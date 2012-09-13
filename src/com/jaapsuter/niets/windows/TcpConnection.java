package com.jaapsuter.niets.windows;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpConnection
{
    private OutputStream output;
    private InputStream input;
    private Socket socket;

    public TcpConnection(String hostname, int port) throws IOException
    {
        socket = new Socket(hostname, port);
        output = socket.getOutputStream();
        input = socket.getInputStream();
    }

    public OutputStream getOutputStream() { return output; }
    public InputStream getInputStream() { return input; }
}