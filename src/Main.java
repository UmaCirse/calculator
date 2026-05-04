void main() throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to Uma's calculator! <3");
    IO.print("Please enter first number >> ");
    int firstNumber = scanner.nextInt();

    System.out.print("Please enter sign >> ");
    String sign = scanner.next();

    System.out.print("Please enter second number >> ");
    int secondNumber = Integer.parseInt(IO.readln());


//    if ("+".equals(sign)) {
//        result = firstNumber + secondNumber;
//    } else if ("-".equals(sign)) {
//        result = firstNumber - secondNumber;
//    } else if ("*".equals(sign) || "x".equals(sign)) {
//        result = firstNumber * secondNumber;
//    } else if ("/".equals(sign) || ":".equals(sign)) {
//        result = (double) firstNumber / (secondNumber * 1.0);
//    } else {
//        isValidSign = false;
//        System.out.println("Wrong sign!");
//    }
//    if (isValidSign) {
//        printCalculationResult(firstNumber, secondNumber, sign, result);
//    }

    double result = 666;
    boolean isValidSign = true;
    switch (sign) {
        case "+": result = firstNumber + secondNumber; break;
        case "-": result = firstNumber - secondNumber; break;
        case "*", "x": result = firstNumber * secondNumber; break;
        case "/", ":": result = firstNumber / (secondNumber * 1.0); break;
        default: {
            System.out.println("Wrong sign!");
            isValidSign = false;
        }

    }
    if (isValidSign) {
        printCalculationResult(firstNumber, secondNumber, sign, result);
    }




//    int sum = firstNumber + secondNumber;
//    int substraction = firstNumber - secondNumber;
//    int multiplication = firstNumber * secondNumber;
//    double division = firstNumber / (secondNumber * 1.0);
//    printCalculationResult(firstNumber, secondNumber, "+", sum);
//    printCalculationResult(firstNumber, secondNumber, "-", substraction);
//    printCalculationResult(firstNumber, secondNumber, "*", multiplication);
//    printCalculationResult(firstNumber, secondNumber, "/", division);

    Thread.sleep(3000);
    System.out.println("\nThanks for choosing Uma's Calculator!");
    IO.println("We are waiting for you again!");
}

private void printCalculationResult(int firstNumber, int secondNumber, String sign, double result) {
    System.out.println(firstNumber + " " + sign + " " + secondNumber + " = " + result );
}