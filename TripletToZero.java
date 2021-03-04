
import java.util.*;


public class TripletToZero {


    public static void main(String args[]) {


        int a[] = new int[]{0, 0, 0, 0,};

        findSum(a);

    }

    private static void findSum(int[] a) {
        Arrays.sort(a);
        int len = a.length;


        for (int i = 0; i < len; i++) {

            int left = i + 1;
            int right = len - 1;
            int x = a[i];

            while (left < right) {

                if (a[left] + x + a[right] == 0) {


                    System.out.println("The triplet" + a[left] + " " + a[i] + " " + a[right]);
                    left++;
                    right--;

                }

                if (a[left] + x + a[right] < 0) {


                    left++;

                }
                else

                    right--;



            }
        }


    }
}


