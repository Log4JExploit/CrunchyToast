# CrunchyToast

A Library that allows you to host a WebServer from within your  
Java-Application. No annoying installation required. Simply  
add CrunchyToast as a Library and get started.


# Features

Version 2.4 includes the following features:
- Works with TLS 1.3 and LetsEncrypt
- Launching multiple independent Server instances
- Declaring Endpoints using Annotations
- Automatic handling of returned values by such endpoints
- Making use of chunked or direct data transfer
- Sending outbound Requests (useful for proxying)
- Allows for dynamic resource loading (to keep your RAM free)
- Supports WebSockets and all the benefits they bring
- and much more!


# Getting Started

Spin up a WebServer instance in seconds  
with only a few lines of code:

```
import github.log4jexploit.crunchytoast.http.endpoint.HttpEndpoint;
import github.log4jexploit.crunchytoast.http.inbound.impl.HttpServerBuilder;
import github.log4jexploit.crunchytoast.http.inbound.inf.HttpServer;

public class Start {

    public static void main(String[] args) {
        HttpServer server = HttpServerBuilder.build(8080, "HTTP");
        server.getEndpointManager().registerHandler(new Start());
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

So you made it all the way down here??  
If you have some spare time, please consider helping!  
I would really appreciate any contribution you may  
have to make this more solid and bug-free! ❤️
