# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from MindwWM.models.neo4j_capture_data_change_node_payload_after import Neo4jCaptureDataChangeNodePayloadAfter

class TestNeo4jCaptureDataChangeNodePayloadAfter(unittest.TestCase):
    """Neo4jCaptureDataChangeNodePayloadAfter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Neo4jCaptureDataChangeNodePayloadAfter:
        """Test Neo4jCaptureDataChangeNodePayloadAfter
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Neo4jCaptureDataChangeNodePayloadAfter`
        """
        model = Neo4jCaptureDataChangeNodePayloadAfter()
        if include_optional:
            return Neo4jCaptureDataChangeNodePayloadAfter(
                labels = [
                    ''
                    ],
                properties = {
                    'key' : null
                    }
            )
        else:
            return Neo4jCaptureDataChangeNodePayloadAfter(
                labels = [
                    ''
                    ],
                properties = {
                    'key' : null
                    },
        )
        """

    def testNeo4jCaptureDataChangeNodePayloadAfter(self):
        """Test Neo4jCaptureDataChangeNodePayloadAfter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
