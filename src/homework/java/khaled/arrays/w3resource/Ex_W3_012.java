package homework.java.khaled.arrays.w3resource;


public class Ex_W3_012 { // 12. Write a Java program to find the duplicate values of an array of integer values.
    public static void main(String[] args)
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
    }
}
