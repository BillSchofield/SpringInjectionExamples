package springinjection.weapons;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dartGun")
public class DartGun implements Weapon {
    public String shoot() {
        return "fires a volley of darts";
    }
}
