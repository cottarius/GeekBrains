public class Notebook {
    private int ram;
    private int hdd;
    private String os;
    private String color;
    public Notebook(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public Notebook() {

    }

    public int getRam() {
        return ram;
    }
    public int getHdd() {
        return hdd;
    }
    public String getColor() {
        return color;
    }
    public String getOs() {
        return os;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void print(){
        System.out.printf("Ram: %d, HDD: %d, Operation System: %s, Color: %s\n", ram, hdd, os, color);
    }
}
