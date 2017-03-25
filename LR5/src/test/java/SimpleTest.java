import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class SimpleTest {

    boolean interactive = false;
    String createFilePath = "D:\\Projects\\test4.txt";
    String deleteFilePath = "D:\\Projects\\test1.txt";
    String renameFilePathOld = "D:\\Projects\\test2.txt";
    String renameFilePathNew = "D:\\Projects\\test2new.txt";
    //String createFilePathNegative = "D:\\Projesdfsfts\\test2.txt";

    @Parameters({"interactive"})
    SimpleTest(boolean interactive) { this.interactive = interactive; }

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Parameters({"myParam"})
    @Test(groups = {"gotParams", "runAll"})
    public void getParams(String myParam) {
        System.out.println("I got a parameter: " + myParam);
    }

    @Test(groups = {"createFile", "runAll"})
    public void testCreateFile() {
        FileManager fileManager = new FileManager(interactive);
        fileManager.createFile(createFilePath);
        assertEquals(true, Files.exists(Paths.get(createFilePath)));
    }

   @Test(groups = {"deleteFile", "runAll"})
    public void testDeleteFile() throws  Exception {
        FileManager fileManager = new FileManager(interactive);
        assertEquals(true, Files.exists(Paths.get(deleteFilePath)));
        fileManager.deleteFile(deleteFilePath);
        assertEquals(false, Files.exists(Paths.get(deleteFilePath)));
    }

    @Test(groups = {"renameFile", "runAll"})
    public void testRenameFile() throws  Exception {
        FileManager fileManager = new FileManager(interactive);
        assertEquals(true, Files.exists(Paths.get(renameFilePathOld)));
        fileManager.renameFile(renameFilePathOld, renameFilePathNew);
        assertEquals(false, Files.exists(Paths.get(renameFilePathOld)));
        assertEquals(true, Files.exists(Paths.get(renameFilePathNew)));
    }

//    @Test(expectedExceptions = {IOException.class})
//    public void testCreateFileNegative() throws IOException {
//        FileManager fileManager = new FileManager(interactive);
//        fileManager.createFile(createFilePathNegative);
//    }
}

