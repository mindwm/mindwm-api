/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package MindwWM.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import MindwWM.models.IoDocument
import MindwWM.models.CloudEventData
import MindwWM.models.TmuxPaneIoDocument

class IoDocumentTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of IoDocument
        //val modelInstance = IoDocument()

        // to test the property `id` - Identifies the event.
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `specversion` - The version of the CloudEvents specification which the event uses.
        should("test specversion") {
            // uncomment below to test the property
            //modelInstance.specversion shouldBe ("TODO")
        }

        // to test the property `type`
        should("test type") {
            // uncomment below to test the property
            //modelInstance.type shouldBe ("TODO")
        }

        // to test the property `source`
        should("test source") {
            // uncomment below to test the property
            //modelInstance.source shouldBe ("TODO")
        }

        // to test the property ``data``
        should("test `data`") {
            // uncomment below to test the property
            //modelInstance.`data` shouldBe ("TODO")
        }

        // to test the property `datacontenttype` - Content type of the data value. Must adhere to RFC 2046 format.
        should("test datacontenttype") {
            // uncomment below to test the property
            //modelInstance.datacontenttype shouldBe ("TODO")
        }

        // to test the property `dataschema` - Identifies the schema that data adheres to.
        should("test dataschema") {
            // uncomment below to test the property
            //modelInstance.dataschema shouldBe ("TODO")
        }

        // to test the property `subject` - Describes the subject of the event in the context of the event producer (identified by source).
        should("test subject") {
            // uncomment below to test the property
            //modelInstance.subject shouldBe ("TODO")
        }

        // to test the property `time` - Timestamp of when the occurrence happened. Must adhere to RFC 3339.
        should("test time") {
            // uncomment below to test the property
            //modelInstance.time shouldBe ("TODO")
        }

        // to test the property `dataBase64` - Base64 encoded event payload. Must adhere to RFC4648.
        should("test dataBase64") {
            // uncomment below to test the property
            //modelInstance.dataBase64 shouldBe ("TODO")
        }

    }
}
