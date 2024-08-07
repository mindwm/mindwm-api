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
    instance = new MindwmApi.ClipboardContext();
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

  describe('ClipboardContext', function() {
    it('should create an instance of ClipboardContext', function() {
      // uncomment below and update the code to test ClipboardContext
      //var instance = new MindwmApi.ClipboardContext();
      //expect(instance).to.be.a(MindwmApi.ClipboardContext);
    });

    it('should have the property windowId (base name: "windowId")', function() {
      // uncomment below and update the code to test the property windowId
      //var instance = new MindwmApi.ClipboardContext();
      //expect(instance).to.be();
    });

  });

}));
