@isTest
private class OASGraphNodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASGraphNode graphNode1 = OASGraphNode.getExample();
        OASGraphNode graphNode2 = graphNode1;
        OASGraphNode graphNode3 = new OASGraphNode();
        OASGraphNode graphNode4 = graphNode3;

        System.assert(graphNode1.equals(graphNode2));
        System.assert(graphNode2.equals(graphNode1));
        System.assert(graphNode1.equals(graphNode1));
        System.assert(graphNode3.equals(graphNode4));
        System.assert(graphNode4.equals(graphNode3));
        System.assert(graphNode3.equals(graphNode3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGraphNode graphNode1 = OASGraphNode.getExample();
        OASGraphNode graphNode2 = OASGraphNode.getExample();
        OASGraphNode graphNode3 = new OASGraphNode();
        OASGraphNode graphNode4 = new OASGraphNode();

        System.assert(graphNode1.equals(graphNode2));
        System.assert(graphNode2.equals(graphNode1));
        System.assert(graphNode3.equals(graphNode4));
        System.assert(graphNode4.equals(graphNode3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGraphNode graphNode1 = OASGraphNode.getExample();
        OASGraphNode graphNode2 = new OASGraphNode();

        System.assertEquals(false, graphNode1.equals('foo'));
        System.assertEquals(false, graphNode2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGraphNode graphNode1 = OASGraphNode.getExample();
        OASGraphNode graphNode2 = new OASGraphNode();
        OASGraphNode graphNode3;

        System.assertEquals(false, graphNode1.equals(graphNode3));
        System.assertEquals(false, graphNode2.equals(graphNode3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGraphNode graphNode1 = OASGraphNode.getExample();
        OASGraphNode graphNode2 = new OASGraphNode();

        System.assertEquals(graphNode1.hashCode(), graphNode1.hashCode());
        System.assertEquals(graphNode2.hashCode(), graphNode2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGraphNode graphNode1 = OASGraphNode.getExample();
        OASGraphNode graphNode2 = OASGraphNode.getExample();
        OASGraphNode graphNode3 = new OASGraphNode();
        OASGraphNode graphNode4 = new OASGraphNode();

        System.assert(graphNode1.equals(graphNode2));
        System.assert(graphNode3.equals(graphNode4));
        System.assertEquals(graphNode1.hashCode(), graphNode2.hashCode());
        System.assertEquals(graphNode3.hashCode(), graphNode4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGraphNode graphNode = new OASGraphNode();
        Map<String, String> x-property-mappings = graphNode.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
        System.assertEquals('dataBase64', x-property-mappings.get('data_base64'));
    }
}
