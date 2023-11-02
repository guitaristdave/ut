package seminars.second.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    @Test
    public void carIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void carHasFourWheels() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carTestDriveSetsSpeedTo60() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleTestDriveSetsSpeedTo75() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carStopsWhenParked() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
