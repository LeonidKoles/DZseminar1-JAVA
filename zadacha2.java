// Вывести все простые числа от 1 до 1000

public class zadacha2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i <= n; i++){
            boolean flg = true;
            for ( int j = 2; j < i; j++){
                if (i % j == 0){
                    flg = false;
                    break;
                }
            }
            if (flg){
                System.out.println(i);
            }
          
                }
            }           
        }
