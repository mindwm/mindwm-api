@isTest
private class OASIoDocumentTest {
    @isTest
    private static void equalsSameInstance() {
        OASIoDocument ioDocument1 = OASIoDocument.getExample();
        OASIoDocument ioDocument2 = ioDocument1;
        OASIoDocument ioDocument3 = new OASIoDocument();
        OASIoDocument ioDocument4 = ioDocument3;

        System.assert(ioDocument1.equals(ioDocument2));
        System.assert(ioDocument2.equals(ioDocument1));
        System.assert(ioDocument1.equals(ioDocument1));
        System.assert(ioDocument3.equals(ioDocument4));
        System.assert(ioDocument4.equals(ioDocument3));
        System.assert(ioDocument3.equals(ioDocument3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASIoDocument ioDocument1 = OASIoDocument.getExample();
        OASIoDocument ioDocument2 = OASIoDocument.getExample();
        OASIoDocument ioDocument3 = new OASIoDocument();
        OASIoDocument ioDocument4 = new OASIoDocument();

        System.assert(ioDocument1.equals(ioDocument2));
        System.assert(ioDocument2.equals(ioDocument1));
        System.assert(ioDocument3.equals(ioDocument4));
        System.assert(ioDocument4.equals(ioDocument3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASIoDocument ioDocument1 = OASIoDocument.getExample();
        OASIoDocument ioDocument2 = new OASIoDocument();

        System.assertEquals(false, ioDocument1.equals('foo'));
        System.assertEquals(false, ioDocument2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASIoDocument ioDocument1 = OASIoDocument.getExample();
        OASIoDocument ioDocument2 = new OASIoDocument();
        OASIoDocument ioDocument3;

        System.assertEquals(false, ioDocument1.equals(ioDocument3));
        System.assertEquals(false, ioDocument2.equals(ioDocument3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASIoDocument ioDocument1 = OASIoDocument.getExample();
        OASIoDocument ioDocument2 = new OASIoDocument();

        System.assertEquals(ioDocument1.hashCode(), ioDocument1.hashCode());
        System.assertEquals(ioDocument2.hashCode(), ioDocument2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASIoDocument ioDocument1 = OASIoDocument.getExample();
        OASIoDocument ioDocument2 = OASIoDocument.getExample();
        OASIoDocument ioDocument3 = new OASIoDocument();
        OASIoDocument ioDocument4 = new OASIoDocument();

        System.assert(ioDocument1.equals(ioDocument2));
        System.assert(ioDocument3.equals(ioDocument4));
        System.assertEquals(ioDocument1.hashCode(), ioDocument2.hashCode());
        System.assertEquals(ioDocument3.hashCode(), ioDocument4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASIoDocument ioDocument = new OASIoDocument();
        Map<String, String> x-property-mappings = ioDocument.getx-property-mappings();
        System.assertEquals('r_time', x-property-mappings.get('time'));
        System.assertEquals('dataBase64', x-property-mappings.get('data_base64'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASIoDocument ioDocument = new OASIoDocument();
        System.assertEquals('IoDocument', ioDocument.subject);
        System.assertEquals(null, ioDocument.type);
        System.assertEquals(null, ioDocument.source);
        System.assertEquals(null, ioDocument.data);
        System.assertEquals(null, ioDocument.id);
        System.assertEquals(null, ioDocument.specversion);
        System.assertEquals(null, ioDocument.datacontenttype);
        System.assertEquals(null, ioDocument.dataschema);
        System.assertEquals(null, ioDocument.r_time);
        System.assertEquals(null, ioDocument.dataBase64);
    }
}
