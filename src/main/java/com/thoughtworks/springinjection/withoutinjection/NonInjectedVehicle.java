package com.thoughtworks.springinjection.withoutinjection;

import com.thoughtworks.springinjection.movers.Mover;
import com.thoughtworks.springinjection.Vehicle;
import com.thoughtworks.springinjection.movers.WheeledMover;
import com.thoughtworks.springinjection.weapons.SquirtGun;
import com.thoughtworks.springinjection.weapons.Weapon;

public class NonInjectedVehicle implements Vehicle {

    private Mover mover;
    private Weapon weapon;

    public NonInjectedVehicle() {
        this.mover = new WheeledMover();
        this.weapon = new SquirtGun();
    }

    public String go() {
        return mover.move() + " and then the weapon " + weapon.shoot();
    }
}
