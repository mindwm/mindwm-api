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

#include "OAINeo4jCaptureDataChange_meta_source.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAINeo4jCaptureDataChange_meta_source::OAINeo4jCaptureDataChange_meta_source(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAINeo4jCaptureDataChange_meta_source::OAINeo4jCaptureDataChange_meta_source() {
    this->initializeModel();
}

OAINeo4jCaptureDataChange_meta_source::~OAINeo4jCaptureDataChange_meta_source() {}

void OAINeo4jCaptureDataChange_meta_source::initializeModel() {

    m_hostname_isSet = false;
    m_hostname_isValid = false;
}

void OAINeo4jCaptureDataChange_meta_source::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAINeo4jCaptureDataChange_meta_source::fromJsonObject(QJsonObject json) {

    m_hostname_isValid = ::OpenAPI::fromJsonValue(m_hostname, json[QString("hostname")]);
    m_hostname_isSet = !json[QString("hostname")].isNull() && m_hostname_isValid;
}

QString OAINeo4jCaptureDataChange_meta_source::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAINeo4jCaptureDataChange_meta_source::asJsonObject() const {
    QJsonObject obj;
    if (m_hostname_isSet) {
        obj.insert(QString("hostname"), ::OpenAPI::toJsonValue(m_hostname));
    }
    return obj;
}

QString OAINeo4jCaptureDataChange_meta_source::getHostname() const {
    return m_hostname;
}
void OAINeo4jCaptureDataChange_meta_source::setHostname(const QString &hostname) {
    m_hostname = hostname;
    m_hostname_isSet = true;
}

bool OAINeo4jCaptureDataChange_meta_source::is_hostname_Set() const{
    return m_hostname_isSet;
}

bool OAINeo4jCaptureDataChange_meta_source::is_hostname_Valid() const{
    return m_hostname_isValid;
}

bool OAINeo4jCaptureDataChange_meta_source::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_hostname_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAINeo4jCaptureDataChange_meta_source::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_hostname_isValid && true;
}

} // namespace OpenAPI
