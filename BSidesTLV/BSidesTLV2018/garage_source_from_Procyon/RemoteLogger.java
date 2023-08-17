import java.io.IOException;
import java.net.UnknownHostException;
import java.net.Socket;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.5.36
// 

public class RemoteLogger implements Logger, Serializable
{
    private String ipAddress;
    private int port;
    Socket clientSocket;
    
    public RemoteLogger(final String ipAddress, final int port) {
        this.clientSocket = null;
        this.ipAddress = ipAddress;
        this.port = port;
    }
    
    @Override
    public void writeToLog(final String entry) {
        try {
            if (this.clientSocket == null) {
                this.clientSocket = new Socket(this.ipAddress, this.port);
            }
            Utils.writeToSocket(this.clientSocket, entry);
            this.clientSocket.close();
            this.clientSocket = null;
        }
        catch (UnknownHostException ex) {}
        catch (IOException ex2) {}
    }
}
