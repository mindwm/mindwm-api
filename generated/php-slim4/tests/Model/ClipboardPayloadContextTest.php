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
use OpenAPIServer\Model\ClipboardPayloadContext;

/**
 * ClipboardPayloadContextTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ClipboardPayloadContext
 */
class ClipboardPayloadContextTest extends TestCase
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
     * Test "ClipboardPayloadContext"
     */
    public function testClipboardPayloadContext()
    {
        $testClipboardPayloadContext = new ClipboardPayloadContext();
        $namespacedClassname = ClipboardPayloadContext::getModelsNamespace() . '\\ClipboardPayloadContext';
        $this->assertSame('\\' . ClipboardPayloadContext::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ClipboardPayloadContext" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "window"
     */
    public function testPropertyWindow()
    {
        self::markTestIncomplete(
            'Test of "window" property in "ClipboardPayloadContext" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ClipboardPayloadContext::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

