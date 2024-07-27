/**
 * Mindwm API
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.MindwmApi);
  }
}(this, function(expect, MindwmApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MindwmApi.Neo4jChangeDataCapture();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Neo4jChangeDataCapture', function() {
    it('should create an instance of Neo4jChangeDataCapture', function() {
      // uncomment below and update the code to test Neo4jChangeDataCapture
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be.a(MindwmApi.Neo4jChangeDataCapture);
    });

    it('should have the property headers (base name: "headers")', function() {
      // uncomment below and update the code to test the property headers
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property messageKey (base name: "message_key")', function() {
      // uncomment below and update the code to test the property messageKey
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property meta (base name: "meta")', function() {
      // uncomment below and update the code to test the property meta
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property offset (base name: "offset")', function() {
      // uncomment below and update the code to test the property offset
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property partition (base name: "partition")', function() {
      // uncomment below and update the code to test the property partition
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property sourceType (base name: "source_type")', function() {
      // uncomment below and update the code to test the property sourceType
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property topic (base name: "topic")', function() {
      // uncomment below and update the code to test the property topic
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property schema (base name: "schema")', function() {
      // uncomment below and update the code to test the property schema
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

    it('should have the property payload (base name: "payload")', function() {
      // uncomment below and update the code to test the property payload
      //var instance = new MindwmApi.Neo4jChangeDataCapture();
      //expect(instance).to.be();
    });

  });

}));
