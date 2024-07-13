from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from MindwWM.models.base_model import Model
from MindwWM import util


class Neo4jCaptureDataChangeRelationshipPayloadEnd(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, ids=None, labels=None):  # noqa: E501
        """Neo4jCaptureDataChangeRelationshipPayloadEnd - a model defined in OpenAPI

        :param id: The id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.  # noqa: E501
        :type id: str
        :param ids: The ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.  # noqa: E501
        :type ids: Dict[str, object]
        :param labels: The labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.  # noqa: E501
        :type labels: List[str]
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
    def from_dict(cls, dikt) -> 'Neo4jCaptureDataChangeRelationshipPayloadEnd':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Neo4jCaptureDataChangeRelationshipPayload_end of this Neo4jCaptureDataChangeRelationshipPayloadEnd.  # noqa: E501
        :rtype: Neo4jCaptureDataChangeRelationshipPayloadEnd
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :return: The id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :param id: The id of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def ids(self) -> Dict[str, object]:
        """Gets the ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :return: The ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :rtype: Dict[str, object]
        """
        return self._ids

    @ids.setter
    def ids(self, ids: Dict[str, object]):
        """Sets the ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :param ids: The ids of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :type ids: Dict[str, object]
        """
        if ids is None:
            raise ValueError("Invalid value for `ids`, must not be `None`")  # noqa: E501

        self._ids = ids

    @property
    def labels(self) -> List[str]:
        """Gets the labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :return: The labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :rtype: List[str]
        """
        return self._labels

    @labels.setter
    def labels(self, labels: List[str]):
        """Sets the labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.


        :param labels: The labels of this Neo4jCaptureDataChangeRelationshipPayloadEnd.
        :type labels: List[str]
        """
        if labels is None:
            raise ValueError("Invalid value for `labels`, must not be `None`")  # noqa: E501

        self._labels = labels
