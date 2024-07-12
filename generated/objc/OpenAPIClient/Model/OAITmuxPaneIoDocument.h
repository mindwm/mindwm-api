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


#import "OAIAnyType.h"
@protocol OAIAnyType;
@class OAIAnyType;



@protocol OAITmuxPaneIoDocument
@end

@interface OAITmuxPaneIoDocument : NSMutableDictionary

/* User input 
 */
@property(nonatomic) NSString* input;
/* Command output (mix of stdout & stderr) 
 */
@property(nonatomic) NSString* output;
/* ps1 (prompt) AFTER the input and output 
 */
@property(nonatomic) NSString* ps1;

@end
