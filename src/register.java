import java.util.Scanner;

public class register {
    public static void main(String argu[]) {
        Scanner sign_in = new Scanner(System.in);
        System.out.println("Enter Your First Name");
        String fname = sign_in.next();
        System.out.println("Enter Your Second Name");
        String sname = sign_in.next();
        System.out.println("Enter Your Faculty");
        String faculty = sign_in.next();
        System.out.println("Enter Your ID");
        String id = sign_in.next();
        System.out.println("Male / Female (M/F)?");
        String male = sign_in.next();
        System.out.println("Enter Your Address");
        String address = sign_in.next();
        System.out.println("Age?");
        String age = sign_in.next();
        System.out.println("Student / Teacher?");
        String position = sign_in.next();
        System.out.println("Enter Your Email");
        String email = sign_in.next();
        System.out.println("Enter Your Password");
        String password = sign_in.next();
        System.out.println("Confirm Password");
        String cpassword = sign_in.next();

        System.out.print(fname);
        System.out.print(sname);
        System.out.print(faculty);
        System.out.print(id);
        System.out.print(male);
        System.out.print(address);
        System.out.print(age);
        System.out.print(position);
        System.out.print(email);
        System.out.print(password);
        System.out.print(cpassword);
        




    }
}
