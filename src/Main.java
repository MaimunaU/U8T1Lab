import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        /*
        String [] [] seatingChart = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
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
         */

        /*
        int [] [] arr1 = new int [2] [3];
        int [] [] arr2 = new int [3] [2];

        for (int[] nums : arr1)
        {
            System.out.println(Arrays.toString(nums));
        }
        for (int[] nums : arr2)
        {
            System.out.println(Arrays.toString(nums));
        }

        arr1 [0] [0] = 1;
        arr1 [0] [1] = 2;
        arr1 [0] [2] = 3;
        arr1 [1] [0] = 4;
        arr1 [1] [1] = 5;
        arr1 [1] [2] = 6;

        for (int[] nums : arr1)
        {
            System.out.println(Arrays.toString(nums));
        }

        arr2 [0] [0] = 1;
        arr2 [1] [0] = 2;
        arr2 [2] [0] = 3;
        arr2 [0] [1] = 4;
        arr2 [1] [1] = 5;
        arr2 [2] [1] = 6;

        for (int[] nums : arr2)
        {
            System.out.println(Arrays.toString(nums));
        }
         */
        /*
        int [] [] nums1 = {{5, 2}, {1, 3}, {7, 9}};
        int [] [] nums2 = {{1, 2, 3}, {6, 5, 4}};
        int [] [] nums3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        int [] [] nums4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        int [] [] nums5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        int [] [] nums6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        int [] [] nums7 = {{4}, {7}, {8}, {2}};
        int [] [] nums8 = {{4}};
        int [] [] nums9 = {{}};

        System.out.println(FunWith2DArrays.totalElements(nums1));
        System.out.println(FunWith2DArrays.totalElements(nums2));
        System.out.println(FunWith2DArrays.totalElements(nums3));
        System.out.println(FunWith2DArrays.totalElements(nums4));
        System.out.println(FunWith2DArrays.totalElements(nums5));
        System.out.println(FunWith2DArrays.totalElements(nums6));
        System.out.println(FunWith2DArrays.totalElements(nums7));
        System.out.println(FunWith2DArrays.totalElements(nums8));
        System.out.println(FunWith2DArrays.totalElements(nums9));
         */
        /*
        String [] [] words1 = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        String [] [] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        String [] [] words3 = {{"phone", "mouse", "keyboard"}};
        String [] [] words4 = {{"cat"}, {"dog"}, {"hamster"}, {"bird"}};
        String [] [] words5 = {{"time"}};

        FunWith2DArrays.fourCorners(words1);
        FunWith2DArrays.fourCorners(words2);
        FunWith2DArrays.fourCorners(words3);
        FunWith2DArrays.fourCorners(words4);
        FunWith2DArrays.fourCorners(words5);
         */
        /* TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));
         */
        /* TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));
         */
    }
}
