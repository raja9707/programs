import java.util.*;

public class CommonArrays {


    public int [] result(int a[],int b[]) {

        Arrays.sort(a);
        Arrays.sort(b);


        int len=Math.max(a.length,b.length);

        int ans[]=new int[len];

        int i=0,j=0,k=0;

        while(i<a.length&&j<b.length){



            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){

                j++;
            }

            else{

                ans[k++]=a[i++];

                j++;
            }




        }





return Arrays.copyOfRange(ans,0,k);
    }




        public static void main(String[] args) {
        CommonArrays sol = new CommonArrays();
        int a[]= {4,9,5};
        int b[]= {9,4,9,8,4};

        int res[]=sol.result(a,b);

        for(int i=0;i<res.length;i++){

            System.out.println(res[i]);
        }


    }
}
