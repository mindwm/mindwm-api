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



from pydantic import BaseModel, Field, constr

class IoDocument(BaseModel):
    """
    IoDocument
    """
    input: constr(strict=True, min_length=1) = Field(default=..., description="User input")
    output: constr(strict=True, min_length=0) = Field(default=..., description="Command output (mix of stdout & stderr)")
    ps1: constr(strict=True, min_length=1) = Field(default=..., description="ps1 (prompt) AFTER the input and output")
    additional_properties: Dict[str, Any] = {}
    __properties = ["input", "output", "ps1"]

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
    def from_json(cls, json_str: str) -> IoDocument:
        """Create an instance of IoDocument from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> IoDocument:
        """Create an instance of IoDocument from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return IoDocument.parse_obj(obj)

        _obj = IoDocument.parse_obj({
            "input": obj.get("input"),
            "output": obj.get("output"),
            "ps1": obj.get("ps1")
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj


