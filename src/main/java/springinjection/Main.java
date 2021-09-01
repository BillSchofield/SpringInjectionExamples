package springinjection;

import springinjection.manualinjection.ManuallyInjectedVehicle;
import springinjection.movers.WheeledMover;
import springinjection.springautowiredinjection.AutowiredVehicle;
import springinjection.weapons.SquirtGun;
import springinjection.withoutinjection.NonInjectedVehicle;
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
