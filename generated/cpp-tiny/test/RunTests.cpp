
#include "ClipboardTest.cpp"

#include "ClipboardPayloadTest.cpp"

#include "ClipboardPayload_contextTest.cpp"

#include "CloudEventTest.cpp"

#include "CloudEvent_dataTest.cpp"

#include "IoDocumentTest.cpp"

#include "TmuxPaneIoDocumentTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_Clipboard_type_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_source_is_assigned_from_json);
    
    
    
    RUN_TEST(test_Clipboard_id_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_specversion_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_datacontenttype_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_dataschema_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_subject_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_time_is_assigned_from_json);
    
    
    RUN_TEST(test_Clipboard_data_base64_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_ClipboardPayload_data_is_assigned_from_json);
    
    
    RUN_TEST(test_ClipboardPayload_type_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ClipboardPayload_context_window_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CloudEvent_id_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_source_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_specversion_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_type_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_datacontenttype_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_dataschema_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_subject_is_assigned_from_json);
    
    
    RUN_TEST(test_CloudEvent_time_is_assigned_from_json);
    
    
    
    RUN_TEST(test_CloudEvent_data_base64_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_IoDocument_type_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_source_is_assigned_from_json);
    
    
    
    RUN_TEST(test_IoDocument_id_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_specversion_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_datacontenttype_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_dataschema_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_subject_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_time_is_assigned_from_json);
    
    
    RUN_TEST(test_IoDocument_data_base64_is_assigned_from_json);
    
    
    
    RUN_TEST(test_TmuxPaneIoDocument_input_is_assigned_from_json);
    
    
    RUN_TEST(test_TmuxPaneIoDocument_output_is_assigned_from_json);
    
    
    RUN_TEST(test_TmuxPaneIoDocument_ps1_is_assigned_from_json);
    
    

    
    
    RUN_TEST(test_Clipboard_type_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_source_is_converted_to_json);
    
    
    
    RUN_TEST(test_Clipboard_id_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_specversion_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_datacontenttype_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_dataschema_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_subject_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_time_is_converted_to_json);
    
    
    RUN_TEST(test_Clipboard_data_base64_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_ClipboardPayload_data_is_converted_to_json);
    
    
    RUN_TEST(test_ClipboardPayload_type_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ClipboardPayload_context_window_is_converted_to_json);
    
    
    
    RUN_TEST(test_CloudEvent_id_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_source_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_specversion_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_type_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_datacontenttype_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_dataschema_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_subject_is_converted_to_json);
    
    
    RUN_TEST(test_CloudEvent_time_is_converted_to_json);
    
    
    
    RUN_TEST(test_CloudEvent_data_base64_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_IoDocument_type_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_source_is_converted_to_json);
    
    
    
    RUN_TEST(test_IoDocument_id_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_specversion_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_datacontenttype_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_dataschema_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_subject_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_time_is_converted_to_json);
    
    
    RUN_TEST(test_IoDocument_data_base64_is_converted_to_json);
    
    
    
    RUN_TEST(test_TmuxPaneIoDocument_input_is_converted_to_json);
    
    
    RUN_TEST(test_TmuxPaneIoDocument_output_is_converted_to_json);
    
    
    RUN_TEST(test_TmuxPaneIoDocument_ps1_is_converted_to_json);
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
