#import "OAIGraphNode.h"

@implementation OAIGraphNode

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"source": @"source", @"specversion": @"specversion", @"type": @"type", @"datacontenttype": @"datacontenttype", @"dataschema": @"dataschema", @"subject": @"subject", @"time": @"time", @"data": @"data", @"dataBase64": @"data_base64" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"datacontenttype", @"dataschema", @"subject", @"time", @"data", @"dataBase64"];
  return [optionalProperties containsObject:propertyName];
}

@end
