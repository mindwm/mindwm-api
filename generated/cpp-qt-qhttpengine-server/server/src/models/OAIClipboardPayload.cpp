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

#include "OAIClipboardPayload.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIClipboardPayload::OAIClipboardPayload(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIClipboardPayload::OAIClipboardPayload() {
    this->initializeModel();
}

OAIClipboardPayload::~OAIClipboardPayload() {}

void OAIClipboardPayload::initializeModel() {

    m_start_isSet = false;
    m_start_isValid = false;

    m_stop_isSet = false;
    m_stop_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_context_isSet = false;
    m_context_isValid = false;
}

void OAIClipboardPayload::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIClipboardPayload::fromJsonObject(QJsonObject json) {

    m_start_isValid = ::OpenAPI::fromJsonValue(start, json[QString("start")]);
    m_start_isSet = !json[QString("start")].isNull() && m_start_isValid;

    m_stop_isValid = ::OpenAPI::fromJsonValue(stop, json[QString("stop")]);
    m_stop_isSet = !json[QString("stop")].isNull() && m_stop_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_context_isValid = ::OpenAPI::fromJsonValue(context, json[QString("context")]);
    m_context_isSet = !json[QString("context")].isNull() && m_context_isValid;
}

QString OAIClipboardPayload::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIClipboardPayload::asJsonObject() const {
    QJsonObject obj;
    if (start.size() > 0) {
        obj.insert(QString("start"), ::OpenAPI::toJsonValue(start));
    }
    if (stop.size() > 0) {
        obj.insert(QString("stop"), ::OpenAPI::toJsonValue(stop));
    }
    if (m_data_isSet) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(data));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(type));
    }
    if (context.isSet()) {
        obj.insert(QString("context"), ::OpenAPI::toJsonValue(context));
    }
    return obj;
}

QList<qint32> OAIClipboardPayload::getStart() const {
    return start;
}
void OAIClipboardPayload::setStart(const QList<qint32> &start) {
    this->start = start;
    this->m_start_isSet = true;
}

bool OAIClipboardPayload::is_start_Set() const{
    return m_start_isSet;
}

bool OAIClipboardPayload::is_start_Valid() const{
    return m_start_isValid;
}

QList<qint32> OAIClipboardPayload::getStop() const {
    return stop;
}
void OAIClipboardPayload::setStop(const QList<qint32> &stop) {
    this->stop = stop;
    this->m_stop_isSet = true;
}

bool OAIClipboardPayload::is_stop_Set() const{
    return m_stop_isSet;
}

bool OAIClipboardPayload::is_stop_Valid() const{
    return m_stop_isValid;
}

QString OAIClipboardPayload::getData() const {
    return data;
}
void OAIClipboardPayload::setData(const QString &data) {
    this->data = data;
    this->m_data_isSet = true;
}

bool OAIClipboardPayload::is_data_Set() const{
    return m_data_isSet;
}

bool OAIClipboardPayload::is_data_Valid() const{
    return m_data_isValid;
}

QString OAIClipboardPayload::getType() const {
    return type;
}
void OAIClipboardPayload::setType(const QString &type) {
    this->type = type;
    this->m_type_isSet = true;
}

bool OAIClipboardPayload::is_type_Set() const{
    return m_type_isSet;
}

bool OAIClipboardPayload::is_type_Valid() const{
    return m_type_isValid;
}

OAIClipboardPayload_context OAIClipboardPayload::getContext() const {
    return context;
}
void OAIClipboardPayload::setContext(const OAIClipboardPayload_context &context) {
    this->context = context;
    this->m_context_isSet = true;
}

bool OAIClipboardPayload::is_context_Set() const{
    return m_context_isSet;
}

bool OAIClipboardPayload::is_context_Valid() const{
    return m_context_isValid;
}

bool OAIClipboardPayload::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (start.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (stop.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_data_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (context.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIClipboardPayload::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
