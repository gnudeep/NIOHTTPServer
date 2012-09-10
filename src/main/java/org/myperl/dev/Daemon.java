package org.myperl.dev;

/**
 *NIP HTTP Server
 */
public class Daemon {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        Server daemon = new N2(8090, 1024, false);
        daemon.runServer();
    }
}
