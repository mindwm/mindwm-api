@isTest
private class OASNeo4jCaptureDataChangeMetaTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta1 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta2 = neo4jCaptureDataChangeMeta1;
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta3 = new OASNeo4jCaptureDataChangeMeta();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta4 = neo4jCaptureDataChangeMeta3;

        System.assert(neo4jCaptureDataChangeMeta1.equals(neo4jCaptureDataChangeMeta2));
        System.assert(neo4jCaptureDataChangeMeta2.equals(neo4jCaptureDataChangeMeta1));
        System.assert(neo4jCaptureDataChangeMeta1.equals(neo4jCaptureDataChangeMeta1));
        System.assert(neo4jCaptureDataChangeMeta3.equals(neo4jCaptureDataChangeMeta4));
        System.assert(neo4jCaptureDataChangeMeta4.equals(neo4jCaptureDataChangeMeta3));
        System.assert(neo4jCaptureDataChangeMeta3.equals(neo4jCaptureDataChangeMeta3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta1 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta2 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta3 = new OASNeo4jCaptureDataChangeMeta();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta4 = new OASNeo4jCaptureDataChangeMeta();

        System.assert(neo4jCaptureDataChangeMeta1.equals(neo4jCaptureDataChangeMeta2));
        System.assert(neo4jCaptureDataChangeMeta2.equals(neo4jCaptureDataChangeMeta1));
        System.assert(neo4jCaptureDataChangeMeta3.equals(neo4jCaptureDataChangeMeta4));
        System.assert(neo4jCaptureDataChangeMeta4.equals(neo4jCaptureDataChangeMeta3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta1 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta2 = new OASNeo4jCaptureDataChangeMeta();

        System.assertEquals(false, neo4jCaptureDataChangeMeta1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChangeMeta2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta1 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta2 = new OASNeo4jCaptureDataChangeMeta();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta3;

        System.assertEquals(false, neo4jCaptureDataChangeMeta1.equals(neo4jCaptureDataChangeMeta3));
        System.assertEquals(false, neo4jCaptureDataChangeMeta2.equals(neo4jCaptureDataChangeMeta3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta1 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta2 = new OASNeo4jCaptureDataChangeMeta();

        System.assertEquals(neo4jCaptureDataChangeMeta1.hashCode(), neo4jCaptureDataChangeMeta1.hashCode());
        System.assertEquals(neo4jCaptureDataChangeMeta2.hashCode(), neo4jCaptureDataChangeMeta2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta1 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta2 = OASNeo4jCaptureDataChangeMeta.getExample();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta3 = new OASNeo4jCaptureDataChangeMeta();
        OASNeo4jCaptureDataChangeMeta neo4jCaptureDataChangeMeta4 = new OASNeo4jCaptureDataChangeMeta();

        System.assert(neo4jCaptureDataChangeMeta1.equals(neo4jCaptureDataChangeMeta2));
        System.assert(neo4jCaptureDataChangeMeta3.equals(neo4jCaptureDataChangeMeta4));
        System.assertEquals(neo4jCaptureDataChangeMeta1.hashCode(), neo4jCaptureDataChangeMeta2.hashCode());
        System.assertEquals(neo4jCaptureDataChangeMeta3.hashCode(), neo4jCaptureDataChangeMeta4.hashCode());
    }
}
