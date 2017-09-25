/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 8 Chapter 8
* Computer Configuration
* Due Date: 09/24/17*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class IdenticalArrays {

    public static void main(String[] args) {

            int[][] m1 = new int[3][3];
            int[][] m2 = new int[3][3];

            Scanner input = new Scanner(System.in);
            System.out.print("Enter list1: ");
            for (int i = 0; i < m1.length; i++)
                for (int j = 0; j < m1[i].length; j++)
                    m1[i][j] = input.nextInt();
            System.out.print("Enter list2: ");
            for (int i = 0; i < m2.length; i++)
                for (int j = 0; j < m2[i].length; j++)
                    m2[i][j] = input.nextInt();

            if (equals(m1, m2)) {
                System.out.println("The two arrays are identical.");
            } else {
                System.out.println("The two arrays are not identical.");
            }
        }

        public static boolean equals(int[][] m1, int[][] m2) {

            List<Integer> m1new = new ArrayList<>();
            for (int[] row : m1) {
                for (int num : row) {
                    m1new.add(num);
                }
            }
            Collections.sort(m1new);
            List<Integer> m2new = new ArrayList<>();
            for (int[] row : m2) {
                for (int num : row) {
                    m2new.add(num);
                }
            }
            Collections.sort(m2new);
            return m1new.equals(m2new);
    }
}
