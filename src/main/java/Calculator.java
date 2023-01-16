import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println(
                """
                                              
                                              
                                              
                                              
                                              
                                              
                                              
                                              
                                              
                                              WELCOME
                    
                    The purpose of this project is to experiment with calling a file 
                    from the terminal. This application is a calculator app. 
                    
                    Please fill out all information in this order:
                    
                    • First number
                    
                    • Operation(case sensitive)
                      Acceptable types of operations (+ or add, - or subtract, / or divide, * or multiply)
                    
                    • Second number
                    
                    
                """);

        Addition addition = new Addition();
        Division division = new Division();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();


        Scanner sc = new Scanner(System.in);
        System.out.println("Type 0 to exit, any key to continue.");
        String cont = sc.next();
        try {
            while(!cont.equals(0)) {
                String num1 = sc.next();
                String str = sc.next();
                String num2 = sc.next();


                if(str.equals("+") || str.equals("add")) System.out.println(addition.addValues(Double.parseDouble(num1), Double.parseDouble(num2)));
                if(str.equals("-") || str.equals("subtract")) System.out.println(subtraction.subtractValues(Double.parseDouble(num1), Double.parseDouble(num2)));
                if(str.equals("/") || str.equals("divide")) System.out.println(division.divideValues(Double.parseDouble(num1), Double.parseDouble(num2)));
                if(str.equals("*") || str.equals("multiply")) System.out.println(multiplication.multiplyValues(Double.parseDouble(num1), Double.parseDouble(num2)));

                System.out.println("\nType 0 to exit, any key to continue");
                cont = sc.next();
            }
            System.exit(0);
        } catch (Exception e) {
            System.exit(100);
        }

    }
}
