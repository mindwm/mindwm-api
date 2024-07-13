@isTest
private class OASNeo4jCaptureDataChangeSchemaTest {
    @isTest
    private static void equalsSameInstance() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema1 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema2 = neo4jCaptureDataChangeSchema1;
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema3 = new OASNeo4jCaptureDataChangeSchema();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema4 = neo4jCaptureDataChangeSchema3;

        System.assert(neo4jCaptureDataChangeSchema1.equals(neo4jCaptureDataChangeSchema2));
        System.assert(neo4jCaptureDataChangeSchema2.equals(neo4jCaptureDataChangeSchema1));
        System.assert(neo4jCaptureDataChangeSchema1.equals(neo4jCaptureDataChangeSchema1));
        System.assert(neo4jCaptureDataChangeSchema3.equals(neo4jCaptureDataChangeSchema4));
        System.assert(neo4jCaptureDataChangeSchema4.equals(neo4jCaptureDataChangeSchema3));
        System.assert(neo4jCaptureDataChangeSchema3.equals(neo4jCaptureDataChangeSchema3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema1 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema2 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema3 = new OASNeo4jCaptureDataChangeSchema();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema4 = new OASNeo4jCaptureDataChangeSchema();

        System.assert(neo4jCaptureDataChangeSchema1.equals(neo4jCaptureDataChangeSchema2));
        System.assert(neo4jCaptureDataChangeSchema2.equals(neo4jCaptureDataChangeSchema1));
        System.assert(neo4jCaptureDataChangeSchema3.equals(neo4jCaptureDataChangeSchema4));
        System.assert(neo4jCaptureDataChangeSchema4.equals(neo4jCaptureDataChangeSchema3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema1 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema2 = new OASNeo4jCaptureDataChangeSchema();

        System.assertEquals(false, neo4jCaptureDataChangeSchema1.equals('foo'));
        System.assertEquals(false, neo4jCaptureDataChangeSchema2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema1 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema2 = new OASNeo4jCaptureDataChangeSchema();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema3;

        System.assertEquals(false, neo4jCaptureDataChangeSchema1.equals(neo4jCaptureDataChangeSchema3));
        System.assertEquals(false, neo4jCaptureDataChangeSchema2.equals(neo4jCaptureDataChangeSchema3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema1 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema2 = new OASNeo4jCaptureDataChangeSchema();

        System.assertEquals(neo4jCaptureDataChangeSchema1.hashCode(), neo4jCaptureDataChangeSchema1.hashCode());
        System.assertEquals(neo4jCaptureDataChangeSchema2.hashCode(), neo4jCaptureDataChangeSchema2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema1 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema2 = OASNeo4jCaptureDataChangeSchema.getExample();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema3 = new OASNeo4jCaptureDataChangeSchema();
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema4 = new OASNeo4jCaptureDataChangeSchema();

        System.assert(neo4jCaptureDataChangeSchema1.equals(neo4jCaptureDataChangeSchema2));
        System.assert(neo4jCaptureDataChangeSchema3.equals(neo4jCaptureDataChangeSchema4));
        System.assertEquals(neo4jCaptureDataChangeSchema1.hashCode(), neo4jCaptureDataChangeSchema2.hashCode());
        System.assertEquals(neo4jCaptureDataChangeSchema3.hashCode(), neo4jCaptureDataChangeSchema4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASNeo4jCaptureDataChangeSchema neo4jCaptureDataChangeSchema = new OASNeo4jCaptureDataChangeSchema();
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), neo4jCaptureDataChangeSchema.constraints);
        System.assertEquals(new Map<String, oas_any_type_not_mapped>(), neo4jCaptureDataChangeSchema.properties);
    }
}
