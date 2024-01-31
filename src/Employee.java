class Employee extends Person {
    //расширяет класс Person
    private double salary;
    private String position;
    public Employee() {
        super();
    }
    //вызывает конструктор суперкласса Person
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);// Вызывает конструктор суперкласса
        this.position = position;
        this.salary = salary;
    }
    //конструктор, принимающий имя, фамилию, должность и зп
    public double getSalary() {
        return salary;
    }
    public String getPosition() {
        return position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //методы для обновления,получения зп и должности

    @Override
    public String toString() {
        return super.toString() +
                "\n" + getPaymentAmount()+
                "\n" + position ;
    }
    //строковое представления объекта Person
    @Override
    public double getPaymentAmount() {
        return salary;
    }
    //Возвращает заработную плату в качестве суммы оплаты
}
