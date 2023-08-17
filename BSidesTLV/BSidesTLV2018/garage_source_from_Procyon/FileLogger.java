import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class FileLogger implements Logger
{
    private FileOutputStream fileWriter;
    private File logFile;
    
    public FileLogger(final String fileName) throws IOException {
        (this.logFile = new File(fileName)).createNewFile();
        this.fileWriter = new FileOutputStream(this.logFile, false);
    }
    
    @Override
    public void writeToLog(final String entry) {
        final PrintWriter printer = new PrintWriter(this.fileWriter);
        printer.println(entry);
    }
}
