package Loop;

import java.util.Scanner;

public class SumOfValues {
    //    A program which reads sequence of integers from users and stop by displaying Done when the sum of these values exceeds 100
    static void main(String[] args) {
        sum();
    }

        public static void sum(){
            Scanner s = new Scanner(System.in);
            int sum = 0;
//            while(true)

           do {
//                int userNum = s.nextInt();

                System.out.print("Enter a number: ");

//                sum += userNum;
                sum += s.nextInt();
//                if (sum > 100)
//                    break;
            }  while (sum <=100);

            System.out.println("Done " + sum);
        }
}
