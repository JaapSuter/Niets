package com.jaapsuter.niets;

import java.io.*;
import java.util.Hashtable;
// import com.jaapsuter.niets.windows.*;

public class Niets {
    public static void run() {
        String hostname = "bin-short.whatsapp.net";
        int port = 5222;
        
        hostname = "192.168.0.7";

        try {
            TcpConnection tcpConnection = new TcpConnection(hostname, port);
            OutputStream output = tcpConnection.getOutputStream();
            InputStream input = tcpConnection.getInputStream();

            send(output, "574101010019F80501A08A84FC116950686F6E652D322E382E322D35323232");
            send(output, "0008F80296F801F8017E");
            send(output, "0007F8050FBDA75A2A");

            receive(input);
            receive(input);
            byte[] recv = receive(input);

            int skipToBase64 = 7;
            String base64 = new String(recv, skipToBase64, recv.length - skipToBase64, "UTF-8");
            String challenge = new String(Base64.decode(base64), "UTF-8");

            System.out.println(challenge);


        } catch (IOException e) {
            System.err.println(e.toString());
            System.exit(1);
        }
    }

    private static Hashtable decodeSaslParameters(String challenge)
    {
        String[] parameters = StringUtil.split(challenge, ",");
        Hashtable ret = new Hashtable();
        for (int i = 0; i < parameters.length; ++i)
        {
            String[] keyValue = StringUtil.split(parameters[i], "=");
            ret.put(keyValue[0], StringUtil.unquote(keyValue[1]));
        }
        return ret;
    }

    private static void send(OutputStream output, String hexString) throws IOException {
        System.out.println("> " + hexString);
        output.write(StringUtil.hexStringToByteArray(hexString));
        output.flush();
    }

    private static byte[] receive(InputStream input) throws IOException {
        int size = readBigEndian16(input);
        byte[] buffer = new byte[size];
        input.read(buffer);
        System.out.println("< " + StringUtil.byteArrayToHexString(buffer));
        return buffer;
    }

    private static int readBigEndian16(InputStream input) throws IOException {
        return ((int) input.read() << 8) | (int) input.read();
    }


}