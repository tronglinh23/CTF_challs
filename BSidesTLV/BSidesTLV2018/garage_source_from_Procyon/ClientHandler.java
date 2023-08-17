import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.net.Socket;

// 
// Decompiled by Procyon v0.5.36
// 

class ClientHandler implements Runnable
{
    private Socket myClientSocket;
    private String helloMessage;
    private String mainOptions;
    private String garageManagementOption;
    boolean sessionActive;
    boolean stateChanged;
    Garage garage;
    
    public ClientHandler() {
        this.helloMessage = "      ___           ___           ___           ___           ___           ___     \r\n     /  /\\         /  /\\         /  /\\         /  /\\         /  /\\         /  /\\    \r\n    /  /::\\       /  /::\\       /  /::\\       /  /::\\       /  /::\\       /  /::\\   \r\n   /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\  \r\n  /  /:/  \\:\\   /  /::\\ \\:\\   /  /::\\ \\:\\   /  /::\\ \\:\\   /  /:/  \\:\\   /  /::\\ \\:\\ \r\n /__/:/_\\_ \\:\\ /__/:/\\:\\_\\:\\ /__/:/\\:\\_\\:\\ /__/:/\\:\\_\\:\\ /__/:/_\\_ \\:\\ /__/:/\\:\\ \\:\\\r\n \\  \\:\\__/\\_\\/ \\__\\/  \\:\\/:/ \\__\\/~|::\\/:/ \\__\\/  \\:\\/:/ \\  \\:\\__/\\_\\/ \\  \\:\\ \\:\\_\\/\r\n  \\  \\:\\ \\:\\        \\__\\::/     |  |:|::/       \\__\\::/   \\  \\:\\ \\:\\    \\  \\:\\ \\:\\  \r\n   \\  \\:\\/:/        /  /:/      |  |:|\\/        /  /:/     \\  \\:\\/:/     \\  \\:\\_\\/  \r\n    \\  \\::/        /__/:/       |__|:|~        /__/:/       \\  \\::/       \\  \\:\\    \r\n     \\__\\/         \\__\\/         \\__\\|         \\__\\/         \\__\\/         \\__\\/\r\n     \r\n     Hello and welcome to our virtual garage, it lets you store your cars and we will take care of them for you. \r\n     \r\n";
        this.mainOptions = "[1] Create new garage\r\n[2] Load existing garage\r\n[3] Exit\r\n";
        this.garageManagementOption = "[1] Add car\r\n[2] Remove car\r\n[3] Save garage\r\n[4] Print garage content\r\n[5] Exit";
        this.sessionActive = true;
        this.stateChanged = false;
        this.garage = null;
    }
    
    ClientHandler(final Socket s) {
        this.helloMessage = "      ___           ___           ___           ___           ___           ___     \r\n     /  /\\         /  /\\         /  /\\         /  /\\         /  /\\         /  /\\    \r\n    /  /::\\       /  /::\\       /  /::\\       /  /::\\       /  /::\\       /  /::\\   \r\n   /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\     /  /:/\\:\\  \r\n  /  /:/  \\:\\   /  /::\\ \\:\\   /  /::\\ \\:\\   /  /::\\ \\:\\   /  /:/  \\:\\   /  /::\\ \\:\\ \r\n /__/:/_\\_ \\:\\ /__/:/\\:\\_\\:\\ /__/:/\\:\\_\\:\\ /__/:/\\:\\_\\:\\ /__/:/_\\_ \\:\\ /__/:/\\:\\ \\:\\\r\n \\  \\:\\__/\\_\\/ \\__\\/  \\:\\/:/ \\__\\/~|::\\/:/ \\__\\/  \\:\\/:/ \\  \\:\\__/\\_\\/ \\  \\:\\ \\:\\_\\/\r\n  \\  \\:\\ \\:\\        \\__\\::/     |  |:|::/       \\__\\::/   \\  \\:\\ \\:\\    \\  \\:\\ \\:\\  \r\n   \\  \\:\\/:/        /  /:/      |  |:|\\/        /  /:/     \\  \\:\\/:/     \\  \\:\\_\\/  \r\n    \\  \\::/        /__/:/       |__|:|~        /__/:/       \\  \\::/       \\  \\:\\    \r\n     \\__\\/         \\__\\/         \\__\\|         \\__\\/         \\__\\/         \\__\\/\r\n     \r\n     Hello and welcome to our virtual garage, it lets you store your cars and we will take care of them for you. \r\n     \r\n";
        this.mainOptions = "[1] Create new garage\r\n[2] Load existing garage\r\n[3] Exit\r\n";
        this.garageManagementOption = "[1] Add car\r\n[2] Remove car\r\n[3] Save garage\r\n[4] Print garage content\r\n[5] Exit";
        this.sessionActive = true;
        this.stateChanged = false;
        this.garage = null;
        this.myClientSocket = s;
    }
    
    @Override
    public void run() {
        try {
            Utils.writeToSocket(this.myClientSocket, String.valueOf(this.helloMessage) + "\r\n" + this.mainOptions);
            while (this.sessionActive) {
                if (this.garage == null) {
                    if (this.stateChanged) {
                        Utils.writeToSocket(this.myClientSocket, this.mainOptions);
                        this.stateChanged = false;
                    }
                    final String clientCommand = Utils.readFromSocket(this.myClientSocket);
                    if (clientCommand.equalsIgnoreCase("1")) {
                        this.garage = new Garage();
                    }
                    else if (clientCommand.equalsIgnoreCase("2")) {
                        final byte[] garageBytes = Utils.receiveGarage(this.myClientSocket);
                        final ByteArrayInputStream in = new ByteArrayInputStream(garageBytes);
                        final ObjectInputStream ois = new ObjectInputStream(in);
                        this.garage = (Garage)ois.readObject();
                        ois.close();
                        this.stateChanged = true;
                    }
                    else if (clientCommand.equalsIgnoreCase("3")) {
                        Utils.writeToSocket(this.myClientSocket, "[end]");
                        this.sessionActive = false;
                    }
                    else {
                        Utils.writeToSocket(this.myClientSocket, "Unknown option");
                        this.stateChanged = true;
                    }
                }
                else {
                    Utils.writeToSocket(this.myClientSocket, this.garageManagementOption);
                    final String clientCommand = Utils.readFromSocket(this.myClientSocket);
                    if (clientCommand.equalsIgnoreCase("1")) {
                        Utils.writeToSocket(this.myClientSocket, "Car manufacturer:");
                        final String carManufacturer = Utils.readFromSocket(this.myClientSocket);
                        Utils.writeToSocket(this.myClientSocket, "Car license number:");
                        final String carLicenseNumber = Utils.readFromSocket(this.myClientSocket);
                        Utils.writeToSocket(this.myClientSocket, "Car manufacturing year:");
                        final String carManufacturingYear = Utils.readFromSocket(this.myClientSocket);
                        if (this.garage.addCar(new Car(carManufacturer, carLicenseNumber, carManufacturingYear))) {
                            Utils.writeToSocket(this.myClientSocket, "Car added successfully");
                        }
                        else {
                            Utils.writeToSocket(this.myClientSocket, "Garage is full");
                        }
                    }
                    else if (clientCommand.equalsIgnoreCase("2")) {
                        Utils.writeToSocket(this.myClientSocket, "Car license number to rmove:");
                        final String carLicenseNumber2 = Utils.readFromSocket(this.myClientSocket);
                        final boolean result = this.garage.removeCarByLicenseNumber(carLicenseNumber2);
                        if (result) {
                            Utils.writeToSocket(this.myClientSocket, "Successfully removed car");
                        }
                        else {
                            Utils.writeToSocket(this.myClientSocket, "Failed to remove car, are you sure this is the correct license number?");
                        }
                    }
                    else if (clientCommand.equalsIgnoreCase("3")) {
                        Utils.sendGarage(this.myClientSocket, this.garage.toByteArray());
                    }
                    else if (clientCommand.equals("4")) {
                        final String garageContent = this.garage.printGarage();
                        if (!garageContent.equals("")) {
                            Utils.writeToSocket(this.myClientSocket, garageContent);
                        }
                        else {
                            Utils.writeToSocket(this.myClientSocket, "Garage is empty");
                        }
                    }
                    else if (clientCommand.equals("5")) {
                        this.garage = null;
                        this.stateChanged = true;
                    }
                    else {
                        Utils.writeToSocket(this.myClientSocket, "Unknown option");
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                this.myClientSocket.close();
            }
            catch (IOException ex) {}
        }
        try {
            this.myClientSocket.close();
        }
        catch (IOException ex2) {}
    }
}
