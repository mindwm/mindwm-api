// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Mindwm API
 *
 * This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads
 *
 * API version: 0.1.0
 */

package main

import (
	"log"
	"net/http"

	MindwWM "github.com/GIT_USER_ID/GIT_REPO_ID/go"
)

func main() {
	log.Printf("Server started")

	router := MindwWM.NewRouter()

	log.Fatal(http.ListenAndServe(":8080", router))
}