public class Person {
    private static String name;
    private static double vel;
    private double height;
    private boolean up;
    public Person(String name, double vel, double height, boolean up){
        this.name = name;
        this.vel = vel;
        this.height = height;
        this.up = up;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getVel() {
        return vel;
    }

    public boolean isUp() {
        return up;
    }

    public void setHeight(double h){
        this.height = h;
    }

    public void kick(){
        this.up = !this.up;
    }
}

