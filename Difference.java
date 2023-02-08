public class Difference {

    private static int findAverage(int[] array)
    {
        int total=0;
        for( int element: array )
        {
            total += element;
        }
        return total/array.length;
    }

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

}
