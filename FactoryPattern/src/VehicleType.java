public enum VehicleType {
    TRUCK{
        public Vehicle getVehicle(){
            return new Truck();
        }
    },
    CAR{
        public Vehicle getVehicle(){
            return new Car();
        }
    },
    BUS{
        public Vehicle getVehicle(){
            return new Bus();
        }
    };
    /*
    this is necessary, because without it, VehicleTpe
    won't be able to find this method, the above methods
    are only the concrete implementation of this method
    */
    abstract Vehicle getVehicle();
}
