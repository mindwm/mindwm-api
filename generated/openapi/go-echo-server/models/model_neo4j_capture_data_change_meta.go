package models

type Neo4jCaptureDataChangeMeta struct {

	Operation string `json:"operation"`

	Source Neo4jCaptureDataChangeMetaSource `json:"source"`

	Timestamp int32 `json:"timestamp"`

	TxEventId int32 `json:"txEventId"`

	TxEventsCount int32 `json:"txEventsCount"`

	TxId int32 `json:"txId"`

	Username string `json:"username"`
}
