[package]
name = "mindwm-api"
version = "0.1.0"

[dependencies]
json_merge_patch = { oci = "oci://ghcr.io/kcl-lang/json_merge_patch", tag = "0.1.1" }

[profile]
#entries = ["test.k"]
entries = ["mindwm_openapi.k"]
