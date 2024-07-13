@isTest
private class OASGraphRelationshipAllOfDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData1 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData2 = graphRelationshipAllOfData1;
        OASGraphRelationshipAllOfData graphRelationshipAllOfData3 = new OASGraphRelationshipAllOfData();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData4 = graphRelationshipAllOfData3;

        System.assert(graphRelationshipAllOfData1.equals(graphRelationshipAllOfData2));
        System.assert(graphRelationshipAllOfData2.equals(graphRelationshipAllOfData1));
        System.assert(graphRelationshipAllOfData1.equals(graphRelationshipAllOfData1));
        System.assert(graphRelationshipAllOfData3.equals(graphRelationshipAllOfData4));
        System.assert(graphRelationshipAllOfData4.equals(graphRelationshipAllOfData3));
        System.assert(graphRelationshipAllOfData3.equals(graphRelationshipAllOfData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData1 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData2 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData3 = new OASGraphRelationshipAllOfData();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData4 = new OASGraphRelationshipAllOfData();

        System.assert(graphRelationshipAllOfData1.equals(graphRelationshipAllOfData2));
        System.assert(graphRelationshipAllOfData2.equals(graphRelationshipAllOfData1));
        System.assert(graphRelationshipAllOfData3.equals(graphRelationshipAllOfData4));
        System.assert(graphRelationshipAllOfData4.equals(graphRelationshipAllOfData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData1 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData2 = new OASGraphRelationshipAllOfData();

        System.assertEquals(false, graphRelationshipAllOfData1.equals('foo'));
        System.assertEquals(false, graphRelationshipAllOfData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData1 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData2 = new OASGraphRelationshipAllOfData();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData3;

        System.assertEquals(false, graphRelationshipAllOfData1.equals(graphRelationshipAllOfData3));
        System.assertEquals(false, graphRelationshipAllOfData2.equals(graphRelationshipAllOfData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData1 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData2 = new OASGraphRelationshipAllOfData();

        System.assertEquals(graphRelationshipAllOfData1.hashCode(), graphRelationshipAllOfData1.hashCode());
        System.assertEquals(graphRelationshipAllOfData2.hashCode(), graphRelationshipAllOfData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData1 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData2 = OASGraphRelationshipAllOfData.getExample();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData3 = new OASGraphRelationshipAllOfData();
        OASGraphRelationshipAllOfData graphRelationshipAllOfData4 = new OASGraphRelationshipAllOfData();

        System.assert(graphRelationshipAllOfData1.equals(graphRelationshipAllOfData2));
        System.assert(graphRelationshipAllOfData3.equals(graphRelationshipAllOfData4));
        System.assertEquals(graphRelationshipAllOfData1.hashCode(), graphRelationshipAllOfData2.hashCode());
        System.assertEquals(graphRelationshipAllOfData3.hashCode(), graphRelationshipAllOfData4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGraphRelationshipAllOfData graphRelationshipAllOfData = new OASGraphRelationshipAllOfData();
        Map<String, String> x-property-mappings = graphRelationshipAllOfData.getx-property-mappings();
        System.assertEquals('messageKey', x-property-mappings.get('message_key'));
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
    }
}
