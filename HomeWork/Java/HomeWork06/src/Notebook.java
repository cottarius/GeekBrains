import lombok.Getter;
import lombok.Setter;

public class Notebook {
    @Getter @Setter private int Ram;
    @Getter @Setter private int Hdd;
    @Getter @Setter private String Os;
    @Getter @Setter private String Color;

//    public int getRam() {
//        return ram;
//    }
//    public int getHdd() {
//        return hdd;
//    }
//    public String getColor() {
//        return color;
//    }
//    public String getOs() {
//        return os;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public void setHdd(int hdd) {
//        this.hdd = hdd;
//    }
//    public void setOs(String os) {
//        this.os = os;
//    }
//    public void setRam(int ram) {
//        this.ram = ram;
//    }





    public Notebook(int ram, int hdd, String os, String color) {
        this.Ram = ram;
        this.Hdd = hdd;
        this.Os = os;
        this.Color = color;
    }

    public Notebook() {

    }
    public void print(){
        System.out.printf("Ram: %d, HDD: %d, Operation System: %s, Color: %s\n", Ram, Hdd, Os, Color);
    }
}
