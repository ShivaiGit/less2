package lessOOP;

public class Cat {
    private String name;
    private String color;
    private double age;
    private String say;

    public Cat(String name, String color, double age, String say) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.say = say;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void say (){
        System.out.println("Cat " + name + " say " + say);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", say='" + say + '\'' +
                ", age=" + age +
                '}';
    }
}
