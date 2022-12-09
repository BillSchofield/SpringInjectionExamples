package springinjection.weapons;

import org.springframework.stereotype.Component;

@Component
public class SquirtGun implements Weapon {
    public String shoot() {
        return "squirts water";
    }
}
