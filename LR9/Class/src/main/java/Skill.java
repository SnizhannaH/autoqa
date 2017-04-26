import java.util.ArrayList;

/**
 * Created by guber on 26.04.2017.
 */
public class Skill {

    private String name;
    private String description;
    private int level;

    public Skill(String name, String description, int level) {
        this.name = name;
        this.description = description;
        this.level = level;
    }

    public Skill(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String toString() {
        return this.name + " " + this.description + " " + this.level;
    }
}
