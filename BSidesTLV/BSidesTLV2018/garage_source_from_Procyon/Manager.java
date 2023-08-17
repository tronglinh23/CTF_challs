import java.io.FileInputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.5.36
// 

public class Manager extends Employee implements Serializable
{
    private String closeMessageFile;
    private String closeMessage;
    
    public Manager() throws IOException {
        this.closeMessageFile = "close.txt";
        this.logger = new FileLogger("log.txt");
        this.closeMessage = null;
    }
    
    public void setCloseMessage(final String closeMessage) {
        this.closeMessage = closeMessage;
    }
    
    @Override
    public void doWork() {
        this.logger.writeToLog(this.closeMessage);
    }
    
    public void setCloseMessageFile(final String closeMessageFile) {
        this.closeMessageFile = closeMessageFile;
    }
    
    private void readObject(final ObjectInputStream in) throws ClassNotFoundException, IOException {
        in.defaultReadObject();
        try {
            if (this.closeMessage == null) {
                final File closeMessageFile = new File(this.closeMessageFile);
                final FileInputStream fis = new FileInputStream(closeMessageFile);
                final byte[] data = new byte[(int)closeMessageFile.length()];
                fis.read(data);
                fis.close();
                this.closeMessage = new String(data, "UTF-8");
            }
        }
        catch (IOException ex) {}
    }
}
