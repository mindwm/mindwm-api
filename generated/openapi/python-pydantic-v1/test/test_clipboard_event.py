# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from MindWM.models.clipboard_event import ClipboardEvent  # noqa: E501

class TestClipboardEvent(unittest.TestCase):
    """ClipboardEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ClipboardEvent:
        """Test ClipboardEvent
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ClipboardEvent`
        """
        model = ClipboardEvent()  # noqa: E501
        if include_optional:
            return ClipboardEvent(
                id = '0',
                source = '',
                specversion = '0',
                type = 'Clipboard',
                datacontenttype = '0',
                dataschema = '0',
                subject = 'Clipboard',
                time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                data = {
                    'key' : null
                    },
                data_base64 = ''
            )
        else:
            return ClipboardEvent(
                id = '0',
                source = '',
                specversion = '0',
                type = 'Clipboard',
        )
        """

    def testClipboardEvent(self):
        """Test ClipboardEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()