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


#import "OAINeo4jCaptureDataChangeNodePayloadAfter.h"
@protocol OAINeo4jCaptureDataChangeNodePayloadAfter;
@class OAINeo4jCaptureDataChangeNodePayloadAfter;



@protocol OAINeo4jCaptureDataChangeNodePayload
@end

@interface OAINeo4jCaptureDataChangeNodePayload : OAIObject


@property(nonatomic) OAINeo4jCaptureDataChangeNodePayloadAfter* after;

@property(nonatomic) NSString* before;

@property(nonatomic) NSString* _id;

@property(nonatomic) NSString* type;

@end