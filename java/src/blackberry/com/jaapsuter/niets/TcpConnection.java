// Copyright 2012, Jaap Suter - This file is subject to the
// terms and conditions defined in file LICENSE.md, which
// is part of the package - or contact license@jaapsuter.com

package com.jaapsuter.niets;

import java.io.*;
import javax.microedition.io.*;

public class TcpConnection
{
    private OutputStream _out;
    private InputStream _in;
    private StreamConnection _conn;

    public TcpConnection(String hostname, int port) throws IOException
    {
        // deviceside=true;
        String url = "socket://" + hostname + ":" + Integer.toString(port) + ";interface=wifi";                                    
        _conn = (StreamConnection)Connector.open(url);
        
        _out = _conn.openOutputStream();
        _in = _conn.openInputStream();
    }

    public OutputStream getOutputStream() { return _out; }
    public InputStream getInputStream() { return _in; }
    
    public void disconnect()
    {              
        try { if (_in != null) _in.close(); }
        catch(IOException ioe) {}
        finally { _in = null; }
        try { if (_out != null) _out.close(); }
        catch(IOException ioe) {}
        finally { _out = null; }
        try { if (_conn != null) _conn.close(); }
        catch(IOException ioe) {}
        finally { _conn = null; }
        
    }
}
