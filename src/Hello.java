public class Hello {

    public  static void main(String[] args) {

        System.out.println("Hello, newbie!");

        int myFirstNumber = (10+5) + (2*10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber+mySecondNumber+myThirdNumber;

        int myLastOne = 1000 -myTotal;

        System.out.println(myLastOne);




        //Primitive data types

        int myMinValue = -2147483648;
        int myMaxValue = 2_147_483_647;

        byte myByteValue = -128;
        //max is 127 like MIDI interface ;)

        short myShortValue = -32768;
        //max is 32767

        long myLongValue = -9_223_372_036_854_775_807L;
        //long has a width of 64, int 32, short 16, byte 8

        //casting into long
        long longTotal = 50000L + 10L * (myShortValue + myByteValue + myMaxValue);
        System.out.println("longTotal = " + longTotal);


        //Section3.21 Char and Boolean (unicode table website used to generate this copyright symbol)
        char myChar1 = '&';
        char myCharUnicode = '\u00A9';
        System.out.println(myCharUnicode);

        boolean myBoolean = false;
        boolean isMale = true;


        //Section3.22 String data type

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("lastString value: " + lastString);


        // Section 3.23 Operators in Java

        int result = 1 + 2;
        System.out.println("1 + 2 = " +result);

        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " -1 = " +result);

        result = result *10;
        System.out.println(previousResult + " * 10 = " +result);

        result = result /5;
        System.out.println(previousResult + " / 5 = " +result);

        previousResult = result;
        result = result %3;
        System.out.println(previousResult + " % 3 = " +result);

        result++;
        System.out.println("result is now " +result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");


    }
}
