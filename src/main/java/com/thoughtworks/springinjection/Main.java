package com.thoughtworks.springinjection;

import com.thoughtworks.springinjection.manualinjection.ManuallyInjectedVehicle;
import com.thoughtworks.springinjection.movers.WheeledMover;
import com.thoughtworks.springinjection.springautowiredinjection.AutowiredVehicle;
import com.thoughtworks.springinjection.weapons.SquirtGun;
import com.thoughtworks.springinjection.withoutinjection.NonInjectedVehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        {
            Vehicle vehicle = new NonInjectedVehicle();
            System.out.println(vehicle.go());
        }

        {
            SquirtGun weapon = new SquirtGun();
            WheeledMover mover = new WheeledMover();
            final Vehicle vehicle = new ManuallyInjectedVehicle(weapon, mover);
            System.out.println(vehicle.go());
        }

        {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

            Vehicle vehicle = (Vehicle) context.getBean("vehicle");

            System.out.println(vehicle.go());
        }

        {
            final ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            Vehicle vehicle = context.getBean(AutowiredVehicle.class);
            System.out.println(vehicle.go());
        }
    }
}
