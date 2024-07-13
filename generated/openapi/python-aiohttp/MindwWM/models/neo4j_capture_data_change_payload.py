# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from MindwWM.models.base_model import Model
from MindwWM.models.neo4j_capture_data_change_node_payload import Neo4jCaptureDataChangeNodePayload
from MindwWM.models.neo4j_capture_data_change_relationship_payload import Neo4jCaptureDataChangeRelationshipPayload
from MindwWM.models.neo4j_capture_data_change_relationship_payload_end import Neo4jCaptureDataChangeRelationshipPayloadEnd
from MindwWM import util


class Neo4jCaptureDataChangePayload(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, after: object=None, before: str=None, id: str=None, type: str=None, end: Neo4jCaptureDataChangeRelationshipPayloadEnd=None, label: str=None, start: Neo4jCaptureDataChangeRelationshipPayloadEnd=None):
        """Neo4jCaptureDataChangePayload - a model defined in OpenAPI

        :param after: The after of this Neo4jCaptureDataChangePayload.
        :param before: The before of this Neo4jCaptureDataChangePayload.
        :param id: The id of this Neo4jCaptureDataChangePayload.
        :param type: The type of this Neo4jCaptureDataChangePayload.
        :param end: The end of this Neo4jCaptureDataChangePayload.
        :param label: The label of this Neo4jCaptureDataChangePayload.
        :param start: The start of this Neo4jCaptureDataChangePayload.
        """
        self.openapi_types = {
            'after': object,
            'before': str,
            'id': str,
            'type': str,
            'end': Neo4jCaptureDataChangeRelationshipPayloadEnd,
            'label': str,
            'start': Neo4jCaptureDataChangeRelationshipPayloadEnd
        }

        self.attribute_map = {
            'after': 'after',
            'before': 'before',
            'id': 'id',
            'type': 'type',
            'end': 'end',
            'label': 'label',
            'start': 'start'
        }

        self._after = after
        self._before = before
        self._id = id
        self._type = type
        self._end = end
        self._label = label
        self._start = start

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Neo4jCaptureDataChangePayload':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Neo4jCaptureDataChange_payload of this Neo4jCaptureDataChangePayload.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def after(self):
        """Gets the after of this Neo4jCaptureDataChangePayload.


        :return: The after of this Neo4jCaptureDataChangePayload.
        :rtype: object
        """
        return self._after

    @after.setter
    def after(self, after):
        """Sets the after of this Neo4jCaptureDataChangePayload.


        :param after: The after of this Neo4jCaptureDataChangePayload.
        :type after: object
        """
        if after is None:
            raise ValueError("Invalid value for `after`, must not be `None`")

        self._after = after

    @property
    def before(self):
        """Gets the before of this Neo4jCaptureDataChangePayload.


        :return: The before of this Neo4jCaptureDataChangePayload.
        :rtype: str
        """
        return self._before

    @before.setter
    def before(self, before):
        """Sets the before of this Neo4jCaptureDataChangePayload.


        :param before: The before of this Neo4jCaptureDataChangePayload.
        :type before: str
        """
        if before is None:
            raise ValueError("Invalid value for `before`, must not be `None`")

        self._before = before

    @property
    def id(self):
        """Gets the id of this Neo4jCaptureDataChangePayload.


        :return: The id of this Neo4jCaptureDataChangePayload.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Neo4jCaptureDataChangePayload.


        :param id: The id of this Neo4jCaptureDataChangePayload.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def type(self):
        """Gets the type of this Neo4jCaptureDataChangePayload.


        :return: The type of this Neo4jCaptureDataChangePayload.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this Neo4jCaptureDataChangePayload.


        :param type: The type of this Neo4jCaptureDataChangePayload.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")

        self._type = type

    @property
    def end(self):
        """Gets the end of this Neo4jCaptureDataChangePayload.


        :return: The end of this Neo4jCaptureDataChangePayload.
        :rtype: Neo4jCaptureDataChangeRelationshipPayloadEnd
        """
        return self._end

    @end.setter
    def end(self, end):
        """Sets the end of this Neo4jCaptureDataChangePayload.


        :param end: The end of this Neo4jCaptureDataChangePayload.
        :type end: Neo4jCaptureDataChangeRelationshipPayloadEnd
        """
        if end is None:
            raise ValueError("Invalid value for `end`, must not be `None`")

        self._end = end

    @property
    def label(self):
        """Gets the label of this Neo4jCaptureDataChangePayload.


        :return: The label of this Neo4jCaptureDataChangePayload.
        :rtype: str
        """
        return self._label

    @label.setter
    def label(self, label):
        """Sets the label of this Neo4jCaptureDataChangePayload.


        :param label: The label of this Neo4jCaptureDataChangePayload.
        :type label: str
        """
        if label is None:
            raise ValueError("Invalid value for `label`, must not be `None`")

        self._label = label

    @property
    def start(self):
        """Gets the start of this Neo4jCaptureDataChangePayload.


        :return: The start of this Neo4jCaptureDataChangePayload.
        :rtype: Neo4jCaptureDataChangeRelationshipPayloadEnd
        """
        return self._start

    @start.setter
    def start(self, start):
        """Sets the start of this Neo4jCaptureDataChangePayload.


        :param start: The start of this Neo4jCaptureDataChangePayload.
        :type start: Neo4jCaptureDataChangeRelationshipPayloadEnd
        """
        if start is None:
            raise ValueError("Invalid value for `start`, must not be `None`")

        self._start = start
