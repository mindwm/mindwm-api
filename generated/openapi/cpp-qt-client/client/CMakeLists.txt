cmake_minimum_required(VERSION 3.5)

project(MindwWM)

set(CMAKE_AUTOMOC ON)

find_package(QT NAMES Qt6 Qt5 REQUIRED COMPONENTS Core Network Gui)
find_package(Qt${QT_VERSION_MAJOR} REQUIRED COMPONENTS Core Network Gui)

include(GNUInstallDirs)
include(CMakePackageConfigHelpers)

add_library(${PROJECT_NAME}
  OAIClipboard.h
  OAIClipboardPayload.h
  OAIClipboardPayload_context.h
  OAICloudEvent.h
  OAICloudEvent_data.h
  OAIGraphNode.h
  OAIGraphNode_allOf_data.h
  OAIGraphRelationship.h
  OAIGraphRelationship_allOf_data.h
  OAIIoDocument.h
  OAINeo4jCaptureDataChange.h
  OAINeo4jCaptureDataChangeNodePayload.h
  OAINeo4jCaptureDataChangeNodePayload_after.h
  OAINeo4jCaptureDataChangeRelationshipPayload.h
  OAINeo4jCaptureDataChangeRelationshipPayload_end.h
  OAINeo4jCaptureDataChange_meta.h
  OAINeo4jCaptureDataChange_meta_source.h
  OAINeo4jCaptureDataChange_payload.h
  OAINeo4jCaptureDataChange_schema.h
  OAITmuxPaneIoDocument.h
  OAIHelpers.h
  OAIHttpRequest.h
  OAIObject.h
  OAIEnum.h
  OAIHttpFileElement.h
  OAIServerConfiguration.h
  OAIServerVariable.h
  OAIOauth.h
  OAIClipboard.cpp
  OAIClipboardPayload.cpp
  OAIClipboardPayload_context.cpp
  OAICloudEvent.cpp
  OAICloudEvent_data.cpp
  OAIGraphNode.cpp
  OAIGraphNode_allOf_data.cpp
  OAIGraphRelationship.cpp
  OAIGraphRelationship_allOf_data.cpp
  OAIIoDocument.cpp
  OAINeo4jCaptureDataChange.cpp
  OAINeo4jCaptureDataChangeNodePayload.cpp
  OAINeo4jCaptureDataChangeNodePayload_after.cpp
  OAINeo4jCaptureDataChangeRelationshipPayload.cpp
  OAINeo4jCaptureDataChangeRelationshipPayload_end.cpp
  OAINeo4jCaptureDataChange_meta.cpp
  OAINeo4jCaptureDataChange_meta_source.cpp
  OAINeo4jCaptureDataChange_payload.cpp
  OAINeo4jCaptureDataChange_schema.cpp
  OAITmuxPaneIoDocument.cpp
  OAIHelpers.cpp
  OAIHttpRequest.cpp
  OAIHttpFileElement.cpp
  OAIOauth.cpp
  )

target_include_directories(${PROJECT_NAME}
    PUBLIC
        $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}>
        $<INSTALL_INTERFACE:${CMAKE_INSTALL_INCLUDEDIR}>
)

target_link_libraries(${PROJECT_NAME}
    PUBLIC
        Qt${QT_VERSION_MAJOR}::Core
        Qt${QT_VERSION_MAJOR}::Network
        Qt${QT_VERSION_MAJOR}::Gui

)

configure_package_config_file(${CMAKE_CURRENT_SOURCE_DIR}/Config.cmake.in
    "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    INSTALL_DESTINATION "${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}"
)

install(
    TARGETS ${PROJECT_NAME}
    EXPORT ${PROJECT_NAME}Targets
    LIBRARY DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    ARCHIVE DESTINATION "${CMAKE_INSTALL_LIBDIR}"
    RUNTIME DESTINATION "${CMAKE_INSTALL_BINDIR}"
    INCLUDES DESTINATION "${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}"
)

install(
    FILES ${HEADER_FILES}
    DESTINATION ${CMAKE_INSTALL_INCLUDEDIR}/${PROJECT_NAME}
)

install(
    FILES "${CMAKE_CURRENT_BINARY_DIR}/${PROJECT_NAME}Config.cmake"
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)

install(
    EXPORT ${PROJECT_NAME}Targets
    DESTINATION ${CMAKE_INSTALL_LIBDIR}/cmake/${PROJECT_NAME}
)
