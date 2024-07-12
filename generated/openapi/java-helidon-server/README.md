# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```

```

## Try health and metrics

```
curl -s -X GET https://mindwmw.io/v1/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://mindwmw.io/v1/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://mindwmw.io/v1/metrics
{"base":...
. . .
```