public class App {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle v1 = factory.getVehicle(VehicleType.CAR);
        v1.startEngine();

        Vehicle v2 = factory.getVehicle(VehicleType.TRUCK);
        v2.startEngine();
    }
}
