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
 * OAINeo4jCaptureDataChange_meta.h
 *
 * 
 */

#ifndef OAINeo4jCaptureDataChange_meta_H
#define OAINeo4jCaptureDataChange_meta_H

#include <QJsonObject>

#include "OAINeo4jCaptureDataChange_meta_source.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAINeo4jCaptureDataChange_meta_source;

class OAINeo4jCaptureDataChange_meta : public OAIObject {
public:
    OAINeo4jCaptureDataChange_meta();
    OAINeo4jCaptureDataChange_meta(QString json);
    ~OAINeo4jCaptureDataChange_meta() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getOperation() const;
    void setOperation(const QString &operation);
    bool is_operation_Set() const;
    bool is_operation_Valid() const;

    OAINeo4jCaptureDataChange_meta_source getSource() const;
    void setSource(const OAINeo4jCaptureDataChange_meta_source &source);
    bool is_source_Set() const;
    bool is_source_Valid() const;

    qint32 getTimestamp() const;
    void setTimestamp(const qint32 &timestamp);
    bool is_timestamp_Set() const;
    bool is_timestamp_Valid() const;

    qint32 getTxEventId() const;
    void setTxEventId(const qint32 &tx_event_id);
    bool is_tx_event_id_Set() const;
    bool is_tx_event_id_Valid() const;

    qint32 getTxEventsCount() const;
    void setTxEventsCount(const qint32 &tx_events_count);
    bool is_tx_events_count_Set() const;
    bool is_tx_events_count_Valid() const;

    qint32 getTxId() const;
    void setTxId(const qint32 &tx_id);
    bool is_tx_id_Set() const;
    bool is_tx_id_Valid() const;

    QString getUsername() const;
    void setUsername(const QString &username);
    bool is_username_Set() const;
    bool is_username_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_operation;
    bool m_operation_isSet;
    bool m_operation_isValid;

    OAINeo4jCaptureDataChange_meta_source m_source;
    bool m_source_isSet;
    bool m_source_isValid;

    qint32 m_timestamp;
    bool m_timestamp_isSet;
    bool m_timestamp_isValid;

    qint32 m_tx_event_id;
    bool m_tx_event_id_isSet;
    bool m_tx_event_id_isValid;

    qint32 m_tx_events_count;
    bool m_tx_events_count_isSet;
    bool m_tx_events_count_isValid;

    qint32 m_tx_id;
    bool m_tx_id_isSet;
    bool m_tx_id_isValid;

    QString m_username;
    bool m_username_isSet;
    bool m_username_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAINeo4jCaptureDataChange_meta)

#endif // OAINeo4jCaptureDataChange_meta_H
