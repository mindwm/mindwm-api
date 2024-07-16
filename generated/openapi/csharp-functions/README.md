# MindWM - Azure Functions v4 Server

This document describes the documentation, a collection of JSON schemas and example cloudevent and payloads

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/MindWM
docker build -t mindwm .
docker run -p 5000:8080 mindwm
```
