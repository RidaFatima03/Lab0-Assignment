import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class randomArray {

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
    public int max(int[] array){
        for (int i =0; i<array.length;i++)
        {
            if (i==0){
                max=array[i];
            }
            if (i!=0)
            {
                if (array[i]>max)
                {
                    max=array[i];
                }
            }
        }
        return max;
    }
    public int min(int[] array){
        for (int i =0; i<array.length;i++)
        {
            if (i==0){
                min=array[i];
            }
            if (i!=0)
            {
                if (array[i]<min)
                {
                    min=array[i];
                }
            }
        }
        return min;
    }
    /* part e
     * finding sums of both odd and even numbers
     */
    public int oddSum( int[] array )
    {
        int oddSums = 0;
        for( int i = 0; i < array.length; i++ )
        {
            if( array[i] % 2 == 1 )
            {
                oddSums += array[i];
            }
        }
        return oddSums;
    }
    public int evenSum( int[] array )
    {
        int evenSums = 0;
        for( int i = 0; i < array.length; i++ )
        {
            if( array[i] % 2 == 0 )
            {
                evenSums += array[i];
            }
        }
        return evenSums;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean wantsToExit = false;
        int arrayLength = 0;

        while (!wantsToExit){
            System.out.print("Choose one of the following options: \n1. Enter new number into the array. \n2. Exit.\nYour choice: ");
            int menuOption = in.nextInt();
            if (menuOption == 1){
                arrayLength++;
            }
            else if (menuOption == 2){
                wantsToExit = true;
            }
            else{
                System.out.println("You have entered an invalid number. Please try again.");
            }
        }
        //when i try to run the method even with a fixed length, it doesn't provide the correct output.
        //System.out.println(createRandomArray(2));

        System.out.println(Arrays.toString(createRandomArray(arrayLength)));

        in.close();
    }

}
