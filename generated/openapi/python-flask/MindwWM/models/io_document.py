from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from MindwWM.models.base_model import Model
from MindwWM.models.tmux_pane_io_document import TmuxPaneIoDocument
import re
from MindwWM import util

from MindwWM.models.tmux_pane_io_document import TmuxPaneIoDocument  # noqa: E501
import re  # noqa: E501

class IoDocument(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, type=None, source=None, data=None, id=None, specversion=None, datacontenttype=None, dataschema=None, subject='IoDocument', time=None, data_base64=None):  # noqa: E501
        """IoDocument - a model defined in OpenAPI

        :param type: The type of this IoDocument.  # noqa: E501
        :type type: str
        :param source: The source of this IoDocument.  # noqa: E501
        :type source: str
        :param data: The data of this IoDocument.  # noqa: E501
        :type data: TmuxPaneIoDocument
        :param id: The id of this IoDocument.  # noqa: E501
        :type id: str
        :param specversion: The specversion of this IoDocument.  # noqa: E501
        :type specversion: str
        :param datacontenttype: The datacontenttype of this IoDocument.  # noqa: E501
        :type datacontenttype: str
        :param dataschema: The dataschema of this IoDocument.  # noqa: E501
        :type dataschema: str
        :param subject: The subject of this IoDocument.  # noqa: E501
        :type subject: str
        :param time: The time of this IoDocument.  # noqa: E501
        :type time: datetime
        :param data_base64: The data_base64 of this IoDocument.  # noqa: E501
        :type data_base64: str
        """
        self.openapi_types = {
            'type': str,
            'source': str,
            'data': TmuxPaneIoDocument,
            'id': str,
            'specversion': str,
            'datacontenttype': str,
            'dataschema': str,
            'subject': str,
            'time': datetime,
            'data_base64': str
        }

        self.attribute_map = {
            'type': 'type',
            'source': 'source',
            'data': 'data',
            'id': 'id',
            'specversion': 'specversion',
            'datacontenttype': 'datacontenttype',
            'dataschema': 'dataschema',
            'subject': 'subject',
            'time': 'time',
            'data_base64': 'data_base64'
        }

        self._type = type
        self._source = source
        self._data = data
        self._id = id
        self._specversion = specversion
        self._datacontenttype = datacontenttype
        self._dataschema = dataschema
        self._subject = subject
        self._time = time
        self._data_base64 = data_base64

    @classmethod
    def from_dict(cls, dikt) -> 'IoDocument':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The IoDocument of this IoDocument.  # noqa: E501
        :rtype: IoDocument
        """
        return util.deserialize_model(dikt, cls)

    @property
    def type(self) -> str:
        """Gets the type of this IoDocument.


        :return: The type of this IoDocument.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this IoDocument.


        :param type: The type of this IoDocument.
        :type type: str
        """

        self._type = type

    @property
    def source(self) -> str:
        """Gets the source of this IoDocument.


        :return: The source of this IoDocument.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source: str):
        """Sets the source of this IoDocument.


        :param source: The source of this IoDocument.
        :type source: str
        """
        if source is not None and not re.search(r'[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\.tmux\\.[A-Za-z0-9+\/]*={0,2}\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\.[0-9]+?\\.[0-9]+?\\.tiodocument$', source):  # noqa: E501
            raise ValueError("Invalid value for `source`, must be a follow pattern or equal to `/[a-zA-Z0-9_][a-zA-Z0-9_-]{0,31}\\.(?!-)[a-zA-Z0-9-]{1,63}(?<!-)\\.tmux\\.[A-Za-z0-9+\/]*={0,2}\.[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\.[0-9]+?\\.[0-9]+?\\.tiodocument$/`")  # noqa: E501

        self._source = source

    @property
    def data(self) -> TmuxPaneIoDocument:
        """Gets the data of this IoDocument.


        :return: The data of this IoDocument.
        :rtype: TmuxPaneIoDocument
        """
        return self._data

    @data.setter
    def data(self, data: TmuxPaneIoDocument):
        """Sets the data of this IoDocument.


        :param data: The data of this IoDocument.
        :type data: TmuxPaneIoDocument
        """

        self._data = data

    @property
    def id(self) -> str:
        """Gets the id of this IoDocument.

        Identifies the event.  # noqa: E501

        :return: The id of this IoDocument.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this IoDocument.

        Identifies the event.  # noqa: E501

        :param id: The id of this IoDocument.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501
        if id is not None and len(id) < 1:
            raise ValueError("Invalid value for `id`, length must be greater than or equal to `1`")  # noqa: E501

        self._id = id

    @property
    def specversion(self) -> str:
        """Gets the specversion of this IoDocument.

        The version of the CloudEvents specification which the event uses.  # noqa: E501

        :return: The specversion of this IoDocument.
        :rtype: str
        """
        return self._specversion

    @specversion.setter
    def specversion(self, specversion: str):
        """Sets the specversion of this IoDocument.

        The version of the CloudEvents specification which the event uses.  # noqa: E501

        :param specversion: The specversion of this IoDocument.
        :type specversion: str
        """
        if specversion is None:
            raise ValueError("Invalid value for `specversion`, must not be `None`")  # noqa: E501
        if specversion is not None and len(specversion) < 1:
            raise ValueError("Invalid value for `specversion`, length must be greater than or equal to `1`")  # noqa: E501

        self._specversion = specversion

    @property
    def datacontenttype(self) -> str:
        """Gets the datacontenttype of this IoDocument.

        Content type of the data value. Must adhere to RFC 2046 format.  # noqa: E501

        :return: The datacontenttype of this IoDocument.
        :rtype: str
        """
        return self._datacontenttype

    @datacontenttype.setter
    def datacontenttype(self, datacontenttype: str):
        """Sets the datacontenttype of this IoDocument.

        Content type of the data value. Must adhere to RFC 2046 format.  # noqa: E501

        :param datacontenttype: The datacontenttype of this IoDocument.
        :type datacontenttype: str
        """
        if datacontenttype is not None and len(datacontenttype) < 1:
            raise ValueError("Invalid value for `datacontenttype`, length must be greater than or equal to `1`")  # noqa: E501

        self._datacontenttype = datacontenttype

    @property
    def dataschema(self) -> str:
        """Gets the dataschema of this IoDocument.

        Identifies the schema that data adheres to.  # noqa: E501

        :return: The dataschema of this IoDocument.
        :rtype: str
        """
        return self._dataschema

    @dataschema.setter
    def dataschema(self, dataschema: str):
        """Sets the dataschema of this IoDocument.

        Identifies the schema that data adheres to.  # noqa: E501

        :param dataschema: The dataschema of this IoDocument.
        :type dataschema: str
        """
        if dataschema is not None and len(dataschema) < 1:
            raise ValueError("Invalid value for `dataschema`, length must be greater than or equal to `1`")  # noqa: E501

        self._dataschema = dataschema

    @property
    def subject(self) -> str:
        """Gets the subject of this IoDocument.


        :return: The subject of this IoDocument.
        :rtype: str
        """
        return self._subject

    @subject.setter
    def subject(self, subject: str):
        """Sets the subject of this IoDocument.


        :param subject: The subject of this IoDocument.
        :type subject: str
        """

        self._subject = subject

    @property
    def time(self) -> datetime:
        """Gets the time of this IoDocument.

        Timestamp of when the occurrence happened. Must adhere to RFC 3339.  # noqa: E501

        :return: The time of this IoDocument.
        :rtype: datetime
        """
        return self._time

    @time.setter
    def time(self, time: datetime):
        """Sets the time of this IoDocument.

        Timestamp of when the occurrence happened. Must adhere to RFC 3339.  # noqa: E501

        :param time: The time of this IoDocument.
        :type time: datetime
        """
        if time is not None and len(time) < 1:
            raise ValueError("Invalid value for `time`, length must be greater than or equal to `1`")  # noqa: E501

        self._time = time

    @property
    def data_base64(self) -> str:
        """Gets the data_base64 of this IoDocument.

        Base64 encoded event payload. Must adhere to RFC4648.  # noqa: E501

        :return: The data_base64 of this IoDocument.
        :rtype: str
        """
        return self._data_base64

    @data_base64.setter
    def data_base64(self, data_base64: str):
        """Sets the data_base64 of this IoDocument.

        Base64 encoded event payload. Must adhere to RFC4648.  # noqa: E501

        :param data_base64: The data_base64 of this IoDocument.
        :type data_base64: str
        """

        self._data_base64 = data_base64
