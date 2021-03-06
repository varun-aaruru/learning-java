import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        //arrays are if fixed length
        /*
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 5;
        // numbers[10] = 17; throws exception because index in more than defined array length
        System.out.println(Arrays.toString(numbers));//to print the array i.e, to see string representation of array
        System.out.println(numbers);
        //newer way
        int[] moreNumbers = {1,3,5,7,9};
        System.out.println(moreNumbers.length);
        // Multi dimensional arrays

        //2d:
        int[][] matrix = new int[2][3];
        matrix[0][0] = 5;
        matrix[0][1] = 8;
        matrix[0][2] = 4;
        matrix[1][0] = 6;
        matrix[1][1] = 9;
        matrix[1][2] = 1;

        //new way:
        int[][] moreMatrix = {{1,2,3},{9,8,7}};
        System.out.println(Arrays.deepToString(moreMatrix));//deepToString method is used to print complex arrays
        */
        String[] cars = {"tata","maruti","mahindra"};
        cars[1] = "suzuki";
        for(int index=0; index<cars.length; index+=1){
            System.out.println(cars[index]);
        }
        String[][] bikes = new String[3][3];
        bikes[0][0] = "Hero";
        bikes[0][1] = "Kawasaki";
        bikes[0][2] = "Suzuki";
        bikes[1][0] = "Yamaha";
        bikes[1][1] = "Mahindra";
        bikes[1][2] = "Honda";
        bikes[2][0] = "Harley";
        bikes[2][1] = "Triumph  ";
        bikes[2][2] = "Ducati";
        System.out.println(bikes.length);
        //System.out.println(Arrays.deepToString(bikes));
        for(int rows=0; rows<bikes.length; rows++){
            System.out.println();
            for(int cols=0; cols<bikes[rows].length; cols++){
                System.out.print("\t\t"+bikes[rows][cols]);
            }
        }
    }
}
