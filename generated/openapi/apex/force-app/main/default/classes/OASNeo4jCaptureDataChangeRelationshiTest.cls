@isTest
private class OASNeo4jCaptureDataChangeRelationshiTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd1 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd2 = neo4jCaptureDataChangeRelationshipPayloadEnd1;
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd3 = new OASNeo4jCaptureDataChangeRelationshi();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd4 = neo4jCaptureDataChangeRelationshipPayloadEnd3;

        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd1.equals(neo4jCaptureDataChangeRelationshipPayloadEnd2));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd2.equals(neo4jCaptureDataChangeRelationshipPayloadEnd1));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd1.equals(neo4jCaptureDataChangeRelationshipPayloadEnd1));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd3.equals(neo4jCaptureDataChangeRelationshipPayloadEnd4));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd4.equals(neo4jCaptureDataChangeRelationshipPayloadEnd3));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd3.equals(neo4jCaptureDataChangeRelationshipPayloadEnd3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd1 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd2 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd3 = new OASNeo4jCaptureDataChangeRelationshi();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd4 = new OASNeo4jCaptureDataChangeRelationshi();

        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd1.equals(neo4jCaptureDataChangeRelationshipPayloadEnd2));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd2.equals(neo4jCaptureDataChangeRelationshipPayloadEnd1));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd3.equals(neo4jCaptureDataChangeRelationshipPayloadEnd4));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd4.equals(neo4jCaptureDataChangeRelationshipPayloadEnd3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd1 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd2 = new OASNeo4jCaptureDataChangeRelationshi();

        System.assertEquals(false, neo4jCaptureDataChangeRelationshipPayloadEnd1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChangeRelationshipPayloadEnd2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd1 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd2 = new OASNeo4jCaptureDataChangeRelationshi();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd3;

        System.assertEquals(false, neo4jCaptureDataChangeRelationshipPayloadEnd1.equals(neo4jCaptureDataChangeRelationshipPayloadEnd3));
        System.assertEquals(false, neo4jCaptureDataChangeRelationshipPayloadEnd2.equals(neo4jCaptureDataChangeRelationshipPayloadEnd3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd1 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd2 = new OASNeo4jCaptureDataChangeRelationshi();

        System.assertEquals(neo4jCaptureDataChangeRelationshipPayloadEnd1.hashCode(), neo4jCaptureDataChangeRelationshipPayloadEnd1.hashCode());
        System.assertEquals(neo4jCaptureDataChangeRelationshipPayloadEnd2.hashCode(), neo4jCaptureDataChangeRelationshipPayloadEnd2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd1 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd2 = OASNeo4jCaptureDataChangeRelationshi.getExample();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd3 = new OASNeo4jCaptureDataChangeRelationshi();
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd4 = new OASNeo4jCaptureDataChangeRelationshi();

        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd1.equals(neo4jCaptureDataChangeRelationshipPayloadEnd2));
        System.assert(neo4jCaptureDataChangeRelationshipPayloadEnd3.equals(neo4jCaptureDataChangeRelationshipPayloadEnd4));
        System.assertEquals(neo4jCaptureDataChangeRelationshipPayloadEnd1.hashCode(), neo4jCaptureDataChangeRelationshipPayloadEnd2.hashCode());
        System.assertEquals(neo4jCaptureDataChangeRelationshipPayloadEnd3.hashCode(), neo4jCaptureDataChangeRelationshipPayloadEnd4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASNeo4jCaptureDataChangeRelationshi neo4jCaptureDataChangeRelationshipPayloadEnd = new OASNeo4jCaptureDataChangeRelationshi();
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), neo4jCaptureDataChangeRelationshipPayloadEnd.ids);
        System.assertEquals(new List<String>(), neo4jCaptureDataChangeRelationshipPayloadEnd.labels);
        System.assertEquals(null, neo4jCaptureDataChangeRelationshipPayloadEnd.id);
    }
}
