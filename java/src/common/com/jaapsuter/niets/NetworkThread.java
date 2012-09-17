package com.jaapsuter.niets;

import com.jaapsuter.niets.md5.MD5;
import com.jaapsuter.niets.md5.MD5Sasl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;

class NetworkThread extends Thread
{
    private NetworkEventHandler _handler;
    private TcpConnection _tcpConn;
    private OutputStream _out;
    private InputStream _in;
    private String _dst;
    private String _msg;

    public NetworkThread(String dst, String msg, NetworkEventHandler handler)
    {
        _dst = dst;
        _msg = msg;
        _handler = handler;
    }
    
    private void send(String hexString) throws IOException {
        byte[] bytes = StringUtil.hexStringToByteArray(hexString);
        send(bytes);
    }

    private void send(byte[] bytes) throws IOException {
        _handler.log("> " + StringUtil.byteArrayToHexString(bytes));
        writeBigEndian16(_out, bytes.length);
        _out.write(bytes);
        _out.flush();
    }

    private void sendProtocolCookie() throws IOException {
        _out.write(StringUtil.hexStringToByteArray("57410101"));
        _out.flush();
    }

    private byte[] receive() throws IOException {
        int size = readBigEndian16(_in);
        byte[] buffer = new byte[size];
        _in.read(buffer);
        _handler.log("< " + StringUtil.byteArrayToHexString(buffer));
        return buffer;
    }

    private static int readBigEndian16(InputStream input) throws IOException {
        return ((int) input.read() << 8) | (int) input.read();
    }

    private static void writeBigEndian16(OutputStream output, int n) throws IOException {
        output.write((byte) (n >> 8));
        output.write((byte) (n));
    }

    public static void writeBigEndian24(OutputStream output, int n) throws IOException {
        output.write((byte)(n >> 16));
        output.write((byte)(n >> 8));
        output.write((byte)(n));
    }

    private static void writeString(OutputStream output, String s) throws IOException {
        final byte stringTag = (byte)0xfc;
        final byte longStringTag = (byte)0xfd;

        byte[] bytes = StringUtil.getBytesUTF8(s);
        if (bytes.length > Byte.MAX_VALUE)
        {
            output.write(longStringTag);
            writeBigEndian24(output, bytes.length);
        }
        else
        {
            output.write(stringTag);
            output.write((byte)bytes.length);
        }

        output.write(bytes);
    }
  
    public void run()
    {        
        try
        {
            _handler.log("Opening Connection...");
            
            final String hostname = "bin-short.whatsapp.net";
            final int port = 5222;
        
            _tcpConn = new TcpConnection(hostname, port);
            _out = _tcpConn.getOutputStream();
            _in = _tcpConn.getInputStream();
        
            sendProtocolCookie();
            send("F80501A08A84FC116950686F6E652D322E382E322D35323232"); // 0019
            send("F80296F801F8017E"); // 0008
            send("F8050FBDA75A2A"); // 0007

            final String username = "61416905612"; // "16043135227"; // "16045646511";
            final String imei = "603938931484000"; // "603938931484000";
            final String password = StringUtil.byteArrayToHexString(new MD5(new StringBuffer(imei).reverse().toString()).doFinal()); // "3a65f5bd7256642f90efe085190c038a"; 
            final String realm = "s.whatsapp.net";

            receive();
            receive();
            byte[] recv = receive();

            int skipToBase64 = 7;
            String base64 = new String(recv, skipToBase64, recv.length - skipToBase64, "UTF-8");
            MD5Sasl.Challenge challenge = MD5Sasl.decode(new String(Base64.decode(base64), "UTF-8"));
            String response = MD5Sasl.respond(challenge, username, password, realm);
            _handler.log(response);

            base64 = Base64.encode(StringUtil.getBytesUTF8(response));

            ByteArrayOutputStream baOut = new ByteArrayOutputStream();
            baOut.write(StringUtil.hexStringToByteArray("f80486bda7"));
            writeString(baOut, base64);
            send(baOut.toByteArray());

            receive();
            receive();
            receive();

            _handler.log("Connected...");

            String msgId = StringUtil.zeroPad(Long.toString(System.currentTimeMillis()), 10) + "-1";

            baOut.reset();
            baOut.write(StringUtil.hexStringToByteArray("f8085d43"));
            writeString(baOut, msgId);
            baOut.write(StringUtil.hexStringToByteArray("a0fa"));
            writeString(baOut, _dst);
            baOut.write(StringUtil.hexStringToByteArray("8aa21b"));
            baOut.write(StringUtil.hexStringToByteArray("f802f804babd4ff801f8018cf80216"));
            writeString(baOut, _msg);
            send(baOut.toByteArray());

            _handler.log("Message sent...");
            
            receive();
            receive();
            receive();
            
            _handler.log("Message possibly received...");           
            

            final long sleepInMs = 2237;
            sleep(sleepInMs);
        }
        catch(InterruptedException e) { _handler.log(e.toString()); }
        catch(IOException e) { _handler.log(e.toString()); }
        finally
        {
            _tcpConn.disconnect();
            _tcpConn = null;
        }
    }
}

