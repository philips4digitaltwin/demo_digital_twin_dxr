package com.philips.hc.iap.svc.digitaltwin.model;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
//@Table(name="dtwin_battery", schema="digital_twin")
@Table(name="dtwin_battery", schema="dbo")
public class DTwinBattery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dTwinInstanceBatteryID;
    @Column(name="dtwin_instance_id")
    private String dtwin_instance_id;
    @ManyToOne
    @JoinColumn(name="dtwin_id" , nullable = false)
    private DTwin dTwin;
    @Column(name="batteryserialnumber")
    private String batterySerialNumber;
    @Column(name="remaininglifetime")
    private Timestamp remainingLifetime;
    @Column(name="remaininglifetimedays")
    private String remainingLifetimeDays;
    @Column(name="ischargingcyclesexceeded")
    private String isChargingCyclesExceeded;
    @Column(name="numberofchargingcycles")
    private String numberOfChargingCycles;

    private Timestamp eventDateTime;

    public DTwinBattery(int dTwinInstanceBatteryID, String dtwin_instance_id, DTwin dTwin, String batterySerialNumber, Timestamp remainingLifetime, String remainingLifetimeDays, String isChargingCyclesExceeded, String numberOfChargingCycles, Timestamp eventDateTime) {
        this.dTwinInstanceBatteryID = dTwinInstanceBatteryID;
        this.dtwin_instance_id = dtwin_instance_id;
        this.dTwin = dTwin;
        this.batterySerialNumber = batterySerialNumber;
        this.remainingLifetime = remainingLifetime;
        this.remainingLifetimeDays = remainingLifetimeDays;
        this.isChargingCyclesExceeded = isChargingCyclesExceeded;
        this.numberOfChargingCycles = numberOfChargingCycles;
        this.eventDateTime = eventDateTime;
    }

    public DTwinBattery() {

    }


    public int getdTwinInstanceBatteryID() {
        return dTwinInstanceBatteryID;
    }

    public void setdTwinInstanceBatteryID(int dTwinInstanceBatteryID) {
        this.dTwinInstanceBatteryID = dTwinInstanceBatteryID;
    }

    public String getDtwin_instance_id() {
        return dtwin_instance_id;
    }

    public void setDtwin_instance_id(String dtwin_instance_id) {
        this.dtwin_instance_id = dtwin_instance_id;
    }


    public DTwin getdTwin() {
        return dTwin;
    }

    public void setdTwin(DTwin dTwin) {
        this.dTwin = dTwin;
    }

    public String getBatterySerialNumber() {
        return batterySerialNumber;
    }

    public void setBatterySerialNumber(String batterySerialNumber) {
        this.batterySerialNumber = batterySerialNumber;
    }

    public Timestamp getRemainingLifetime() {
        return remainingLifetime;
    }

    public void setRemainingLifetime(Timestamp remainingLifetime) {
        this.remainingLifetime = remainingLifetime;
    }

    public String getRemainingLifetimeDays() {
        return remainingLifetimeDays;
    }

    public void setRemainingLifetimeDays(String remainingLifetimeDays) {
        this.remainingLifetimeDays = remainingLifetimeDays;
    }

    public String isChargingCyclesExceeded() {
        return isChargingCyclesExceeded;
    }

    public void setChargingCyclesExceeded(String chargingCyclesExceeded) {
        isChargingCyclesExceeded = chargingCyclesExceeded;
    }

    public String getNumberOfChargingCycles() {
        return numberOfChargingCycles;
    }

    public void setNumberOfChargingCycles(String numberOfChargingCycles) {
        this.numberOfChargingCycles = numberOfChargingCycles;
    }

    public Timestamp getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(Timestamp eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
}
