package assignment03.labs.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(double maintenanceCost, double totalRent) {
        if (maintenanceCost < 0 || totalRent < 0) {
            throw new IllegalArgumentException("Maintenance cost and total rent cannot be negative");
        }
        buildings.add(new Building(maintenanceCost, totalRent));
    }

    public List<Building> getBuildings() {
        return Collections.unmodifiableList(buildings); // Return an unmodifiable list to prevent external modification
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.calculateProfit();
        }
        return totalProfit;
    }
}
