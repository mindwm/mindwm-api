from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from MindwWM.models.base_model import Model
from MindwWM import util


class Neo4jCaptureDataChangeMetaSource(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, hostname=None):  # noqa: E501
        """Neo4jCaptureDataChangeMetaSource - a model defined in OpenAPI

        :param hostname: The hostname of this Neo4jCaptureDataChangeMetaSource.  # noqa: E501
        :type hostname: str
        """
        self.openapi_types = {
            'hostname': str
        }

        self.attribute_map = {
            'hostname': 'hostname'
        }

        self._hostname = hostname

    @classmethod
    def from_dict(cls, dikt) -> 'Neo4jCaptureDataChangeMetaSource':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Neo4jCaptureDataChange_meta_source of this Neo4jCaptureDataChangeMetaSource.  # noqa: E501
        :rtype: Neo4jCaptureDataChangeMetaSource
        """
        return util.deserialize_model(dikt, cls)

    @property
    def hostname(self) -> str:
        """Gets the hostname of this Neo4jCaptureDataChangeMetaSource.


        :return: The hostname of this Neo4jCaptureDataChangeMetaSource.
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname: str):
        """Sets the hostname of this Neo4jCaptureDataChangeMetaSource.


        :param hostname: The hostname of this Neo4jCaptureDataChangeMetaSource.
        :type hostname: str
        """
        if hostname is None:
            raise ValueError("Invalid value for `hostname`, must not be `None`")  # noqa: E501

        self._hostname = hostname