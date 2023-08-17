import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.5.36
// 

public class Garage implements Serializable
{
    private ArrayList<Car> carArray;
    private int carLimit;
    private Employee garageManager;
    private ArrayList<Employee> garageEmployees;
    private boolean isOpen;
    
    public Garage() {
        this.carLimit = 5;
        this.isOpen = true;
        this.carArray = new ArrayList<Car>();
        this.garageEmployees = new ArrayList<Employee>();
    }
    
    public boolean addCar(final Car car) {
        if (this.isOpen) {
            this.carArray.add(car);
            this.checkGarageStatus();
            return true;
        }
        return false;
    }
    
    public boolean removeCarByLicenseNumber(final String licenseNumber) {
        for (int i = 0; i < this.carArray.size(); ++i) {
            if (this.carArray.get(i).getLicenseNumber().equals(licenseNumber)) {
                this.carArray.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public String printGarage() {
        String garageContent = "";
        for (int i = 0; i < this.carArray.size(); ++i) {
            garageContent = String.valueOf(garageContent) + "Car Manufacturer: " + this.carArray.get(i).getManufacturerName() + "\r\n" + "Car License Number: " + this.carArray.get(i).getLicenseNumber() + "\r\n" + "Car Manufacturing Year: " + this.carArray.get(i).getManufacturingYear() + "\r\n";
        }
        return garageContent;
    }
    
    public boolean checkGarageStatus() {
        if (this.carArray.size() == this.carLimit) {
            this.garageManager.doWork();
            return this.isOpen = false;
        }
        return true;
    }
    
    private void readObject(final ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        this.checkGarageStatus();
    }
    
    public void setManager(final Employee manager) {
        this.garageManager = manager;
    }
    
    public byte[] toByteArray() throws IOException {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(this);
        return out.toByteArray();
    }
}
