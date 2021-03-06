package classwork.java.khaled;

public class ArrayToMethod {

    public static void main(String[] args) {

        int choices[] = {60,20,50,30,40};
        double numbers[] = {2.0,3.0};
        int choice[] = {10};

        setArray(choices);
        findMin(choice);


    }

    public static void setArray(int numbers[]){


    }

    public static int[] getArray(){
        // Print the array
        return new int[] {60,20,50,30,40};

    }

    public static void findMin(int[] num){
        int minimum = num[0];

        for(int i=1; i<num.length; i++){
            if(minimum > num[i]){
                minimum = num[i];
            }
        }

        System.out.println("Minimum Number is : " +minimum);

    }


    /*  num[3] = {30,20,10,40};
     *   i=1 -->  num[0] > num[1]  ---> 30 > 20  -- > 20
     *   i=2 -->  num[1] > num[2]  ---> 20 > 10 -- 10
     * i=3  -->   num[2] > num [3] --> 10 > 40 --> 10
     *
     *
     * */


}

/*
    System.out.println("Please Enter Your Name: ");
    names[i] = reader.nextLine();
*   names[0] = "abc";   --> addition
*
*
        Press 1 for add  --> add()
        Press 2 for delete --> delete(int index) ,delete(String value)
        Press 3 for edit  --> update()
        press 4 for print  --> print()
        press 5 for exit
*
*
* */

