import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MyCompany {

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    public void addEmployee(String employeeName, int age, String projectName, HashMap<String, String> skills) {
        employeeList.add(new Employee(employeeName, age, projectName, skills));
    }


    public void deleteEmployeeByName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.remove(i);
            }
        }
    }

    public void deleteEmployeeOlder(int desiredAge) {
        // TODO
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getAge()>desiredAge) {
                employeeList.remove(i);
            }
        }
    }

    public Employee getEmployeeByName(String employeeName) {
        Employee employeeToReturn = null;

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeToReturn = employeeList.get(i);
            } else {
                HashMap <String, String> empty = new HashMap<String, String>();
                empty.put("Not found", "Not found");
                employeeToReturn = new Employee("Not found", 0, "Not found", empty);
            }
        }
        return employeeToReturn;
    }

    public void setEmployeeProjectName(String employeeName, String projectName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(projectName);
            }
        }
    }

    public void updateEmployeeName(String employeeName, String employeeNewName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setName(employeeNewName);
            }
        }
    }

    public void clearProjectName(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(employeeName)) {
                employeeList.get(i).setProjectName(" ");
            }
        }
    }
}
