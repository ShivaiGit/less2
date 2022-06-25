package lessOOP;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("green", 2000, 1980);

        Car car2 = new Car("red", 1500, 2020);

        car1.print();
        System.out.println();
        car2.print();

    }
}
