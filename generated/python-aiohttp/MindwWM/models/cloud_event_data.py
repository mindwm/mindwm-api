# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from MindwWM.models.base_model import Model
from MindwWM import util


class CloudEventData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self):
        """CloudEventData - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt: dict) -> 'CloudEventData':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The CloudEvent_data of this CloudEventData.
        """
        return util.deserialize_model(dikt, cls)
