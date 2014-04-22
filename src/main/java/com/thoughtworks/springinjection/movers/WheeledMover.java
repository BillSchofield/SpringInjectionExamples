package com.thoughtworks.springinjection.movers;

import com.thoughtworks.springinjection.movers.Mover;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class WheeledMover implements Mover {
    public String move() {
        return "Tires squeal";
    }
}
