class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }