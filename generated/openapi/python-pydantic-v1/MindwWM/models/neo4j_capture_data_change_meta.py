# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json



from pydantic import BaseModel, Field, StrictInt, StrictStr
from MindwWM.models.neo4j_capture_data_change_meta_source import Neo4jCaptureDataChangeMetaSource

class Neo4jCaptureDataChangeMeta(BaseModel):
    """
    Neo4jCaptureDataChangeMeta
    """
    operation: StrictStr = Field(...)
    source: Neo4jCaptureDataChangeMetaSource = Field(...)
    timestamp: StrictInt = Field(...)
    tx_event_id: StrictInt = Field(default=..., alias="txEventId")
    tx_events_count: StrictInt = Field(default=..., alias="txEventsCount")
    tx_id: StrictInt = Field(default=..., alias="txId")
    username: StrictStr = Field(...)
    __properties = ["operation", "source", "timestamp", "txEventId", "txEventsCount", "txId", "username"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Neo4jCaptureDataChangeMeta:
        """Create an instance of Neo4jCaptureDataChangeMeta from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of source
        if self.source:
            _dict['source'] = self.source.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Neo4jCaptureDataChangeMeta:
        """Create an instance of Neo4jCaptureDataChangeMeta from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Neo4jCaptureDataChangeMeta.parse_obj(obj)

        _obj = Neo4jCaptureDataChangeMeta.parse_obj({
            "operation": obj.get("operation"),
            "source": Neo4jCaptureDataChangeMetaSource.from_dict(obj.get("source")) if obj.get("source") is not None else None,
            "timestamp": obj.get("timestamp"),
            "tx_event_id": obj.get("txEventId"),
            "tx_events_count": obj.get("txEventsCount"),
            "tx_id": obj.get("txId"),
            "username": obj.get("username")
        })
        return _obj


