package springinjection.springxmlinjection;

import springinjection.Vehicle;
import springinjection.movers.Mover;
import springinjection.weapons.Weapon;

public class SpringInjectedVehicle implements Vehicle{

    private Mover mover;
    private Weapon weapon;

    public SpringInjectedVehicle(Mover mover, Weapon weapon) {
        this.mover = mover;
        this.weapon = weapon;
    }

    public String go() {
        return mover.move() + " and then the weapon " + weapon.shoot();
    }
}
