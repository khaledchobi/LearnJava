package www.hackerrank.com.others;
// Compare the Triplets

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
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

public class Practice_02 {




    /*static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aliceTotalScore = 0, bobTotalScore = 0;

        for (int i = 0; i < 3; i++) {
            int aliceScore = a.get(i);
            int bobScore = b.get(i);
            if (aliceScore != bobScore) {
                int temp = aliceScore > bobScore ? aliceTotalScore++ : bobTotalScore++;
            }

        }
        List<Integer> result = new ArrayList<>();
        result.add(aliceTotalScore);
        result.add(bobTotalScore);
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }*/

}
