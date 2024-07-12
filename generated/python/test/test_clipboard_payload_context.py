# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from MindwWM.models.clipboard_payload_context import ClipboardPayloadContext

class TestClipboardPayloadContext(unittest.TestCase):
    """ClipboardPayloadContext unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ClipboardPayloadContext:
        """Test ClipboardPayloadContext
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ClipboardPayloadContext`
        """
        model = ClipboardPayloadContext()
        if include_optional:
            return ClipboardPayloadContext(
                window = ''
            )
        else:
            return ClipboardPayloadContext(
        )
        """

    def testClipboardPayloadContext(self):
        """Test ClipboardPayloadContext"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()