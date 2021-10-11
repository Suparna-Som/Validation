import java.util.Scanner;
import java.util.regex.Pattern;

public class validation {
   public static void age(int a)
   {
      if(a>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("YOu are too young to vote");
        }
    }
   
    public static void email_valid(String email){
        String emailRegex ="^[a-zA-Z0-9 +&*-]+(?:\\."+
                "[a-zA-Z0-9 +&*-]+)*@"+
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid Email id - try : abc@xyz.com");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Email-Id :");
        String email = sc.nextLine();
        email_valid(email);
        System.out.println("Enter your Age :");
        int a = sc.nextInt();
        age(a);
    }
}


