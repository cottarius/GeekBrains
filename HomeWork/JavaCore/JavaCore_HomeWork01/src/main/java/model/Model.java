package model;

public class Model {
    private int x;
    private int y;

    public Model(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int addition(){
        return x + y;
    }
    public int substruction(){
        return x - y;
    }
    public int multiply(){
        return  x * y;
    }
    public int division(){
        return x / y;
    }

}
