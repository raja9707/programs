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

            if(a[i]<b[j]){


                System.out.println(a[i]);
                i++;

            }


            else if(a[i]>b[j]){


                System.out.println(b[j]);
                j++;
            }


            else{

                i++;
                j++;
            }

        }

while(i<a.length/*&&a[i]!=b[j]*/){

    System.out.println(a[i]);
    i++;

}

        while(j<b.length/*&&a[i]!=b[j]*/){

            System.out.println(b[j]);
            j++;

        }



    }



    public static void main(String[] args) {
        UncommonArrays sol = new UncommonArrays();
        int a[]= {1, 4, 6, 9, 12,14,25};
        int b[]= {2, 4, 7, 8, 9, 10,13,18,20,21};

        sol.result(a,b);


    }
}