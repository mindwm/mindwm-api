# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from MindwWM.models.base_model import Model
from MindwWM import util


class Neo4jCaptureDataChangeRelationshipPayloadEnd(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, ids: Dict[str, object]=None, labels: List[str]=None):
        """Neo4jCaptureDataChangeRelationshipPayloadEnd - a model defined in OpenAPI

        :param id: The id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :param ids: The ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :param labels: The labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        """
        self.openapi_types = {
            'id': str,
            'ids': Dict[str, object],
            'labels': List[str]
        }

        self.attribute_map = {
            'id': 'id',
            'ids': 'ids',
            'labels': 'labels'
        }

        self._id = id
        self._ids = ids
        self._labels = labels

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Neo4jCaptureDataChangeRelationshipPayloadEnd':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Neo4jCaptureDataChangeRelationshipPayload_end of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :return: The id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :param id: The id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")

        self._id = id

    @property
    def ids(self):
        """Gets the ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :return: The ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :rtype: Dict[str, object]
        """
        return self._ids

    @ids.setter
    def ids(self, ids):
        """Sets the ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :param ids: The ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :type ids: Dict[str, object]
        """
        if ids is None:
            raise ValueError("Invalid value for `ids`, must not be `None`")

        self._ids = ids

    @property
    def labels(self):
        """Gets the labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :return: The labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :rtype: List[str]
        """
        return self._labels

    @labels.setter
    def labels(self, labels):
        """Sets the labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :param labels: The labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :type labels: List[str]
        """
        if labels is None:
            raise ValueError("Invalid value for `labels`, must not be `None`")

        self._labels = labels