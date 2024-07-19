# generated by datamodel-codegen:
#   filename:  mindwm.yaml
#   timestamp: 2024-07-19T08:52:10+00:00

from __future__ import annotations

from enum import Enum
from typing import Any, Dict, List, Literal, Optional, Union

from pydantic import AnyUrl, AwareDatetime, BaseModel, ConfigDict, Field, RootModel


class DataBase64def(RootModel[Optional[str]]):
    root: Optional[str]


class Datacontenttypedef(RootModel[Optional[str]]):
    root: Optional[str] = Field(..., min_length=1)


class Datadef(RootModel[Optional[Union[Dict[str, Any], str, float, List[Any], bool]]]):
    root: Optional[Union[Dict[str, Any], str, float, List[Any], bool]]


class Dataschemadef(RootModel[Optional[AnyUrl]]):
    root: Optional[AnyUrl]


class Iddef(RootModel[str]):
    root: str = Field(..., min_length=1)


class Sourcedef(RootModel[str]):
    root: str = Field(..., min_length=1)


class Specversiondef(RootModel[str]):
    root: str = Field(..., min_length=1)


class Subjectdef(RootModel[Optional[str]]):
    root: Optional[str] = Field(..., min_length=1)


class Timedef(RootModel[Optional[AwareDatetime]]):
    root: Optional[AwareDatetime] = Field(..., min_length=1)


class Typedef(RootModel[str]):
    root: str = Field(..., min_length=1)


class Type(Enum):
    primary = 'primary'
    secondary = 'secondary'
    clipboard = 'clipboard'


class Context(BaseModel):
    window: Optional[str] = Field(None, description='window id')


class ClipboardPayload(BaseModel):
    start: Optional[List[int]] = Field(
        None,
        description='Starting position of clipboard selection [x,y]',
        max_length=2,
        min_length=2,
    )
    stop: Optional[List[int]] = Field(
        None,
        description='Ending position of clipboard selection [x,y]',
        max_length=2,
        min_length=2,
    )
    data: Optional[str] = Field(None, description='Clipboard data', min_length=1)
    type: Optional[Type] = Field(None, description='Clipboard type')
    context: Optional[Context] = Field(None, description='Selection context')


class TmuxPaneIoDocument(BaseModel):
    model_config = ConfigDict(
        extra='forbid',
    )
    input: str = Field(..., description='User input', min_length=1)
    output: str = Field(
        ..., description='Command output (mix of stdout & stderr)', min_length=0
    )
    ps1: str = Field(
        ..., description='ps1 (prompt) AFTER the input and output', min_length=1
    )


class Type1(Enum):
    created = 'created'
    updated = 'updated'
    deleted = 'deleted'


class Source(Enum):
    graph_node = 'graph.node'
    graph_relationship = 'graph.relationship'


class Source1(Enum):
    graph_relationship = 'graph.relationship'


class Source2(BaseModel):
    hostname: str


class Meta(BaseModel):
    operation: str
    source: Source2
    timestamp: int
    txEventId: int
    txEventsCount: int
    txId: int
    username: str


class Schema(BaseModel):
    constraints: Optional[Dict[str, Any]] = None
    properties: Optional[Dict[str, Any]] = None


class After(BaseModel):
    labels: List[str]
    properties: Dict[str, Any]


class Neo4jCaptureDataChangeNodePayload(BaseModel):
    after: After
    before: str
    id: str
    type: str


class End(BaseModel):
    id: str
    ids: Dict[str, Any]
    labels: List[str]


class Start(BaseModel):
    id: str
    ids: Dict[str, Any]
    labels: List[str]


class Neo4jCaptureDataChangeRelationshipPayload(BaseModel):
    after: Dict[str, Any]
    before: str
    end: End
    id: str
    label: str
    start: Start
    type: Literal['relationship'] = 'relationship'


class Cloudevents(BaseModel):
    id: Iddef = Field(
        ..., description='Identifies the event.', examples=['A234-1234-1234']
    )
    source: Sourcedef = Field(
        ...,
        description='Identifies the context in which an event happened.',
        examples=[
            'https://github.com/cloudevents',
            'mailto:cncf-wg-serverless@lists.cncf.io',
            'urn:uuid:6e8bc430-9c3a-11d9-9669-0800200c9a66',
            'cloudevents/spec/pull/123',
            '/sensors/tn-1234567/alerts',
            '1-555-123-4567',
        ],
    )
    specversion: Specversiondef = Field(
        ...,
        description='The version of the CloudEvents specification which the event uses.',
        examples=['1.0'],
    )
    type: Typedef = Field(
        ...,
        description='Describes the type of event related to the originating occurrence.',
        examples=['com.github.pull_request.opened', 'com.example.object.deleted.v2'],
    )
    datacontenttype: Optional[Datacontenttypedef] = Field(
        None,
        description='Content type of the data value. Must adhere to RFC 2046 format.',
        examples=['text/xml', 'application/json', 'image/png', 'multipart/form-data'],
    )
    dataschema: Optional[Dataschemadef] = Field(
        None, description='Identifies the schema that data adheres to.'
    )
    subject: Optional[Subjectdef] = Field(
        None,
        description='Describes the subject of the event in the context of the event producer (identified by source).',
        examples=['mynewfile.jpg'],
    )
    time: Optional[Timedef] = Field(
        None,
        description='Timestamp of when the occurrence happened. Must adhere to RFC 3339.',
        examples=['2018-04-05T17:31:00Z'],
    )
    data: Optional[Datadef] = Field(
        None, description='The event payload.', examples=['<much wow="xml"/>']
    )
    data_base64: Optional[DataBase64def] = Field(
        None,
        description='Base64 encoded event payload. Must adhere to RFC4648.',
        examples=['Zm9vYg=='],
    )


class Clipboard(Cloudevents):
    model_config = ConfigDict(
        extra='forbid',
        regex_engine="python-re",
    )
    type: Literal['Clipboard'] = 'Clipboard'
    subject: Literal['Clipboard'] = 'Clipboard'
    source: Optional[str] = Field(
        None,
        pattern='mindwm.[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-).clipboard$',
    )
    data: Optional[ClipboardPayload] = None


class Neo4jCaptureDataChange(BaseModel):
    headers: Dict[str, Any]
    message_key: str
    meta: Meta
    offset: int
    partition: int
    source_type: str
    timestamp: AwareDatetime
    topic: str
    schema_: Schema = Field(..., alias='schema')
    payload: Union[
        Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload
    ]


class IoDocument(Cloudevents):
    model_config = ConfigDict(
        extra='forbid',
    )
    type: Literal['IoDocument'] = 'IoDocument'
    subject: Literal['IoDocument'] = 'IoDocument'
    source: str = Field(..., pattern='^mindwm\\..*\\.iodocument$')
    data: TmuxPaneIoDocument


class Data(Neo4jCaptureDataChange):
    payload: Optional[Neo4jCaptureDataChangeNodePayload] = None


class GraphNode(Cloudevents):
    model_config = ConfigDict(
        extra='forbid',
    )
    type: Optional[Type1] = None
    source: Optional[Source] = None
    data: Optional[Data] = None


class Data1(Neo4jCaptureDataChange):
    payload: Optional[Neo4jCaptureDataChangeRelationshipPayload] = None


class GraphRelationship(Cloudevents):
    model_config = ConfigDict(
        extra='forbid',
    )
    type: Optional[Type1] = None
    source: Optional[Source1] = None
    data: Optional[Data1] = None
