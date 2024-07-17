# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from MindWM.models.base_model import Model
from MindWM import util


class Neo4jCaptureDataChangeNodePayloadAfter(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, labels: List[str]=None, properties: Dict[str, object]=None):
        """Neo4jCaptureDataChangeNodePayloadAfter - a model defined in OpenAPI

        :param labels: The labels of this Neo4jCaptureDataChangeNodePayloadAfter.
        :param properties: The properties of this Neo4jCaptureDataChangeNodePayloadAfter.
        """
        self.openapi_types = {
            'labels': List[str],
            'properties': Dict[str, object]
        }

        self.attribute_map = {
            'labels': 'labels',
            'properties': 'properties'
        }

        self._labels = labels
        self._properties = properties

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Neo4jCaptureDataChangeNodePayloadAfter':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Neo4jCaptureDataChangeNodePayload_after of this Neo4jCaptureDataChangeNodePayloadAfter.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def labels(self):
        """Gets the labels of this Neo4jCaptureDataChangeNodePayloadAfter.


        :return: The labels of this Neo4jCaptureDataChangeNodePayloadAfter.
        :rtype: List[str]
        """
        return self._labels

    @labels.setter
    def labels(self, labels):
        """Sets the labels of this Neo4jCaptureDataChangeNodePayloadAfter.


        :param labels: The labels of this Neo4jCaptureDataChangeNodePayloadAfter.
        :type labels: List[str]
        """
        if labels is None:
            raise ValueError("Invalid value for `labels`, must not be `None`")

        self._labels = labels

    @property
    def properties(self):
        """Gets the properties of this Neo4jCaptureDataChangeNodePayloadAfter.


        :return: The properties of this Neo4jCaptureDataChangeNodePayloadAfter.
        :rtype: Dict[str, object]
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this Neo4jCaptureDataChangeNodePayloadAfter.


        :param properties: The properties of this Neo4jCaptureDataChangeNodePayloadAfter.
        :type properties: Dict[str, object]
        """
        if properties is None:
            raise ValueError("Invalid value for `properties`, must not be `None`")

        self._properties = properties