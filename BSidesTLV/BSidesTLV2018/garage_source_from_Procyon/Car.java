import java.io.Serializable;

// 
// Decompiled by Procyon v0.5.36
// 

public class Car implements Serializable
{
    private String licenseNumber;
    private String manufacturerName;
    private String manufacturingYear;
    
    public Car(final String manufacturerName, final String licenseNumber, final String manufacturingYear) {
        this.setLicenseNumber(licenseNumber);
        this.setManufacturerName(manufacturerName);
        this.setManufacturingYear(manufacturingYear);
    }
    
    public String getLicenseNumber() {
        return this.licenseNumber;
    }
    
    public void setLicenseNumber(final String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    
    public String getManufacturerName() {
        return this.manufacturerName;
    }
    
    public void setManufacturerName(final String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    
    public String getManufacturingYear() {
        return this.manufacturingYear;
    }
    
    public void setManufacturingYear(final String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
}
