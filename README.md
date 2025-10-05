# CrunchyToast

A library that allows you to host an http/websocket server from   
within your java application. No installation required.   
Simply add CrunchyToast as a library and get started.  

Prebuilt jars can be found in the <b>Releases</b> section of  
this GitHub repository.


# Features

Version 3.0 includes the following features:
- Support for certificates (SSL/TLS)
- Launching multiple independent Server instances
- Declaring Endpoints using Annotations
- Automatic handling of returned values by such endpoints
- Making use of chunked or direct data transfer
- Sending outbound Requests (useful for proxying)
- Supports WebSockets and all the benefits they bring
- Add Pre- and Postprocessors to intercept requests/responses
- Logging functionality
- Load balancing of requests
- and much more!


# Getting Started

Spin up a http/websocket server instance in seconds  
with only a few lines of code:

```
import github.log4jexploit.crunchytoast.http.endpoint.HttpEndpoint;
import github.log4jexploit.crunchytoast.http.inbound.impl.HttpServerBuilder;
import github.log4jexploit.crunchytoast.http.inbound.impl.HttpServer;

public class github.log4jexploit.crunchytoast.Start {

    public static void main(String[] args) {
        HttpServer server = HttpServerBuilder.build(8080, "HTTP");
        server.getEndpointManager().registerHandler(new github.log4jexploit.crunchytoast.Start());
        server.start();
    }

    @HttpEndpoint
    public String getHelloWorld() {
        return "Hello world!";
    }

}
```
When you connect to `localhost:8080`, you'll see the `Hello world!` response.

> [!TIP]
> You can visit the [CrunchyToast-Wiki](https://github.com/Log4JExploit/CrunchyToast/wiki) to find out more!

# Contribution

Thank you for reading all the way until the end!  
If you have some spare time, please consider helping!  
I would really appreciate any contribution you may  
have to make this more reliable and bug-free! ❤️
