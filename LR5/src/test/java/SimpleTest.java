import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class SimpleTest {

    boolean interactive = false;
    String createFilePath = "D:\\Projects\\test5.txt";
    String deleteFilePath = "D:\\Projects\\test1.txt";
    String renameFilePathOld = "D:\\Projects\\test2.txt";
    String renameFilePathNew = "D:\\Projects\\test2new.txt";
    String filePathNegative = "D:\\Projesdfsfts\\test2.txt";
    String renameFilePath = "D:\\Projects\\test2.txt";

    @Parameters({"interactive"})
    SimpleTest(boolean interactive) { this.interactive = interactive; }

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Parameters({"myParam"})
    @Test(groups = {"gotParams", "runAll"})
    public void getParams(String myParam)throws IOException{
        System.out.println("I got a parameter: " + myParam);
    }

    @Test(groups = {"createFile", "runAll"})
    public void testCreateFile() throws IOException {
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

    @Test(groups = {"CreateFileNegative", "runAll"}, expectedExceptions = {IOException.class})
    public void testCreateFileNegative() throws IOException {
        FileManager fileManager = new FileManager(interactive);
        fileManager.createFile(filePathNegative);
        assertEquals(false, Files.exists(Paths.get(filePathNegative)));
    }

    @Test(groups = {"DeleteFileNegative", "runAll"})
    public void testDeleteFileNegative() throws IOException {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FileManager fileManager = new FileManager(interactive);
        assertEquals(false, Files.exists(Paths.get(filePathNegative)));
        fileManager.deleteFile(filePathNegative);
        assertEquals(false, Files.exists(Paths.get(filePathNegative)));
        assertEquals("File hasn't been found or can't be deleted", outContent.toString().trim());

    }

    @Test(groups = {"RenameFileNegative", "runAll"})
    public void testRenameFileNegative() throws IOException {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        FileManager fileManager = new FileManager(interactive);
        assertEquals(true, Files.exists(Paths.get(renameFilePath)));
        assertEquals(false, Files.exists(Paths.get(filePathNegative)));
        fileManager.renameFile(renameFilePath, filePathNegative);
        assertEquals(true, Files.exists(Paths.get(renameFilePath)));
        assertEquals(false, Files.exists(Paths.get(filePathNegative)));
        assertEquals("File hasn't been renamed", outContent.toString().trim());
    }
}

