package springinjection.withoutinjection;

import springinjection.movers.Mover;
import springinjection.Vehicle;
import springinjection.movers.WheeledMover;
import springinjection.weapons.SquirtGun;
import springinjection.weapons.Weapon;

public class NonInjectedVehicle implements Vehicle {

    private final Mover mover;
    private final Weapon weapon;

    public NonInjectedVehicle() {
        this.mover = new WheeledMover();
        this.weapon = new SquirtGun();
    }

    public String go() {
        return mover.move() + " and then the weapon " + weapon.shoot();
    }
}
