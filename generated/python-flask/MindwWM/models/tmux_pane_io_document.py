from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from MindwWM.models.base_model import Model
from MindwWM import util


class TmuxPaneIoDocument(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, input=None, output=None, ps1=None):  # noqa: E501
        """TmuxPaneIoDocument - a model defined in OpenAPI

        :param input: The input of this TmuxPaneIoDocument.  # noqa: E501
        :type input: str
        :param output: The output of this TmuxPaneIoDocument.  # noqa: E501
        :type output: str
        :param ps1: The ps1 of this TmuxPaneIoDocument.  # noqa: E501
        :type ps1: str
        """
        self.openapi_types = {
            'input': str,
            'output': str,
            'ps1': str
        }

        self.attribute_map = {
            'input': 'input',
            'output': 'output',
            'ps1': 'ps1'
        }

        self._input = input
        self._output = output
        self._ps1 = ps1

    @classmethod
    def from_dict(cls, dikt) -> 'TmuxPaneIoDocument':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TmuxPaneIoDocument of this TmuxPaneIoDocument.  # noqa: E501
        :rtype: TmuxPaneIoDocument
        """
        return util.deserialize_model(dikt, cls)

    @property
    def input(self) -> str:
        """Gets the input of this TmuxPaneIoDocument.

        User input  # noqa: E501

        :return: The input of this TmuxPaneIoDocument.
        :rtype: str
        """
        return self._input

    @input.setter
    def input(self, input: str):
        """Sets the input of this TmuxPaneIoDocument.

        User input  # noqa: E501

        :param input: The input of this TmuxPaneIoDocument.
        :type input: str
        """
        if input is None:
            raise ValueError("Invalid value for `input`, must not be `None`")  # noqa: E501
        if input is not None and len(input) < 1:
            raise ValueError("Invalid value for `input`, length must be greater than or equal to `1`")  # noqa: E501

        self._input = input

    @property
    def output(self) -> str:
        """Gets the output of this TmuxPaneIoDocument.

        Command output (mix of stdout & stderr)  # noqa: E501

        :return: The output of this TmuxPaneIoDocument.
        :rtype: str
        """
        return self._output

    @output.setter
    def output(self, output: str):
        """Sets the output of this TmuxPaneIoDocument.

        Command output (mix of stdout & stderr)  # noqa: E501

        :param output: The output of this TmuxPaneIoDocument.
        :type output: str
        """
        if output is None:
            raise ValueError("Invalid value for `output`, must not be `None`")  # noqa: E501
        if output is not None and len(output) < 0:
            raise ValueError("Invalid value for `output`, length must be greater than or equal to `0`")  # noqa: E501

        self._output = output

    @property
    def ps1(self) -> str:
        """Gets the ps1 of this TmuxPaneIoDocument.

        ps1 (prompt) AFTER the input and output  # noqa: E501

        :return: The ps1 of this TmuxPaneIoDocument.
        :rtype: str
        """
        return self._ps1

    @ps1.setter
    def ps1(self, ps1: str):
        """Sets the ps1 of this TmuxPaneIoDocument.

        ps1 (prompt) AFTER the input and output  # noqa: E501

        :param ps1: The ps1 of this TmuxPaneIoDocument.
        :type ps1: str
        """
        if ps1 is None:
            raise ValueError("Invalid value for `ps1`, must not be `None`")  # noqa: E501
        if ps1 is not None and len(ps1) < 1:
            raise ValueError("Invalid value for `ps1`, length must be greater than or equal to `1`")  # noqa: E501

        self._ps1 = ps1
