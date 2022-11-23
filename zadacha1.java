import java.util.Scanner;

public class zadacha1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = n.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i ++){
            sum += i;
           
        }
        System.out.println(sum);
       

        Scanner fac = new Scanner(System.in);
        System.out.println("Введите число: ");
        int f = fac.nextInt();
        int mylt = factorial(f);
        System.out.println(mylt);
        n.close();
        fac.close(); 

        }  
        public static int factorial(int f){
            if (f <+ 1){
                return 1;
            }
            else {
                return f * factorial(f -1);
            }
        }
    
    }


    
