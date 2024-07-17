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
use OpenAPIServer\Model\Clipboard;

/**
 * ClipboardTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Clipboard
 */
class ClipboardTest extends TestCase
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
     * Test "Clipboard"
     */
    public function testClipboard()
    {
        $testClipboard = new Clipboard();
        $namespacedClassname = Clipboard::getModelsNamespace() . '\\Clipboard';
        $this->assertSame('\\' . Clipboard::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "id"
     */
    public function testPropertyId()
    {
        self::markTestIncomplete(
            'Test of "id" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "source"
     */
    public function testPropertySource()
    {
        self::markTestIncomplete(
            'Test of "source" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "specversion"
     */
    public function testPropertySpecversion()
    {
        self::markTestIncomplete(
            'Test of "specversion" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "type"
     */
    public function testPropertyType()
    {
        self::markTestIncomplete(
            'Test of "type" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "datacontenttype"
     */
    public function testPropertyDatacontenttype()
    {
        self::markTestIncomplete(
            'Test of "datacontenttype" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dataschema"
     */
    public function testPropertyDataschema()
    {
        self::markTestIncomplete(
            'Test of "dataschema" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "subject"
     */
    public function testPropertySubject()
    {
        self::markTestIncomplete(
            'Test of "subject" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "time"
     */
    public function testPropertyTime()
    {
        self::markTestIncomplete(
            'Test of "time" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "data"
     */
    public function testPropertyData()
    {
        self::markTestIncomplete(
            'Test of "data" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "dataBase64"
     */
    public function testPropertyDataBase64()
    {
        self::markTestIncomplete(
            'Test of "dataBase64" property in "Clipboard" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Clipboard::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

