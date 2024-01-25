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
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return String.format("%s: %d. %s %s", getPosition(), id, name, surname);
    }

    public String getPosition() {
        return "Person";
    }
