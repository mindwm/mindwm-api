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


from typing import Any, Dict, List
from pydantic import BaseModel, Field, StrictStr, conlist

class Neo4jChangeDataCaptureRelationshipPayloadEnd(BaseModel):
    """
    Neo4jChangeDataCaptureRelationshipPayloadEnd
    """
    id: StrictStr = Field(...)
    ids: Dict[str, Any] = Field(...)
    labels: conlist(StrictStr) = Field(...)
    __properties = ["id", "ids", "labels"]

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
    def from_json(cls, json_str: str) -> Neo4jChangeDataCaptureRelationshipPayloadEnd:
        """Create an instance of Neo4jChangeDataCaptureRelationshipPayloadEnd from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Neo4jChangeDataCaptureRelationshipPayloadEnd:
        """Create an instance of Neo4jChangeDataCaptureRelationshipPayloadEnd from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Neo4jChangeDataCaptureRelationshipPayloadEnd.parse_obj(obj)

        _obj = Neo4jChangeDataCaptureRelationshipPayloadEnd.parse_obj({
            "id": obj.get("id"),
            "ids": obj.get("ids"),
            "labels": obj.get("labels")
        })
        return _obj

