public class App {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle("Car");
        v1.startEngine();

        Vehicle v2 = factory.getVehicle("Truck");
        v2.startEngine();
    }
}
