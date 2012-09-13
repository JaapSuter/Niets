package com.jaapsuter.niets;

import java.io.*;
import javax.microedition.io.*;

public class TcpConnection
{
    private OutputStream output;
    private InputStream input;
    private StreamConnection connection;

    public TcpConnection(String hostname, int port) throws IOException
    {
    	String url = "socket://" + hostname + ":" + Integer.toString(port) + ";deviceside=true;interface=wifi";                                    
        connection = (StreamConnection)Connector.open(url);
        
        output = connection.openOutputStream();
        input = connection.openInputStream();
    }

    public OutputStream getOutputStream() { return output; }
    public InputStream getInputStream() { return input; }
}