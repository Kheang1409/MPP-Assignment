package assignment03.labs.prob2;

import java.util.ArrayList;

public class Building {
    private double maintenanceCost;
    private double totalRent;
    private ArrayList<Apartment> apartments;

    public Building(double maintenanceCost, double totalRent) {
        this.maintenanceCost = maintenanceCost;
        this.totalRent = totalRent;
    }

    public double calculateProfit() {
        return totalRent - maintenanceCost;
    }
    public void addApartment(double rent) {
        apartments.add(new Apartment(rent));
    }
}
