package learn.java.day11.array;

public class Test_010 {
    public static void main(String[] args) {

        String[] array = new String[]{"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        int n = 6;
        System.out.println("String of array sorted in ascending order: ");
        printInSortedOrder(array, n);

    }

    // function to print strings in sorted order
    static void printInSortedOrder(String arr[], int n) {
        int index[] = new int[n];
        int i, j, min;

        // Initially the index of the strings
        // are assigned to the 'index[]'
        for (i = 0; i < n; i++) {
            index[i] = i;
        }

        // selection sort technique is applied
        for (i = 0; i < n - 1; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                // with the help of 'index[]'
                // strings are being compared
                if (arr[index[min]].compareTo(arr[index[j]]) > 0) {
                    min = j;
                }
            }

            // index of the smallest string is placed
            // at the ith index of 'index[]'
            if (min != i) {
                int temp = index[min];
                index[min] = index[i];
                index[i] = temp;
            }
        }

        // printing strings in sorted order
        for (i = 0; i < n; i++) {
            System.out.print(arr[index[i]] + " ");
        }
    }
/*public static void main(String[] args){
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        //User will be asked to enter the count of strings
        System.out.println("Enter number of strings you would like to enter:");
        count = scan.nextInt();


        String arr[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++){
            arr[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        //Sorting the strings
        for (int i = 0; i < count; i++){
            for (int j = i + 1; j < count; j++) {
                if (arr[i].compareTo(arr[j])>0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //Displaying the strings after sorting them based on alphabetical order
        System.out.println("Strings in Sorted Order:");

        for (int i = 0; i <= count - 1; i++){
            System.out.print(arr[i] + ", ");
        }
    }*/
}
