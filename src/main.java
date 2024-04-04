import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] myArray = new int [100];

        int count = 0;

        for (int i = 0; i < 100; i ++ ){

            myArray[i] = count;

            count +=2;

        }

        for (int i = 0; i < 100; i ++ ){

            System.out.print(myArray[i] + " | ");
        }

        do {
            System.out.println("Type in a locus");

            int myLocus = safeinput.getRangedInt(in, "My locus: ", 0, 99);

            System.out.println();
            System.out.println("The value at "+myLocus+" was "+myArray[myLocus]);


        } while (safeinput.getYNConfirm(in, "Do you have another locus?"));


    }


}
