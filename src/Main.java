public class Main {
    public static void main (String[]args) {
        /*
        for (int i = 1; i <= 10; i ++) {
            System.out.print(i + " ");
        }

        for (int i = 1; i < 11; i ++) {
            System.out.print(i + " ");
        }

        for (int i = 15; i >= 0; i --) {
            System.out.print(i + " ");
        }

        for (int i = 16; i >= 1; i --) {
            System.out.print(i - 1 + " ");
        }

        for (int i = 0; i <= 15; i += 1) {
            if (i % 2 == 0) {
                i ++;
            }
            System.out.print(i + " ");
        }

        for (int i = 1; i <= 15; i += 2) {
            System.out.print(i + " ");
        }

        int sum = 0;
        int x = 5;
        for (int i = 0; i < 10 + x; i += 2) {
            sum += i;
        }
        System.out.println(sum);


        int i = 20;
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 3;
        }

        for (int j = 0; j <= 100; j += 5) {
            System.out.print(j + " ");
        }

        for (int k = 3; k < 11; k ++) {
            System.out.print(k + 1 + " ");
        }

        for (int m = 3; m <= 14; m ++) {
            if (m % 2 == 0) {
                System.out.print(m + " ");
            }
        }

        for (int i = 6; i <= 100; i += 6) {
            System.out.print(i + " ");
        }

        for (int i = 1; i <= 100; i ++) {
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

*/

        int j = 0;
        int sum = 0;
        for (int i = 6; j <= i; i--)
        {
            j++;
            sum += i + j;
        }
        System.out.println(sum);

        int num = 100;
        for (int count = 1; count <= num; count++)
        {
            System.out.print(num + " ");
            num = num / 2;
        }

    }
}
