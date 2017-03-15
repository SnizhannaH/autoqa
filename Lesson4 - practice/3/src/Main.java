

public class Main {
    public static void main(String[] args) {
        HillelFileWriter writer = new HillelFileWriter();

        writer.writeToFile(args[0], args[1]);
    }
}
