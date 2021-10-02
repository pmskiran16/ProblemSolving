import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MigratoryBirds_E {
    public static void main(String[] args) {
        System.out.println(migratoryBirds(Arrays.asList(1, 1, 2, 2, 3)));
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] elementsCnt= new int[5];
        arr.forEach(i->{
            elementsCnt[i-1]++;
        });

        int max = Arrays.stream(elementsCnt).max().getAsInt();
        int i = 0;

        for(i=0; i<elementsCnt.length; i++)
            if(max == elementsCnt[i])
                break;

        return i+1;
    }

}
