import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

      double z =  Math.max(x,y);
        System.out.println(z);
        double c = Math.min(x,y);
        System.out.println(c);
//        Метод абсолютної функції
        double v = Math.abs(y);
        System.out.println(v);
//        Метод квадратного корення
        double b = Math.sqrt(x);
        System.out.println(b);
//        Метод округлення
        double n = Math.round(x);
        System.out.println(n);
        double m = Math.ceil(x);
        System.out.println(m);
        double a = Math.floor(x);
        System.out.println(a);

//        Программа яка знаходть гіпотенузу трикутника, треба знайти строни трикутника:
        double s;
        double f;
        double g;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side s: ");
        s = scanner.nextDouble();
        System.out.println("Enter side f: ");
        f = scanner.nextDouble();
       double j = Math.sqrt((s*s) + (f*f));
      System.out.println("The hypotenuse : " + j);
      scanner.close();
    }
}
