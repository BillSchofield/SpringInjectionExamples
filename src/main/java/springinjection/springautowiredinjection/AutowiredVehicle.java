package springinjection.springautowiredinjection;

import springinjection.Vehicle;
import springinjection.movers.Mover;
import springinjection.movers.WheeledMover;
import springinjection.weapons.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredVehicle implements Vehicle{

    private Mover mover;
    private Weapon weapon;

    @Autowired
    public AutowiredVehicle(WheeledMover mover, @Qualifier("theSquirtGun") Weapon weapon) {
        this.mover = mover;
        this.weapon = weapon;
    }

    public String go() {
        return mover.move() + " and then the weapon " + weapon.shoot();
    }
}
