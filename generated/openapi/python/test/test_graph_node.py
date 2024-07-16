# coding: utf-8

"""
    Mindwm API

    This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

    The version of the OpenAPI document: 0.1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from MindWM.models.graph_node import GraphNode

class TestGraphNode(unittest.TestCase):
    """GraphNode unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GraphNode:
        """Test GraphNode
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GraphNode`
        """
        model = GraphNode()
        if include_optional:
            return GraphNode(
                id = '0',
                source = 'graph.node',
                specversion = '0',
                type = 'created',
                datacontenttype = '0',
                dataschema = '0',
                subject = '0',
                time = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                data = None,
                data_base64 = ''
            )
        else:
            return GraphNode(
                id = '0',
                source = 'graph.node',
                specversion = '0',
                type = 'created',
        )
        """

    def testGraphNode(self):
        """Test GraphNode"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
