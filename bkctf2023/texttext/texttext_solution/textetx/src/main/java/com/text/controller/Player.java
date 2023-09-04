//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.text.controller;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

public class Player implements Serializable {
    private String name = "player";
    private boolean isAdmin;

    public Player() {
    }

    public String getName() {
        return this.name;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public String toString() {
        String output = "";
        if (this.isAdmin()) {
            try {
                StringSubstitutor stringSubstitutor = StringSubstitutor.createInterpolator();
                output = stringSubstitutor.replace(this.name);
            } catch (Exception var3) {
                output = "???????";
            }
        }

        return "Hello" + output + "!";
    }
}
