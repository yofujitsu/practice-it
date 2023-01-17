import java.util.*;

public class YesOrNo {

//    Дано число N. Напиши код,который выводит слово YES,
//    если число N является точной степенью двойки,
//    или слово NO в противном случае.
//    Операцией возведения в степень пользоваться нельзя

    public static String powOfTwo(int n) {
        if (n == 0) return "NO";
        if(n == 1) return "YES";
        if(n % 2 == 0) return powOfTwo(n / 2);
        return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; ++i) {
            int x = scan.nextInt();
            System.out.println(powOfTwo(x));
        }
    }
}
