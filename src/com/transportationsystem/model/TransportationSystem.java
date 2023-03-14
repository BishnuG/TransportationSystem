package com.transportationsystem.model;

public class TransportationSystem {

    private String vehicleId;
    private String typeOfVehicle;
    private int milageOfVehicle;
    private  String gearType;
    private int custId;
    private String custName;
    private long mob;
    private String email;
    private String drivingLicense;
    private float durationForRent;

    public String getVehicleId() {
        return vehicleId;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public int getMilageOfVehicle() {
        return milageOfVehicle;
    }

    public String getGearType() {
        return gearType;
    }

    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public long getMob() {
        return mob;
    }

    public String getEmail() {
        return email;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public float getDurationForRent() {
        return durationForRent;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setMilageOfVehicle(int milageOfVehicle) {
        this.milageOfVehicle = milageOfVehicle;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setMob(long mob) {
        this.mob = mob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public void setDurationForRent(float durationForRent) {
        this.durationForRent = durationForRent;
    }

}
