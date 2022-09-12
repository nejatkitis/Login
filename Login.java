import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz : ");
        username = input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }
        else if (username.equals("patika") && !password.equals("java123")) {
            System.out.println("Hatalı şifre girdiniz");
            System.out.println("Yeni şifre oluşturmak için 1'e basın");
            int i = input.nextInt();
            switch (i){
                case 1 :
                    System.out.println("Yeni şifrenizi oluşturun");
                    Scanner input2 = new Scanner(System.in);
                    password = input2.nextLine();
                    System.out.println("Tekrar giriş yapın");
                    break;
                default :
                    System.out.println("Hatalı giriş yaptınız");
            }
        }
        else {
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}
