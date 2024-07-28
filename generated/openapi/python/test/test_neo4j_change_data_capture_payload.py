# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from MindWM.models.neo4j_change_data_capture_payload import Neo4jChangeDataCapturePayload

class TestNeo4jChangeDataCapturePayload(unittest.TestCase):
    """Neo4jChangeDataCapturePayload unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Neo4jChangeDataCapturePayload:
        """Test Neo4jChangeDataCapturePayload
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Neo4jChangeDataCapturePayload`
        """
        model = Neo4jChangeDataCapturePayload()
        if include_optional:
            return Neo4jChangeDataCapturePayload(
                after = MindWM.models.after.after(),
                before = '',
                id = '',
                type = '',
                end = MindWM.models.neo4j_change_data_capture_relationship_payload_end.Neo4jChangeDataCaptureRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
                label = '',
                start = MindWM.models.neo4j_change_data_capture_relationship_payload_end.Neo4jChangeDataCaptureRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], )
            )
        else:
            return Neo4jChangeDataCapturePayload(
                after = MindWM.models.after.after(),
                before = '',
                id = '',
                type = '',
                end = MindWM.models.neo4j_change_data_capture_relationship_payload_end.Neo4jChangeDataCaptureRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
                label = '',
                start = MindWM.models.neo4j_change_data_capture_relationship_payload_end.Neo4jChangeDataCaptureRelationshipPayload_end(
                    id = '', 
                    ids = {
                        'key' : null
                        }, 
                    labels = [
                        ''
                        ], ),
        )
        """

    def testNeo4jChangeDataCapturePayload(self):
        """Test Neo4jChangeDataCapturePayload"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()