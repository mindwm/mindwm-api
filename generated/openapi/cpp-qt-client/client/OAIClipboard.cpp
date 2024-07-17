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

#include "OAIClipboard.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIClipboard::OAIClipboard(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIClipboard::OAIClipboard() {
    this->initializeModel();
}

OAIClipboard::~OAIClipboard() {}

void OAIClipboard::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_source_isSet = false;
    m_source_isValid = false;

    m_specversion_isSet = false;
    m_specversion_isValid = false;

    m_type_isSet = false;
    m_type_isValid = false;

    m_datacontenttype_isSet = false;
    m_datacontenttype_isValid = false;

    m_dataschema_isSet = false;
    m_dataschema_isValid = false;

    m_subject_isSet = false;
    m_subject_isValid = false;

    m_time_isSet = false;
    m_time_isValid = false;

    m_data_isSet = false;
    m_data_isValid = false;

    m_data_base64_isSet = false;
    m_data_base64_isValid = false;
}

void OAIClipboard::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIClipboard::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_source_isValid = ::OpenAPI::fromJsonValue(m_source, json[QString("source")]);
    m_source_isSet = !json[QString("source")].isNull() && m_source_isValid;

    m_specversion_isValid = ::OpenAPI::fromJsonValue(m_specversion, json[QString("specversion")]);
    m_specversion_isSet = !json[QString("specversion")].isNull() && m_specversion_isValid;

    m_type_isValid = ::OpenAPI::fromJsonValue(m_type, json[QString("type")]);
    m_type_isSet = !json[QString("type")].isNull() && m_type_isValid;

    m_datacontenttype_isValid = ::OpenAPI::fromJsonValue(m_datacontenttype, json[QString("datacontenttype")]);
    m_datacontenttype_isSet = !json[QString("datacontenttype")].isNull() && m_datacontenttype_isValid;

    m_dataschema_isValid = ::OpenAPI::fromJsonValue(m_dataschema, json[QString("dataschema")]);
    m_dataschema_isSet = !json[QString("dataschema")].isNull() && m_dataschema_isValid;

    m_subject_isValid = ::OpenAPI::fromJsonValue(m_subject, json[QString("subject")]);
    m_subject_isSet = !json[QString("subject")].isNull() && m_subject_isValid;

    m_time_isValid = ::OpenAPI::fromJsonValue(m_time, json[QString("time")]);
    m_time_isSet = !json[QString("time")].isNull() && m_time_isValid;

    m_data_isValid = ::OpenAPI::fromJsonValue(m_data, json[QString("data")]);
    m_data_isSet = !json[QString("data")].isNull() && m_data_isValid;

    m_data_base64_isValid = ::OpenAPI::fromJsonValue(m_data_base64, json[QString("data_base64")]);
    m_data_base64_isSet = !json[QString("data_base64")].isNull() && m_data_base64_isValid;
}

QString OAIClipboard::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIClipboard::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_source_isSet) {
        obj.insert(QString("source"), ::OpenAPI::toJsonValue(m_source));
    }
    if (m_specversion_isSet) {
        obj.insert(QString("specversion"), ::OpenAPI::toJsonValue(m_specversion));
    }
    if (m_type_isSet) {
        obj.insert(QString("type"), ::OpenAPI::toJsonValue(m_type));
    }
    if (m_datacontenttype_isSet) {
        obj.insert(QString("datacontenttype"), ::OpenAPI::toJsonValue(m_datacontenttype));
    }
    if (m_dataschema_isSet) {
        obj.insert(QString("dataschema"), ::OpenAPI::toJsonValue(m_dataschema));
    }
    if (m_subject_isSet) {
        obj.insert(QString("subject"), ::OpenAPI::toJsonValue(m_subject));
    }
    if (m_time_isSet) {
        obj.insert(QString("time"), ::OpenAPI::toJsonValue(m_time));
    }
    if (m_data.isSet()) {
        obj.insert(QString("data"), ::OpenAPI::toJsonValue(m_data));
    }
    if (m_data_base64_isSet) {
        obj.insert(QString("data_base64"), ::OpenAPI::toJsonValue(m_data_base64));
    }
    return obj;
}

QString OAIClipboard::getId() const {
    return m_id;
}
void OAIClipboard::setId(const QString &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIClipboard::is_id_Set() const{
    return m_id_isSet;
}

bool OAIClipboard::is_id_Valid() const{
    return m_id_isValid;
}

QString OAIClipboard::getSource() const {
    return m_source;
}
void OAIClipboard::setSource(const QString &source) {
    m_source = source;
    m_source_isSet = true;
}

bool OAIClipboard::is_source_Set() const{
    return m_source_isSet;
}

bool OAIClipboard::is_source_Valid() const{
    return m_source_isValid;
}

QString OAIClipboard::getSpecversion() const {
    return m_specversion;
}
void OAIClipboard::setSpecversion(const QString &specversion) {
    m_specversion = specversion;
    m_specversion_isSet = true;
}

bool OAIClipboard::is_specversion_Set() const{
    return m_specversion_isSet;
}

bool OAIClipboard::is_specversion_Valid() const{
    return m_specversion_isValid;
}

QString OAIClipboard::getType() const {
    return m_type;
}
void OAIClipboard::setType(const QString &type) {
    m_type = type;
    m_type_isSet = true;
}

bool OAIClipboard::is_type_Set() const{
    return m_type_isSet;
}

bool OAIClipboard::is_type_Valid() const{
    return m_type_isValid;
}

QString OAIClipboard::getDatacontenttype() const {
    return m_datacontenttype;
}
void OAIClipboard::setDatacontenttype(const QString &datacontenttype) {
    m_datacontenttype = datacontenttype;
    m_datacontenttype_isSet = true;
}

bool OAIClipboard::is_datacontenttype_Set() const{
    return m_datacontenttype_isSet;
}

bool OAIClipboard::is_datacontenttype_Valid() const{
    return m_datacontenttype_isValid;
}

QString OAIClipboard::getDataschema() const {
    return m_dataschema;
}
void OAIClipboard::setDataschema(const QString &dataschema) {
    m_dataschema = dataschema;
    m_dataschema_isSet = true;
}

bool OAIClipboard::is_dataschema_Set() const{
    return m_dataschema_isSet;
}

bool OAIClipboard::is_dataschema_Valid() const{
    return m_dataschema_isValid;
}

QString OAIClipboard::getSubject() const {
    return m_subject;
}
void OAIClipboard::setSubject(const QString &subject) {
    m_subject = subject;
    m_subject_isSet = true;
}

bool OAIClipboard::is_subject_Set() const{
    return m_subject_isSet;
}

bool OAIClipboard::is_subject_Valid() const{
    return m_subject_isValid;
}

QDateTime OAIClipboard::getTime() const {
    return m_time;
}
void OAIClipboard::setTime(const QDateTime &time) {
    m_time = time;
    m_time_isSet = true;
}

bool OAIClipboard::is_time_Set() const{
    return m_time_isSet;
}

bool OAIClipboard::is_time_Valid() const{
    return m_time_isValid;
}

OAIClipboardPayload OAIClipboard::getData() const {
    return m_data;
}
void OAIClipboard::setData(const OAIClipboardPayload &data) {
    m_data = data;
    m_data_isSet = true;
}

bool OAIClipboard::is_data_Set() const{
    return m_data_isSet;
}

bool OAIClipboard::is_data_Valid() const{
    return m_data_isValid;
}

QString OAIClipboard::getDataBase64() const {
    return m_data_base64;
}
void OAIClipboard::setDataBase64(const QString &data_base64) {
    m_data_base64 = data_base64;
    m_data_base64_isSet = true;
}

bool OAIClipboard::is_data_base64_Set() const{
    return m_data_base64_isSet;
}

bool OAIClipboard::is_data_base64_Valid() const{
    return m_data_base64_isValid;
}

bool OAIClipboard::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_source_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_specversion_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_type_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_datacontenttype_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_dataschema_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_subject_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_data.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_data_base64_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIClipboard::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_id_isValid && m_source_isValid && m_specversion_isValid && m_type_isValid && true;
}

} // namespace OpenAPI
