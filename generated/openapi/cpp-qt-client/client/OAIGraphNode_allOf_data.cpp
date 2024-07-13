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

#include "OAIGraphNode_allOf_data.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGraphNode_allOf_data::OAIGraphNode_allOf_data(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGraphNode_allOf_data::OAIGraphNode_allOf_data() {
    this->initializeModel();
}

OAIGraphNode_allOf_data::~OAIGraphNode_allOf_data() {}

void OAIGraphNode_allOf_data::initializeModel() {

    m_headers_isSet = false;
    m_headers_isValid = false;

    m_message_key_isSet = false;
    m_message_key_isValid = false;

    m_meta_isSet = false;
    m_meta_isValid = false;

    m_offset_isSet = false;
    m_offset_isValid = false;

    m_partition_isSet = false;
    m_partition_isValid = false;

    m_source_type_isSet = false;
    m_source_type_isValid = false;

    m_timestamp_isSet = false;
    m_timestamp_isValid = false;

    m_topic_isSet = false;
    m_topic_isValid = false;

    m_schema_isSet = false;
    m_schema_isValid = false;

    m_payload_isSet = false;
    m_payload_isValid = false;
}

void OAIGraphNode_allOf_data::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGraphNode_allOf_data::fromJsonObject(QJsonObject json) {

    m_headers_isValid = ::OpenAPI::fromJsonValue(m_headers, json[QString("headers")]);
    m_headers_isSet = !json[QString("headers")].isNull() && m_headers_isValid;

    m_message_key_isValid = ::OpenAPI::fromJsonValue(m_message_key, json[QString("message_key")]);
    m_message_key_isSet = !json[QString("message_key")].isNull() && m_message_key_isValid;

    m_meta_isValid = ::OpenAPI::fromJsonValue(m_meta, json[QString("meta")]);
    m_meta_isSet = !json[QString("meta")].isNull() && m_meta_isValid;

    m_offset_isValid = ::OpenAPI::fromJsonValue(m_offset, json[QString("offset")]);
    m_offset_isSet = !json[QString("offset")].isNull() && m_offset_isValid;

    m_partition_isValid = ::OpenAPI::fromJsonValue(m_partition, json[QString("partition")]);
    m_partition_isSet = !json[QString("partition")].isNull() && m_partition_isValid;

    m_source_type_isValid = ::OpenAPI::fromJsonValue(m_source_type, json[QString("source_type")]);
    m_source_type_isSet = !json[QString("source_type")].isNull() && m_source_type_isValid;

    m_timestamp_isValid = ::OpenAPI::fromJsonValue(m_timestamp, json[QString("timestamp")]);
    m_timestamp_isSet = !json[QString("timestamp")].isNull() && m_timestamp_isValid;

    m_topic_isValid = ::OpenAPI::fromJsonValue(m_topic, json[QString("topic")]);
    m_topic_isSet = !json[QString("topic")].isNull() && m_topic_isValid;

    m_schema_isValid = ::OpenAPI::fromJsonValue(m_schema, json[QString("schema")]);
    m_schema_isSet = !json[QString("schema")].isNull() && m_schema_isValid;

    m_payload_isValid = ::OpenAPI::fromJsonValue(m_payload, json[QString("payload")]);
    m_payload_isSet = !json[QString("payload")].isNull() && m_payload_isValid;
}

QString OAIGraphNode_allOf_data::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGraphNode_allOf_data::asJsonObject() const {
    QJsonObject obj;
    if (m_headers_isSet) {
        obj.insert(QString("headers"), ::OpenAPI::toJsonValue(m_headers));
    }
    if (m_message_key_isSet) {
        obj.insert(QString("message_key"), ::OpenAPI::toJsonValue(m_message_key));
    }
    if (m_meta.isSet()) {
        obj.insert(QString("meta"), ::OpenAPI::toJsonValue(m_meta));
    }
    if (m_offset_isSet) {
        obj.insert(QString("offset"), ::OpenAPI::toJsonValue(m_offset));
    }
    if (m_partition_isSet) {
        obj.insert(QString("partition"), ::OpenAPI::toJsonValue(m_partition));
    }
    if (m_source_type_isSet) {
        obj.insert(QString("source_type"), ::OpenAPI::toJsonValue(m_source_type));
    }
    if (m_timestamp_isSet) {
        obj.insert(QString("timestamp"), ::OpenAPI::toJsonValue(m_timestamp));
    }
    if (m_topic_isSet) {
        obj.insert(QString("topic"), ::OpenAPI::toJsonValue(m_topic));
    }
    if (m_schema.isSet()) {
        obj.insert(QString("schema"), ::OpenAPI::toJsonValue(m_schema));
    }
    if (m_payload.isSet()) {
        obj.insert(QString("payload"), ::OpenAPI::toJsonValue(m_payload));
    }
    return obj;
}

OAIObject OAIGraphNode_allOf_data::getHeaders() const {
    return m_headers;
}
void OAIGraphNode_allOf_data::setHeaders(const OAIObject &headers) {
    m_headers = headers;
    m_headers_isSet = true;
}

bool OAIGraphNode_allOf_data::is_headers_Set() const{
    return m_headers_isSet;
}

bool OAIGraphNode_allOf_data::is_headers_Valid() const{
    return m_headers_isValid;
}

QString OAIGraphNode_allOf_data::getMessageKey() const {
    return m_message_key;
}
void OAIGraphNode_allOf_data::setMessageKey(const QString &message_key) {
    m_message_key = message_key;
    m_message_key_isSet = true;
}

bool OAIGraphNode_allOf_data::is_message_key_Set() const{
    return m_message_key_isSet;
}

bool OAIGraphNode_allOf_data::is_message_key_Valid() const{
    return m_message_key_isValid;
}

OAINeo4jCaptureDataChange_meta OAIGraphNode_allOf_data::getMeta() const {
    return m_meta;
}
void OAIGraphNode_allOf_data::setMeta(const OAINeo4jCaptureDataChange_meta &meta) {
    m_meta = meta;
    m_meta_isSet = true;
}

bool OAIGraphNode_allOf_data::is_meta_Set() const{
    return m_meta_isSet;
}

bool OAIGraphNode_allOf_data::is_meta_Valid() const{
    return m_meta_isValid;
}

qint32 OAIGraphNode_allOf_data::getOffset() const {
    return m_offset;
}
void OAIGraphNode_allOf_data::setOffset(const qint32 &offset) {
    m_offset = offset;
    m_offset_isSet = true;
}

bool OAIGraphNode_allOf_data::is_offset_Set() const{
    return m_offset_isSet;
}

bool OAIGraphNode_allOf_data::is_offset_Valid() const{
    return m_offset_isValid;
}

qint32 OAIGraphNode_allOf_data::getPartition() const {
    return m_partition;
}
void OAIGraphNode_allOf_data::setPartition(const qint32 &partition) {
    m_partition = partition;
    m_partition_isSet = true;
}

bool OAIGraphNode_allOf_data::is_partition_Set() const{
    return m_partition_isSet;
}

bool OAIGraphNode_allOf_data::is_partition_Valid() const{
    return m_partition_isValid;
}

QString OAIGraphNode_allOf_data::getSourceType() const {
    return m_source_type;
}
void OAIGraphNode_allOf_data::setSourceType(const QString &source_type) {
    m_source_type = source_type;
    m_source_type_isSet = true;
}

bool OAIGraphNode_allOf_data::is_source_type_Set() const{
    return m_source_type_isSet;
}

bool OAIGraphNode_allOf_data::is_source_type_Valid() const{
    return m_source_type_isValid;
}

QDateTime OAIGraphNode_allOf_data::getTimestamp() const {
    return m_timestamp;
}
void OAIGraphNode_allOf_data::setTimestamp(const QDateTime &timestamp) {
    m_timestamp = timestamp;
    m_timestamp_isSet = true;
}

bool OAIGraphNode_allOf_data::is_timestamp_Set() const{
    return m_timestamp_isSet;
}

bool OAIGraphNode_allOf_data::is_timestamp_Valid() const{
    return m_timestamp_isValid;
}

QString OAIGraphNode_allOf_data::getTopic() const {
    return m_topic;
}
void OAIGraphNode_allOf_data::setTopic(const QString &topic) {
    m_topic = topic;
    m_topic_isSet = true;
}

bool OAIGraphNode_allOf_data::is_topic_Set() const{
    return m_topic_isSet;
}

bool OAIGraphNode_allOf_data::is_topic_Valid() const{
    return m_topic_isValid;
}

OAINeo4jCaptureDataChange_schema OAIGraphNode_allOf_data::getSchema() const {
    return m_schema;
}
void OAIGraphNode_allOf_data::setSchema(const OAINeo4jCaptureDataChange_schema &schema) {
    m_schema = schema;
    m_schema_isSet = true;
}

bool OAIGraphNode_allOf_data::is_schema_Set() const{
    return m_schema_isSet;
}

bool OAIGraphNode_allOf_data::is_schema_Valid() const{
    return m_schema_isValid;
}

OAINeo4jCaptureDataChangeNodePayload OAIGraphNode_allOf_data::getPayload() const {
    return m_payload;
}
void OAIGraphNode_allOf_data::setPayload(const OAINeo4jCaptureDataChangeNodePayload &payload) {
    m_payload = payload;
    m_payload_isSet = true;
}

bool OAIGraphNode_allOf_data::is_payload_Set() const{
    return m_payload_isSet;
}

bool OAIGraphNode_allOf_data::is_payload_Valid() const{
    return m_payload_isValid;
}

bool OAIGraphNode_allOf_data::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_headers_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_message_key_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_meta.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_offset_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_partition_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_source_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_timestamp_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_topic_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_schema.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_payload.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGraphNode_allOf_data::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_headers_isValid && m_message_key_isValid && m_meta_isValid && m_offset_isValid && m_partition_isValid && m_source_type_isValid && m_timestamp_isValid && m_topic_isValid && m_schema_isValid && m_payload_isValid && true;
}

} // namespace OpenAPI
