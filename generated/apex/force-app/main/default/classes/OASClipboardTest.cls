@isTest
private class OASClipboardTest {
    @isTest
    private static void equalsSameInstance() {
        OASClipboard clipboard1 = OASClipboard.getExample();
        OASClipboard clipboard2 = clipboard1;
        OASClipboard clipboard3 = new OASClipboard();
        OASClipboard clipboard4 = clipboard3;

        System.assert(clipboard1.equals(clipboard2));
        System.assert(clipboard2.equals(clipboard1));
        System.assert(clipboard1.equals(clipboard1));
        System.assert(clipboard3.equals(clipboard4));
        System.assert(clipboard4.equals(clipboard3));
        System.assert(clipboard3.equals(clipboard3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASClipboard clipboard1 = OASClipboard.getExample();
        OASClipboard clipboard2 = OASClipboard.getExample();
        OASClipboard clipboard3 = new OASClipboard();
        OASClipboard clipboard4 = new OASClipboard();

        System.assert(clipboard1.equals(clipboard2));
        System.assert(clipboard2.equals(clipboard1));
        System.assert(clipboard3.equals(clipboard4));
        System.assert(clipboard4.equals(clipboard3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASClipboard clipboard1 = OASClipboard.getExample();
        OASClipboard clipboard2 = new OASClipboard();

        System.assertEquals(false, clipboard1.equals('foo'));
        System.assertEquals(false, clipboard2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASClipboard clipboard1 = OASClipboard.getExample();
        OASClipboard clipboard2 = new OASClipboard();
        OASClipboard clipboard3;

        System.assertEquals(false, clipboard1.equals(clipboard3));
        System.assertEquals(false, clipboard2.equals(clipboard3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASClipboard clipboard1 = OASClipboard.getExample();
        OASClipboard clipboard2 = new OASClipboard();

        System.assertEquals(clipboard1.hashCode(), clipboard1.hashCode());
        System.assertEquals(clipboard2.hashCode(), clipboard2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASClipboard clipboard1 = OASClipboard.getExample();
        OASClipboard clipboard2 = OASClipboard.getExample();
        OASClipboard clipboard3 = new OASClipboard();
        OASClipboard clipboard4 = new OASClipboard();

        System.assert(clipboard1.equals(clipboard2));
        System.assert(clipboard3.equals(clipboard4));
        System.assertEquals(clipboard1.hashCode(), clipboard2.hashCode());
        System.assertEquals(clipboard3.hashCode(), clipboard4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASClipboard clipboard = new OASClipboard();
        Map<String, String> x-property-mappings = clipboard.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
        System.assertEquals('dataBase64', x-property-mappings.get('data_base64'));
    }
}
