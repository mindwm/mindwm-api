@isTest
private class OASNeo4jCaptureDataChangePayloadTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload1 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload2 = neo4jCaptureDataChangePayload1;
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload3 = new OASNeo4jCaptureDataChangePayload();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload4 = neo4jCaptureDataChangePayload3;

        System.assert(neo4jCaptureDataChangePayload1.equals(neo4jCaptureDataChangePayload2));
        System.assert(neo4jCaptureDataChangePayload2.equals(neo4jCaptureDataChangePayload1));
        System.assert(neo4jCaptureDataChangePayload1.equals(neo4jCaptureDataChangePayload1));
        System.assert(neo4jCaptureDataChangePayload3.equals(neo4jCaptureDataChangePayload4));
        System.assert(neo4jCaptureDataChangePayload4.equals(neo4jCaptureDataChangePayload3));
        System.assert(neo4jCaptureDataChangePayload3.equals(neo4jCaptureDataChangePayload3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload1 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload2 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload3 = new OASNeo4jCaptureDataChangePayload();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload4 = new OASNeo4jCaptureDataChangePayload();

        System.assert(neo4jCaptureDataChangePayload1.equals(neo4jCaptureDataChangePayload2));
        System.assert(neo4jCaptureDataChangePayload2.equals(neo4jCaptureDataChangePayload1));
        System.assert(neo4jCaptureDataChangePayload3.equals(neo4jCaptureDataChangePayload4));
        System.assert(neo4jCaptureDataChangePayload4.equals(neo4jCaptureDataChangePayload3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload1 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload2 = new OASNeo4jCaptureDataChangePayload();

        System.assertEquals(false, neo4jCaptureDataChangePayload1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChangePayload2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload1 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload2 = new OASNeo4jCaptureDataChangePayload();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload3;

        System.assertEquals(false, neo4jCaptureDataChangePayload1.equals(neo4jCaptureDataChangePayload3));
        System.assertEquals(false, neo4jCaptureDataChangePayload2.equals(neo4jCaptureDataChangePayload3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload1 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload2 = new OASNeo4jCaptureDataChangePayload();

        System.assertEquals(neo4jCaptureDataChangePayload1.hashCode(), neo4jCaptureDataChangePayload1.hashCode());
        System.assertEquals(neo4jCaptureDataChangePayload2.hashCode(), neo4jCaptureDataChangePayload2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload1 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload2 = OASNeo4jCaptureDataChangePayload.getExample();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload3 = new OASNeo4jCaptureDataChangePayload();
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload4 = new OASNeo4jCaptureDataChangePayload();

        System.assert(neo4jCaptureDataChangePayload1.equals(neo4jCaptureDataChangePayload2));
        System.assert(neo4jCaptureDataChangePayload3.equals(neo4jCaptureDataChangePayload4));
        System.assertEquals(neo4jCaptureDataChangePayload1.hashCode(), neo4jCaptureDataChangePayload2.hashCode());
        System.assertEquals(neo4jCaptureDataChangePayload3.hashCode(), neo4jCaptureDataChangePayload4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNeo4jCaptureDataChangePayload neo4jCaptureDataChangePayload = new OASNeo4jCaptureDataChangePayload();
        Map<String, String> x-property-mappings = neo4jCaptureDataChangePayload.getx-property-mappings();
        System.assertEquals('r_end', x-property-mappings.get('end'));
    }
}
