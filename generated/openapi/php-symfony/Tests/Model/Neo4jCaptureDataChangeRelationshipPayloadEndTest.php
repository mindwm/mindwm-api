<?php
/**
 * Neo4jCaptureDataChangeRelationshipPayloadEndTest
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

use OpenAPI\Server\Model\Neo4jCaptureDataChangeRelationshipPayloadEnd;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * Neo4jCaptureDataChangeRelationshipPayloadEndTest Class Doc Comment
 *
 * @category    Class
 * @description Neo4jCaptureDataChangeRelationshipPayloadEnd
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\Neo4jCaptureDataChangeRelationshipPayloadEnd
 */
class Neo4jCaptureDataChangeRelationshipPayloadEndTest extends TestCase
{
    protected Neo4jCaptureDataChangeRelationshipPayloadEnd|MockObject $object;

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
        $this->object = $this->getMockBuilder(Neo4jCaptureDataChangeRelationshipPayloadEnd::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(Neo4jCaptureDataChangeRelationshipPayloadEnd::class));
        $this->assertInstanceOf(Neo4jCaptureDataChangeRelationshipPayloadEnd::class, $this->object);
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
     * Test attribute "ids"
     *
     * @group unit
     * @small
     */
    public function testPropertyIds(): void
    {
        $this->markTestSkipped('Test for property ids not implemented');
    }

    /**
     * Test attribute "labels"
     *
     * @group unit
     * @small
     */
    public function testPropertyLabels(): void
    {
        $this->markTestSkipped('Test for property labels not implemented');
    }
}
