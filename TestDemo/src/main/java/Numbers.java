import java.util.*;

public class Numbers {


        public static void main(String[] args) {
            calc(7,-3,4,5,6,0,242,100,34,-12,-123,123,-12345,31,100,53,21400);
        }
        public static void calc (int ... a){
            int u = 0,
                    count = 0;

            for (int i = 0; i < a.length; i++) {
                if(a[i]>=0)
                    count++;
            }
            for(int i = a.length-1 ; i > 0 ; i--){

                for(int j = 0 ; j < i ; j++){

                    if( a[j] < a[j+1] ){
                        int tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }
            }
            int[] b = new int[count];
            for (int i = 0; i < a.length; i++) {
                if(a[i]>=0){
                    b[u] = a[i];
                    u++;
                }
            }

            System.out.println("\n По убыванию : "+ Arrays.toString(b));

        }
    }

