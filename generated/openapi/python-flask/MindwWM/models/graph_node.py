from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from MindwWM.models.base_model import Model
from MindwWM.models.graph_node_all_of_data import GraphNodeAllOfData
from MindwWM import util

from MindwWM.models.graph_node_all_of_data import GraphNodeAllOfData  # noqa: E501

class GraphNode(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, source=None, specversion=None, type=None, datacontenttype=None, dataschema=None, subject=None, time=None, data=None, data_base64=None):  # noqa: E501
        """GraphNode - a model defined in OpenAPI

        :param id: The id of this GraphNode.  # noqa: E501
        :type id: str
        :param source: The source of this GraphNode.  # noqa: E501
        :type source: str
        :param specversion: The specversion of this GraphNode.  # noqa: E501
        :type specversion: str
        :param type: The type of this GraphNode.  # noqa: E501
        :type type: str
        :param datacontenttype: The datacontenttype of this GraphNode.  # noqa: E501
        :type datacontenttype: str
        :param dataschema: The dataschema of this GraphNode.  # noqa: E501
        :type dataschema: str
        :param subject: The subject of this GraphNode.  # noqa: E501
        :type subject: str
        :param time: The time of this GraphNode.  # noqa: E501
        :type time: datetime
        :param data: The data of this GraphNode.  # noqa: E501
        :type data: GraphNodeAllOfData
        :param data_base64: The data_base64 of this GraphNode.  # noqa: E501
        :type data_base64: str
        """
        self.openapi_types = {
            'id': str,
            'source': str,
            'specversion': str,
            'type': str,
            'datacontenttype': str,
            'dataschema': str,
            'subject': str,
            'time': datetime,
            'data': GraphNodeAllOfData,
            'data_base64': str
        }

        self.attribute_map = {
            'id': 'id',
            'source': 'source',
            'specversion': 'specversion',
            'type': 'type',
            'datacontenttype': 'datacontenttype',
            'dataschema': 'dataschema',
            'subject': 'subject',
            'time': 'time',
            'data': 'data',
            'data_base64': 'data_base64'
        }

        self._id = id
        self._source = source
        self._specversion = specversion
        self._type = type
        self._datacontenttype = datacontenttype
        self._dataschema = dataschema
        self._subject = subject
        self._time = time
        self._data = data
        self._data_base64 = data_base64

    @classmethod
    def from_dict(cls, dikt) -> 'GraphNode':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GraphNode of this GraphNode.  # noqa: E501
        :rtype: GraphNode
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this GraphNode.

        Identifies the event.  # noqa: E501

        :return: The id of this GraphNode.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this GraphNode.

        Identifies the event.  # noqa: E501

        :param id: The id of this GraphNode.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501
        if id is not None and len(id) < 1:
            raise ValueError("Invalid value for `id`, length must be greater than or equal to `1`")  # noqa: E501

        self._id = id

    @property
    def source(self) -> str:
        """Gets the source of this GraphNode.


        :return: The source of this GraphNode.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this GraphNode.


        :param source: The source of this GraphNode.
        :type source: str
        """
        allowed_values = ["graph.node"]  # noqa: E501
        if source not in allowed_values:
            raise ValueError(
                "Invalid value for `source` ({0}), must be one of {1}"
                .format(source, allowed_values)
            )

        self._source = source

    @property
    def specversion(self) -> str:
        """Gets the specversion of this GraphNode.

        The version of the CloudEvents specification which the event uses.  # noqa: E501

        :return: The specversion of this GraphNode.
        :rtype: str
        """
        return self._specversion

    @specversion.setter
    def specversion(self, specversion: str):
        """Sets the specversion of this GraphNode.

        The version of the CloudEvents specification which the event uses.  # noqa: E501

        :param specversion: The specversion of this GraphNode.
        :type specversion: str
        """
        if specversion is None:
            raise ValueError("Invalid value for `specversion`, must not be `None`")  # noqa: E501
        if specversion is not None and len(specversion) < 1:
            raise ValueError("Invalid value for `specversion`, length must be greater than or equal to `1`")  # noqa: E501

        self._specversion = specversion

    @property
    def type(self) -> str:
        """Gets the type of this GraphNode.


        :return: The type of this GraphNode.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this GraphNode.


        :param type: The type of this GraphNode.
        :type type: str
        """
        allowed_values = ["created", "updated", "deleted"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def datacontenttype(self) -> str:
        """Gets the datacontenttype of this GraphNode.

        Content type of the data value. Must adhere to RFC 2046 format.  # noqa: E501

        :return: The datacontenttype of this GraphNode.
        :rtype: str
        """
        return self._datacontenttype

    @datacontenttype.setter
    def datacontenttype(self, datacontenttype: str):
        """Sets the datacontenttype of this GraphNode.

        Content type of the data value. Must adhere to RFC 2046 format.  # noqa: E501

        :param datacontenttype: The datacontenttype of this GraphNode.
        :type datacontenttype: str
        """
        if datacontenttype is not None and len(datacontenttype) < 1:
            raise ValueError("Invalid value for `datacontenttype`, length must be greater than or equal to `1`")  # noqa: E501

        self._datacontenttype = datacontenttype

    @property
    def dataschema(self) -> str:
        """Gets the dataschema of this GraphNode.

        Identifies the schema that data adheres to.  # noqa: E501

        :return: The dataschema of this GraphNode.
        :rtype: str
        """
        return self._dataschema

    @dataschema.setter
    def dataschema(self, dataschema: str):
        """Sets the dataschema of this GraphNode.

        Identifies the schema that data adheres to.  # noqa: E501

        :param dataschema: The dataschema of this GraphNode.
        :type dataschema: str
        """
        if dataschema is not None and len(dataschema) < 1:
            raise ValueError("Invalid value for `dataschema`, length must be greater than or equal to `1`")  # noqa: E501

        self._dataschema = dataschema

    @property
    def subject(self) -> str:
        """Gets the subject of this GraphNode.

        Describes the subject of the event in the context of the event producer (identified by source).  # noqa: E501

        :return: The subject of this GraphNode.
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject: str):
        """Sets the subject of this GraphNode.

        Describes the subject of the event in the context of the event producer (identified by source).  # noqa: E501

        :param subject: The subject of this GraphNode.
        :type subject: str
        """
        if subject is not None and len(subject) < 1:
            raise ValueError("Invalid value for `subject`, length must be greater than or equal to `1`")  # noqa: E501

        self._subject = subject

    @property
    def time(self) -> datetime:
        """Gets the time of this GraphNode.

        Timestamp of when the occurrence happened. Must adhere to RFC 3339.  # noqa: E501

        :return: The time of this GraphNode.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time: datetime):
        """Sets the time of this GraphNode.

        Timestamp of when the occurrence happened. Must adhere to RFC 3339.  # noqa: E501

        :param time: The time of this GraphNode.
        :type time: datetime
        """
        if time is not None and len(time) < 1:
            raise ValueError("Invalid value for `time`, length must be greater than or equal to `1`")  # noqa: E501

        self._time = time

    @property
    def data(self) -> GraphNodeAllOfData:
        """Gets the data of this GraphNode.


        :return: The data of this GraphNode.
        :rtype: GraphNodeAllOfData
        """
        return self._data

    @data.setter
    def data(self, data: GraphNodeAllOfData):
        """Sets the data of this GraphNode.


        :param data: The data of this GraphNode.
        :type data: GraphNodeAllOfData
        """

        self._data = data

    @property
    def data_base64(self) -> str:
        """Gets the data_base64 of this GraphNode.

        Base64 encoded event payload. Must adhere to RFC4648.  # noqa: E501

        :return: The data_base64 of this GraphNode.
        :rtype: str
        """
        return self._data_base64

    @data_base64.setter
    def data_base64(self, data_base64: str):
        """Sets the data_base64 of this GraphNode.

        Base64 encoded event payload. Must adhere to RFC4648.  # noqa: E501

        :param data_base64: The data_base64 of this GraphNode.
        :type data_base64: str
        """

        self._data_base64 = data_base64
