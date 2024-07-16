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

from MindWM.models.io_document import IoDocument  # noqa: E501

class TestIoDocument(unittest.TestCase):
    """IoDocument unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> IoDocument:
        """Test IoDocument
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `IoDocument`
        """
        model = IoDocument()  # noqa: E501
        if include_optional:
            return IoDocument(
                type = '',
                source = 'eBAMDTMv2D2ylmgd10Z3UB6UkJSISSB5\\'qKX7HzKpul80FcVjSkp5IHYCm6w-v0dZfUofvKERjsmInY9s-EmMH6kw8gsnz\\ftmux\\uJFMWgxKGoOID+ZeUrdIMcX8BKxXxAbcfRIWWYFRBE6dB+lRX+6YlPIKV0ZFMc==.5c13353f-0aef-e481-d4ba-c008ee97abec\\Y64428489671318576363915338224935163074506805\\627935706\\Wtiodocument',
                data = {
                    'key' : null
                    },
                id = '0',
                specversion = '0',
                datacontenttype = '0',
                dataschema = '0',
                subject = 'IoDocument',
                time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                data_base64 = ''
            )
        else:
            return IoDocument(
                id = '0',
                specversion = '0',
        )
        """

    def testIoDocument(self):
        """Test IoDocument"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
