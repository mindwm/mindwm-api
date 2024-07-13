# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from MindwWM.models.neo4j_capture_data_change_meta_source import Neo4jCaptureDataChangeMetaSource

class TestNeo4jCaptureDataChangeMetaSource(unittest.TestCase):
    """Neo4jCaptureDataChangeMetaSource unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Neo4jCaptureDataChangeMetaSource:
        """Test Neo4jCaptureDataChangeMetaSource
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Neo4jCaptureDataChangeMetaSource`
        """
        model = Neo4jCaptureDataChangeMetaSource()
        if include_optional:
            return Neo4jCaptureDataChangeMetaSource(
                hostname = ''
            )
        else:
            return Neo4jCaptureDataChangeMetaSource(
                hostname = '',
        )
        """

    def testNeo4jCaptureDataChangeMetaSource(self):
        """Test Neo4jCaptureDataChangeMetaSource"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
