package com.thoughtworks.springinjection.springxmlinjection;

import com.thoughtworks.springinjection.Vehicle;
import com.thoughtworks.springinjection.movers.Mover;
import com.thoughtworks.springinjection.weapons.Weapon;

public class SpringInjectedVehicle implements Vehicle{

    private Mover mover;
    private Weapon weapon;

    public SpringInjectedVehicle(Mover mover, Weapon weapon) {
        this.mover = mover;
        this.weapon = weapon;
    }

    public String go() {
        return mover.move() + " and then weapon " + weapon.shoot();
    }
}
