import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        String [] [] seatingChart = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Kathy", "Fred", "Jill", "Matt"}
        };

        for (String[] names : seatingChart)
        {
            System.out.println(Arrays.toString(names));
        }

        seatingChart [1] [2] = "Paul";
        System.out.println();

        for (String[] names : seatingChart)
        {
            System.out.println(Arrays.toString(names));
        }

        String temp = seatingChart [0] [0];
        seatingChart [0] [0] = seatingChart [2] [3];
        seatingChart [2] [3] = temp;
        System.out.println();

        for (String[] names : seatingChart)
        {
            System.out.println(Arrays.toString(names));
        }

        String[] tempRow = seatingChart [0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempRow;
        System.out.println();

        for (String[] names : seatingChart)
        {
            System.out.println(Arrays.toString(names));
        }
    }
}
