import Transport.ServiceStation;
import Transport.Car;
import Transport.Driver.Driver;
import Transport.Mechanics;
import Transport.Bus;
import Transport.TransportType;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println("Коллекции. Часть 1. Списки и очереди");

        Driver driver = new Driver("Анатолий");

        Mechanics mechanicsTayota = new Mechanics("Петя", "Tayota", TransportType.ALL);

        Bus bus = new Bus("Mercedes-Benz", "Travego M OM 457 LA", 8.0);

        Car car = new Car("Tayota", " Mark II", 2.5);
        car.addMechanica(mechanicsTayota);

        List<Mechanics> racers = new ArrayList<>();
        racers.add(mechanicsTayota);
        System.out.println(racers);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driver);
        System.out.println(drivers);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addQueue(car);
        serviceStation.addQueue(bus);

        serviceStation.spendTO();
        serviceStation.spendTO();


    }
}