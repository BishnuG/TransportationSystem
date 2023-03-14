package com.transportationsystem.main;

import com.transportationsystem.model.TransportationSystem;
import com.transportationsystem.service.TransportationSystemService;

import java.util.Scanner;

public class TransportationSystemMain {
    public static void main(String[] args) {
        String[] typesOfVehicles = {"Bus", "Truck", "Taxi", "Scooty", "Bike"};
        int[] rateOfTheVehicle = {100, 150, 60, 30, 40};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter type of vehicle: Bus, Truck, Taxi, etc.. ");
        String typeOfVehicle = scanner.next();

        System.out.println("Enter vehicle Id like B01 for Bus, BK01 for Bike... ");
        String vehicleId = scanner.next();

        System.out.println("Enter milage Of Vehicle");
        int milageOfVehicle = scanner.nextInt();

        System.out.println("Enter customer id ");
        int custId = scanner.nextInt();

        System.out.println("Enter customer name");
        String custName = scanner.next();

        System.out.println("Enter customer mobile number");
        long mob = scanner.nextLong();

        System.out.println("Enter customer email");
        String email = scanner.next();

        System.out.println("Enter customer driving lisence");
        String drivingLisence = scanner.next();

        System.out.println("Enter duration of rent in hour");
        float durationOfRent = scanner.nextFloat();

        TransportationSystem ts = new TransportationSystem();
        TransportationSystemService transportationSystemService = new TransportationSystemService();

        boolean data = transportationSystemService.isVehicleIdValid( vehicleId, typeOfVehicle);

        if(data){
            ts.setTypeOfVehicle(typeOfVehicle);
            ts.setVehicleId(vehicleId);
            ts.setMilageOfVehicle(milageOfVehicle);
            ts.setCustId(custId);
            ts.setCustName(custName);
            ts.setMob(mob);
            ts.setEmail(email);
            ts.setDrivingLicense(drivingLisence);
            ts.setDurationForRent(durationOfRent);

            float rate = transportationSystemService.rateOfSelectedVehicle(ts.getTypeOfVehicle(), ts.getDurationForRent(), typesOfVehicles, rateOfTheVehicle);
            if(rate != 0){
                transportationSystemService.bookingDetails(ts.getTypeOfVehicle(), ts.getVehicleId(), ts.getMilageOfVehicle(),
                        ts.getCustId(), ts.getCustName(), ts.getMob(), ts.getEmail(), ts.getDrivingLicense(),
                        ts.getDurationForRent(), rate);
            }else{
                System.out.println("Error occured while inserting data !!");
            }


        }else {
            System.out.println("Vehicle id is Invalid");
        }
    }

}
