public class Person {
    private int personId;
    private String name;
    private int age;
    private static int personCount;

    private Person() {
        //super(); it's called automatically
        this.personId = ++personCount;
    }

    //Constructor complete - overload
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getPersonCount() {
        return personCount;
    }

    @Override
    public String toString() {
        return "Persona{ " + "personId= " + personId + ", name= " + name + ", edad= " + age + "}";
    }

}
