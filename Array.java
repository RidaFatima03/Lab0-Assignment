import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static int[] createRandomArray(int n)
    {
        Random rand = new Random();
        int arraySize = n;
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++)
        {
            int randomNumber = rand.nextInt(0,100);
            array[i] = randomNumber;
        }
        return array;
    }
    /* finding maximum and minimum values */
    private int max;
    private int min;
    public static int max(int[] array){
        int maximum=0; //initialization
        for (int i =0; i<array.length;i++)
        {
            if (i==0){
                maximum=array[i];
            }
            if (i!=0)
            {
                if (array[i]>maximum)
                {
                    maximum=array[i];
                }
            }
        }
        return maximum;
    }
    public static int min(int[] array){
        int minimum =0; //initialization
        for (int i =0; i<array.length;i++)
        {
            if (i==0){
                minimum=array[i];
            }
            if (i!=0)
            {
                if (array[i]<minimum)
                {
                    minimum=array[i];
                }
            }
        }
        return minimum;
    }
    // part d 
    
    /*
     * a private method for finding the average of an array 
     */
    private static int findAverage(int[] array)
    {
        int total=0;
        for( int element: array )
        {
            total += element;
        }
        return total/array.length;
    }

    /*
     *  a public method to display how each element differs from the average
     */
    public static int[] findDifference( int[] array )
    {
        int average = findAverage(array);
        int finalArray [] = new int[array.length];
        
        for (int i = 0; i < array.length; i++) 
        {
           finalArray[i] = array[i]-average;
        }
        return finalArray;
    }

    /* part e
     * finding sums of both odd and even numbers
     */
    public static int oddSum( int[] array )
    {
        int oddSums = 0;
        for( int i = 0; i < array.length; i++ )
        {
            if( i % 2 == 1 )
            {
                oddSums += array[i];
            }
        }
        return oddSums;
    }
    public static int evenSum( int[] array )
    {
        int evenSums = 0;
        for( int i = 0; i < array.length; i++ )
        {
            if( i % 2 == 0 )
            {
                evenSums += array[i];
            }
        }
        return evenSums;
    }
    public static void  displayMenuOptions(){
        String menu= "Choose one of the options below\n" + "1- Find the minimum number in the array\n" +
        "2-Find the maximum number in the array\n" + "3-Find the difference of each element and the average of the array\n" 
        + "4-Find the sum of the elements in even indices\n" + "5-Find the sum of the elements in odd indices\n" + "6-Exit";
        System.out.println(menu);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean wantsToExit = false;
        System.out.print("Enter the size of the array:");
        int arrayLength= in.nextInt();
        int [] array= createRandomArray(arrayLength);
        while (!wantsToExit){
            displayMenuOptions();
            String choice= in.next();
            switch (choice) {
                case "1":
                    System.out.println(min(array));
                    break;
                case "2":
                    System.out.println(max(array));
                    break;
                case "3":
                    System.out.println(Arrays.toString(findDifference(array)));
                    break;
                case "4":
                    System.out.println(evenSum(array));
                    break;
               case "5":
                    System.out.println(oddSum(array));
                    break;
                case "6":
                    wantsToExit=true;
                    break;              
                                       
             default:
                    break;
            }

        }
        in.close();

         
        }
      

    }


