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

from MindwWM.models.neo4j_capture_data_change_relationship_payload import Neo4jCaptureDataChangeRelationshipPayload  # noqa: E501

class TestNeo4jCaptureDataChangeRelationshipPayload(unittest.TestCase):
    """Neo4jCaptureDataChangeRelationshipPayload unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Neo4jCaptureDataChangeRelationshipPayload:
        """Test Neo4jCaptureDataChangeRelationshipPayload
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Neo4jCaptureDataChangeRelationshipPayload`
        """
        model = Neo4jCaptureDataChangeRelationshipPayload()  # noqa: E501
        if include_optional:
            return Neo4jCaptureDataChangeRelationshipPayload(
                after = None,
                before = '',
                end = MindwWM.models.neo4j_capture_data_change_relationship_payload_end.Neo4jCaptureDataChangeRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
                id = '',
                label = '',
                start = MindwWM.models.neo4j_capture_data_change_relationship_payload_end.Neo4jCaptureDataChangeRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
                type = ''
            )
        else:
            return Neo4jCaptureDataChangeRelationshipPayload(
                after = None,
                before = '',
                end = MindwWM.models.neo4j_capture_data_change_relationship_payload_end.Neo4jCaptureDataChangeRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
                id = '',
                label = '',
                start = MindwWM.models.neo4j_capture_data_change_relationship_payload_end.Neo4jCaptureDataChangeRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
                type = '',
        )
        """

    def testNeo4jCaptureDataChangeRelationshipPayload(self):
        """Test Neo4jCaptureDataChangeRelationshipPayload"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()