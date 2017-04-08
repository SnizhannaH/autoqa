public class Main {

    public static void main(String[] args) {

        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Serj", 33, "Hillel");
        myCompany.addEmployee("Ann", 25, "Hillel");
        myCompany.addEmployee("Alex", 30, "Hillel");
        myCompany.addEmployee("Vika", 33, "Hillel");

        System.out.println("Employee data:");
        myCompany.getAllEmployees().forEach(System.out::println);

        myCompany.deleteEmployeeByName("Serj");

        System.out.println("\nAfter deleted Serj");
        myCompany.getAllEmployees().forEach(System.out::println);

        System.out.println("\nGet data about employee by name Vika");
        System.out.println(myCompany.getEmployeeByName("Vika").toString());

        myCompany.deleteEmployeeOlder(30);
        System.out.println("\nAfter delete employees with age more than 30:");
        myCompany.getAllEmployees().forEach(System.out::println);

        myCompany.setEmployeeProjectName("Ann", "Test");
        System.out.println("\nSet project name (Test) for employee Ann: ");
        myCompany.getAllEmployees().forEach(System.out::println);

        myCompany.updateEmployeeName("Ann", "Anna");
        System.out.println("\nEmployee name Ann was changed to Anna:");
        myCompany.getAllEmployees().forEach(System.out::println);

        myCompany.clearProjectName("Anna");
        System.out.println("\nProject name was cleared for employee Anna");
        myCompany.getAllEmployees().forEach(System.out::println);
    }
}
