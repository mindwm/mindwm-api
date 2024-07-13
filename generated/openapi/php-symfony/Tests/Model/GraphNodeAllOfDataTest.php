<?php
/**
 * GraphNodeAllOfDataTest
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

use OpenAPI\Server\Model\GraphNodeAllOfData;
use PHPUnit\Framework\MockObject\MockObject;
use PHPUnit\Framework\TestCase;

/**
 * GraphNodeAllOfDataTest Class Doc Comment
 *
 * @category    Class
 * @description GraphNodeAllOfData
 * @package     OpenAPI\Server\Tests\Model
 * @author      openapi-generator contributors
 * @link        https://github.com/openapitools/openapi-generator
 * @coversDefaultClass \OpenAPI\Server\Model\GraphNodeAllOfData
 */
class GraphNodeAllOfDataTest extends TestCase
{
    protected GraphNodeAllOfData|MockObject $object;

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
        $this->object = $this->getMockBuilder(GraphNodeAllOfData::class)->getMockForAbstractClass();
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
        $this->assertTrue(class_exists(GraphNodeAllOfData::class));
        $this->assertInstanceOf(GraphNodeAllOfData::class, $this->object);
    }

    /**
     * Test attribute "headers"
     *
     * @group unit
     * @small
     */
    public function testPropertyHeaders(): void
    {
        $this->markTestSkipped('Test for property headers not implemented');
    }

    /**
     * Test attribute "messageKey"
     *
     * @group unit
     * @small
     */
    public function testPropertyMessageKey(): void
    {
        $this->markTestSkipped('Test for property messageKey not implemented');
    }

    /**
     * Test attribute "meta"
     *
     * @group unit
     * @small
     */
    public function testPropertyMeta(): void
    {
        $this->markTestSkipped('Test for property meta not implemented');
    }

    /**
     * Test attribute "offset"
     *
     * @group unit
     * @small
     */
    public function testPropertyOffset(): void
    {
        $this->markTestSkipped('Test for property offset not implemented');
    }

    /**
     * Test attribute "partition"
     *
     * @group unit
     * @small
     */
    public function testPropertyPartition(): void
    {
        $this->markTestSkipped('Test for property partition not implemented');
    }

    /**
     * Test attribute "sourceType"
     *
     * @group unit
     * @small
     */
    public function testPropertySourceType(): void
    {
        $this->markTestSkipped('Test for property sourceType not implemented');
    }

    /**
     * Test attribute "timestamp"
     *
     * @group unit
     * @small
     */
    public function testPropertyTimestamp(): void
    {
        $this->markTestSkipped('Test for property timestamp not implemented');
    }

    /**
     * Test attribute "topic"
     *
     * @group unit
     * @small
     */
    public function testPropertyTopic(): void
    {
        $this->markTestSkipped('Test for property topic not implemented');
    }

    /**
     * Test attribute "schema"
     *
     * @group unit
     * @small
     */
    public function testPropertySchema(): void
    {
        $this->markTestSkipped('Test for property schema not implemented');
    }

    /**
     * Test attribute "payload"
     *
     * @group unit
     * @small
     */
    public function testPropertyPayload(): void
    {
        $this->markTestSkipped('Test for property payload not implemented');
    }
}
