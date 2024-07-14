/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAINeo4jCaptureDataChange_meta.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAINeo4jCaptureDataChange_meta::OAINeo4jCaptureDataChange_meta(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAINeo4jCaptureDataChange_meta::OAINeo4jCaptureDataChange_meta() {
    this->initializeModel();
}

OAINeo4jCaptureDataChange_meta::~OAINeo4jCaptureDataChange_meta() {}

void OAINeo4jCaptureDataChange_meta::initializeModel() {

    m_operation_isSet = false;
    m_operation_isValid = false;

    m_source_isSet = false;
    m_source_isValid = false;

    m_timestamp_isSet = false;
    m_timestamp_isValid = false;

    m_tx_event_id_isSet = false;
    m_tx_event_id_isValid = false;

    m_tx_events_count_isSet = false;
    m_tx_events_count_isValid = false;

    m_tx_id_isSet = false;
    m_tx_id_isValid = false;

    m_username_isSet = false;
    m_username_isValid = false;
}

void OAINeo4jCaptureDataChange_meta::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAINeo4jCaptureDataChange_meta::fromJsonObject(QJsonObject json) {

    m_operation_isValid = ::OpenAPI::fromJsonValue(m_operation, json[QString("operation")]);
    m_operation_isSet = !json[QString("operation")].isNull() && m_operation_isValid;

    m_source_isValid = ::OpenAPI::fromJsonValue(m_source, json[QString("source")]);
    m_source_isSet = !json[QString("source")].isNull() && m_source_isValid;

    m_timestamp_isValid = ::OpenAPI::fromJsonValue(m_timestamp, json[QString("timestamp")]);
    m_timestamp_isSet = !json[QString("timestamp")].isNull() && m_timestamp_isValid;

    m_tx_event_id_isValid = ::OpenAPI::fromJsonValue(m_tx_event_id, json[QString("txEventId")]);
    m_tx_event_id_isSet = !json[QString("txEventId")].isNull() && m_tx_event_id_isValid;

    m_tx_events_count_isValid = ::OpenAPI::fromJsonValue(m_tx_events_count, json[QString("txEventsCount")]);
    m_tx_events_count_isSet = !json[QString("txEventsCount")].isNull() && m_tx_events_count_isValid;

    m_tx_id_isValid = ::OpenAPI::fromJsonValue(m_tx_id, json[QString("txId")]);
    m_tx_id_isSet = !json[QString("txId")].isNull() && m_tx_id_isValid;

    m_username_isValid = ::OpenAPI::fromJsonValue(m_username, json[QString("username")]);
    m_username_isSet = !json[QString("username")].isNull() && m_username_isValid;
}

QString OAINeo4jCaptureDataChange_meta::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAINeo4jCaptureDataChange_meta::asJsonObject() const {
    QJsonObject obj;
    if (m_operation_isSet) {
        obj.insert(QString("operation"), ::OpenAPI::toJsonValue(m_operation));
    }
    if (m_source.isSet()) {
        obj.insert(QString("source"), ::OpenAPI::toJsonValue(m_source));
    }
    if (m_timestamp_isSet) {
        obj.insert(QString("timestamp"), ::OpenAPI::toJsonValue(m_timestamp));
    }
    if (m_tx_event_id_isSet) {
        obj.insert(QString("txEventId"), ::OpenAPI::toJsonValue(m_tx_event_id));
    }
    if (m_tx_events_count_isSet) {
        obj.insert(QString("txEventsCount"), ::OpenAPI::toJsonValue(m_tx_events_count));
    }
    if (m_tx_id_isSet) {
        obj.insert(QString("txId"), ::OpenAPI::toJsonValue(m_tx_id));
    }
    if (m_username_isSet) {
        obj.insert(QString("username"), ::OpenAPI::toJsonValue(m_username));
    }
    return obj;
}

QString OAINeo4jCaptureDataChange_meta::getOperation() const {
    return m_operation;
}
void OAINeo4jCaptureDataChange_meta::setOperation(const QString &operation) {
    m_operation = operation;
    m_operation_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_operation_Set() const{
    return m_operation_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_operation_Valid() const{
    return m_operation_isValid;
}

OAINeo4jCaptureDataChange_meta_source OAINeo4jCaptureDataChange_meta::getSource() const {
    return m_source;
}
void OAINeo4jCaptureDataChange_meta::setSource(const OAINeo4jCaptureDataChange_meta_source &source) {
    m_source = source;
    m_source_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_source_Set() const{
    return m_source_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_source_Valid() const{
    return m_source_isValid;
}

qint32 OAINeo4jCaptureDataChange_meta::getTimestamp() const {
    return m_timestamp;
}
void OAINeo4jCaptureDataChange_meta::setTimestamp(const qint32 &timestamp) {
    m_timestamp = timestamp;
    m_timestamp_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_timestamp_Set() const{
    return m_timestamp_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_timestamp_Valid() const{
    return m_timestamp_isValid;
}

qint32 OAINeo4jCaptureDataChange_meta::getTxEventId() const {
    return m_tx_event_id;
}
void OAINeo4jCaptureDataChange_meta::setTxEventId(const qint32 &tx_event_id) {
    m_tx_event_id = tx_event_id;
    m_tx_event_id_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_tx_event_id_Set() const{
    return m_tx_event_id_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_tx_event_id_Valid() const{
    return m_tx_event_id_isValid;
}

qint32 OAINeo4jCaptureDataChange_meta::getTxEventsCount() const {
    return m_tx_events_count;
}
void OAINeo4jCaptureDataChange_meta::setTxEventsCount(const qint32 &tx_events_count) {
    m_tx_events_count = tx_events_count;
    m_tx_events_count_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_tx_events_count_Set() const{
    return m_tx_events_count_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_tx_events_count_Valid() const{
    return m_tx_events_count_isValid;
}

qint32 OAINeo4jCaptureDataChange_meta::getTxId() const {
    return m_tx_id;
}
void OAINeo4jCaptureDataChange_meta::setTxId(const qint32 &tx_id) {
    m_tx_id = tx_id;
    m_tx_id_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_tx_id_Set() const{
    return m_tx_id_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_tx_id_Valid() const{
    return m_tx_id_isValid;
}

QString OAINeo4jCaptureDataChange_meta::getUsername() const {
    return m_username;
}
void OAINeo4jCaptureDataChange_meta::setUsername(const QString &username) {
    m_username = username;
    m_username_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta::is_username_Set() const{
    return m_username_isSet;
}

bool OAINeo4jCaptureDataChange_meta::is_username_Valid() const{
    return m_username_isValid;
}

bool OAINeo4jCaptureDataChange_meta::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_operation_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_source.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_timestamp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_tx_event_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_tx_events_count_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_tx_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_username_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAINeo4jCaptureDataChange_meta::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_operation_isValid && m_source_isValid && m_timestamp_isValid && m_tx_event_id_isValid && m_tx_events_count_isValid && m_tx_id_isValid && m_username_isValid && true;
}

} // namespace OpenAPI