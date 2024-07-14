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

from MindwWM.models.graph_node_all_of_data import GraphNodeAllOfData  # noqa: E501

class TestGraphNodeAllOfData(unittest.TestCase):
    """GraphNodeAllOfData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GraphNodeAllOfData:
        """Test GraphNodeAllOfData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GraphNodeAllOfData`
        """
        model = GraphNodeAllOfData()  # noqa: E501
        if include_optional:
            return GraphNodeAllOfData(
                headers = MindwWM.models.headers.headers(),
                message_key = '',
                meta = MindwWM.models.neo4j_capture_data_change_meta.Neo4jCaptureDataChange_meta(
                    operation = '', 
                    source = MindwWM.models.neo4j_capture_data_change_meta_source.Neo4jCaptureDataChange_meta_source(
                        hostname = '', ), 
                    timestamp = 56, 
                    tx_event_id = 56, 
                    tx_events_count = 56, 
                    tx_id = 56, 
                    username = '', ),
                offset = 56,
                partition = 56,
                source_type = '',
                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                topic = '',
                var_schema = MindwWM.models.neo4j_capture_data_change_schema.Neo4jCaptureDataChange_schema(
                    constraints = {
                        'key' : null
                        }, 
                    properties = {
                        'key' : null
                        }, ),
                payload = MindwWM.models.neo4j_capture_data_change_node_payload.Neo4jCaptureDataChangeNodePayload(
                    after = MindwWM.models.neo4j_capture_data_change_node_payload_after.Neo4jCaptureDataChangeNodePayload_after(
                        labels = [
                            ''
                            ], 
                        properties = {
                            'key' : null
                            }, ), 
                    before = '', 
                    id = '', 
                    type = '', )
            )
        else:
            return GraphNodeAllOfData(
                headers = MindwWM.models.headers.headers(),
                message_key = '',
                meta = MindwWM.models.neo4j_capture_data_change_meta.Neo4jCaptureDataChange_meta(
                    operation = '', 
                    source = MindwWM.models.neo4j_capture_data_change_meta_source.Neo4jCaptureDataChange_meta_source(
                        hostname = '', ), 
                    timestamp = 56, 
                    tx_event_id = 56, 
                    tx_events_count = 56, 
                    tx_id = 56, 
                    username = '', ),
                offset = 56,
                partition = 56,
                source_type = '',
                timestamp = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                topic = '',
                var_schema = MindwWM.models.neo4j_capture_data_change_schema.Neo4jCaptureDataChange_schema(
                    constraints = {
                        'key' : null
                        }, 
                    properties = {
                        'key' : null
                        }, ),
                payload = MindwWM.models.neo4j_capture_data_change_node_payload.Neo4jCaptureDataChangeNodePayload(
                    after = MindwWM.models.neo4j_capture_data_change_node_payload_after.Neo4jCaptureDataChangeNodePayload_after(
                        labels = [
                            ''
                            ], 
                        properties = {
                            'key' : null
                            }, ), 
                    before = '', 
                    id = '', 
                    type = '', ),
        )
        """

    def testGraphNodeAllOfData(self):
        """Test GraphNodeAllOfData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()