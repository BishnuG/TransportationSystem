package com.transportationsystem.service;

public class TransportationSystemService {
    public boolean isVehicleIdValid(String vehicleId, int typeOfVehicle ){
        boolean flag = false;

       /* char firstCharacterOfVehicle = typeOfVehicle.charAt(0);
        char firstCharacterOfVehicleId = vehicleId.charAt(0);
        String lastTwoChar = vehicleId.length() > 2 ? vehicleId.substring(vehicleId.length() - 2) : vehicleId;

        String firstCharacterOfVehicle1 = String.valueOf(firstCharacterOfVehicle);
        String firstCharacterOfVehicleId2 = String.valueOf(firstCharacterOfVehicleId);

        if(firstCharacterOfVehicle1.equals(firstCharacterOfVehicleId2) && islastTwoCharInteger(lastTwoChar)){
            flag = true;
        }*/

        if(typeOfVehicle == 1 && vehicleId.equals("B01")){
            flag = true;
        } else if (typeOfVehicle == 2 && vehicleId.equals("T01")) {
            flag = true;
        } else if (typeOfVehicle == 3 && vehicleId.equals("TX01")) {
            flag = true;
        } else if (typeOfVehicle == 4 && vehicleId.equals("SC01")) {
            flag = true;
        } else if (typeOfVehicle == 5 && vehicleId.equals("BK01")) {
            flag = true;
        }

        return flag;
    }

    /*public boolean islastTwoCharInteger(String lastTwoChar){
        boolean isInteger = true;

        try {
            int data = Integer.parseInt(lastTwoChar);
        } catch (NumberFormatException nfe) {
            isInteger = false;
        }

        return isInteger;
    }*/

    public void bookingDetails(String typeOfVehicle, String vehicleId, int milageOfVehicle, int custId, String custName,
        long mob, String email, String drivingLisence, float durationOfRent, float rate){

        System.out.println("************************************");
        System.out.println("Type of Vehicle: " + typeOfVehicle);
        System.out.println("Vehicle Id: " + vehicleId);
        System.out.println("Vehicle milage: " + milageOfVehicle);
        System.out.println("Vehicle customer Id: " + custId);
        System.out.println("Customer Name: " + custName);
        System.out.println("Mobile: " + mob);
        System.out.println("Email: " + email);
        System.out.println("Driving Lisence: " + drivingLisence);
        System.out.println("Duration of rent: " + durationOfRent);
        System.out.println("Booking rate of Vehicle: " + rate);

    }

    public float rateOfSelectedVehicle(String selectedVehicle, float duration, String[] typeOfVehicles, int[] rates){
        float rate = 0.0f;
        int index = 0;
        int flag = 0;
        for(int i = 0; i < typeOfVehicles.length; i++){
            if(typeOfVehicles[i].equalsIgnoreCase(selectedVehicle)){
                index = i;
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            rate = rates[index] * duration;
        }
        return rate;

    }

    public String selectedVehicleType(int data){
        String vehicle = "";
        switch (data){
            case 1:
                vehicle = "Bus";
                break;
            case 2:
                vehicle = "Truck";
                break;
            case 3:
                vehicle = "Taxi";
                break;

            case 4:
                vehicle = "Scooty";
                break;

            case 5:
                vehicle = "Bike";
                break;

        }
        return vehicle;
    }

}
