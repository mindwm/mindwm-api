#import "OAIGraphNodeAllOfData.h"

@implementation OAIGraphNodeAllOfData

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"headers": @"headers", @"messageKey": @"message_key", @"meta": @"meta", @"offset": @"offset", @"partition": @"partition", @"sourceType": @"source_type", @"timestamp": @"timestamp", @"topic": @"topic", @"schema": @"schema", @"payload": @"payload" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[];
  return [optionalProperties containsObject:propertyName];
}

@end
