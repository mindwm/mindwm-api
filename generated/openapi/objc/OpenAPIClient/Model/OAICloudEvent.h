#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Mindwm API
* This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
*
* The version of the OpenAPI document: 0.1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAICloudEvent
@end

@interface OAICloudEvent : OAIObject

/* Identifies the event. 
 */
@property(nonatomic) NSString* _id;
/* Identifies the context in which an event happened. 
 */
@property(nonatomic) NSString* source;
/* The version of the CloudEvents specification which the event uses. 
 */
@property(nonatomic) NSString* specversion;
/* Describes the type of event related to the originating occurrence. 
 */
@property(nonatomic) NSString* type;
/* Content type of the data value. Must adhere to RFC 2046 format. [optional]
 */
@property(nonatomic) NSString* datacontenttype;
/* Identifies the schema that data adheres to. [optional]
 */
@property(nonatomic) NSString* dataschema;
/* Describes the subject of the event in the context of the event producer (identified by source). [optional]
 */
@property(nonatomic) NSString* subject;
/* Timestamp of when the occurrence happened. Must adhere to RFC 3339. [optional]
 */
@property(nonatomic) NSDate* time;
/* The event payload. [optional]
 */
@property(nonatomic) NSObject* data;
/* Base64 encoded event payload. Must adhere to RFC4648. [optional]
 */
@property(nonatomic) NSString* dataBase64;

@end
