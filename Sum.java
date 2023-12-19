import java.util.Scanner;

class Sum {
    public static void main(String[] args) {

        int a;
        int b;
        String data;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        data = sc.next();

        System.out.println(a + b);
        System.out.println(a * b);

        System.out.println(data);

    }
}