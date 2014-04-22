package com.thoughtworks.springinjection.withoutinjection;

import com.thoughtworks.springinjection.movers.Mover;
import com.thoughtworks.springinjection.Vehicle;
import com.thoughtworks.springinjection.movers.WheeledMover;
import com.thoughtworks.springinjection.weapons.SquirtGun;
import com.thoughtworks.springinjection.weapons.Weapon;

public class NonInjectedVehicle implements Vehicle {

    private Weapon weapon;

    public NonInjectedVehicle() {
        this.mover = new WheeledMover();
        this.weapon = new SquirtGun();
    }

    private Mover mover;

    public String go() {
        return mover.move() + " and then weapon " + weapon.shoot();
    }
}
