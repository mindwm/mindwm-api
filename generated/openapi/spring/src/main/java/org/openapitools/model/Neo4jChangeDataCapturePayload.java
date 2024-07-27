package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Neo4jChangeDataCaptureNodePayload;
import org.openapitools.model.Neo4jChangeDataCaptureRelationshipPayload;
import org.openapitools.model.Neo4jChangeDataCaptureRelationshipPayloadEnd;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-27T20:33:35.131405119Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public interface Neo4jChangeDataCapturePayload {
}
