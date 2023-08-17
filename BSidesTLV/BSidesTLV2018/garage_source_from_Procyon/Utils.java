import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.DataInputStream;
import java.net.Socket;

// 
// Decompiled by Procyon v0.5.36
// 

public class Utils
{
    public static String readFromSocket(final Socket sock) throws IOException {
        final DataInputStream dataInputStream = new DataInputStream(sock.getInputStream());
        final int length = dataInputStream.readInt();
        final byte[] b = new byte[length];
        dataInputStream.readFully(b);
        return new String(b);
    }
    
    public static void writeToSocket(final Socket sock, final String message) throws IOException {
        final DataOutputStream outToServer = new DataOutputStream(sock.getOutputStream());
        outToServer.writeInt(message.length());
        outToServer.writeBytes(message);
        outToServer.flush();
    }
    
    public static void sendGarage(final Socket sock, final byte[] garageBytes) throws IOException {
        final DataOutputStream dos = new DataOutputStream(sock.getOutputStream());
        dos.writeInt(garageBytes.length);
        dos.write(garageBytes);
        dos.flush();
    }
    
    public static byte[] receiveGarage(final Socket sock) throws IOException {
        final FileOutputStream fos = null;
        final BufferedOutputStream bos = null;
        final DataInputStream dataInputStream = new DataInputStream(sock.getInputStream());
        final int byteArrSize = dataInputStream.readInt();
        final byte[] garageByteArray = new byte[byteArrSize];
        dataInputStream.read(garageByteArray, 0, byteArrSize);
        return garageByteArray;
    }
}
