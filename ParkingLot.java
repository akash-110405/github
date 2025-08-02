import java.util.*;

public class ParkingLot {
    private int capacity;
    private List<Vehicle> parkedVehicles;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkedVehicles = new ArrayList<>();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (parkedVehicles.size() < capacity) {
            parkedVehicles.add(vehicle);
            return true;
        } else {
            return false; // Parking full
        }
    }

    public boolean removeVehicle(String vehicleNumber) {
        for (Vehicle v : parkedVehicles) {
            if (v.getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {
                parkedVehicles.remove(v);
                return true;
            }
        }
        return false; // Vehicle not found
    }

    public void displayStatus() {
        System.out.println("Total Slots: " + capacity);
        System.out.println("Occupied Slots: " + parkedVehicles.size());
        System.out.println("Available Slots: " + (capacity - parkedVehicles.size()));
        System.out.println("Parked Vehicles:");
        for (Vehicle v : parkedVehicles) {
            System.out.println(v);
        }
    }
}
