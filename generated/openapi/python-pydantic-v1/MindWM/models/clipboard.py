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


from typing import Optional
from pydantic import BaseModel, Field, StrictStr, validator
from MindWM.models.clipboard_context import ClipboardContext
from MindWM.models.vector2int import Vector2int

class Clipboard(BaseModel):
    """
    Clipboard
    """
    context: ClipboardContext = Field(...)
    clipboard_type: StrictStr = Field(default=..., alias="clipboardType", description="Type of clipboard")
    content: StrictStr = Field(default=..., description="Clipboard content")
    selection_start: Optional[Vector2int] = Field(default=None, alias="selectionStart")
    selection_end: Optional[Vector2int] = Field(default=None, alias="selectionEnd")
    additional_properties: Dict[str, Any] = {}
    __properties = ["context", "clipboardType", "content", "selectionStart", "selectionEnd"]

    @validator('clipboard_type')
    def clipboard_type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('Primary', 'Secondary', 'Clipboard'):
            raise ValueError("must be one of enum values ('Primary', 'Secondary', 'Clipboard')")
        return value

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
    def from_json(cls, json_str: str) -> Clipboard:
        """Create an instance of Clipboard from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                            "additional_properties"
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of context
        if self.context:
            _dict['context'] = self.context.to_dict()
        # override the default output from pydantic by calling `to_dict()` of selection_start
        if self.selection_start:
            _dict['selectionStart'] = self.selection_start.to_dict()
        # override the default output from pydantic by calling `to_dict()` of selection_end
        if self.selection_end:
            _dict['selectionEnd'] = self.selection_end.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Clipboard:
        """Create an instance of Clipboard from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Clipboard.parse_obj(obj)

        _obj = Clipboard.parse_obj({
            "context": ClipboardContext.from_dict(obj.get("context")) if obj.get("context") is not None else None,
            "clipboard_type": obj.get("clipboardType"),
            "content": obj.get("content"),
            "selection_start": Vector2int.from_dict(obj.get("selectionStart")) if obj.get("selectionStart") is not None else None,
            "selection_end": Vector2int.from_dict(obj.get("selectionEnd")) if obj.get("selectionEnd") is not None else None
        })
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj

