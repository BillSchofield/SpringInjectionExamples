package com.thoughtworks.springinjection.weapons;

import com.thoughtworks.springinjection.weapons.Weapon;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class SquirtGun implements Weapon {
    public String shoot() {
        return "squirts water";
    }
}
