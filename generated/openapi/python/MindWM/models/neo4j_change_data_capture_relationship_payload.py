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

from pydantic import BaseModel, ConfigDict, StrictStr
from typing import Any, ClassVar, Dict, List
from MindWM.models.neo4j_change_data_capture_relationship_payload_end import Neo4jChangeDataCaptureRelationshipPayloadEnd
from typing import Optional, Set
from typing_extensions import Self

class Neo4jChangeDataCaptureRelationshipPayload(BaseModel):
    """
    Neo4jChangeDataCaptureRelationshipPayload
    """ # noqa: E501
    after: Dict[str, Any]
    before: StrictStr
    end: Neo4jChangeDataCaptureRelationshipPayloadEnd
    id: StrictStr
    label: StrictStr
    start: Neo4jChangeDataCaptureRelationshipPayloadEnd
    type: StrictStr
    __properties: ClassVar[List[str]] = ["after", "before", "end", "id", "label", "start", "type"]

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
        """Create an instance of Neo4jChangeDataCaptureRelationshipPayload from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of end
        if self.end:
            _dict['end'] = self.end.to_dict()
        # override the default output from pydantic by calling `to_dict()` of start
        if self.start:
            _dict['start'] = self.start.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Neo4jChangeDataCaptureRelationshipPayload from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "after": obj.get("after"),
            "before": obj.get("before"),
            "end": Neo4jChangeDataCaptureRelationshipPayloadEnd.from_dict(obj["end"]) if obj.get("end") is not None else None,
            "id": obj.get("id"),
            "label": obj.get("label"),
            "start": Neo4jChangeDataCaptureRelationshipPayloadEnd.from_dict(obj["start"]) if obj.get("start") is not None else None,
            "type": obj.get("type")
        })
        return _obj


