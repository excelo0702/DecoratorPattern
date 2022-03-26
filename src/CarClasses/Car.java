package CarClasses;

public abstract class Car {
    private String description;
    private String mileage;
    private Boolean IsOwlCam;
    private Boolean IsRefrigerator;
    private Boolean IsHealthMonitor;
    private Boolean IsAlexa;
    private Boolean IsTireSafetyMonitor;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Boolean getOwlCam() {
        return IsOwlCam;
    }

    public void setOwlCam(Boolean owlCam) {
        IsOwlCam = owlCam;
    }

    public Boolean getRefrigerator() {
        return IsRefrigerator;
    }

    public void setRefrigerator(Boolean refrigerator) {
        IsRefrigerator = refrigerator;
    }

    public Boolean getHealthMonitor() {
        return IsHealthMonitor;
    }

    public void setHealthMonitor(Boolean healthMonitor) {
        IsHealthMonitor = healthMonitor;
    }

    public Boolean getAlexa() {
        return IsAlexa;
    }

    public void setAlexa(Boolean alexa) {
        IsAlexa = alexa;
    }

    public Boolean getTireSafetyMonitor() {
        return IsTireSafetyMonitor;
    }

    public void setTireSafetyMonitor(Boolean tireSafetyMonitor) {
        IsTireSafetyMonitor = tireSafetyMonitor;
    }

    public abstract void cost();
}
