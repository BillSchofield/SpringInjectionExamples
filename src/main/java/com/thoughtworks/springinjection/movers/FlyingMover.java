package com.thoughtworks.springinjection.movers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("flyingMover")
public class FlyingMover implements Mover{
    public String move() {
        return "Swoops through the air";
    }
}
