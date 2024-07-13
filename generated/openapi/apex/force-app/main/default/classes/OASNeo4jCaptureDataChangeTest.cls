@isTest
private class OASNeo4jCaptureDataChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange1 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange2 = neo4jCaptureDataChange1;
        OASNeo4jCaptureDataChange neo4jCaptureDataChange3 = new OASNeo4jCaptureDataChange();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange4 = neo4jCaptureDataChange3;

        System.assert(neo4jCaptureDataChange1.equals(neo4jCaptureDataChange2));
        System.assert(neo4jCaptureDataChange2.equals(neo4jCaptureDataChange1));
        System.assert(neo4jCaptureDataChange1.equals(neo4jCaptureDataChange1));
        System.assert(neo4jCaptureDataChange3.equals(neo4jCaptureDataChange4));
        System.assert(neo4jCaptureDataChange4.equals(neo4jCaptureDataChange3));
        System.assert(neo4jCaptureDataChange3.equals(neo4jCaptureDataChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange1 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange2 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange3 = new OASNeo4jCaptureDataChange();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange4 = new OASNeo4jCaptureDataChange();

        System.assert(neo4jCaptureDataChange1.equals(neo4jCaptureDataChange2));
        System.assert(neo4jCaptureDataChange2.equals(neo4jCaptureDataChange1));
        System.assert(neo4jCaptureDataChange3.equals(neo4jCaptureDataChange4));
        System.assert(neo4jCaptureDataChange4.equals(neo4jCaptureDataChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange1 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange2 = new OASNeo4jCaptureDataChange();

        System.assertEquals(false, neo4jCaptureDataChange1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange1 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange2 = new OASNeo4jCaptureDataChange();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange3;

        System.assertEquals(false, neo4jCaptureDataChange1.equals(neo4jCaptureDataChange3));
        System.assertEquals(false, neo4jCaptureDataChange2.equals(neo4jCaptureDataChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange1 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange2 = new OASNeo4jCaptureDataChange();

        System.assertEquals(neo4jCaptureDataChange1.hashCode(), neo4jCaptureDataChange1.hashCode());
        System.assertEquals(neo4jCaptureDataChange2.hashCode(), neo4jCaptureDataChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange1 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange2 = OASNeo4jCaptureDataChange.getExample();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange3 = new OASNeo4jCaptureDataChange();
        OASNeo4jCaptureDataChange neo4jCaptureDataChange4 = new OASNeo4jCaptureDataChange();

        System.assert(neo4jCaptureDataChange1.equals(neo4jCaptureDataChange2));
        System.assert(neo4jCaptureDataChange3.equals(neo4jCaptureDataChange4));
        System.assertEquals(neo4jCaptureDataChange1.hashCode(), neo4jCaptureDataChange2.hashCode());
        System.assertEquals(neo4jCaptureDataChange3.hashCode(), neo4jCaptureDataChange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange = new OASNeo4jCaptureDataChange();
        Map<String, String> x-property-mappings = neo4jCaptureDataChange.getx-property-mappings();
        System.assertEquals('messageKey', x-property-mappings.get('message_key'));
        System.assertEquals('sourceType', x-property-mappings.get('source_type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASNeo4jCaptureDataChange neo4jCaptureDataChange = new OASNeo4jCaptureDataChange();
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), neo4jCaptureDataChange.headers);
        System.assertEquals(null, neo4jCaptureDataChange.messageKey);
        System.assertEquals(null, neo4jCaptureDataChange.meta);
        System.assertEquals(null, neo4jCaptureDataChange.offset);
        System.assertEquals(null, neo4jCaptureDataChange.partition);
        System.assertEquals(null, neo4jCaptureDataChange.sourceType);
        System.assertEquals(null, neo4jCaptureDataChange.timestamp);
        System.assertEquals(null, neo4jCaptureDataChange.topic);
        System.assertEquals(null, neo4jCaptureDataChange.schema);
        System.assertEquals(null, neo4jCaptureDataChange.payload);
    }
}
