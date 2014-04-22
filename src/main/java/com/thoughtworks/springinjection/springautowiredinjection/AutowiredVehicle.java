package com.thoughtworks.springinjection.springautowiredinjection;

import com.thoughtworks.springinjection.Vehicle;
import com.thoughtworks.springinjection.movers.Mover;
import com.thoughtworks.springinjection.weapons.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredVehicle implements Vehicle{

    private Mover mover;
    private Weapon weapon;

    @Autowired
    public AutowiredVehicle(@Qualifier("flyingMover") Mover mover, @Qualifier("dartGun") Weapon weapon) {
        this.mover = mover;
        this.weapon = weapon;
    }

    public String go() {
        return mover.move() + " and then weapon " + weapon.shoot();
    }
}
