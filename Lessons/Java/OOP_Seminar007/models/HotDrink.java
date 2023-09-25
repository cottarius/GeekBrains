package models;

public abstract class HotDrink {
    protected int temperature;
    protected int coast;
    protected int id;
    protected boolean isReadyToServe;

    public HotDrink(int temperature, int coast, int id, boolean isReadyToServe) {
        this.temperature = temperature;
        this.coast = coast;
        this.id = id;
        this.isReadyToServe = isReadyToServe;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isReadyToServe() {
        return isReadyToServe;
    }

    public void setReadyToServe(boolean readyToServe) {
        isReadyToServe = readyToServe;
    }
}
