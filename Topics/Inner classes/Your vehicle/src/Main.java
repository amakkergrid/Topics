//class Vehicle {
//
//    // vehicle of your dream
//
//    class Engine {
//
//        void start() {
//            System.out.println("RRRrrrrrrr....");
//        }
//    }
//}

class EnjoyVehicle {

    public static void startVehicle() {
        // start your vehicle
        Vehicle v = new Vehicle();
        Vehicle.Engine eg = v.new Engine();
        eg.start();

    }
}