class Person implements Comparable<Person>, Payable {
    private static int nextId = 1;

    private int id;
    private String name;
    private String surname;