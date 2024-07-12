@isTest
private class OASClipboardPayloadContextTest {
    @isTest
    private static void equalsSameInstance() {
        OASClipboardPayloadContext clipboardPayloadContext1 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext2 = clipboardPayloadContext1;
        OASClipboardPayloadContext clipboardPayloadContext3 = new OASClipboardPayloadContext();
        OASClipboardPayloadContext clipboardPayloadContext4 = clipboardPayloadContext3;

        System.assert(clipboardPayloadContext1.equals(clipboardPayloadContext2));
        System.assert(clipboardPayloadContext2.equals(clipboardPayloadContext1));
        System.assert(clipboardPayloadContext1.equals(clipboardPayloadContext1));
        System.assert(clipboardPayloadContext3.equals(clipboardPayloadContext4));
        System.assert(clipboardPayloadContext4.equals(clipboardPayloadContext3));
        System.assert(clipboardPayloadContext3.equals(clipboardPayloadContext3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASClipboardPayloadContext clipboardPayloadContext1 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext2 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext3 = new OASClipboardPayloadContext();
        OASClipboardPayloadContext clipboardPayloadContext4 = new OASClipboardPayloadContext();

        System.assert(clipboardPayloadContext1.equals(clipboardPayloadContext2));
        System.assert(clipboardPayloadContext2.equals(clipboardPayloadContext1));
        System.assert(clipboardPayloadContext3.equals(clipboardPayloadContext4));
        System.assert(clipboardPayloadContext4.equals(clipboardPayloadContext3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASClipboardPayloadContext clipboardPayloadContext1 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext2 = new OASClipboardPayloadContext();

        System.assertEquals(false, clipboardPayloadContext1.equals('foo'));
        System.assertEquals(false, clipboardPayloadContext2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASClipboardPayloadContext clipboardPayloadContext1 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext2 = new OASClipboardPayloadContext();
        OASClipboardPayloadContext clipboardPayloadContext3;

        System.assertEquals(false, clipboardPayloadContext1.equals(clipboardPayloadContext3));
        System.assertEquals(false, clipboardPayloadContext2.equals(clipboardPayloadContext3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASClipboardPayloadContext clipboardPayloadContext1 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext2 = new OASClipboardPayloadContext();

        System.assertEquals(clipboardPayloadContext1.hashCode(), clipboardPayloadContext1.hashCode());
        System.assertEquals(clipboardPayloadContext2.hashCode(), clipboardPayloadContext2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASClipboardPayloadContext clipboardPayloadContext1 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext2 = OASClipboardPayloadContext.getExample();
        OASClipboardPayloadContext clipboardPayloadContext3 = new OASClipboardPayloadContext();
        OASClipboardPayloadContext clipboardPayloadContext4 = new OASClipboardPayloadContext();

        System.assert(clipboardPayloadContext1.equals(clipboardPayloadContext2));
        System.assert(clipboardPayloadContext3.equals(clipboardPayloadContext4));
        System.assertEquals(clipboardPayloadContext1.hashCode(), clipboardPayloadContext2.hashCode());
        System.assertEquals(clipboardPayloadContext3.hashCode(), clipboardPayloadContext4.hashCode());
    }
}
