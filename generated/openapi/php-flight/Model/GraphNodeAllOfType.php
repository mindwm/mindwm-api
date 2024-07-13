<?php
/**
 * GraphNodeAllOfType
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPIServer\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */


namespace OpenAPIServer\Model;

/**
 * Class representing the GraphNodeAllOfType model.
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 */
enum GraphNodeAllOfType: string
{
        case CREATED = 'created';
        case UPDATED = 'updated';
        case DELETED = 'deleted';
}



