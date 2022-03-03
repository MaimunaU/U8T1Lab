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

    public static double average(int [] [] ints)
    {
        double sum = 0;
        int count = 0;
        for (int[] row : ints)
        {
            for (int num : row)
            {
                sum +=num;
                count++;
            }
        }
        return sum / count;
    }

    public static int[] indexFound(String [] [] words, String target)
    {
        int[] place = {-1, -1};
        for (int r = 0; r < words.length; r++)
        {
            for (int c = 0; c < words[0].length; c++)
            {
                if (words [r] [c].equals(target))
                {
                    place[0] = r;
                    place[1] = c;
                    return place;
                }
            }
        }
        return place;
    }
}
