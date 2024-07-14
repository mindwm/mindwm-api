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
use OpenAPIServer\Model\Neo4jCaptureDataChangeMeta;

/**
 * Neo4jCaptureDataChangeMetaTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Neo4jCaptureDataChangeMeta
 */
class Neo4jCaptureDataChangeMetaTest extends TestCase
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
     * Test "Neo4jCaptureDataChangeMeta"
     */
    public function testNeo4jCaptureDataChangeMeta()
    {
        $testNeo4jCaptureDataChangeMeta = new Neo4jCaptureDataChangeMeta();
        $namespacedClassname = Neo4jCaptureDataChangeMeta::getModelsNamespace() . '\\Neo4jCaptureDataChangeMeta';
        $this->assertSame('\\' . Neo4jCaptureDataChangeMeta::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "operation"
     */
    public function testPropertyOperation()
    {
        self::markTestIncomplete(
            'Test of "operation" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "source"
     */
    public function testPropertySource()
    {
        self::markTestIncomplete(
            'Test of "source" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "timestamp"
     */
    public function testPropertyTimestamp()
    {
        self::markTestIncomplete(
            'Test of "timestamp" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "txEventId"
     */
    public function testPropertyTxEventId()
    {
        self::markTestIncomplete(
            'Test of "txEventId" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "txEventsCount"
     */
    public function testPropertyTxEventsCount()
    {
        self::markTestIncomplete(
            'Test of "txEventsCount" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "txId"
     */
    public function testPropertyTxId()
    {
        self::markTestIncomplete(
            'Test of "txId" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "username"
     */
    public function testPropertyUsername()
    {
        self::markTestIncomplete(
            'Test of "username" property in "Neo4jCaptureDataChangeMeta" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Neo4jCaptureDataChangeMeta::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
