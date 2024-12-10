package com.caresoft.clinicapp;

import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    // Constructor
    public AdminUser(Integer id, String role) {
        super(id); 
        this.role = role;
        this.securityIncidents = new ArrayList<>(); 
    }


    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() >= 6) { 
            this.pin = pin;
            return true;
        }
        return false; 
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (this.id.equals(confirmedAuthID)) {
            return true; 
        } else {
            authIncident();
            return false; 
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n, ID: %s\n Notes: %s \n", 
            new java.util.Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report); 
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<String> getSecurityIncidents() {
        return securityIncidents;
    }
}
