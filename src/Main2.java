public class Main2 {
    public static void main (String [] args)
    {
        System.out.println("PROBLEM 1:");

        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
        for (int r = 0; r < testArr1.length; r++)
        {
            for (int c = 0; c < testArr1[0].length; c++)
            {
                System.out.println(testArr1 [r] [c]);
            }
        }

        System.out.println("---------");
        for (int[] row : testArr1)
        {
            for (int element : row)
            {
                System.out.println(element);
            }
        }

        System.out.println("---------");
        for (int c = 0; c < testArr1[0].length; c++)
        {
            for (int r = 0; r < testArr1.length; r++)
            {
                System.out.println(testArr1 [r] [c]);
            }
        }

        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
        for (String[] row : testArr2)
        {
            for (String word : row)
            {
                System.out.println(word);
            }
        }

        System.out.println("---------");
        for (int c = 0; c < testArr2[0].length; c++)
        {
            for (int r = 0; r < testArr2.length; r++)
            {
                System.out.println(testArr2 [r] [c]);
            }
        }
    }
}
