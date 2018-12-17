package com.manny;

public class Main {

    public static void main(String[] args) {
        // Operators are special symbols that perform specific operations on one, two or three operands
        // and then return a result

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("result is now " + result);
        result++;
        System.out.println("result is now " + result);
        result--;
        System.out.println("result is now " + result);

        result += 2;
        System.out.println("result is now " + result);
        result *= 10;
        System.out.println("result is now " + result);
        result -= 10;
        System.out.println("result is now " + result);
        result /= 10;
        System.out.println("result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if(topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score but less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        //Challenge
        // 1. Create a double variable with the value of 20
        // 2. Create a second variable of type double with the value of 80
        // 3. Add both number up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays the message "Total was over the limit",
        //    if the remaining total (#4) is equal to 20 or less

        double myDouble = 20d;
        double mySecondDouble = 80d;

        double myDoubleTotal = (myDouble + mySecondDouble) * 25;
        System.out.println("myDoubleTotal = " + myDoubleTotal);
        double theRemainder = myDoubleTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if(theRemainder <= 20)
            System.out.println("Total was over the limit");




    }
}
