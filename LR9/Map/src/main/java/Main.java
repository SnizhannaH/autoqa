import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        MyCompany myCompany = new MyCompany();

        HashMap<String, String> skillsSerj = new HashMap<String, String>();
        HashMap <String, String> skillsAlex = new HashMap<String, String>();
        HashMap <String, String> skillsMax = new HashMap<String, String>();
        HashMap <String, String> skillsAnn = new HashMap<String, String>();
        HashMap <String, String> skillsVika = new HashMap<String, String>();

        skillsSerj.put("skill1", "descripton1");
        skillsSerj.put("skill2", "description2");
        skillsSerj.put("skill3", "description3");

        skillsAlex.put("skill1", "description1");
        skillsAlex.put("skill4", "description4");

        skillsMax.put("skill1", "description1");
        skillsMax.put("skill2", "descrpiption2");

        skillsAnn.put("skill1", "descripton1");
        skillsAnn.put("skill3", "description3");

        skillsVika.put("skill5", "descripton5");
        skillsVika.put("skill6", "description6");
        skillsVika.put("skill7", "description7");

        myCompany.addEmployee("Serj", 25, "Hillel", skillsSerj);
        myCompany.addEmployee("Alex", 30, "Hillel", skillsAlex);
        myCompany.addEmployee("Max", 33, "Hillel", skillsMax);
        myCompany.addEmployee("Ann", 25, "Hillel", skillsAnn);
        myCompany.addEmployee("Vika", 33, "Hillel", skillsVika);

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
