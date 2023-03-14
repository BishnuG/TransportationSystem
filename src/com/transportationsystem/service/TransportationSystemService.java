package com.transportationsystem.service;

public class TransportationSystemService {
    public boolean isVehicleIdValid(String vehicleId, String typeOfVehicle ){
        boolean flag = false;

        char firstCharacterOfVehicle = typeOfVehicle.charAt(0);
        char firstCharacterOfVehicleId = vehicleId.charAt(0);
        String lastTwoChar = vehicleId.length() > 2 ? vehicleId.substring(vehicleId.length() - 2) : vehicleId;

        String firstCharacterOfVehicle1 = String.valueOf(firstCharacterOfVehicle);
        String firstCharacterOfVehicleId2 = String.valueOf(firstCharacterOfVehicleId);

        if(firstCharacterOfVehicle1.equals(firstCharacterOfVehicleId2) && islastTwoCharInteger(lastTwoChar)){
            flag = true;
        }
        return flag;
    }

    public boolean islastTwoCharInteger(String lastTwoChar){
        boolean isInteger = true;

        try {
            int data = Integer.parseInt(lastTwoChar);
        } catch (NumberFormatException nfe) {
            isInteger = false;
        }

        return isInteger;
    }

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

}
