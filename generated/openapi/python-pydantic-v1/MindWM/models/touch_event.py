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
from typing import Optional
from pydantic import BaseModel, Field, StrictStr, constr
from MindWM.models.touch import Touch

class TouchEvent(BaseModel):
    """
    TouchEvent
    """
    id: constr(strict=True, min_length=1) = Field(default=..., description="Identifies the event.")
    source: StrictStr = Field(...)
    specversion: constr(strict=True, min_length=1) = Field(default=..., description="The version of the CloudEvents specification which the event uses.")
    type: StrictStr = Field(...)
    datacontenttype: Optional[constr(strict=True, min_length=1)] = Field(default=None, description="Content type of the data value. Must adhere to RFC 2046 format.")
    dataschema: Optional[constr(strict=True, min_length=1)] = Field(default=None, description="Identifies the schema that data adheres to.")
    subject: Optional[StrictStr] = 'node'
    time: Optional[datetime] = Field(default=None, description="Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
    data: Optional[Touch] = None
    data_base64: Optional[StrictStr] = Field(default=None, description="Base64 encoded event payload. Must adhere to RFC4648.")
    additional_properties: Dict[str, Any] = {}
    __properties = ["id", "source", "specversion", "type", "datacontenttype", "dataschema", "subject", "time", "data", "data_base64"]

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
    def from_json(cls, json_str: str) -> TouchEvent:
        """Create an instance of TouchEvent from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of data
        if self.data:
            _dict['data'] = self.data.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> TouchEvent:
        """Create an instance of TouchEvent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return TouchEvent.parse_obj(obj)

        _obj = TouchEvent.parse_obj({
            "id": obj.get("id"),
            "source": obj.get("source"),
            "specversion": obj.get("specversion"),
            "type": obj.get("type") if obj.get("type") is not None else 'touch',
            "datacontenttype": obj.get("datacontenttype"),
            "dataschema": obj.get("dataschema"),
            "subject": obj.get("subject") if obj.get("subject") is not None else 'node',
            "time": obj.get("time"),
            "data": Touch.from_dict(obj.get("data")) if obj.get("data") is not None else None,
            "data_base64": obj.get("data_base64")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


