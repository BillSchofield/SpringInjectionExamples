package springinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springinjection.manualinjection.ManuallyInjectedVehicle;
import springinjection.movers.WheeledMover;
import springinjection.springautowiredinjection.AutowiredVehicle;
import springinjection.weapons.SquirtGun;
import springinjection.withoutinjection.NonInjectedVehicle;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        {
            final Vehicle vehicle = new NonInjectedVehicle();
            System.out.println(vehicle.go());
        }

        {
            SquirtGun weapon = new SquirtGun();
            WheeledMover mover = new WheeledMover();
            final Vehicle vehicle = new ManuallyInjectedVehicle(weapon, mover);
            System.out.println(vehicle.go());
        }

        {
            ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
            AutowiredVehicle autowiredVehicle = context.getBean(AutowiredVehicle.class);
            System.out.println(autowiredVehicle.go());
        }
    }
}
