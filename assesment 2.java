public class Main {
    public static void main(String[] args) {
        int [] arr = new int [] {1,2,1,1,2,3,3,3,3,6,6,7,7,7};
        int [] count = new int[100];
        int i,tmp = 0;
        for(i = 0; i < arr.length; i++){
                tmp = arr[i];
                count[tmp]++;
        }
        for(i=1; i < count.length; i++){
            if(count[i] > 0 && count[i] == 1){
                System.out.printf("%d occurs %d times\n",i, count[i]);
             }
            else if(count[i] >= 2){
                System.out.printf("%d occurs %d times\n",i, count[i]);
            }
         }
    }
}