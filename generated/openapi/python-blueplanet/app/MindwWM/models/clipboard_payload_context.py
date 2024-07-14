# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.MindwWM.models.base_model import Model
from MindwWM import util


class ClipboardPayloadContext(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, window: str=None):  # noqa: E501
        """ClipboardPayloadContext - a model defined in Swagger

        :param window: The window of this ClipboardPayloadContext.  # noqa: E501
        :type window: str
        """
        self.swagger_types = {
            'window': str
        }

        self.attribute_map = {
            'window': 'window'
        }

        self._window = window

    @classmethod
    def from_dict(cls, dikt) -> 'ClipboardPayloadContext':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ClipboardPayload_context of this ClipboardPayloadContext.  # noqa: E501
        :rtype: ClipboardPayloadContext
        """
        return util.deserialize_model(dikt, cls)

    @property
    def window(self) -> str:
        """Gets the window of this ClipboardPayloadContext.

        window id  # noqa: E501

        :return: The window of this ClipboardPayloadContext.
        :rtype: str
        """
        return self._window

    @window.setter
    def window(self, window: str):
        """Sets the window of this ClipboardPayloadContext.

        window id  # noqa: E501

        :param window: The window of this ClipboardPayloadContext.
        :type window: str
        """

        self._window = window