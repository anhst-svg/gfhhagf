import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class UserGet {

    private static Set<String> emailReg = new HashSet<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        String email = getEmail(scanner);

        System.out.println("Введите пароль: ");
        String password = scanner.nextLine();

        System.out.println("Введите рост: ");
        float height = scanner.nextFloat();

        System.out.println("Введите вес: ");
        float weight = scanner.nextFloat();


        User user = new User(name, email, password, height, weight);
        System.out.println(user);


        emailReg.add(email);
        scanner.close();
    }

    public static String getEmail(Scanner scanner) {
        String email;
        while (true) {
            System.out.println("Введите почту: ");
            email = scanner.nextLine();
            if (!emailReg.contains(email)) {
                break;
            } else {
                System.out.println("Почта уже зарегистрирована");}
            }
        return email;
    }
}
