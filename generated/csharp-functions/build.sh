#!/usr/bin/env bash
#
# Generated by: https://openapi-generator.tech
#

dotnet restore src/MindwWM/ && \
    dotnet build src/MindwWM/ && \
    echo "Now, run the following to start the project: func start"
