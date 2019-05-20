public class lab1 {

    public static void main(String[] args) {

        step1();
        step3();
        step4();
        anotherMethod();
        playWithStrings();

    }

    /*Part 1-Declaring & Initializing Variables*/

    public static void step1() {

        int firstInt = 6;

        System.out.println(firstInt);

        int secondInt = 20;

        System.out.println(secondInt);

        int thirdInt = 0;

        System.out.println(thirdInt);

        float variable = 4.4f;

        System.out.println(variable);

        boolean isCold = false;

        System.out.println(isCold);

        double doubleValue = 10_200;

        System.out.println(doubleValue);


    /*Part 2-Calculations w/ Multiple Variables*/


        System.out.println(firstInt + secondInt);

        System.out.println(firstInt + thirdInt);

        System.out.println(secondInt / firstInt);

        int fourthInt = secondInt % firstInt;

        System.out.println(fourthInt);

        int lastPartStep2 = (fourthInt + firstInt);

        System.out.println(++lastPartStep2); /* to increment put the ++ BEFORE variable name, otherwise it wil print variable value followed by the incremented variable value*/

    }

    /*Part 3*/

    public static void step3() {

        int x = 100;

        boolean compare = x == 100;

        int y = 106;

        boolean compare2 = x > y;
        System.out.println(compare2);
        boolean compare3 = y > x;
        System.out.println(compare3);
        boolean compare4 = x > (y - 6);
        System.out.println(compare4);

        int z = 92;

        boolean compareMultiple = x < y && y < z;
        System.out.println(compareMultiple);
        boolean compareMultiple2 = y < z && x >= y;
        System.out.println(compareMultiple2);
        boolean compareMultiple3 = z > y + x && x - y < z;
        System.out.println(compareMultiple3);

        boolean compareMultiple4 = (x < y) == !(x > y);
        System.out.println(compareMultiple4);

    }

    /*Step 4*/

    public static void step4() {

        int n = 41;
        int nShiftRight = n >> 1;
        System.out.println(nShiftRight);
        System.out.println(nShiftRight == n / 2); /*Proves that shifting n to the right is half of n*/
        int nShiftLeft = n << 1;
        System.out.println(nShiftLeft == n * 2); /*Proves that shifting n to the left is double n*/
        int nShiftLeft2 = n >> 2;
        System.out.println(nShiftLeft2);

    }

    /*Step 5 & 6*/

    public static void anotherMethod() {

        Integer anotherInt = 15;
        Integer anotherInt2 = Integer.valueOf("1000");


        if (anotherInt.compareTo( anotherInt2 )>0){
            System.out.println(anotherInt + " is a Big Value");
        }else{
            System.out.println(anotherInt + " is definitely small");
        }

    }

    /*Step 7*/

    public static void playWithStrings(){

        String firstName = "Chad";
        String lastName = new String ("Antonides");
        String fullName = firstName + " " + lastName;
        System.out.println("Hello "+(firstName)+(" ")+(lastName)); //concatenates 2 String variables
        System.out.println(fullName.length());      //finds the length of a String variable
        System.out.println(fullName.indexOf("z"));  //finds the index of a character or returns -1 if no such character exists
        System.out.println(fullName.charAt(7));     //finds the index of a character
        System.out.println(fullName.contains("son"));//looks if the variable contains these characters in sequential order and returns T or F
        System.out.println(fullName.substring(9,14));//takes the characters between 2 index values of a variable
        System.out.println(fullName.contains("-") || fullName.contains("'"));//looks to see if a variable contains >1 conditions

        System.out.println(String.format("The total length of the String %s is %s ",
                fullName,
                fullName.length()
        ));
        System.out.println(String.format("The String %s does not have a Z %s.",
                fullName,
                fullName.indexOf("z")
                ));
        System.out.println(String.format("The letter %s is at position 7.",
                fullName.charAt(7)
        ));

    }

}