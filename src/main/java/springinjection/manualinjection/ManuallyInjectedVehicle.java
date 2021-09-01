package springinjection.manualinjection;

import springinjection.Vehicle;
import springinjection.movers.Mover;
import springinjection.weapons.Weapon;

public class ManuallyInjectedVehicle implements Vehicle {
    private final Weapon weapon;
    private final Mover mover;

    public ManuallyInjectedVehicle(Weapon weapon, Mover mover) {
        this.weapon = weapon;
        this.mover = mover;
    }

    public String go() {
        return mover.move() + " and then the weapon " + weapon.shoot();
    }
}
