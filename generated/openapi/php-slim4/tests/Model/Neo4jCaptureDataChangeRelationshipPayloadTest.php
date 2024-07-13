<?php

/**
 * Mindwm API
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 * The version of the OpenAPI document: 0.1.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\Neo4jCaptureDataChangeRelationshipPayload;

/**
 * Neo4jCaptureDataChangeRelationshipPayloadTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Neo4jCaptureDataChangeRelationshipPayload
 */
class Neo4jCaptureDataChangeRelationshipPayloadTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test "Neo4jCaptureDataChangeRelationshipPayload"
     */
    public function testNeo4jCaptureDataChangeRelationshipPayload()
    {
        $testNeo4jCaptureDataChangeRelationshipPayload = new Neo4jCaptureDataChangeRelationshipPayload();
        $namespacedClassname = Neo4jCaptureDataChangeRelationshipPayload::getModelsNamespace() . '\\Neo4jCaptureDataChangeRelationshipPayload';
        $this->assertSame('\\' . Neo4jCaptureDataChangeRelationshipPayload::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "after"
     */
    public function testPropertyAfter()
    {
        self::markTestIncomplete(
            'Test of "after" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "before"
     */
    public function testPropertyBefore()
    {
        self::markTestIncomplete(
            'Test of "before" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "end"
     */
    public function testPropertyEnd()
    {
        self::markTestIncomplete(
            'Test of "end" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "label"
     */
    public function testPropertyLabel()
    {
        self::markTestIncomplete(
            'Test of "label" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "start"
     */
    public function testPropertyStart()
    {
        self::markTestIncomplete(
            'Test of "start" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        self::markTestIncomplete(
            'Test of "type" property in "Neo4jCaptureDataChangeRelationshipPayload" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Neo4jCaptureDataChangeRelationshipPayload::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

