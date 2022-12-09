package springinjection.movers;

import org.springframework.stereotype.Component;

@Component
public class WheeledMover implements Mover {
    public String move() {
        return "Tires squeal";
    }
}
