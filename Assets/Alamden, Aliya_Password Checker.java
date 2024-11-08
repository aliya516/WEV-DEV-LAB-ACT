package passwordchecker;
import java.util.regex.*;
import java.util.Scanner;

public class PasswordChecker 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) 
        {
            System.out.print("Enter a password (password must contain: between 8 to 20 characters, uppercase, lowercase, digit, and symbol): ");
            String password = input.nextLine();
            isValid = isPasswordValid(password);

            if (isValid) 
            {
                System.out.println("Password is valid.");
            } else 
            {
                System.out.println("Invalid password. Please try again.");
            }
        }
        input.close();
    }

    public static boolean isPasswordValid(String password) 
    {
        if (password == null || password.isEmpty()) 
        {
            System.out.println("Password cannot be empty");
            return false;
        }

        if (password.length() < 8 || password.length() > 20) 
        {
            System.out.println("Password must be between 8 to 20 characters");
            return false;
        }

        if (!Pattern.compile("[a-z]").matcher(password).find()) 
        {
            System.out.println("Password must contain at least one lowercase letter");
            return false;
        }

        if (!Pattern.compile("[A-Z]").matcher(password).find()) 
        {
            System.out.println("Password must contain at least one uppercase letter");
            return false;
        }

        if (!Pattern.compile("[0-9]").matcher(password).find()) 
        {
            System.out.println("Password must contain at least one digit");
            return false;
        }

        if (!Pattern.compile("[!@#$%^&*()-_=+?]").matcher(password).find()) 
        {
            System.out.println("Password must contain at least one symbol");
            return false;
        }
        return true;
    }
}

