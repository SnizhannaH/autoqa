import java.util.ArrayList;
import java.util.HashSet;

public class Employee {
    private String name;
    private int age;
    private String projectName;
    private ArrayList<Skill> skills = new ArrayList<>();

    public Employee(String name, int age, String projectName, ArrayList<Skill> skills) {
        this.name = name;
        this.age = age;
        this.projectName = projectName;
        this.skills = skills;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String toString() {
        return this.name + " " + this.age + " " + this.projectName + " " + "skills:" + this.skills;
    }
}
