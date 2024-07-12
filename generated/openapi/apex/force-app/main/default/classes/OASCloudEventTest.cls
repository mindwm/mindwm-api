@isTest
private class OASCloudEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASCloudEvent cloudEvent1 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent2 = cloudEvent1;
        OASCloudEvent cloudEvent3 = new OASCloudEvent();
        OASCloudEvent cloudEvent4 = cloudEvent3;

        System.assert(cloudEvent1.equals(cloudEvent2));
        System.assert(cloudEvent2.equals(cloudEvent1));
        System.assert(cloudEvent1.equals(cloudEvent1));
        System.assert(cloudEvent3.equals(cloudEvent4));
        System.assert(cloudEvent4.equals(cloudEvent3));
        System.assert(cloudEvent3.equals(cloudEvent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCloudEvent cloudEvent1 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent2 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent3 = new OASCloudEvent();
        OASCloudEvent cloudEvent4 = new OASCloudEvent();

        System.assert(cloudEvent1.equals(cloudEvent2));
        System.assert(cloudEvent2.equals(cloudEvent1));
        System.assert(cloudEvent3.equals(cloudEvent4));
        System.assert(cloudEvent4.equals(cloudEvent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCloudEvent cloudEvent1 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent2 = new OASCloudEvent();

        System.assertEquals(false, cloudEvent1.equals('foo'));
        System.assertEquals(false, cloudEvent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCloudEvent cloudEvent1 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent2 = new OASCloudEvent();
        OASCloudEvent cloudEvent3;

        System.assertEquals(false, cloudEvent1.equals(cloudEvent3));
        System.assertEquals(false, cloudEvent2.equals(cloudEvent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCloudEvent cloudEvent1 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent2 = new OASCloudEvent();

        System.assertEquals(cloudEvent1.hashCode(), cloudEvent1.hashCode());
        System.assertEquals(cloudEvent2.hashCode(), cloudEvent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCloudEvent cloudEvent1 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent2 = OASCloudEvent.getExample();
        OASCloudEvent cloudEvent3 = new OASCloudEvent();
        OASCloudEvent cloudEvent4 = new OASCloudEvent();

        System.assert(cloudEvent1.equals(cloudEvent2));
        System.assert(cloudEvent3.equals(cloudEvent4));
        System.assertEquals(cloudEvent1.hashCode(), cloudEvent2.hashCode());
        System.assertEquals(cloudEvent3.hashCode(), cloudEvent4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCloudEvent cloudEvent = new OASCloudEvent();
        Map<String, String> x-property-mappings = cloudEvent.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
        System.assertEquals('dataBase64', x-property-mappings.get('data_base64'));
    }
}
