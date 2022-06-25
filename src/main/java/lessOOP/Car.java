package lessOOP;

public class Car {
    String color;
    double weight;
    int year;
    private double speed;

    public Car(String color, double weight, int year) {
        this.color = color;
        this.weight = weight;
        this.year = year;
    }

    public void beep() {
        System.out.println("BEEP-BEEP!!!");
    }

    public void acceleration(double a) {
        this.speed = speed + a;
    }

    public void deceleration(double b) {
        if (speed - b >= 0)
            speed = speed - b;
    }

    public void print() {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Year car: " + year);
        System.out.println("Velosity: " + speed);
    }
}