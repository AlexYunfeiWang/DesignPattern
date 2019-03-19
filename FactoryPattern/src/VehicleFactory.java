public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType) {
        switch(vehicleType) {
            case CAR:
                return new Car();
            case TRUCK:
                return new Truck();
            case BUS:
                return new Bus();
            default:
                return null;
        }
    }
}
