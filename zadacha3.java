import java.util.Scanner;

// Реализовать простой калькулятор


public class zadacha3 {
    public static void main(String[] args) {
       
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = num.nextDouble();
        System.out.println("Введите второе число: ");
        Double num2 = num.nextDouble();
        System.out.println("Введите знак операции: ");
        char ch = num.next().charAt(0);
        double res = 0;
        switch(ch){
            case '+': res = num1 + num2;
                break;
            case '-': res = num1 - num2;
                break;
            case '*': res = num1 * num2;
                break;
            case '/': res = num1 / num2;
                break;
            default: System.out.println("Введен некоректный знак!!!");
            
        }
        System.out.println("Результата будет следующим: 3");
        System.out.printf(num1 + " " + ch + " " + num2 + " = " + res);
    }
    
}
