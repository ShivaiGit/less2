package lessOOP.persons;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
            persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
            persArray[1] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 36);
            persArray[2] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 45);
            persArray[3] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 42);
            persArray[4] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 29);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40)
                persArray[i].printInfo();
            System.out.println();
        }
    }
}
