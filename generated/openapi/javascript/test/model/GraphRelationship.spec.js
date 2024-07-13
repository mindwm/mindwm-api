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
    instance = new MindwmApi.GraphRelationship();
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

  describe('GraphRelationship', function() {
    it('should create an instance of GraphRelationship', function() {
      // uncomment below and update the code to test GraphRelationship
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be.a(MindwmApi.GraphRelationship);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property source (base name: "source")', function() {
      // uncomment below and update the code to test the property source
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property specversion (base name: "specversion")', function() {
      // uncomment below and update the code to test the property specversion
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property datacontenttype (base name: "datacontenttype")', function() {
      // uncomment below and update the code to test the property datacontenttype
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property dataschema (base name: "dataschema")', function() {
      // uncomment below and update the code to test the property dataschema
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property subject (base name: "subject")', function() {
      // uncomment below and update the code to test the property subject
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property time (base name: "time")', function() {
      // uncomment below and update the code to test the property time
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property data (base name: "data")', function() {
      // uncomment below and update the code to test the property data
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

    it('should have the property dataBase64 (base name: "data_base64")', function() {
      // uncomment below and update the code to test the property dataBase64
      //var instance = new MindwmApi.GraphRelationship();
      //expect(instance).to.be();
    });

  });

}));
