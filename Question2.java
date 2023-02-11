
import java.util.HashSet;
import java.util.Set;
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 4, 3, 4, 1, 5, 3, 5};
        Set<Integer> s = new HashSet<>();
        for(int ele:arr){
            s.add(ele);
        }
        for (int ele : s) {
            System.out.print(ele+" ");
        }

    }
}
