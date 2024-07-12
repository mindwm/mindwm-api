@isTest
private class OASTmuxPaneIoDocumentTest {
    @isTest
    private static void equalsSameInstance() {
        OASTmuxPaneIoDocument tmuxPaneIoDocument1 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument2 = tmuxPaneIoDocument1;
        OASTmuxPaneIoDocument tmuxPaneIoDocument3 = new OASTmuxPaneIoDocument();
        OASTmuxPaneIoDocument tmuxPaneIoDocument4 = tmuxPaneIoDocument3;

        System.assert(tmuxPaneIoDocument1.equals(tmuxPaneIoDocument2));
        System.assert(tmuxPaneIoDocument2.equals(tmuxPaneIoDocument1));
        System.assert(tmuxPaneIoDocument1.equals(tmuxPaneIoDocument1));
        System.assert(tmuxPaneIoDocument3.equals(tmuxPaneIoDocument4));
        System.assert(tmuxPaneIoDocument4.equals(tmuxPaneIoDocument3));
        System.assert(tmuxPaneIoDocument3.equals(tmuxPaneIoDocument3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTmuxPaneIoDocument tmuxPaneIoDocument1 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument2 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument3 = new OASTmuxPaneIoDocument();
        OASTmuxPaneIoDocument tmuxPaneIoDocument4 = new OASTmuxPaneIoDocument();

        System.assert(tmuxPaneIoDocument1.equals(tmuxPaneIoDocument2));
        System.assert(tmuxPaneIoDocument2.equals(tmuxPaneIoDocument1));
        System.assert(tmuxPaneIoDocument3.equals(tmuxPaneIoDocument4));
        System.assert(tmuxPaneIoDocument4.equals(tmuxPaneIoDocument3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTmuxPaneIoDocument tmuxPaneIoDocument1 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument2 = new OASTmuxPaneIoDocument();

        System.assertEquals(false, tmuxPaneIoDocument1.equals('foo'));
        System.assertEquals(false, tmuxPaneIoDocument2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTmuxPaneIoDocument tmuxPaneIoDocument1 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument2 = new OASTmuxPaneIoDocument();
        OASTmuxPaneIoDocument tmuxPaneIoDocument3;

        System.assertEquals(false, tmuxPaneIoDocument1.equals(tmuxPaneIoDocument3));
        System.assertEquals(false, tmuxPaneIoDocument2.equals(tmuxPaneIoDocument3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTmuxPaneIoDocument tmuxPaneIoDocument1 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument2 = new OASTmuxPaneIoDocument();

        System.assertEquals(tmuxPaneIoDocument1.hashCode(), tmuxPaneIoDocument1.hashCode());
        System.assertEquals(tmuxPaneIoDocument2.hashCode(), tmuxPaneIoDocument2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTmuxPaneIoDocument tmuxPaneIoDocument1 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument2 = OASTmuxPaneIoDocument.getExample();
        OASTmuxPaneIoDocument tmuxPaneIoDocument3 = new OASTmuxPaneIoDocument();
        OASTmuxPaneIoDocument tmuxPaneIoDocument4 = new OASTmuxPaneIoDocument();

        System.assert(tmuxPaneIoDocument1.equals(tmuxPaneIoDocument2));
        System.assert(tmuxPaneIoDocument3.equals(tmuxPaneIoDocument4));
        System.assertEquals(tmuxPaneIoDocument1.hashCode(), tmuxPaneIoDocument2.hashCode());
        System.assertEquals(tmuxPaneIoDocument3.hashCode(), tmuxPaneIoDocument4.hashCode());
    }
}
