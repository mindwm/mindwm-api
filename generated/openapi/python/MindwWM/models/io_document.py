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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from MindwWM.models.tmux_pane_io_document import TmuxPaneIoDocument
from typing import Optional, Set
from typing_extensions import Self

class IoDocument(BaseModel):
    """
    IoDocument
    """ # noqa: E501
    type: Optional[StrictStr] = None
    source: Optional[Annotated[str, Field(strict=True)]] = None
    data: Optional[TmuxPaneIoDocument] = None
    id: Annotated[str, Field(min_length=1, strict=True)] = Field(description="Identifies the event.")
    specversion: Annotated[str, Field(min_length=1, strict=True)] = Field(description="The version of the CloudEvents specification which the event uses.")
    datacontenttype: Optional[Annotated[str, Field(min_length=1, strict=True)]] = Field(default=None, description="Content type of the data value. Must adhere to RFC 2046 format.")
    dataschema: Optional[Annotated[str, Field(min_length=1, strict=True)]] = Field(default=None, description="Identifies the schema that data adheres to.")
    subject: Optional[Annotated[str, Field(min_length=1, strict=True)]] = Field(default=None, description="Describes the subject of the event in the context of the event producer (identified by source).")
    time: Optional[datetime] = Field(default=None, description="Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
    data_base64: Optional[StrictStr] = Field(default=None, description="Base64 encoded event payload. Must adhere to RFC4648.")
    additional_properties: Dict[str, Any] = {}
    __properties: ClassVar[List[str]] = ["id", "source", "specversion", "type", "datacontenttype", "dataschema", "subject", "time", "data", "data_base64"]

    @field_validator('source')
    def source_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\.tmux\\.[A-Za-z0-9+\/]*={0,2}\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\.[0-9]+?\\.[0-9]+?\\.tiodocument$", value):
            raise ValueError(r"must validate the regular expression /[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\.tmux\\.[A-Za-z0-9+\/]*={0,2}\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\.[0-9]+?\\.[0-9]+?\\.tiodocument$/")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of IoDocument from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * Fields in `self.additional_properties` are added to the output dict.
        """
        excluded_fields: Set[str] = set([
            "additional_properties",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of data
        if self.data:
            _dict['data'] = self.data.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of IoDocument from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "source": obj.get("source"),
            "specversion": obj.get("specversion"),
            "type": obj.get("type"),
            "datacontenttype": obj.get("datacontenttype"),
            "dataschema": obj.get("dataschema"),
            "subject": obj.get("subject"),
            "time": obj.get("time"),
            "data": TmuxPaneIoDocument.from_dict(obj["data"]) if obj.get("data") is not None else None,
            "data_base64": obj.get("data_base64")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


