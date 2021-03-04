import java.util.*;
public class UncommonArrays {


    public void result(int a[],int b[]){

        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0,k=0;

        int len = Math.max(a.length,b.length);

        int[] ans;

        ans = new int[len];
        while(i<a.length&&j<b.length){

            if(a[i]<a[j]){


                System.out.println(a[i]);
                i++;

            }


            else if(a[i]>a[j]){


                System.out.println(a[j]);
                j++;
            }


            else{

                i++;
                j++;
            }

        }





    }



    public static void main(String[] args) {
        UncommonArrays sol = new UncommonArrays();
        int a[]= {1, 2,3,4};
        int b[]= { 4, 5,6,7,8};

        sol.result(a,b);


    }
}