import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {

        MyCompany myCompany = new MyCompany();
        HashMap <String, String> skills1 = new HashMap<String, String>();
        HashMap <String, String> skills2 = new HashMap<String, String>();
        HashMap <String, String> skills3 = new HashMap<String, String>();

        skills1.put("sk1", "desc1");
        skills1.put("sk2", "desc2");
        skills1.put("sk3", "desc3");

        skills2.put("sk1", "desc1");
        skills2.put("sk2", "desc2");
        skills2.put("sk3", "desc3");

        skills3.put("sk1", "desc1");
        skills3.put("sk2", "desc2");
        skills3.put("sk3", "desc3");


        myCompany.addEmployee("Serj", 25, "Hillel", skills1);
        myCompany.addEmployee("Alex", 30, "Hillel", skills2);
        myCompany.addEmployee("Max", 33, "Hillel", skills3);

        for (Employee currentEmployee : myCompany.getAllEmployees()) {
            System.out.println(currentEmployee.getName() + " " + currentEmployee.getAge() + " "
                    + currentEmployee.getProjectName() + currentEmployee.getSkills().toString());
        }

        myCompany.addEmployeeSkill("Serj", "sk4", "desk4");

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
