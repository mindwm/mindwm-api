#!/usr/bin/env bash
set -euo pipefail

datamodel-codegen \
  --input mindwm.yaml \
  --output model.py \
  --output-model-type 'pydantic_v2.BaseModel' \
  --field-constraints \
  --target-python-version '3.12' \
  --use-one-literal-as-default
