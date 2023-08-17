import java.io.IOException;
import java.net.UnknownHostException;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 
// Decompiled by Procyon v0.5.36
// 

public class GarageClient
{
    private String host;
    private int port;
    private int clientState;
    
    public GarageClient() {
        this.clientState = 1;
    }
    
    public GarageClient(final String host, final int port) {
        this.clientState = 1;
        this.host = host;
        this.port = port;
    }
    
    public void connectToServer() throws UnknownHostException, IOException, InterruptedException, ClassNotFoundException {
        boolean sessionActive = true;
        final BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        final Socket clientSocket = new Socket(this.host, this.port);
        String str = "";
        while (sessionActive) {
            str = Utils.readFromSocket(clientSocket);
            if (str.equals("[end]")) {
                sessionActive = false;
                break;
            }
            System.out.println(str);
            System.out.print("User input: ");
            String sentence = inFromUser.readLine();
            if (this.clientState == 1) {
                if (sentence.equals("1")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    this.clientState = 2;
                }
                else if (sentence.equals("2")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    try {
                        final FileInputStream fis = new FileInputStream("garage");
                        final byte[] garageByteArray = Files.readAllBytes(new File("garage").toPath());
                        Utils.sendGarage(clientSocket, garageByteArray);
                        this.clientState = 2;
                    }
                    catch (FileNotFoundException e) {
                        this.clientState = 1;
                        System.out.println("File not found.");
                        final ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                        oos.writeObject(null);
                        oos.flush();
                    }
                }
                else if (sentence.equals("3")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    sessionActive = false;
                }
                else {
                    Utils.writeToSocket(clientSocket, sentence);
                    str = Utils.readFromSocket(clientSocket);
                    System.out.println(str);
                }
            }
            else {
                if (this.clientState != 2) {
                    continue;
                }
                if (sentence.equals("1")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    for (int i = 0; i < 3; ++i) {
                        str = Utils.readFromSocket(clientSocket);
                        System.out.println(str);
                        System.out.print("User input: ");
                        sentence = inFromUser.readLine();
                        Utils.writeToSocket(clientSocket, sentence);
                    }
                    str = Utils.readFromSocket(clientSocket);
                    System.out.println(str);
                }
                else if (sentence.equals("2")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    str = Utils.readFromSocket(clientSocket);
                    System.out.println(str);
                    System.out.print("User input: ");
                    sentence = inFromUser.readLine();
                    Utils.writeToSocket(clientSocket, sentence);
                    str = Utils.readFromSocket(clientSocket);
                    System.out.println(str);
                }
                else if (sentence.equals("3")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    final byte[] garageByteArray2 = Utils.receiveGarage(clientSocket);
                    final FileOutputStream fos = new FileOutputStream("garage");
                    fos.write(garageByteArray2);
                    fos.close();
                }
                else if (sentence.equals("4")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    str = Utils.readFromSocket(clientSocket);
                    System.out.println(str);
                }
                else if (sentence.equals("5")) {
                    Utils.writeToSocket(clientSocket, sentence);
                    this.clientState = 1;
                }
                else {
                    Utils.writeToSocket(clientSocket, sentence);
                    str = Utils.readFromSocket(clientSocket);
                    System.out.println(str);
                }
            }
        }
    }
}
