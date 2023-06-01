package com.hspedu.homework;

public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    
    public void passRiver() {

//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();

//       if (vehicles == null) {
//       vehicles = null  : vehicles instanceof Boat  => false
//       vehicles = 马对象 ：vehicles instanceof Boat  => false
//       vehicles = 船对象 ：vehicles instanceof Boat  => true
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }

    public void common() {
        //if (vehicles == null) {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }

    public void passFireHill() {
        if (!(vehicles instanceof Plane)) {
            vehicles = VehiclesFactory.getPlane();
        }

        vehicles.work();

    }
}
