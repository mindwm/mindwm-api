@isTest
private class OASGraphRelationshipTest {
    @isTest
    private static void equalsSameInstance() {
        OASGraphRelationship graphRelationship1 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship2 = graphRelationship1;
        OASGraphRelationship graphRelationship3 = new OASGraphRelationship();
        OASGraphRelationship graphRelationship4 = graphRelationship3;

        System.assert(graphRelationship1.equals(graphRelationship2));
        System.assert(graphRelationship2.equals(graphRelationship1));
        System.assert(graphRelationship1.equals(graphRelationship1));
        System.assert(graphRelationship3.equals(graphRelationship4));
        System.assert(graphRelationship4.equals(graphRelationship3));
        System.assert(graphRelationship3.equals(graphRelationship3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGraphRelationship graphRelationship1 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship2 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship3 = new OASGraphRelationship();
        OASGraphRelationship graphRelationship4 = new OASGraphRelationship();

        System.assert(graphRelationship1.equals(graphRelationship2));
        System.assert(graphRelationship2.equals(graphRelationship1));
        System.assert(graphRelationship3.equals(graphRelationship4));
        System.assert(graphRelationship4.equals(graphRelationship3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGraphRelationship graphRelationship1 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship2 = new OASGraphRelationship();

        System.assertEquals(false, graphRelationship1.equals('foo'));
        System.assertEquals(false, graphRelationship2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGraphRelationship graphRelationship1 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship2 = new OASGraphRelationship();
        OASGraphRelationship graphRelationship3;

        System.assertEquals(false, graphRelationship1.equals(graphRelationship3));
        System.assertEquals(false, graphRelationship2.equals(graphRelationship3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGraphRelationship graphRelationship1 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship2 = new OASGraphRelationship();

        System.assertEquals(graphRelationship1.hashCode(), graphRelationship1.hashCode());
        System.assertEquals(graphRelationship2.hashCode(), graphRelationship2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGraphRelationship graphRelationship1 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship2 = OASGraphRelationship.getExample();
        OASGraphRelationship graphRelationship3 = new OASGraphRelationship();
        OASGraphRelationship graphRelationship4 = new OASGraphRelationship();

        System.assert(graphRelationship1.equals(graphRelationship2));
        System.assert(graphRelationship3.equals(graphRelationship4));
        System.assertEquals(graphRelationship1.hashCode(), graphRelationship2.hashCode());
        System.assertEquals(graphRelationship3.hashCode(), graphRelationship4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGraphRelationship graphRelationship = new OASGraphRelationship();
        Map<String, String> x-property-mappings = graphRelationship.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
        System.assertEquals('dataBase64', x-property-mappings.get('data_base64'));
    }
}
