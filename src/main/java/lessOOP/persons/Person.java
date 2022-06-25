package lessOOP.persons;

public class Person {
    private String fullName;
    private String post;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    public Person(String fullName, String post, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo (){
        System.out.println("Full name - " + getFullName());
        System.out.println("Post - " + getPost());
        System.out.println("Email- " + getEmail());
        System.out.println("Phone number - " + getPhoneNumber());
        System.out.println("Salary - " + getSalary());
        System.out.println("Age - " + getAge());
    }

    @Override
    public String toString() {
        return "Person - {" +
                "fullName = '" + fullName + '\'' +
                ", post = '" + post + '\'' +
                ", email = '" + email + '\'' +
                ", phoneNumber = " + phoneNumber +
                ", salary = " + salary +
                ", age = " + age +
                '}';
    }
}
