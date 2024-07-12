@isTest
private class OASCloudEventDataTest {
    @isTest
    private static void equalsSameInstance() {
        OASCloudEventData cloudEventData1 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData2 = cloudEventData1;
        OASCloudEventData cloudEventData3 = new OASCloudEventData();
        OASCloudEventData cloudEventData4 = cloudEventData3;

        System.assert(cloudEventData1.equals(cloudEventData2));
        System.assert(cloudEventData2.equals(cloudEventData1));
        System.assert(cloudEventData1.equals(cloudEventData1));
        System.assert(cloudEventData3.equals(cloudEventData4));
        System.assert(cloudEventData4.equals(cloudEventData3));
        System.assert(cloudEventData3.equals(cloudEventData3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCloudEventData cloudEventData1 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData2 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData3 = new OASCloudEventData();
        OASCloudEventData cloudEventData4 = new OASCloudEventData();

        System.assert(cloudEventData1.equals(cloudEventData2));
        System.assert(cloudEventData2.equals(cloudEventData1));
        System.assert(cloudEventData3.equals(cloudEventData4));
        System.assert(cloudEventData4.equals(cloudEventData3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCloudEventData cloudEventData1 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData2 = new OASCloudEventData();

        System.assertEquals(false, cloudEventData1.equals('foo'));
        System.assertEquals(false, cloudEventData2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCloudEventData cloudEventData1 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData2 = new OASCloudEventData();
        OASCloudEventData cloudEventData3;

        System.assertEquals(false, cloudEventData1.equals(cloudEventData3));
        System.assertEquals(false, cloudEventData2.equals(cloudEventData3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCloudEventData cloudEventData1 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData2 = new OASCloudEventData();

        System.assertEquals(cloudEventData1.hashCode(), cloudEventData1.hashCode());
        System.assertEquals(cloudEventData2.hashCode(), cloudEventData2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCloudEventData cloudEventData1 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData2 = OASCloudEventData.getExample();
        OASCloudEventData cloudEventData3 = new OASCloudEventData();
        OASCloudEventData cloudEventData4 = new OASCloudEventData();

        System.assert(cloudEventData1.equals(cloudEventData2));
        System.assert(cloudEventData3.equals(cloudEventData4));
        System.assertEquals(cloudEventData1.hashCode(), cloudEventData2.hashCode());
        System.assertEquals(cloudEventData3.hashCode(), cloudEventData4.hashCode());
    }
}
