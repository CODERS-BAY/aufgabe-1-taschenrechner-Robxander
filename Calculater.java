import java.util.Scanner;

public class Calculater {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);
        int chooseIntOrFloat = 0;
        boolean chosedInt = false;
        boolean chosedFloat = false;


        System.out.println("Choose between floating-point and integer operations:");
        System.out.println("1) integer");
        System.out.println("2) floating");
        System.out.println("Input the according number (integer or float): ");
        chooseIntOrFloat = readNumber(); // should be 1 or 2



        // make the chosed Integer or Float true (boolean)
        if (chooseIntOrFloat == 1) {
            chosedInt = true;
            System.out.println("You have chosen INTEGER ");
        } else if (chooseIntOrFloat == 2) {
            chosedFloat = true;
            System.out.println("You have chosen FLOAT ");
        } else {
            System.out.println("falsche Eingabe");
        }

        //read the number depending of integer and float
        int integerNumber1 = 0;
        int integerNumber2 = 0;
        float floatNumber1 = 0f;
        float floatNumber2 = 0f;

        System.out.println("Input the first number:");

        if (chosedInt) {
            integerNumber1 = readNumber();
            System.out.println("Input the scecond number:");
            integerNumber2 = readNumber();
        } else {
            floatNumber1 = readFloatNumber();
            System.out.println("Input the scecond number:");
            floatNumber2 = readFloatNumber();
        }

        //print the options of chosed INTEGER or FLOAT
        if (chosedInt) {
            writeOptionInteger();
        } else {
            writeOptionFloat();
        }

        System.out.println("Choose one of the operator:");
        int operator = readNumber();
        int integerCulc = 0;
        float floatCulc = 0f;

//Calculate the calculation
        if (chosedInt) {
            integerCulc = calcInteger(integerNumber1, integerNumber2, operator);
            System.out.println(" ");
            System.out.println("Result: " + integerCulc);
            checkNumberOddEven(integerCulc);
        } else {
            floatCulc = calcFloat(floatNumber1, floatNumber2, operator);
            System.out.println(" ");
            System.out.println("Result: " + floatCulc);
            checkNumberOddEven(floatCulc);
        }


    }

////////////////////////////////////////////////////////////////////////////////////////////////
// METHODEN

    static int readNumber() {
       // Scanner scanner = new Scanner(System.in);
        int chooseIntOrFloat = Integer.parseInt(scanner.nextLine());
        return chooseIntOrFloat;
    }

    static float readFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        float floatNumber = Float.parseFloat(scanner.nextLine());
        return floatNumber;
    }


    static void writeOptionInteger() {
        System.out.println("You have the following options with integer:");
        System.out.println("1) addition");
        System.out.println("2) subtraction");
        System.out.println("3) division");
        System.out.println("4) modulo");
    }

    static void writeOptionFloat() {
        System.out.println("You have the following options with floating points:");
        System.out.println("1) addition");
        System.out.println("2) subtraction");
        System.out.println("3) division");
    }

    static int calcInteger(int number1, int number2, int intOperator) {
        int integerCulc = 0;
        switch (intOperator) {
            case 1:
                return integerCulc = number1 + number2;

            case 2:
                return integerCulc = number1 - number2;

            case 3:
                return integerCulc = number1 / number2;

            case 4:
                return integerCulc = number1 % number2;

        }
        return integerCulc;
    }

    static float calcFloat(float number1, float number2, int floatOperator) {
        float floatCulc = 0f;
        switch (floatOperator) {
            case 1:
                return floatCulc = number1 + number2;

            case 2:
                return floatCulc = number1 - number2;

            case 3:
                return floatCulc = number1 / number2;

        }
        return floatCulc;
    }

    static void checkNumberOddEven(float number){
        float culc = number % 2;
        if (culc == 0){
            System.out.println("The result is even");
        } else {
            System.out.println("The result is odd");
        }
    }
}
