package com.thoughtworks.springinjection.movers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("flyingMover")
public class FlyingMover implements Mover{
    private TakeoffManeuver takeOff;
    private SwoopManeuver swoop;

    @Autowired
    public FlyingMover(TakeoffManeuver takeOff, SwoopManeuver swoop) {
        this.takeOff = takeOff;
        this.swoop = swoop;
    }

    public String move() {
        return takeOff.go() + swoop.go();
    }
}
