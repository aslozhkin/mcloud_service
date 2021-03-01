package ru.lanit.at.mcloud_service.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Objects;

@JsonInclude
public class Device {
    private int id;
    private String deviceName;
    private String platformName;
    private String deviceUdid;
    private String screenResolution;
    private Double screenDiagonal;
    private String platformVersion;
    private int cameraMegapixels;
    private boolean isAvailable;

    public Device() {
    }

    public Device(String deviceName, String platformName, String deviceUdid, String screenResolution, Double screenDiagonal, String platformVersion, int cameraMegapixels) {
        this.deviceName = deviceName;
        this.platformName = platformName;
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

    @JsonProperty("device_name")
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPlatformName() {
        return platformName;
    }

    @JsonProperty("platform_name")
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDeviceUdid() {
        return deviceUdid;
    }

    @JsonProperty("device_udid")
    public void setDeviceUdid(String deviceUdid) {
        this.deviceUdid = deviceUdid;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    @JsonProperty("screen_resolution")
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }

    @JsonProperty("screen_diagonal")
    public void setScreenDiagonal(Double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    @JsonProperty("platform_version")
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    public int getCameraMegapixels() {
        return cameraMegapixels;
    }

    @JsonProperty("camera_megapixels")
    public void setCameraMegapixels(int cameraMegapixels) {
        this.cameraMegapixels = cameraMegapixels;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(platformName, device.platformName) &&
               Objects.equals(deviceUdid, device.deviceUdid) &&
               Objects.equals(screenResolution, device.screenResolution) &&
               Objects.equals(platformVersion, device.platformVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(platformName, deviceUdid, screenResolution, platformVersion);
    }
}
