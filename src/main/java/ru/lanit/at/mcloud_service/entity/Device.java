package ru.lanit.at.mcloud_service.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class Device {
    private int id;
    private String deviceName;
    private String latformName;
    private String deviceUdid;
    private String screenResolution;
    private Double screenDiagonal;
    private Double platformVersion;
    private int cameraMegapixels;

    public Device() {
    }

    public Device(String deviceName, String latformName, String deviceUdid, String screenResolution, Double screenDiagonal, Double platformVersion, int cameraMegapixels) {
        this.deviceName = deviceName;
        this.latformName = latformName;
        this.deviceUdid = deviceUdid;
        this.screenResolution = screenResolution;
        this.screenDiagonal = screenDiagonal;
        this.platformVersion = platformVersion;
        this.cameraMegapixels = cameraMegapixels;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String device_name) {
        this.deviceName = device_name;
    }

    public String getLatformName() {
        return latformName;
    }

    public void setLatformName(String latformName) {
        this.latformName = latformName;
    }

    public String getDeviceUdid() {
        return deviceUdid;
    }

    public void setDeviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(Double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public Double getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(Double platformVersion) {
        this.platformVersion = platformVersion;
    }

    public int getCameraMegapixels() {
        return cameraMegapixels;
    }

    public void setCameraMegapixels(int cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }
}
