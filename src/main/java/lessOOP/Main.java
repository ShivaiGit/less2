package lessOOP;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("red",2000,1988);
        Car car2 = new Car("white",1250,2020);

        Cat cat1 = new Cat("Barsik", "black", 2, "meow" );
        Cat cat2 = new Cat("Murzik", "white", 1.5, "meow meooooooow" );

        Triangle triangle1 = new Triangle(5,6,7);
        triangle1.areaTriangle();
    }
}
