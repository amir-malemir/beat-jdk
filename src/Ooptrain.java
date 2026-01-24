class Person {
    String name;
    int age;

    static String gender = "male";

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "amir";
        p1.age = 28;

        System.out.println(p1.name + " " + p1.age + " " + Person.gender);
    }
}

