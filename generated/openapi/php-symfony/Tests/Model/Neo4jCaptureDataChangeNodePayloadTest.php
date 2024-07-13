<?php
/**
 * Neo4jCaptureDataChangeNodePayloadTest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Tests\Model
 * @author   openapi-generator contributors
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

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */

namespace OpenAPI\Server\Tests\Model;

use OpenAPI\Server\Model\Neo4jCaptureDataChangeNodePayload;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * Neo4jCaptureDataChangeNodePayloadTest Class Doc Comment
 *
 * @category    Class
 * @description Neo4jCaptureDataChangeNodePayload
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\Neo4jCaptureDataChangeNodePayload
 */
class Neo4jCaptureDataChangeNodePayloadTest extends TestCase
{
    protected Neo4jCaptureDataChangeNodePayload|MockObject $object;

    /**
     * Setup before running any test case
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
        $this->object = $this->getMockBuilder(Neo4jCaptureDataChangeNodePayload::class)->getMockForAbstractClass();
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
     * @group integration
     * @small
     */
    public function testTestClassExists(): void
    {
        $this->assertTrue(class_exists(Neo4jCaptureDataChangeNodePayload::class));
        $this->assertInstanceOf(Neo4jCaptureDataChangeNodePayload::class, $this->object);
    }

    /**
     * Test attribute "after"
     *
     * @group unit
     * @small
     */
    public function testPropertyAfter(): void
    {
        $this->markTestSkipped('Test for property after not implemented');
    }

    /**
     * Test attribute "before"
     *
     * @group unit
     * @small
     */
    public function testPropertyBefore(): void
    {
        $this->markTestSkipped('Test for property before not implemented');
    }

    /**
     * Test attribute "id"
     *
     * @group unit
     * @small
     */
    public function testPropertyId(): void
    {
        $this->markTestSkipped('Test for property id not implemented');
    }

    /**
     * Test attribute "type"
     *
     * @group unit
     * @small
     */
    public function testPropertyType(): void
    {
        $this->markTestSkipped('Test for property type not implemented');
    }
}
