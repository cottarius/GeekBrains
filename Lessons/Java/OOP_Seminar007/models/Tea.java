package models;

public class Tea extends HotDrink{
    private boolean isGreen;
    private String region;

    public Tea(int temperature, int coast, int id, boolean isReadyToServe, boolean isGreen, String region) {
        super(temperature, coast, id, isReadyToServe);
        this.isGreen = isGreen;
        this.region = region;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean isReadyToServe() {
        return super.isReadyToServe();
    }

    @Override
    public void setReadyToServe(boolean readyToServe) {
        super.setReadyToServe(readyToServe);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "isGreen=" + isGreen +
                ", region='" + region + '\'' +
                ", temperature=" + temperature +
                ", coast=" + coast +
                ", id=" + id +
                ", isReadyToServe=" + isReadyToServe +
                '}';
    }
}
