import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by guber on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HillelFileWriter writer = new HillelFileWriter();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path;
        String content;

        System.out.println("Please input a path and file name: ");
        path = reader.readLine();
        System.out.println("Please input a content: ");
        content = reader.readLine();

        writer.writeToFile(path, content);
    }
}
