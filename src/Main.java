public class Main {
    public static Employee[] employees = {
            new Employee("Иванов", "Иван", "Ивановоич", 1, 35_000),
            new Employee("Артемов", "Артем", "Артемович", 2, 40_000),
            new Employee("Петров", "Петр", "Петрович", 3, 70_000),
            new Employee("Максимов", "Максим", "Максимович", 1, 130_000)
    };


    public static void printAllEmployess() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            printSeparator();
            System.out.println(employee);
        }
    }
    public static void printAllNameEmployess() {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getLastName());
        }
    }

    public static int mounthlySalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        } return sum;
    }

    public static int middleMounthleSalary() {
        int averageSalary = mounthlySalary() /employees.length;
        return averageSalary;
    }

    public static int minimumSalary() {
        int min = mounthlySalary();
        for (Employee employee : employees) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        return min;
    }
    public static int maximumSalary() {
        int max = minimumSalary();
        for (Employee employee : employees) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
            }
        }
        return max;
    }

    public static void printSeparator() {
        System.out.println();
        System.out.println("===================");
        System.out.println();
    }

    public static void main(String[] args) {
        printAllEmployess();
        printSeparator();
        System.out.println(mounthlySalary());
        printSeparator();
        middleMounthleSalary();
        printSeparator();
        System.out.println(minimumSalary());
        printSeparator();
        System.out.println(maximumSalary());
        printSeparator();
        printAllNameEmployess();
    }
}