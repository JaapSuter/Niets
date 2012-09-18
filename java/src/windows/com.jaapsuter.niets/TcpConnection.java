// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpConnection
{
    private OutputStream _out;
    private InputStream _in;
    private Socket _conn;

    public TcpConnection(String hostname, int port) throws IOException
    {
        _conn = new Socket(hostname, port);
        _out = _conn.getOutputStream();
        _in = _conn.getInputStream();
    }

    public OutputStream getOutputStream() { return _out; }
    public InputStream getInputStream() { return _in; }

    public void disconnect()
    {
        try { _in.close(); }
        catch(IOException ioe) {}
        finally { _in = null; }
        try { _out.close(); }
        catch(IOException ioe) {}
        finally { _out = null; }
        try { _conn.close(); }
        catch(IOException ioe) {}
        finally { _conn = null; }

    }
}