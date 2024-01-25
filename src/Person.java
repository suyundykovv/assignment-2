class Person implements Comparable<Person>, Payable {
    private static int nextId = 1;

    private int id;
    private String name;
    private String surname;
    public Person() {
        this.id = nextId++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }