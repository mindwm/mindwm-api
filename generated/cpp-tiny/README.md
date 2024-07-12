# Documentation for OpenAPI Petstore
This is a client generator for microcontrollers on the Espressif32 platform and the Arduino framework
After the client have been generated, you have to change these following variables:
- root.cert | Provide your service root certificate.
- src/main.cpp | Change wifi name
- src/main.cpp | Change wifi password
- lib/service/AbstractService.h | Change to your url

# Documentation for Mindwm API 0.1.0 Tiny client cpp (Arduino) 

The project is structured like this:
```
samples/client/petstore/tiny/cpp/
├── lib
│   ├── Models
│   ├── service
│   └── TestFiles
├── platformio.ini
├── pre_compiling_bourne.py
├── README.md
├── root.cert
├── src
│   └── main.cpp
└── test
    └── RunTests.cpp
```

All URIs are relative to https://mindwmw.iohttps://mindwmw.io/v1


## What are the Model files for the data structures/objects?
|Class | Description|
|------------- | -------------|
|*Clipboard* | |
|*ClipboardPayload* | |
|*ClipboardPayload_context* | Selection context|
|*CloudEvent* | CloudEvents Specification JSON Schema|
|*CloudEvent_data* | The event payload.|
|*IoDocument* | |
|*TmuxPaneIoDocument* | |

