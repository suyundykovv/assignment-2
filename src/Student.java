class Student extends Person {
    // расширяет класс Person
    private double gpa;
    private static final double STIPENDIA = 36660.00;

    public Student() {
        super();
    }
    //вызывает конструктор суперкласса Person

    public Student(String name, String surname, double gpa) {
        super(name, surname);// Вызывает конструктор суперкласса
        this.gpa = gpa;
    }
    //конструктор, принимающий имя, фамилию и средний балл
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //методы для получения и обновления для среднего бала
    @Override
    public String toString() {
        return super.toString() +
                "\n" + getPaymentAmount()+
                "\n" + gpa ;
    }
    //строковое представления объекта Person

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPENDIA : 0.0;
    }
    //Возвращает стипендию, если средний балл выше 2.67, иначе 0
}