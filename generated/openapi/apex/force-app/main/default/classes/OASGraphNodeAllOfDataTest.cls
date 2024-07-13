@isTest
private class OASGraphNodeAllOfDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASGraphNodeAllOfData graphNodeAllOfData1 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData2 = graphNodeAllOfData1;
        OASGraphNodeAllOfData graphNodeAllOfData3 = new OASGraphNodeAllOfData();
        OASGraphNodeAllOfData graphNodeAllOfData4 = graphNodeAllOfData3;

        System.assert(graphNodeAllOfData1.equals(graphNodeAllOfData2));
        System.assert(graphNodeAllOfData2.equals(graphNodeAllOfData1));
        System.assert(graphNodeAllOfData1.equals(graphNodeAllOfData1));
        System.assert(graphNodeAllOfData3.equals(graphNodeAllOfData4));
        System.assert(graphNodeAllOfData4.equals(graphNodeAllOfData3));
        System.assert(graphNodeAllOfData3.equals(graphNodeAllOfData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGraphNodeAllOfData graphNodeAllOfData1 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData2 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData3 = new OASGraphNodeAllOfData();
        OASGraphNodeAllOfData graphNodeAllOfData4 = new OASGraphNodeAllOfData();

        System.assert(graphNodeAllOfData1.equals(graphNodeAllOfData2));
        System.assert(graphNodeAllOfData2.equals(graphNodeAllOfData1));
        System.assert(graphNodeAllOfData3.equals(graphNodeAllOfData4));
        System.assert(graphNodeAllOfData4.equals(graphNodeAllOfData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGraphNodeAllOfData graphNodeAllOfData1 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData2 = new OASGraphNodeAllOfData();

        System.assertEquals(false, graphNodeAllOfData1.equals('foo'));
        System.assertEquals(false, graphNodeAllOfData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGraphNodeAllOfData graphNodeAllOfData1 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData2 = new OASGraphNodeAllOfData();
        OASGraphNodeAllOfData graphNodeAllOfData3;

        System.assertEquals(false, graphNodeAllOfData1.equals(graphNodeAllOfData3));
        System.assertEquals(false, graphNodeAllOfData2.equals(graphNodeAllOfData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGraphNodeAllOfData graphNodeAllOfData1 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData2 = new OASGraphNodeAllOfData();

        System.assertEquals(graphNodeAllOfData1.hashCode(), graphNodeAllOfData1.hashCode());
        System.assertEquals(graphNodeAllOfData2.hashCode(), graphNodeAllOfData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGraphNodeAllOfData graphNodeAllOfData1 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData2 = OASGraphNodeAllOfData.getExample();
        OASGraphNodeAllOfData graphNodeAllOfData3 = new OASGraphNodeAllOfData();
        OASGraphNodeAllOfData graphNodeAllOfData4 = new OASGraphNodeAllOfData();

        System.assert(graphNodeAllOfData1.equals(graphNodeAllOfData2));
        System.assert(graphNodeAllOfData3.equals(graphNodeAllOfData4));
        System.assertEquals(graphNodeAllOfData1.hashCode(), graphNodeAllOfData2.hashCode());
        System.assertEquals(graphNodeAllOfData3.hashCode(), graphNodeAllOfData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGraphNodeAllOfData graphNodeAllOfData = new OASGraphNodeAllOfData();
        Map<String, String> x-property-mappings = graphNodeAllOfData.getx-property-mappings();
        System.assertEquals('messageKey', x-property-mappings.get('message_key'));
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
    }
}
