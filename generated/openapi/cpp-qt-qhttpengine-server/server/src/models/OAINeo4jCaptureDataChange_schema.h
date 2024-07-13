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

/*
 * OAINeo4jCaptureDataChange_schema.h
 *
 * 
 */

#ifndef OAINeo4jCaptureDataChange_schema_H
#define OAINeo4jCaptureDataChange_schema_H

#include <QJsonObject>

#include "OAIAnyType.h"
#include <QMap>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAINeo4jCaptureDataChange_schema : public OAIObject {
public:
    OAINeo4jCaptureDataChange_schema();
    OAINeo4jCaptureDataChange_schema(QString json);
    ~OAINeo4jCaptureDataChange_schema() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QMap<QString, OAIAnyType> getConstraints() const;
    void setConstraints(const QMap<QString, OAIAnyType> &constraints);
    bool is_constraints_Set() const;
    bool is_constraints_Valid() const;

    QMap<QString, OAIAnyType> getProperties() const;
    void setProperties(const QMap<QString, OAIAnyType> &properties);
    bool is_properties_Set() const;
    bool is_properties_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QMap<QString, OAIAnyType> constraints;
    bool m_constraints_isSet;
    bool m_constraints_isValid;

    QMap<QString, OAIAnyType> properties;
    bool m_properties_isSet;
    bool m_properties_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAINeo4jCaptureDataChange_schema)

#endif // OAINeo4jCaptureDataChange_schema_H
