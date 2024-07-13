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
    instance = new MindwmApi.Neo4jCaptureDataChangeNodePayload();
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

  describe('Neo4jCaptureDataChangeNodePayload', function() {
    it('should create an instance of Neo4jCaptureDataChangeNodePayload', function() {
      // uncomment below and update the code to test Neo4jCaptureDataChangeNodePayload
      //var instance = new MindwmApi.Neo4jCaptureDataChangeNodePayload();
      //expect(instance).to.be.a(MindwmApi.Neo4jCaptureDataChangeNodePayload);
    });

    it('should have the property after (base name: "after")', function() {
      // uncomment below and update the code to test the property after
      //var instance = new MindwmApi.Neo4jCaptureDataChangeNodePayload();
      //expect(instance).to.be();
    });

    it('should have the property before (base name: "before")', function() {
      // uncomment below and update the code to test the property before
      //var instance = new MindwmApi.Neo4jCaptureDataChangeNodePayload();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new MindwmApi.Neo4jCaptureDataChangeNodePayload();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new MindwmApi.Neo4jCaptureDataChangeNodePayload();
      //expect(instance).to.be();
    });

  });

}));
