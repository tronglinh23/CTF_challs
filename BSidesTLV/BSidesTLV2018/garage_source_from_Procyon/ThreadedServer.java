import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

// 
// Decompiled by Procyon v0.5.36
// 

public class ThreadedServer
{
    private int port;
    protected ServerSocket serverSocket;
    protected boolean isStopped;
    protected Thread runningThread;
    
    public ThreadedServer() {
        this.serverSocket = null;
        this.isStopped = false;
        this.runningThread = null;
    }
    
    private synchronized boolean isStopped() {
        return this.isStopped;
    }
    
    private void openServerSocket() {
        try {
            this.serverSocket = new ServerSocket(this.port);
        }
        catch (IOException e) {
            throw new RuntimeException("Cannot listen on port " + this.port, e);
        }
    }
    
    public synchronized void stop() {
        this.isStopped = true;
        try {
            this.serverSocket.close();
        }
        catch (IOException e) {
            throw new RuntimeException("Error closing server", e);
        }
    }
    
    public ThreadedServer(final int port) {
        this.serverSocket = null;
        this.isStopped = false;
        this.runningThread = null;
        this.port = port;
    }
    
    public void startServer() {
        this.openServerSocket();
        while (!this.isStopped()) {
            Socket clientSocket = null;
            try {
                clientSocket = this.serverSocket.accept();
            }
            catch (IOException e) {
                if (this.isStopped()) {
                    System.out.println("Server Stopped.");
                    return;
                }
                throw new RuntimeException("Error accepting client connection", e);
            }
            new Thread(new ClientHandler(clientSocket)).start();
        }
    }
}
