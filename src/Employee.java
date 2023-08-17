public class Employee extends Person{

    private double salary;
    public Employee(String name, int age) {
        // In the case that person class is public we should omit this super() call
        super(name, age);
    }

    public Employee(String name, int age, double salary) {
        this(name, age);
//        We should only use one of "this" call at the moment of initialize the variables
//          super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        //Remember to always add super when creating toString method in the return statement
        return super.toString() + "Employee{" +
                "salary=" + salary +
                '}';
    }
}
