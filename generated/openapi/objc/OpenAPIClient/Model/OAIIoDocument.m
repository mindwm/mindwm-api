#import "OAIIoDocument.h"

@implementation OAIIoDocument

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"type": @"type", @"source": @"source", @"data": @"data", @"_id": @"id", @"specversion": @"specversion", @"datacontenttype": @"datacontenttype", @"dataschema": @"dataschema", @"subject": @"subject", @"time": @"time", @"dataBase64": @"data_base64" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"type", @"source", @"data", @"datacontenttype", @"dataschema", @"subject", @"time", @"dataBase64"];
  return [optionalProperties containsObject:propertyName];
}

@end
