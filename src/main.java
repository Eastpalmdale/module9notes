import java.util.*;

public class main {
    public static void main(String[] args) {


        int [] myArray = new int [100];

        int count = 0;


        for (int i = 0; i < 100; i ++ ){

            myArray[i] = count;

            count +=2;

        }
        for (int i = 0; i <= 100; i ++ ){

            System.out.print(myArray[i] + " | ");
        }



    }


}
