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

from MindWM.models.io_document_event import IoDocumentEvent  # noqa: E501

class TestIoDocumentEvent(unittest.TestCase):
    """IoDocumentEvent unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> IoDocumentEvent:
        """Test IoDocumentEvent
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `IoDocumentEvent`
        """
        model = IoDocumentEvent()  # noqa: E501
        if include_optional:
            return IoDocumentEvent(
                id = '0',
                source = '',
                specversion = '0',
                type = 'IoDocument',
                datacontenttype = '0',
                dataschema = '0',
                subject = 'IoDocument',
                time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                data = {
                    'key' : null
                    },
                data_base64 = ''
            )
        else:
            return IoDocumentEvent(
                id = '0',
                source = '',
                specversion = '0',
                type = 'IoDocument',
        )
        """

    def testIoDocumentEvent(self):
        """Test IoDocumentEvent"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
