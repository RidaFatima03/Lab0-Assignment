import java.util.Random;


public class randomArray {



    public static int[] createRandomArray(int n)
    {
        Random rand= new Random();
        int arraySize = n;
        int [] array= new int[arraySize];
        for(int i = 0; i<arraySize;i++)
        {
            int randomNumber= rand.nextInt(0, 100);
            array[i]= randomNumber;
        }
        return array;
    }
    
}