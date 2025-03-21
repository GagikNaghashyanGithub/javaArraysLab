public class ArrayLab {
    public static void main(String[] args) {
        System.out.println("1. Print numbers from 1 to 15");

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n2. Print even numbers from -10 to 20");

        for (int i = -10; i <= 20; i++)
            if (i % 2 == 0)
                System.out.print(i + " ");

        System.out.println();

        for (int i = -10; i <= 20; i += 2)
            System.out.print(i + " ");


        System.out.println("\n\n3. Print * symbols using given number");
        int n = 7;
        // *
        // **
        // ***
        // ****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\n4. Print * symbols using given number in reverse mode");
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("\n5. Create an array with number 1-11");

        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n\n6. Create and array with even numbers from -10 to 10");

        int[] array2 = new int[11];

        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println("\n\n7. Given an array. print odd elements");

        int[] array3 = {4, 0, 5, 87, 9, 4, 1, 2, 3, 56, 4};

        for (int i : array3)
            if (i % 2 != 0)
                System.out.print(i + " ");

        System.out.println("\n\n8. Given an array. print elements from -10 to 5");

        for (int i : array3)
            if (i >= -10 && i <= 5)
                System.out.print(i + " ");

        System.out.println("\n\n9. Given an array. print elements which can be divided 3 or 4");

        for (int i : array3)
            if (i % 3 == 0 || i % 4 == 0)
                System.out.print(i + " ");

        System.out.println("\n\n10. Given an array. print count of odd elements");
        int counterOfOdd = 0;

        for (int i : array3)
            if (i % 2 == 1)
                counterOfOdd++;

        System.out.println("Count of odd elements is " + counterOfOdd);

        array3 = new int[]{4, -1, 10, 9, 3, 45, 60};

        System.out.println("\n11. Given an array. print sum of elements");
        int sum = array3[0];

        for (int i = 1; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        System.out.println(sum);

        System.out.println("\n12. Given an array. print sum of positive elements");
        sum = 0;

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0)
                sum += array3[i];
        }

        System.out.println(sum);

        System.out.println("\n13. Given an array. print multiplication of positive elements");
        int m = array3[0];
        for (int i = 1; i < array3.length; i++) {
            m = m * array3[i];
        }
        System.out.println(m);

        System.out.println("\n14. Find max element from array");
        int max = array3[0];

        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max)
                max = array3[i];
        }
        System.out.println(max);

        System.out.println("\n15. Find min element from array");

        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min)
                min = array3[i];
        }
        System.out.println(min);

        System.out.println("\n16. Find element which is alone");
        array3 = new int[]{ 8, 5, 2, 10, 8, 5, 10 };
        int result = array3[0];

        for (int i = 1; i < array3.length; i++) {
            result = result ^ array3[i];
        }
        System.out.println(result);

        array3 = new int[]{100, 4, -1, 12, 90, 2, 0};

        int x = 4, y = 3;
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + " y = " + y);

        System.out.println("\n17. Sort array in asc.");

        for (int i : array3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        boolean whileIfEnter = true;

        int countOfFor = 0;

        while (whileIfEnter) {
            whileIfEnter = false;
            for (int i = 0; i < array3.length - 1 - countOfFor; i++) {
                if (array3[i] > array3[i + 1]) {
                    int zz = array3[i];
                    array3[i] = array3[i + 1];
                    array3[i + 1] = zz;
                    whileIfEnter = true;
                }
            }
            countOfFor++;
        }

        for (int i : array3) {
            System.out.print(i + " ");
        }
    }
}
