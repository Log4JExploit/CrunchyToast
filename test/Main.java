/*
 * Copyright (c) 2024 CrunchyToast by Log4JExploit
 * Do you keep my non-compiled source code?
 * Then keep this comment.  (View the license)
 */

import web.log4jexploit.crunchytoast.http.impl.HttpServerBuilder;
import web.log4jexploit.crunchytoast.http.inf.HttpServer;

public class Main {

    public static void main(String[] args) {
        HttpServer server = HttpServerBuilder.build(25565, HttpServerBuilder.getDefault());
        server.start();
    }

}
