package com.thoughtworks.springinjection;

import com.thoughtworks.springinjection.manualinjection.ManuallyInjectedVehicle;
import com.thoughtworks.springinjection.movers.WheeledMover;
import com.thoughtworks.springinjection.springautowiredinjection.AutowiredVehicle;
import com.thoughtworks.springinjection.weapons.SquirtGun;
import com.thoughtworks.springinjection.withoutinjection.NonInjectedVehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        nonInjectedWay();
        injectedWay();
        springXmlWay(context);
        springAutowiredWay(context);
    }

    private static void nonInjectedWay() {
        Vehicle vehicle = new NonInjectedVehicle();
        System.out.println(vehicle.go());
    }

    private static void injectedWay() {
        final Vehicle vehicle = new ManuallyInjectedVehicle(new SquirtGun(), new WheeledMover());
        System.out.println(vehicle.go());
    }

    private static void springXmlWay(ApplicationContext context) {
        Vehicle vehicle = (Vehicle) context.getBean("vehicle");
        System.out.println(vehicle.go());
//        Vehicle flyingSquirtGun = (Vehicle) context.getBean("squirtGunAirplane");
//        System.out.println(flyingSquirtGun.go());
//        Vehicle autowiredVehicle = (Vehicle) context.getBean("autowiredVehicle");
//        System.out.println(autowiredVehicle.go());
    }

    private static void springAutowiredWay(ApplicationContext context) {
        Vehicle vehicle = context.getBean(AutowiredVehicle.class);
        System.out.println(vehicle.go());
    }
}
