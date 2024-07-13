# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from MindwWM.models.base_model import Model
from MindwWM.models.neo4j_capture_data_change_meta import Neo4jCaptureDataChangeMeta
from MindwWM.models.neo4j_capture_data_change_relationship_payload import Neo4jCaptureDataChangeRelationshipPayload
from MindwWM.models.neo4j_capture_data_change_schema import Neo4jCaptureDataChangeSchema
from MindwWM import util


class GraphRelationshipAllOfData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, headers: object=None, message_key: str=None, meta: Neo4jCaptureDataChangeMeta=None, offset: int=None, partition: int=None, source_type: str=None, timestamp: datetime=None, topic: str=None, _schema: Neo4jCaptureDataChangeSchema=None, payload: Neo4jCaptureDataChangeRelationshipPayload=None):
        """GraphRelationshipAllOfData - a model defined in OpenAPI

        :param headers: The headers of this GraphRelationshipAllOfData.
        :param message_key: The message_key of this GraphRelationshipAllOfData.
        :param meta: The meta of this GraphRelationshipAllOfData.
        :param offset: The offset of this GraphRelationshipAllOfData.
        :param partition: The partition of this GraphRelationshipAllOfData.
        :param source_type: The source_type of this GraphRelationshipAllOfData.
        :param timestamp: The timestamp of this GraphRelationshipAllOfData.
        :param topic: The topic of this GraphRelationshipAllOfData.
        :param _schema: The _schema of this GraphRelationshipAllOfData.
        :param payload: The payload of this GraphRelationshipAllOfData.
        """
        self.openapi_types = {
            'headers': object,
            'message_key': str,
            'meta': Neo4jCaptureDataChangeMeta,
            'offset': int,
            'partition': int,
            'source_type': str,
            'timestamp': datetime,
            'topic': str,
            '_schema': Neo4jCaptureDataChangeSchema,
            'payload': Neo4jCaptureDataChangeRelationshipPayload
        }

        self.attribute_map = {
            'headers': 'headers',
            'message_key': 'message_key',
            'meta': 'meta',
            'offset': 'offset',
            'partition': 'partition',
            'source_type': 'source_type',
            'timestamp': 'timestamp',
            'topic': 'topic',
            '_schema': 'schema',
            'payload': 'payload'
        }

        self._headers = headers
        self._message_key = message_key
        self._meta = meta
        self._offset = offset
        self._partition = partition
        self._source_type = source_type
        self._timestamp = timestamp
        self._topic = topic
        self.__schema = _schema
        self._payload = payload

    @classmethod
    def from_dict(cls, dikt: dict) -> 'GraphRelationshipAllOfData':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The GraphRelationship_allOf_data of this GraphRelationshipAllOfData.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def headers(self):
        """Gets the headers of this GraphRelationshipAllOfData.


        :return: The headers of this GraphRelationshipAllOfData.
        :rtype: object
        """
        return self._headers

    @headers.setter
    def headers(self, headers):
        """Sets the headers of this GraphRelationshipAllOfData.


        :param headers: The headers of this GraphRelationshipAllOfData.
        :type headers: object
        """
        if headers is None:
            raise ValueError("Invalid value for `headers`, must not be `None`")

        self._headers = headers

    @property
    def message_key(self):
        """Gets the message_key of this GraphRelationshipAllOfData.


        :return: The message_key of this GraphRelationshipAllOfData.
        :rtype: str
        """
        return self._message_key

    @message_key.setter
    def message_key(self, message_key):
        """Sets the message_key of this GraphRelationshipAllOfData.


        :param message_key: The message_key of this GraphRelationshipAllOfData.
        :type message_key: str
        """
        if message_key is None:
            raise ValueError("Invalid value for `message_key`, must not be `None`")

        self._message_key = message_key

    @property
    def meta(self):
        """Gets the meta of this GraphRelationshipAllOfData.


        :return: The meta of this GraphRelationshipAllOfData.
        :rtype: Neo4jCaptureDataChangeMeta
        """
        return self._meta

    @meta.setter
    def meta(self, meta):
        """Sets the meta of this GraphRelationshipAllOfData.


        :param meta: The meta of this GraphRelationshipAllOfData.
        :type meta: Neo4jCaptureDataChangeMeta
        """
        if meta is None:
            raise ValueError("Invalid value for `meta`, must not be `None`")

        self._meta = meta

    @property
    def offset(self):
        """Gets the offset of this GraphRelationshipAllOfData.


        :return: The offset of this GraphRelationshipAllOfData.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset):
        """Sets the offset of this GraphRelationshipAllOfData.


        :param offset: The offset of this GraphRelationshipAllOfData.
        :type offset: int
        """
        if offset is None:
            raise ValueError("Invalid value for `offset`, must not be `None`")

        self._offset = offset

    @property
    def partition(self):
        """Gets the partition of this GraphRelationshipAllOfData.


        :return: The partition of this GraphRelationshipAllOfData.
        :rtype: int
        """
        return self._partition

    @partition.setter
    def partition(self, partition):
        """Sets the partition of this GraphRelationshipAllOfData.


        :param partition: The partition of this GraphRelationshipAllOfData.
        :type partition: int
        """
        if partition is None:
            raise ValueError("Invalid value for `partition`, must not be `None`")

        self._partition = partition

    @property
    def source_type(self):
        """Gets the source_type of this GraphRelationshipAllOfData.


        :return: The source_type of this GraphRelationshipAllOfData.
        :rtype: str
        """
        return self._source_type

    @source_type.setter
    def source_type(self, source_type):
        """Sets the source_type of this GraphRelationshipAllOfData.


        :param source_type: The source_type of this GraphRelationshipAllOfData.
        :type source_type: str
        """
        if source_type is None:
            raise ValueError("Invalid value for `source_type`, must not be `None`")

        self._source_type = source_type

    @property
    def timestamp(self):
        """Gets the timestamp of this GraphRelationshipAllOfData.


        :return: The timestamp of this GraphRelationshipAllOfData.
        :rtype: datetime
        """
        return self._timestamp

    @timestamp.setter
    def timestamp(self, timestamp):
        """Sets the timestamp of this GraphRelationshipAllOfData.


        :param timestamp: The timestamp of this GraphRelationshipAllOfData.
        :type timestamp: datetime
        """
        if timestamp is None:
            raise ValueError("Invalid value for `timestamp`, must not be `None`")

        self._timestamp = timestamp

    @property
    def topic(self):
        """Gets the topic of this GraphRelationshipAllOfData.


        :return: The topic of this GraphRelationshipAllOfData.
        :rtype: str
        """
        return self._topic

    @topic.setter
    def topic(self, topic):
        """Sets the topic of this GraphRelationshipAllOfData.


        :param topic: The topic of this GraphRelationshipAllOfData.
        :type topic: str
        """
        if topic is None:
            raise ValueError("Invalid value for `topic`, must not be `None`")

        self._topic = topic

    @property
    def _schema(self):
        """Gets the _schema of this GraphRelationshipAllOfData.


        :return: The _schema of this GraphRelationshipAllOfData.
        :rtype: Neo4jCaptureDataChangeSchema
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema):
        """Sets the _schema of this GraphRelationshipAllOfData.


        :param _schema: The _schema of this GraphRelationshipAllOfData.
        :type _schema: Neo4jCaptureDataChangeSchema
        """
        if _schema is None:
            raise ValueError("Invalid value for `_schema`, must not be `None`")

        self.__schema = _schema

    @property
    def payload(self):
        """Gets the payload of this GraphRelationshipAllOfData.


        :return: The payload of this GraphRelationshipAllOfData.
        :rtype: Neo4jCaptureDataChangeRelationshipPayload
        """
        return self._payload

    @payload.setter
    def payload(self, payload):
        """Sets the payload of this GraphRelationshipAllOfData.


        :param payload: The payload of this GraphRelationshipAllOfData.
        :type payload: Neo4jCaptureDataChangeRelationshipPayload
        """
        if payload is None:
            raise ValueError("Invalid value for `payload`, must not be `None`")

        self._payload = payload
