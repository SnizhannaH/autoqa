import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by guber on 27.02.2017.
 */

public class FileManager {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String path;
    boolean result;

    public void createFile() throws IOException {
        System.out.println("Please, input a path and file name: ");
        path = reader.readLine();
        File f = new File(path);

        result = f.createNewFile();
        if (result){
            System.out.println("File has been created");
        }
        else {
            System.out.println("File already exists");
        }
    }

    public void deleteFile() throws IOException {
        System.out.println("Please, input a path and file name: ");
        path = reader.readLine();

        File f = new File(path);
        result = f.delete();

        if (result){
            System.out.println("File has been deleted");
        }
        else {
            System.out.println("File hasn't been found or can't be deleted");
        }
    }

    public void renameFile() {

    }

    public void findWord(){

    }

    public void replaceWord(){

    }
}
