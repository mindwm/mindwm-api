QT += network

HEADERS += \
# Models
    $${PWD}/OAIClipboard.h \
    $${PWD}/OAIClipboardPayload.h \
    $${PWD}/OAIClipboardPayload_context.h \
    $${PWD}/OAICloudEvent.h \
    $${PWD}/OAIGraphNode.h \
    $${PWD}/OAIGraphNode_allOf_data.h \
    $${PWD}/OAIGraphRelationship.h \
    $${PWD}/OAIGraphRelationship_allOf_data.h \
    $${PWD}/OAIIoDocument.h \
    $${PWD}/OAINeo4jCaptureDataChange.h \
    $${PWD}/OAINeo4jCaptureDataChangeNodePayload.h \
    $${PWD}/OAINeo4jCaptureDataChangeNodePayload_after.h \
    $${PWD}/OAINeo4jCaptureDataChangeRelationshipPayload.h \
    $${PWD}/OAINeo4jCaptureDataChangeRelationshipPayload_end.h \
    $${PWD}/OAINeo4jCaptureDataChange_meta.h \
    $${PWD}/OAINeo4jCaptureDataChange_meta_source.h \
    $${PWD}/OAINeo4jCaptureDataChange_payload.h \
    $${PWD}/OAINeo4jCaptureDataChange_schema.h \
    $${PWD}/OAITmuxPaneIoDocument.h \
# APIs
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h \
    $${PWD}/OAIOauth.h

SOURCES += \
# Models
    $${PWD}/OAIClipboard.cpp \
    $${PWD}/OAIClipboardPayload.cpp \
    $${PWD}/OAIClipboardPayload_context.cpp \
    $${PWD}/OAICloudEvent.cpp \
    $${PWD}/OAIGraphNode.cpp \
    $${PWD}/OAIGraphNode_allOf_data.cpp \
    $${PWD}/OAIGraphRelationship.cpp \
    $${PWD}/OAIGraphRelationship_allOf_data.cpp \
    $${PWD}/OAIIoDocument.cpp \
    $${PWD}/OAINeo4jCaptureDataChange.cpp \
    $${PWD}/OAINeo4jCaptureDataChangeNodePayload.cpp \
    $${PWD}/OAINeo4jCaptureDataChangeNodePayload_after.cpp \
    $${PWD}/OAINeo4jCaptureDataChangeRelationshipPayload.cpp \
    $${PWD}/OAINeo4jCaptureDataChangeRelationshipPayload_end.cpp \
    $${PWD}/OAINeo4jCaptureDataChange_meta.cpp \
    $${PWD}/OAINeo4jCaptureDataChange_meta_source.cpp \
    $${PWD}/OAINeo4jCaptureDataChange_payload.cpp \
    $${PWD}/OAINeo4jCaptureDataChange_schema.cpp \
    $${PWD}/OAITmuxPaneIoDocument.cpp \
# APIs
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
