import java.io.IOException;
import java.net.UnknownHostException;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.internal.Lists;
import com.beust.jcommander.Parameter;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    @Parameter
    public List<String> parameters;
    @Parameter(names = { "--listen" }, description = "Starts Garage as a server")
    public boolean serverMode;
    @Parameter(names = { "--port" }, description = "Remote port to connect to / The port that the server will run on")
    public int port;
    @Parameter(names = { "--host" }, description = "The remote server to connect to")
    public String remoteAddr;
    @Parameter(names = { "--help", "-h" }, help = true, description = "Shows this help message")
    public boolean help;
    
    public Main() {
        this.parameters = Lists.newArrayList();
        this.serverMode = false;
        this.port = 1337;
        this.remoteAddr = "127.0.0.1";
        this.help = false;
    }
    
    public static void main(final String[] args) throws UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
        final Main main = new Main();
        final JCommander jCommander = JCommander.newBuilder().addObject((Object)main).build();
        jCommander.parse(args);
        if (main.help) {
            jCommander.usage();
            return;
        }
        if (main.serverMode) {
            main.startServer();
        }
        else {
            main.connectToServer();
        }
    }
    
    public void startServer() {
        System.out.println("Starting server on port " + this.port);
        final ThreadedServer threadedServer = new ThreadedServer(this.port);
        threadedServer.startServer();
    }
    
    public void connectToServer() throws UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
        final GarageClient garageClient = new GarageClient(this.remoteAddr, this.port);
        garageClient.connectToServer();
    }
}
