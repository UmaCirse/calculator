private static final String[] SIGNS = {"+", "-", "/", "*"};


void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Uma's calculator! <3");


    int continueNewCalculation = 0;
    do {
        runNewCalculator(scanner);



        System.out.print("Would you like to continue? Y/N >> ");
        String continueCalculation = scanner.nextLine();
        if ("y".equalsIgnoreCase(continueCalculation) || "yes".equalsIgnoreCase(continueCalculation)) {
            continueNewCalculation = 1;
        } else if ("n".equalsIgnoreCase(continueCalculation) || "no".equalsIgnoreCase(continueCalculation)) {
            continueNewCalculation = 2;
        }

    } while (continueNewCalculation < 2);

    System.out.println("\nThanks for choosing Uma's Calculator!");
    IO.println("We are waiting for you again!");
}

private void runNewCalculator(Scanner scanner) {

    System.out.print("Please enter the expression >> ");
    String input = scanner.nextLine();
    String[] splittedInput = input.split(" ");
    int numbersArraySize = 0;
    int signsArraySize = 0;
    for (String element : splittedInput) {
        boolean isSign = isSign(element);
        if (isSign) {
//            signsArraySize = signsArraySize + 1;
//            signsArraySize += 1;
            signsArraySize++;
        } else {
            numbersArraySize++;
        }
    }
    int[] numbersArray = new int[numbersArraySize];
    char[] signsArray = new char[signsArraySize];
    int numberArrayIndex = 0;
    int signArrayIndex = 0;
    for (String element : splittedInput) {
        if (isSign(element)) {
            signsArray[signArrayIndex] = element.toCharArray()[0];
            signArrayIndex++;
        } else {
            numbersArray[numberArrayIndex] = Integer.parseInt(element);
            numberArrayIndex++;
        }
    }
    double result = numbersArray[0];
    for (int i = 0; i < signsArraySize; i++) {
        result = calculateResult(result, numbersArray[i + 1], signsArray[i]);
    }
    System.out.println(result);
//    System.out.printf("Result: %.3f\n", result);
}

private boolean isSign(String el) {
    boolean isSign = false;
    for (String sign : SIGNS) {
        if (el.equals(sign)) {
            isSign = true;
            break;
        }
    }
    return isSign;
}

private void runOldCalculator(Scanner scanner) {IO.print("Please enter first number >> ");
    int firstNumber = scanner.nextInt();


    System.out.print("Please enter sign >> ");
    String sign = scanner.next();

    System.out.print("\nPlease enter second number >> ");
    int secondNumber = Integer.parseInt(IO.readln());

    double result = 666;
    boolean isValidSign = true;
    switch (sign) {
        case "+":
            result = firstNumber + secondNumber;
            break;
        case "-":
            result = firstNumber - secondNumber;
            break;
        case "*", "x":
            result = firstNumber * secondNumber;
            break;
        case "/", ":":
            result = firstNumber / (secondNumber * 1.0);
            break;
        default: {
            System.out.println("Wrong sign!");
            isValidSign = false;
        }

    }
    if (isValidSign) {
        printCalculationResult(firstNumber, secondNumber, sign, result);
    }}

private void printCalculationResult(int firstNumber, int secondNumber, String sign, double result) {
    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result);}

private double calculateResult(double firstNumber, int secondNumber, char sign) {
    switch (sign) {
        case '+':
            return firstNumber + secondNumber;
        case '-':
            return firstNumber - secondNumber;
        case '*', 'x':
            return firstNumber * secondNumber;
        case '/', ':':
            return firstNumber / secondNumber;
        default: {
            System.out.println("Wrong sign!");
            return firstNumber;
        }
    }
}

