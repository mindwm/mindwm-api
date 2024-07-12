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
from MindwWM.models.cloud_event_data import CloudEventData

class CloudEvent(BaseModel):
    """
    CloudEvents Specification JSON Schema  # noqa: E501
    """
    id: constr(strict=True, min_length=1) = Field(default=..., description="Identifies the event.")
    source: constr(strict=True, min_length=1) = Field(default=..., description="Identifies the context in which an event happened.")
    specversion: constr(strict=True, min_length=1) = Field(default=..., description="The version of the CloudEvents specification which the event uses.")
    type: constr(strict=True, min_length=1) = Field(default=..., description="Describes the type of event related to the originating occurrence.")
    datacontenttype: Optional[constr(strict=True, min_length=1)] = Field(default=None, description="Content type of the data value. Must adhere to RFC 2046 format.")
    dataschema: Optional[constr(strict=True, min_length=1)] = Field(default=None, description="Identifies the schema that data adheres to.")
    subject: Optional[constr(strict=True, min_length=1)] = Field(default=None, description="Describes the subject of the event in the context of the event producer (identified by source).")
    time: Optional[datetime] = Field(default=None, description="Timestamp of when the occurrence happened. Must adhere to RFC 3339.")
    data: Optional[CloudEventData] = None
    data_base64: Optional[StrictStr] = Field(default=None, description="Base64 encoded event payload. Must adhere to RFC4648.")
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
    def from_json(cls, json_str: str) -> CloudEvent:
        """Create an instance of CloudEvent from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of data
        if self.data:
            _dict['data'] = self.data.to_dict()
        # set to None if datacontenttype (nullable) is None
        # and __fields_set__ contains the field
        if self.datacontenttype is None and "datacontenttype" in self.__fields_set__:
            _dict['datacontenttype'] = None

        # set to None if dataschema (nullable) is None
        # and __fields_set__ contains the field
        if self.dataschema is None and "dataschema" in self.__fields_set__:
            _dict['dataschema'] = None

        # set to None if subject (nullable) is None
        # and __fields_set__ contains the field
        if self.subject is None and "subject" in self.__fields_set__:
            _dict['subject'] = None

        # set to None if time (nullable) is None
        # and __fields_set__ contains the field
        if self.time is None and "time" in self.__fields_set__:
            _dict['time'] = None

        # set to None if data (nullable) is None
        # and __fields_set__ contains the field
        if self.data is None and "data" in self.__fields_set__:
            _dict['data'] = None

        # set to None if data_base64 (nullable) is None
        # and __fields_set__ contains the field
        if self.data_base64 is None and "data_base64" in self.__fields_set__:
            _dict['data_base64'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CloudEvent:
        """Create an instance of CloudEvent from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CloudEvent.parse_obj(obj)

        _obj = CloudEvent.parse_obj({
            "id": obj.get("id"),
            "source": obj.get("source"),
            "specversion": obj.get("specversion"),
            "type": obj.get("type"),
            "datacontenttype": obj.get("datacontenttype"),
            "dataschema": obj.get("dataschema"),
            "subject": obj.get("subject"),
            "time": obj.get("time"),
            "data": CloudEventData.from_dict(obj.get("data")) if obj.get("data") is not None else None,
            "data_base64": obj.get("data_base64")
        })
        return _obj


