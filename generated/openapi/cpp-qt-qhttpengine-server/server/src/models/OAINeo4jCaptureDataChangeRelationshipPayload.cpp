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

#include "OAINeo4jCaptureDataChangeRelationshipPayload.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAINeo4jCaptureDataChangeRelationshipPayload::OAINeo4jCaptureDataChangeRelationshipPayload(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAINeo4jCaptureDataChangeRelationshipPayload::OAINeo4jCaptureDataChangeRelationshipPayload() {
    this->initializeModel();
}

OAINeo4jCaptureDataChangeRelationshipPayload::~OAINeo4jCaptureDataChangeRelationshipPayload() {}

void OAINeo4jCaptureDataChangeRelationshipPayload::initializeModel() {

    m_after_isSet = false;
    m_after_isValid = false;

    m_before_isSet = false;
    m_before_isValid = false;

    m_end_isSet = false;
    m_end_isValid = false;

    m_id_isSet = false;
    m_id_isValid = false;

    m_label_isSet = false;
    m_label_isValid = false;

    m_start_isSet = false;
    m_start_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;
}

void OAINeo4jCaptureDataChangeRelationshipPayload::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAINeo4jCaptureDataChangeRelationshipPayload::fromJsonObject(QJsonObject json) {

    m_after_isValid = ::OpenAPI::fromJsonValue(after, json[QString("after")]);
    m_after_isSet = !json[QString("after")].isNull() && m_after_isValid;

    m_before_isValid = ::OpenAPI::fromJsonValue(before, json[QString("before")]);
    m_before_isSet = !json[QString("before")].isNull() && m_before_isValid;

    m_end_isValid = ::OpenAPI::fromJsonValue(end, json[QString("end")]);
    m_end_isSet = !json[QString("end")].isNull() && m_end_isValid;

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_label_isValid = ::OpenAPI::fromJsonValue(label, json[QString("label")]);
    m_label_isSet = !json[QString("label")].isNull() && m_label_isValid;

    m_start_isValid = ::OpenAPI::fromJsonValue(start, json[QString("start")]);
    m_start_isSet = !json[QString("start")].isNull() && m_start_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;
}

QString OAINeo4jCaptureDataChangeRelationshipPayload::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAINeo4jCaptureDataChangeRelationshipPayload::asJsonObject() const {
    QJsonObject obj;
    if (m_after_isSet) {
        obj.insert(QString("after"), ::OpenAPI::toJsonValue(after));
    }
    if (m_before_isSet) {
        obj.insert(QString("before"), ::OpenAPI::toJsonValue(before));
    }
    if (end.isSet()) {
        obj.insert(QString("end"), ::OpenAPI::toJsonValue(end));
    }
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_label_isSet) {
        obj.insert(QString("label"), ::OpenAPI::toJsonValue(label));
    }
    if (start.isSet()) {
        obj.insert(QString("start"), ::OpenAPI::toJsonValue(start));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    return obj;
}

OAIObject OAINeo4jCaptureDataChangeRelationshipPayload::getAfter() const {
    return after;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setAfter(const OAIObject &after) {
    this->after = after;
    this->m_after_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_after_Set() const{
    return m_after_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_after_Valid() const{
    return m_after_isValid;
}

QString OAINeo4jCaptureDataChangeRelationshipPayload::getBefore() const {
    return before;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setBefore(const QString &before) {
    this->before = before;
    this->m_before_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_before_Set() const{
    return m_before_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_before_Valid() const{
    return m_before_isValid;
}

OAINeo4jCaptureDataChangeRelationshipPayload_end OAINeo4jCaptureDataChangeRelationshipPayload::getEnd() const {
    return end;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setEnd(const OAINeo4jCaptureDataChangeRelationshipPayload_end &end) {
    this->end = end;
    this->m_end_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_end_Set() const{
    return m_end_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_end_Valid() const{
    return m_end_isValid;
}

QString OAINeo4jCaptureDataChangeRelationshipPayload::getId() const {
    return id;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_id_Set() const{
    return m_id_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_id_Valid() const{
    return m_id_isValid;
}

QString OAINeo4jCaptureDataChangeRelationshipPayload::getLabel() const {
    return label;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setLabel(const QString &label) {
    this->label = label;
    this->m_label_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_label_Set() const{
    return m_label_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_label_Valid() const{
    return m_label_isValid;
}

OAINeo4jCaptureDataChangeRelationshipPayload_end OAINeo4jCaptureDataChangeRelationshipPayload::getStart() const {
    return start;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setStart(const OAINeo4jCaptureDataChangeRelationshipPayload_end &start) {
    this->start = start;
    this->m_start_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_start_Set() const{
    return m_start_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_start_Valid() const{
    return m_start_isValid;
}

QString OAINeo4jCaptureDataChangeRelationshipPayload::getType() const {
    return type;
}
void OAINeo4jCaptureDataChangeRelationshipPayload::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_type_Set() const{
    return m_type_isSet;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::is_type_Valid() const{
    return m_type_isValid;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_after_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_before_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (end.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_label_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (start.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAINeo4jCaptureDataChangeRelationshipPayload::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_after_isValid && m_before_isValid && m_end_isValid && m_id_isValid && m_label_isValid && m_start_isValid && m_type_isValid && true;
}

} // namespace OpenAPI