import java.util.Random;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.5.36
// 

public class Employee implements Serializable
{
    protected Logger logger;
    protected String name;
    protected int age;
    
    Employee() {
        this.name = NameGenerator.getName();
        this.age = new Random().nextInt(99);
    }
    
    public void setLogger(final Logger logger) {
        this.logger = logger;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void doWork() {
        System.out.println("Worker " + this.name + " is working.");
    }
}
