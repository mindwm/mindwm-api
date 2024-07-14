# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.MindwWM.models.base_model import Model
from app.MindwWM.models.cloud_event_data import CloudEventData  # noqa: F401,E501
from MindwWM import util


class CloudEvent(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, id: str=None, source: str=None, specversion: str=None, type: str=None, datacontenttype: str=None, dataschema: str=None, subject: str=None, time: datetime=None, data: CloudEventData=None, data_base64: str=None):  # noqa: E501
        """CloudEvent - a model defined in Swagger

        :param id: The id of this CloudEvent.  # noqa: E501
        :type id: str
        :param source: The source of this CloudEvent.  # noqa: E501
        :type source: str
        :param specversion: The specversion of this CloudEvent.  # noqa: E501
        :type specversion: str
        :param type: The type of this CloudEvent.  # noqa: E501
        :type type: str
        :param datacontenttype: The datacontenttype of this CloudEvent.  # noqa: E501
        :type datacontenttype: str
        :param dataschema: The dataschema of this CloudEvent.  # noqa: E501
        :type dataschema: str
        :param subject: The subject of this CloudEvent.  # noqa: E501
        :type subject: str
        :param time: The time of this CloudEvent.  # noqa: E501
        :type time: datetime
        :param data: The data of this CloudEvent.  # noqa: E501
        :type data: CloudEventData
        :param data_base64: The data_base64 of this CloudEvent.  # noqa: E501
        :type data_base64: str
        """
        self.swagger_types = {
            'id': str,
            'source': str,
            'specversion': str,
            'type': str,
            'datacontenttype': str,
            'dataschema': str,
            'subject': str,
            'time': datetime,
            'data': CloudEventData,
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
    def from_dict(cls, dikt) -> 'CloudEvent':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CloudEvent of this CloudEvent.  # noqa: E501
        :rtype: CloudEvent
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this CloudEvent.

        Identifies the event.  # noqa: E501

        :return: The id of this CloudEvent.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this CloudEvent.

        Identifies the event.  # noqa: E501

        :param id: The id of this CloudEvent.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501
        if id is not None and len(id) < 1:
            raise ValueError("Invalid value for `id`, length must be greater than or equal to `1`")  # noqa: E501

        self._id = id

    @property
    def source(self) -> str:
        """Gets the source of this CloudEvent.

        Identifies the context in which an event happened.  # noqa: E501

        :return: The source of this CloudEvent.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this CloudEvent.

        Identifies the context in which an event happened.  # noqa: E501

        :param source: The source of this CloudEvent.
        :type source: str
        """
        if source is None:
            raise ValueError("Invalid value for `source`, must not be `None`")  # noqa: E501
        if source is not None and len(source) < 1:
            raise ValueError("Invalid value for `source`, length must be greater than or equal to `1`")  # noqa: E501

        self._source = source

    @property
    def specversion(self) -> str:
        """Gets the specversion of this CloudEvent.

        The version of the CloudEvents specification which the event uses.  # noqa: E501

        :return: The specversion of this CloudEvent.
        :rtype: str
        """
        return self._specversion

    @specversion.setter
    def specversion(self, specversion: str):
        """Sets the specversion of this CloudEvent.

        The version of the CloudEvents specification which the event uses.  # noqa: E501

        :param specversion: The specversion of this CloudEvent.
        :type specversion: str
        """
        if specversion is None:
            raise ValueError("Invalid value for `specversion`, must not be `None`")  # noqa: E501
        if specversion is not None and len(specversion) < 1:
            raise ValueError("Invalid value for `specversion`, length must be greater than or equal to `1`")  # noqa: E501

        self._specversion = specversion

    @property
    def type(self) -> str:
        """Gets the type of this CloudEvent.

        Describes the type of event related to the originating occurrence.  # noqa: E501

        :return: The type of this CloudEvent.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this CloudEvent.

        Describes the type of event related to the originating occurrence.  # noqa: E501

        :param type: The type of this CloudEvent.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501
        if type is not None and len(type) < 1:
            raise ValueError("Invalid value for `type`, length must be greater than or equal to `1`")  # noqa: E501

        self._type = type

    @property
    def datacontenttype(self) -> str:
        """Gets the datacontenttype of this CloudEvent.

        Content type of the data value. Must adhere to RFC 2046 format.  # noqa: E501

        :return: The datacontenttype of this CloudEvent.
        :rtype: str
        """
        return self._datacontenttype

    @datacontenttype.setter
    def datacontenttype(self, datacontenttype: str):
        """Sets the datacontenttype of this CloudEvent.

        Content type of the data value. Must adhere to RFC 2046 format.  # noqa: E501

        :param datacontenttype: The datacontenttype of this CloudEvent.
        :type datacontenttype: str
        """
        if datacontenttype is not None and len(datacontenttype) < 1:
            raise ValueError("Invalid value for `datacontenttype`, length must be greater than or equal to `1`")  # noqa: E501

        self._datacontenttype = datacontenttype

    @property
    def dataschema(self) -> str:
        """Gets the dataschema of this CloudEvent.

        Identifies the schema that data adheres to.  # noqa: E501

        :return: The dataschema of this CloudEvent.
        :rtype: str
        """
        return self._dataschema

    @dataschema.setter
    def dataschema(self, dataschema: str):
        """Sets the dataschema of this CloudEvent.

        Identifies the schema that data adheres to.  # noqa: E501

        :param dataschema: The dataschema of this CloudEvent.
        :type dataschema: str
        """
        if dataschema is not None and len(dataschema) < 1:
            raise ValueError("Invalid value for `dataschema`, length must be greater than or equal to `1`")  # noqa: E501

        self._dataschema = dataschema

    @property
    def subject(self) -> str:
        """Gets the subject of this CloudEvent.

        Describes the subject of the event in the context of the event producer (identified by source).  # noqa: E501

        :return: The subject of this CloudEvent.
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject: str):
        """Sets the subject of this CloudEvent.

        Describes the subject of the event in the context of the event producer (identified by source).  # noqa: E501

        :param subject: The subject of this CloudEvent.
        :type subject: str
        """
        if subject is not None and len(subject) < 1:
            raise ValueError("Invalid value for `subject`, length must be greater than or equal to `1`")  # noqa: E501

        self._subject = subject

    @property
    def time(self) -> datetime:
        """Gets the time of this CloudEvent.

        Timestamp of when the occurrence happened. Must adhere to RFC 3339.  # noqa: E501

        :return: The time of this CloudEvent.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time: datetime):
        """Sets the time of this CloudEvent.

        Timestamp of when the occurrence happened. Must adhere to RFC 3339.  # noqa: E501

        :param time: The time of this CloudEvent.
        :type time: datetime
        """
        if time is not None and len(time) < 1:
            raise ValueError("Invalid value for `time`, length must be greater than or equal to `1`")  # noqa: E501

        self._time = time

    @property
    def data(self) -> CloudEventData:
        """Gets the data of this CloudEvent.


        :return: The data of this CloudEvent.
        :rtype: CloudEventData
        """
        return self._data

    @data.setter
    def data(self, data: CloudEventData):
        """Sets the data of this CloudEvent.


        :param data: The data of this CloudEvent.
        :type data: CloudEventData
        """

        self._data = data

    @property
    def data_base64(self) -> str:
        """Gets the data_base64 of this CloudEvent.

        Base64 encoded event payload. Must adhere to RFC4648.  # noqa: E501

        :return: The data_base64 of this CloudEvent.
        :rtype: str
        """
        return self._data_base64

    @data_base64.setter
    def data_base64(self, data_base64: str):
        """Sets the data_base64 of this CloudEvent.

        Base64 encoded event payload. Must adhere to RFC4648.  # noqa: E501

        :param data_base64: The data_base64 of this CloudEvent.
        :type data_base64: str
        """

        self._data_base64 = data_base64