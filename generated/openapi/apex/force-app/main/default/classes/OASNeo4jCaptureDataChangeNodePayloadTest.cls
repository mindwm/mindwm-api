@isTest
private class OASNeo4jCaptureDataChangeNodePayloadTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter1 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter2 = neo4jCaptureDataChangeNodePayloadAfter1;
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter3 = new OASNeo4jCaptureDataChangeNodePayload();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter4 = neo4jCaptureDataChangeNodePayloadAfter3;

        System.assert(neo4jCaptureDataChangeNodePayloadAfter1.equals(neo4jCaptureDataChangeNodePayloadAfter2));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter2.equals(neo4jCaptureDataChangeNodePayloadAfter1));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter1.equals(neo4jCaptureDataChangeNodePayloadAfter1));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter3.equals(neo4jCaptureDataChangeNodePayloadAfter4));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter4.equals(neo4jCaptureDataChangeNodePayloadAfter3));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter3.equals(neo4jCaptureDataChangeNodePayloadAfter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter1 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter2 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter3 = new OASNeo4jCaptureDataChangeNodePayload();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter4 = new OASNeo4jCaptureDataChangeNodePayload();

        System.assert(neo4jCaptureDataChangeNodePayloadAfter1.equals(neo4jCaptureDataChangeNodePayloadAfter2));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter2.equals(neo4jCaptureDataChangeNodePayloadAfter1));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter3.equals(neo4jCaptureDataChangeNodePayloadAfter4));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter4.equals(neo4jCaptureDataChangeNodePayloadAfter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter1 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter2 = new OASNeo4jCaptureDataChangeNodePayload();

        System.assertEquals(false, neo4jCaptureDataChangeNodePayloadAfter1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChangeNodePayloadAfter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter1 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter2 = new OASNeo4jCaptureDataChangeNodePayload();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter3;

        System.assertEquals(false, neo4jCaptureDataChangeNodePayloadAfter1.equals(neo4jCaptureDataChangeNodePayloadAfter3));
        System.assertEquals(false, neo4jCaptureDataChangeNodePayloadAfter2.equals(neo4jCaptureDataChangeNodePayloadAfter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter1 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter2 = new OASNeo4jCaptureDataChangeNodePayload();

        System.assertEquals(neo4jCaptureDataChangeNodePayloadAfter1.hashCode(), neo4jCaptureDataChangeNodePayloadAfter1.hashCode());
        System.assertEquals(neo4jCaptureDataChangeNodePayloadAfter2.hashCode(), neo4jCaptureDataChangeNodePayloadAfter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter1 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter2 = OASNeo4jCaptureDataChangeNodePayload.getExample();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter3 = new OASNeo4jCaptureDataChangeNodePayload();
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter4 = new OASNeo4jCaptureDataChangeNodePayload();

        System.assert(neo4jCaptureDataChangeNodePayloadAfter1.equals(neo4jCaptureDataChangeNodePayloadAfter2));
        System.assert(neo4jCaptureDataChangeNodePayloadAfter3.equals(neo4jCaptureDataChangeNodePayloadAfter4));
        System.assertEquals(neo4jCaptureDataChangeNodePayloadAfter1.hashCode(), neo4jCaptureDataChangeNodePayloadAfter2.hashCode());
        System.assertEquals(neo4jCaptureDataChangeNodePayloadAfter3.hashCode(), neo4jCaptureDataChangeNodePayloadAfter4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASNeo4jCaptureDataChangeNodePayload neo4jCaptureDataChangeNodePayloadAfter = new OASNeo4jCaptureDataChangeNodePayload();
        System.assertEquals(new List<String>(), neo4jCaptureDataChangeNodePayloadAfter.labels);
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), neo4jCaptureDataChangeNodePayloadAfter.properties);
    }
}
