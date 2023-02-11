
public class Question1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6};
        int i=0;
        int n = 1;
        while(n<arr[arr.length-1]){
            if(arr[i]!=n){
                System.out.println(n);
                n++;
                
            }
            else {
                i++;
                n++;
            }
        }
    }
}