@isTest
private class OASNeo4jCaptureDataChangeMetaSourceTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource1 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource2 = neo4jCaptureDataChangeMetaSource1;
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource3 = new OASNeo4jCaptureDataChangeMetaSource();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource4 = neo4jCaptureDataChangeMetaSource3;

        System.assert(neo4jCaptureDataChangeMetaSource1.equals(neo4jCaptureDataChangeMetaSource2));
        System.assert(neo4jCaptureDataChangeMetaSource2.equals(neo4jCaptureDataChangeMetaSource1));
        System.assert(neo4jCaptureDataChangeMetaSource1.equals(neo4jCaptureDataChangeMetaSource1));
        System.assert(neo4jCaptureDataChangeMetaSource3.equals(neo4jCaptureDataChangeMetaSource4));
        System.assert(neo4jCaptureDataChangeMetaSource4.equals(neo4jCaptureDataChangeMetaSource3));
        System.assert(neo4jCaptureDataChangeMetaSource3.equals(neo4jCaptureDataChangeMetaSource3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource1 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource2 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource3 = new OASNeo4jCaptureDataChangeMetaSource();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource4 = new OASNeo4jCaptureDataChangeMetaSource();

        System.assert(neo4jCaptureDataChangeMetaSource1.equals(neo4jCaptureDataChangeMetaSource2));
        System.assert(neo4jCaptureDataChangeMetaSource2.equals(neo4jCaptureDataChangeMetaSource1));
        System.assert(neo4jCaptureDataChangeMetaSource3.equals(neo4jCaptureDataChangeMetaSource4));
        System.assert(neo4jCaptureDataChangeMetaSource4.equals(neo4jCaptureDataChangeMetaSource3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource1 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource2 = new OASNeo4jCaptureDataChangeMetaSource();

        System.assertEquals(false, neo4jCaptureDataChangeMetaSource1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChangeMetaSource2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource1 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource2 = new OASNeo4jCaptureDataChangeMetaSource();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource3;

        System.assertEquals(false, neo4jCaptureDataChangeMetaSource1.equals(neo4jCaptureDataChangeMetaSource3));
        System.assertEquals(false, neo4jCaptureDataChangeMetaSource2.equals(neo4jCaptureDataChangeMetaSource3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource1 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource2 = new OASNeo4jCaptureDataChangeMetaSource();

        System.assertEquals(neo4jCaptureDataChangeMetaSource1.hashCode(), neo4jCaptureDataChangeMetaSource1.hashCode());
        System.assertEquals(neo4jCaptureDataChangeMetaSource2.hashCode(), neo4jCaptureDataChangeMetaSource2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource1 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource2 = OASNeo4jCaptureDataChangeMetaSource.getExample();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource3 = new OASNeo4jCaptureDataChangeMetaSource();
        OASNeo4jCaptureDataChangeMetaSource neo4jCaptureDataChangeMetaSource4 = new OASNeo4jCaptureDataChangeMetaSource();

        System.assert(neo4jCaptureDataChangeMetaSource1.equals(neo4jCaptureDataChangeMetaSource2));
        System.assert(neo4jCaptureDataChangeMetaSource3.equals(neo4jCaptureDataChangeMetaSource4));
        System.assertEquals(neo4jCaptureDataChangeMetaSource1.hashCode(), neo4jCaptureDataChangeMetaSource2.hashCode());
        System.assertEquals(neo4jCaptureDataChangeMetaSource3.hashCode(), neo4jCaptureDataChangeMetaSource4.hashCode());
    }
}
