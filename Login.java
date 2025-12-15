import java.util.Scanner;

class Login {
    public static void main(String[] args) {

        String correctUser = "admin";
        String correctPass = "1234";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(correctUser) && password.equals(correctPass)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}


// docker built -t login-app .
// docker run -it login-app