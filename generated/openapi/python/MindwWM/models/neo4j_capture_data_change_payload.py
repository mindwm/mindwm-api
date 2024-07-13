# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
import pprint
from pydantic import BaseModel, ConfigDict, Field, StrictStr, ValidationError, field_validator
from typing import Any, List, Optional
from MindwWM.models.neo4j_capture_data_change_node_payload import Neo4jCaptureDataChangeNodePayload
from MindwWM.models.neo4j_capture_data_change_relationship_payload import Neo4jCaptureDataChangeRelationshipPayload
from pydantic import StrictStr, Field
from typing import Union, List, Set, Optional, Dict
from typing_extensions import Literal, Self

NEO4JCAPTUREDATACHANGEPAYLOAD_ONE_OF_SCHEMAS = ["Neo4jCaptureDataChangeNodePayload", "Neo4jCaptureDataChangeRelationshipPayload"]

class Neo4jCaptureDataChangePayload(BaseModel):
    """
    Neo4jCaptureDataChangePayload
    """
    # data type: Neo4jCaptureDataChangeNodePayload
    oneof_schema_1_validator: Optional[Neo4jCaptureDataChangeNodePayload] = None
    # data type: Neo4jCaptureDataChangeRelationshipPayload
    oneof_schema_2_validator: Optional[Neo4jCaptureDataChangeRelationshipPayload] = None
    actual_instance: Optional[Union[Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload]] = None
    one_of_schemas: Set[str] = { "Neo4jCaptureDataChangeNodePayload", "Neo4jCaptureDataChangeRelationshipPayload" }

    model_config = ConfigDict(
        validate_assignment=True,
        protected_namespaces=(),
    )


    def __init__(self, *args, **kwargs) -> None:
        if args:
            if len(args) > 1:
                raise ValueError("If a position argument is used, only 1 is allowed to set `actual_instance`")
            if kwargs:
                raise ValueError("If a position argument is used, keyword arguments cannot be used.")
            super().__init__(actual_instance=args[0])
        else:
            super().__init__(**kwargs)

    @field_validator('actual_instance')
    def actual_instance_must_validate_oneof(cls, v):
        instance = Neo4jCaptureDataChangePayload.model_construct()
        error_messages = []
        match = 0
        # validate data type: Neo4jCaptureDataChangeNodePayload
        if not isinstance(v, Neo4jCaptureDataChangeNodePayload):
            error_messages.append(f"Error! Input type `{type(v)}` is not `Neo4jCaptureDataChangeNodePayload`")
        else:
            match += 1
        # validate data type: Neo4jCaptureDataChangeRelationshipPayload
        if not isinstance(v, Neo4jCaptureDataChangeRelationshipPayload):
            error_messages.append(f"Error! Input type `{type(v)}` is not `Neo4jCaptureDataChangeRelationshipPayload`")
        else:
            match += 1
        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when setting `actual_instance` in Neo4jCaptureDataChangePayload with oneOf schemas: Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when setting `actual_instance` in Neo4jCaptureDataChangePayload with oneOf schemas: Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Details: " + ", ".join(error_messages))
        else:
            return v

    @classmethod
    def from_dict(cls, obj: Union[str, Dict[str, Any]]) -> Self:
        return cls.from_json(json.dumps(obj))

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Returns the object represented by the json string"""
        instance = cls.model_construct()
        error_messages = []
        match = 0

        # deserialize data into Neo4jCaptureDataChangeNodePayload
        try:
            instance.actual_instance = Neo4jCaptureDataChangeNodePayload.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))
        # deserialize data into Neo4jCaptureDataChangeRelationshipPayload
        try:
            instance.actual_instance = Neo4jCaptureDataChangeRelationshipPayload.from_json(json_str)
            match += 1
        except (ValidationError, ValueError) as e:
            error_messages.append(str(e))

        if match > 1:
            # more than 1 match
            raise ValueError("Multiple matches found when deserializing the JSON string into Neo4jCaptureDataChangePayload with oneOf schemas: Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Details: " + ", ".join(error_messages))
        elif match == 0:
            # no match
            raise ValueError("No match found when deserializing the JSON string into Neo4jCaptureDataChangePayload with oneOf schemas: Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload. Details: " + ", ".join(error_messages))
        else:
            return instance

    def to_json(self) -> str:
        """Returns the JSON representation of the actual instance"""
        if self.actual_instance is None:
            return "null"

        if hasattr(self.actual_instance, "to_json") and callable(self.actual_instance.to_json):
            return self.actual_instance.to_json()
        else:
            return json.dumps(self.actual_instance)

    def to_dict(self) -> Optional[Union[Dict[str, Any], Neo4jCaptureDataChangeNodePayload, Neo4jCaptureDataChangeRelationshipPayload]]:
        """Returns the dict representation of the actual instance"""
        if self.actual_instance is None:
            return None

        if hasattr(self.actual_instance, "to_dict") and callable(self.actual_instance.to_dict):
            return self.actual_instance.to_dict()
        else:
            # primitive type
            return self.actual_instance

    def to_str(self) -> str:
        """Returns the string representation of the actual instance"""
        return pprint.pformat(self.model_dump())


