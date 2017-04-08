import java.util.Arrays;
import java.util.Collections;

public class Tasks {
    public void task1(){
        int size = ((99-1)/2) + 1;
        Integer array[] = new Integer[size];
        int value = 1;

        System.out.println("Task 1");

        for (int i = 0;  i< array.length; i++) {
            array[i] = value;
            value = value + 2;
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println();

        for (int i = 0;  i< array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public void task2(){
        int array[] = new int[8];
        int startValue = 1;
        int endValue = 10;

        System.out.println("Task 2");

        for (int i = 0; i < array.length; i++){
            array[i] =  startValue + (int) (Math.random() * endValue);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i = i + 2){
            array[i] = 0;
        }

        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();
    }

    public void task3(){
        int rows = 8;
        int columns = 5;
        int array[][] = new int[rows][columns];
        int startValue = 10;
        int endValue = 99;

        System.out.println("Task 3");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array[i][j] =  startValue + (int) (Math.random() * endValue);
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j] + " ");
                if (j == columns - 1){
                    System.out.println();
                }
            }
        }

        System.out.println();
    }

    public void task4(){
        int rows = 8;
        int columns = 5;
        int array[][] = new int[rows][columns];
        int startValue = -99;
        int endValue = 99;
        int max = array[0][0];

        System.out.println("Task 4");

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array[i][j] =  startValue + (int) (Math.random() * (endValue - startValue + 1));
            }
        }

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j] + " ");
                if (j == columns - 1){
                    System.out.println();
                }
            }
        }

        System.out.println();


        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }

        System.out.println("Max value: " + max);
    }
}
