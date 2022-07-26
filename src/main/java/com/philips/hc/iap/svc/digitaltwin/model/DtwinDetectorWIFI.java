package com.philips.hc.iap.svc.digitaltwin.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="dtwin_detector_wifi", schema="dbo")
public class DtwinDetectorWIFI {
    @Column(name="dtwin_instance_wifi_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dTwinInstanceWIFIID;
//    @ManyToOne
//    @JoinColumn(name="dtwin_instance_id" , nullable = false)
//    private DTwinDetector dTwinDetector;
    @Column(name="linkquality")
    private String  linkQuality;
    @Column(name="signalpower")
    private String signalPower;
    @Column(name="datarate")
    private String dataRate;
    @Column(name="noisepower")
    private String noisePower;
    @Column(name="rawlinkquality")
    private String rawLinkQuality;

    private String dtwin_instance_id;

    private Timestamp eventDateTime;



//    @ManyToOne
//    @JoinColumn(name="dtwin_id" , nullable = false)
//    private DTwin dTwin;


    public DtwinDetectorWIFI(int dTwinInstanceWIFIID, String linkQuality, String signalPower, String dataRate, String noisePower, String rawLinkQuality, String dtwin_instance_id, Timestamp eventDateTime) {
        this.dTwinInstanceWIFIID = dTwinInstanceWIFIID;
        this.linkQuality = linkQuality;
        this.signalPower = signalPower;
        this.dataRate = dataRate;
        this.noisePower = noisePower;
        this.rawLinkQuality = rawLinkQuality;
        this.dtwin_instance_id = dtwin_instance_id;
        this.eventDateTime = eventDateTime;
    }

    public DtwinDetectorWIFI() {

    }

    public int getdTwinInstanceWIFIID() {
        return dTwinInstanceWIFIID;
    }

    public void setdTwinInstanceWIFIID(int dTwinInstanceWIFIID) {
        this.dTwinInstanceWIFIID = dTwinInstanceWIFIID;
    }





    public String getLinkQuality() {
        return linkQuality;
    }

    public void setLinkQuality(String linkQuality) {
        this.linkQuality = linkQuality;
    }

    public String getSignalPower() {
        return signalPower;
    }

    public void setSignalPower(String signalPower) {
        this.signalPower = signalPower;
    }

    public String getDataRate() {
        return dataRate;
    }

    public void setDataRate(String dataRate) {
        this.dataRate = dataRate;
    }

    public String getNoisePower() {
        return noisePower;
    }

    public void setNoisePower(String noisePower) {
        this.noisePower = noisePower;
    }

    public String getRawLinkQuality() {
        return rawLinkQuality;
    }

    public void setRawLinkQuality(String rawLinkQuality) {
        this.rawLinkQuality = rawLinkQuality;
    }

    public String getDtwin_instance_id() {
        return dtwin_instance_id;
    }

    public void setDtwin_instance_id(String dtwin_instance_id) {
        this.dtwin_instance_id = dtwin_instance_id;
    }

    public Timestamp getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(Timestamp eventDateTime) {
        this.eventDateTime = eventDateTime;
    }
}
