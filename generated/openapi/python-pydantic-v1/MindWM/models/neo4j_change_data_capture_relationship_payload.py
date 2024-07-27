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


from typing import Any, Dict
from pydantic import BaseModel, Field, StrictStr
from MindWM.models.neo4j_change_data_capture_relationship_payload_end import Neo4jChangeDataCaptureRelationshipPayloadEnd

class Neo4jChangeDataCaptureRelationshipPayload(BaseModel):
    """
    Neo4jChangeDataCaptureRelationshipPayload
    """
    after: Dict[str, Any] = Field(...)
    before: StrictStr = Field(...)
    end: Neo4jChangeDataCaptureRelationshipPayloadEnd = Field(...)
    id: StrictStr = Field(...)
    label: StrictStr = Field(...)
    start: Neo4jChangeDataCaptureRelationshipPayloadEnd = Field(...)
    type: StrictStr = Field(...)
    __properties = ["after", "before", "end", "id", "label", "start", "type"]

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
    def from_json(cls, json_str: str) -> Neo4jChangeDataCaptureRelationshipPayload:
        """Create an instance of Neo4jChangeDataCaptureRelationshipPayload from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of end
        if self.end:
            _dict['end'] = self.end.to_dict()
        # override the default output from pydantic by calling `to_dict()` of start
        if self.start:
            _dict['start'] = self.start.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Neo4jChangeDataCaptureRelationshipPayload:
        """Create an instance of Neo4jChangeDataCaptureRelationshipPayload from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Neo4jChangeDataCaptureRelationshipPayload.parse_obj(obj)

        _obj = Neo4jChangeDataCaptureRelationshipPayload.parse_obj({
            "after": obj.get("after"),
            "before": obj.get("before"),
            "end": Neo4jChangeDataCaptureRelationshipPayloadEnd.from_dict(obj.get("end")) if obj.get("end") is not None else None,
            "id": obj.get("id"),
            "label": obj.get("label"),
            "start": Neo4jChangeDataCaptureRelationshipPayloadEnd.from_dict(obj.get("start")) if obj.get("start") is not None else None,
            "type": obj.get("type")
        })
        return _obj


