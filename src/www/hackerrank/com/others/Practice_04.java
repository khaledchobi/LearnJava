package www.hackerrank.com.others;
// Diagonal Difference..
import javax.xml.transform.Result;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class Practice_04 {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

   /* public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftdiagonal = 0, rightdiagonal = 0;
        for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }


}*/


/*
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
*/

}

/*
for(int j = 0; j < numInputs; j++){
        for(int k = 0; k < numInputs; k++){
            cin >> curInput;
            if(j == k){
                leftD += curInput;
            }
            if(j+k == (numInputs-1)){
                rightD += curInput;
            }
        }
    }
    ans = abs(leftD-rightD);*/

    /*public static int diagonalDifference(List<List<Integer>> arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            leftSum += arr.get(i).get(i);
            rightSum += arr.get(i).get(arr.size() - (1 + i));
        }

        return Math.abs(leftSum - rightSum);
    }*/
