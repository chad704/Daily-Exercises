import java.util.Scanner;
public class Control_Flow {

        public static void main(String args[])
        {
            /*scanner reads input from the command line through various methods*/
            Scanner scanner = new Scanner(System.in);

            char answers;


            /*Do-While loop uses Scanner to prompt inputs from you through terminal, then looks for a condition to be true in the While statement, in order to run again */

//            do {
//
//                /*prompt and read a string*/
//                System.out.print("Enter your name: ");
//                String username = scanner.next();
//
//                /*prompt and read an int*/
//                System.out.print("Enter your age: ");
//                int age = scanner.nextInt();
//
//
//
//                System.out.println(String.format("Hello %s, your age is %d",
//                        username,
//                        age));
//
//                if (age >= 16) {
//                    System.out.println("You are old enough to drive");
//                }
//                if (age >= 18) {
//                    System.out.println("You are old enough to vote");
//                }
//                if (age >= 21) {
//                    System.out.println("You are old enough to drink");
//                }
//                if (age >= 35) {
//                    System.out.println("You are old enough to be President");
//                }
//                if (age >= 55) {
//                    System.out.println("You can join AARP");
//                } else {
//                    System.out.println("You can not join AARP");
//                }
//                if (age >= 67) {
//                    System.out.println("You can starting drawing Social Security");
//                } else {
//                    System.out.println("You can not starting drawing Social Security");
//                }
//
//                System.out.print("Do you want to change your answers (yes or no): ");
//
//                answers = scanner.next().toLowerCase().charAt(0);
//
//             /*if answered yes, the first character (charAt(0))^ will be used to identify if needed to loop again*/
//            }while(answers == 'y');
//
//            System.out.print("Enter your employment status (E-employed, U-unemployed, or S-student): ");
//            String employment = scanner.next();
//
//            System.out.print("Enter your vehicle (1-car, 2-truck, 3-suv, 4-other: ");
//            String vehicle = scanner.next();
//
//            switch(employment) {
//                case "E" :
//                    System.out.println("You are employed");
//                    break;
//
//                case "U" :
//                    System.out.println("You are unemployed");
//                    break;
//
//                case "S" :
//                    System.out.println("You are a student");
//                    break;
//                default :
//                    System.out.println("Invalid response");
//            }
//
//            switch(vehicle) {
//                case "1" :
//                    System.out.println("You drive a car");
//                    break;
//
//                case "2" :
//                    System.out.println("You drive a truck");
//                    break;
//
//                case "3" :
//                    System.out.println("You drive an SUV");
//                    break;
//
//                case "4" :
//                    System.out.println("You drive something other than a car, truck, or SUV");
//                    break;
//
//                default :
//                    System.out.println("Invalid response");
//            }

//            int[] myArray = new int[30];
//
//            for(int i=0; i<myArray.length; i++){
//                myArray [i] = i;
//                System.out.println(myArray[i]);
//            }
//
//            for (int i : myArray){
//                System.out.println(i);
//            }
//
//            for (int i=0; i<myArray.length; i++){
//                myArray [i] = i*2;
//                System.out.println(myArray[i]);
//            }
//
//            for (int i : myArray){
//                System.out.println(i);
//            }
//
//            for (int i = myArray.length-1; i>=0; i--){
//                System.out.println(myArray[i]);
//            }



//            int i = 0;
//
//                while(i<myArray.length){
//                    System.out.println(myArray[i++]);
//                };
//
//                while(i>0){
//                    System.out.println(myArray[--i]);
//                };


            System.out.println(step5(7));


        }


    public static int step5(int number){


        int[] myArray = new int[30];

        /*variable to help keep a running sum of all even numbers*/
        int evenSum = 0;

                for(int i=0; i<myArray.length; i++){
                    myArray [i] = i;
                    if (i == number){
                        break;
                    }else if(i%2 == 1){
                        System.out.println(i);
                    }else if(i%2 == 0){
                        evenSum+=i;       /*adds each even integer to the evenSum variable to keep running sum of even integers*/
                    }

           }

           return evenSum;

    }


}

