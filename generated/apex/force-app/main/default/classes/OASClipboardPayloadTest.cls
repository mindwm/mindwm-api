@isTest
private class OASClipboardPayloadTest {
    @isTest
    private static void equalsSameInstance() {
        OASClipboardPayload clipboardPayload1 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload2 = clipboardPayload1;
        OASClipboardPayload clipboardPayload3 = new OASClipboardPayload();
        OASClipboardPayload clipboardPayload4 = clipboardPayload3;

        System.assert(clipboardPayload1.equals(clipboardPayload2));
        System.assert(clipboardPayload2.equals(clipboardPayload1));
        System.assert(clipboardPayload1.equals(clipboardPayload1));
        System.assert(clipboardPayload3.equals(clipboardPayload4));
        System.assert(clipboardPayload4.equals(clipboardPayload3));
        System.assert(clipboardPayload3.equals(clipboardPayload3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASClipboardPayload clipboardPayload1 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload2 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload3 = new OASClipboardPayload();
        OASClipboardPayload clipboardPayload4 = new OASClipboardPayload();

        System.assert(clipboardPayload1.equals(clipboardPayload2));
        System.assert(clipboardPayload2.equals(clipboardPayload1));
        System.assert(clipboardPayload3.equals(clipboardPayload4));
        System.assert(clipboardPayload4.equals(clipboardPayload3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASClipboardPayload clipboardPayload1 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload2 = new OASClipboardPayload();

        System.assertEquals(false, clipboardPayload1.equals('foo'));
        System.assertEquals(false, clipboardPayload2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASClipboardPayload clipboardPayload1 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload2 = new OASClipboardPayload();
        OASClipboardPayload clipboardPayload3;

        System.assertEquals(false, clipboardPayload1.equals(clipboardPayload3));
        System.assertEquals(false, clipboardPayload2.equals(clipboardPayload3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASClipboardPayload clipboardPayload1 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload2 = new OASClipboardPayload();

        System.assertEquals(clipboardPayload1.hashCode(), clipboardPayload1.hashCode());
        System.assertEquals(clipboardPayload2.hashCode(), clipboardPayload2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASClipboardPayload clipboardPayload1 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload2 = OASClipboardPayload.getExample();
        OASClipboardPayload clipboardPayload3 = new OASClipboardPayload();
        OASClipboardPayload clipboardPayload4 = new OASClipboardPayload();

        System.assert(clipboardPayload1.equals(clipboardPayload2));
        System.assert(clipboardPayload3.equals(clipboardPayload4));
        System.assertEquals(clipboardPayload1.hashCode(), clipboardPayload2.hashCode());
        System.assertEquals(clipboardPayload3.hashCode(), clipboardPayload4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASClipboardPayload clipboardPayload = new OASClipboardPayload();
        System.assertEquals(new List<Integer>(), clipboardPayload.start);
        System.assertEquals(new List<Integer>(), clipboardPayload.stop);
        System.assertEquals(null, clipboardPayload.data);
        System.assertEquals(null, clipboardPayload.type);
        System.assertEquals(null, clipboardPayload.context);
    }
}
