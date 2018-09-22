package in.co.thakur.deltaabstraction;

public abstract class Device {



    protected String deviceName;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    protected boolean isOn;
    public abstract void breakDevice();

}
