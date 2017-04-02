import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {

        MyCompany myCompany = new MyCompany();
        myCompany.addEmployee("Serj", 25, "Hillel", new HashSet<String>(Arrays.asList("sk1", "sk2")));
        myCompany.addEmployee("Alex", 30, "Hillel", new HashSet<String>(Arrays.asList("sk1", "sk3")));
        myCompany.addEmployee("Max", 33, "Hillel", new HashSet<String>(Arrays.asList("sk5", "sk6")));

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName() + " " + currentEmployee.getAge() + " "
                    + currentEmployee.getProjectName() + currentEmployee.getSkills().toString());
        }

        myCompany.addEmployeeSkill("Serj", "sk4");

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName() + " " + currentEmployee.getAge() + " "
            + currentEmployee.getProjectName() + currentEmployee.getSkills().toString());
        }

//        myCompany.deleteEmployeeByName("Serj");
//
//        System.out.println();
//        System.out.println("After deleted Serj");
//
//        for (Employee currentEmployee : myCompany.getAllEmployees()) {
//            System.out.println(currentEmployee.getName());
//        }
//
//        System.out.println(myCompany.getEmployeeByName("Test Name").getName());

    }


    //        new Employee();
//        new Employee("", 20, "");

//        ArrayList<Object> listOfObjects = new ArrayList<Object>();
//        listOfObjects.add("Test");
//        listOfObjects.add(new Employee());

//        ArrayList<Employee> employeeList = new ArrayList<Employee>();
//        employeeList.add(new Employee("Serj", 25, "Hillel"));
//        employeeList.add(new Employee("Alex", 30, "Electric Cloud"));
//        employeeList.add(new Employee("Serj", 45, "Sigma"));

}
