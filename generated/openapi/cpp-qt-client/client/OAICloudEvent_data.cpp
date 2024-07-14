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

#include "OAICloudEvent_data.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAICloudEvent_data::OAICloudEvent_data(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAICloudEvent_data::OAICloudEvent_data() {
    this->initializeModel();
}

OAICloudEvent_data::~OAICloudEvent_data() {}

void OAICloudEvent_data::initializeModel() {

}

void OAICloudEvent_data::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAICloudEvent_data::fromJsonObject(QJsonObject json) {

}

QString OAICloudEvent_data::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAICloudEvent_data::asJsonObject() const {
    QJsonObject obj;
    return obj;
}

bool OAICloudEvent_data::isSet() const {
    bool isObjectUpdated = false;
    do {

    } while (false);
    return isObjectUpdated;
}

bool OAICloudEvent_data::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI