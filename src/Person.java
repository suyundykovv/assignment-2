class Person implements Comparable<Person>, Payable {
    //Создаем класс Person с интерфейсами compabrble and Payable
    private static
    int id_gen = 1;
    //Создаем статистическую пременную для создания уникального идентификатора

    private int id;
    private String name;
    private String surname;
    //Создаем приватные переменные
    public Person() {
        this.id = id_gen++;
    }
    // Конструктор по умолчанию, который присваивает уникальный идентификатор каждому человеку

    public Person(String name, String surname) {
        this();//ВЫзывает конструктор
        this.name = name;
        this.surname = surname;
    }
    //Создаем конструктор который присваисвает значение имени и фамилии т дает уникальный идентификатор
    public int getId() {
        return id;
    }
    // Метод для получения идентификатора человека

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
    // Методы для получения и обновления идентификатора,фамилли,имени человека

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }
    // Реализация метода getPaymentAmount из интерфейса Payable

    @Override
    public String toString() {
        return "Person:" +
                "\n" + name +
                "\n" + surname ;
    }
    //строковое представления объекта Person
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
    //  Сравнивает людей на основе суммы их оплаты





}