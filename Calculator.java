interface Tasks {
    void calculator(int item);
}

class Square implements Tasks {
    
    public void calculator(int item) {
        System.out.println("Square: " + (item * item)); 
    }
}

class Fibonacci implements Tasks {
    
    public void calculator(int item) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b + " ");
        for (int i = 2; i < item; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}

class Factorial implements Tasks {
   
    public void calculator(int item) {
        int factorial = 1;
        for (int i = 1; i <= item; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}

public class Calculator {
    public static void main(String[] args) {
        Tasks square = new Square();
        square.calculator(5); // Calculate square of 5

        Tasks fibonacci = new Fibonacci();
        fibonacci.calculator(10); // Display first 10 Fibonacci numbers

        Tasks factorial = new Factorial();
        factorial.calculator(4); // Calculate factorial of 4
    }
}