package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        int n = 9;
        int result = 1;


        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                System.out.println("*|1 2 3 4 5 6 7 8 9");
                System.out.println("---------------------");

            }


            System.out.print(i+"|");

            for (int j = 1; j <= n; j++) {
                result = i * j;

                System.out.print(result + " ");


            }
            System.out.println();
        }
    }
}
