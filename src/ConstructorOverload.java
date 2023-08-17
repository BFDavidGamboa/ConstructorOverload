// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ConstructorOverload {
    public static void main(String[] args) {

        Person person1 = new Person("Juan", 25);
        System.out.println("persona1 = " + person1);


        Employee employee1 = new Employee("Karla", 30, 4000);
        System.out.println("employee1= " + employee1);
    }
}