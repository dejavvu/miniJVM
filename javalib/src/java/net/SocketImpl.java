/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.net;

import java.io.Closeable;
import java.io.IOException;
import org.mini.net.SocketNative;

/**
 *
 * @author Gust
 */
public class SocketImpl implements Closeable {


    int fd = -1;

    String host;
    int port;//remotePort
    String localHost;
    int localport;

    void bind(int sockfd, String host, int port) throws IOException {
        localHost = host;
        localport = port;
        int ret = SocketNative.bind0(sockfd, localHost.getBytes(), localport);
        if (ret < 0) {
            throw new IOException("bind error");
        }
    }

    public void bind(SocketAddress bindpoint) throws IOException {
        if (fd < 0) {
            throw new IOException("socket not open");
        }
        if (bindpoint instanceof InetSocketAddress) {
            InetSocketAddress inetBindpoint = (InetSocketAddress) bindpoint;
            localHost = inetBindpoint.getAddress().getHostName();
            localport = inetBindpoint.getPort();
            bind(fd, localHost, localport);
        }
    }

    @Override
    public void close() throws IOException {
        if (fd >= 0) {
            SocketNative.close0(fd);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }


}
