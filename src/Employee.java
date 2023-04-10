public class Employee {
    String firstName;
    String secondName;
    String lastName;
    int department;
    int salary;
    int id;
    static int idCounter = 1;

    public Employee(String firstName, String secondName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter++;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
@Override
    public String toString() {
    return "ФИО: " + this.firstName + " " + this.secondName + " " + this.lastName + '\n' +
            "Отел: " + this.department + '\n' +
            "Зарплата: " + this.salary + " тыс.руб." + '\n' +
            "Счетчик: " + this.id;

    }
}
