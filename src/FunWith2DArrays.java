import java.util.Arrays;
public class FunWith2DArrays {
    public static int totalElements(int [] [] ints)
    {
        int total = 0;
        for (int[] nums : ints)
        {
            total += nums.length;
        }
        return total;
    }

    public static void fourCorners(String [] [] words)
    {
        String[] row1 = words [0];
        String[] lastRow = words [words.length - 1];
        System.out.println(words [0] [0] + "\n" + words [0] [row1.length - 1] + "\n"
                + words [words.length - 1] [0] + "\n" + words [words.length - 1] [lastRow.length - 1]);
    }
}
