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
    instance = new MindwmApi.Neo4jChangeDataCaptureSchema();
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

  describe('Neo4jChangeDataCaptureSchema', function() {
    it('should create an instance of Neo4jChangeDataCaptureSchema', function() {
      // uncomment below and update the code to test Neo4jChangeDataCaptureSchema
      //var instance = new MindwmApi.Neo4jChangeDataCaptureSchema();
      //expect(instance).to.be.a(MindwmApi.Neo4jChangeDataCaptureSchema);
    });

    it('should have the property constraints (base name: "constraints")', function() {
      // uncomment below and update the code to test the property constraints
      //var instance = new MindwmApi.Neo4jChangeDataCaptureSchema();
      //expect(instance).to.be();
    });

    it('should have the property properties (base name: "properties")', function() {
      // uncomment below and update the code to test the property properties
      //var instance = new MindwmApi.Neo4jChangeDataCaptureSchema();
      //expect(instance).to.be();
    });

  });

}));
