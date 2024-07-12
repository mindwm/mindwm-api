QT += network

HEADERS += \
# Models
    $${PWD}/OAIClipboard.h \
    $${PWD}/OAIClipboardPayload.h \
    $${PWD}/OAIClipboardPayload_context.h \
    $${PWD}/OAICloudEvent.h \
    $${PWD}/OAICloudEvent_data.h \
    $${PWD}/OAIIoDocument.h \
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
    $${PWD}/OAICloudEvent_data.cpp \
    $${PWD}/OAIIoDocument.cpp \
    $${PWD}/OAITmuxPaneIoDocument.cpp \
# APIs
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
