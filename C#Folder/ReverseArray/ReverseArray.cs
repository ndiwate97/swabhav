using System;

namespace ArrayApplication {
    public class ReverseArray { 
     public static int[] reverse(int [] array){

        if(array == null || array.Length <= 1){
           Console.WriteLine("Invalid array.");
        }
        for (int i = 0; i < array.Length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.Length - 1 - i];
            array[array.Length - 1 - i] = temp;
        }
        return array;
    }
  
    static void Main(String[] args) 
    { 
        
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        Console.WriteLine("Original array :");
        foreach (int i in input)
        {
            Console.Write(i + " ");
        }
        Console.WriteLine("\nReversed array :" );
        foreach (int i in reverse(input))
        {
            Console.Write(i + " ");
        }
    } 
} 
}