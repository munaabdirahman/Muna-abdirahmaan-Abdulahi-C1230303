import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password to check it's strength: ");
        String password = input.nextLine();
        if (isStrong(password)){
            System.out.println("Your password is Strong");
        }
        else if (!checkLength(password)){
            System.out.println("Your password must be atleast 8 characters ");
        }
        else if (!checkUpercase(password)){
            System.out.println("Your password must containt atleast one Uppercase letter");
        }else if (!checkLowerCase(password)){
            System.out.println("Your password must containt atleast one Lowercase letter");
        }else if (!checkSpecialCase(password)){
            System.out.println("Your password must containt atleast one Specialcase character");
        }
        else {
            System.out.println("Your password is weak");
        }

    }
    //check length
    public static boolean checkLength(String password){
        return password.length()>=8;
    }
    //check Uppercase
    public static boolean checkUpercase(String UP){
        for(char ch : UP.toCharArray()){
            if (Character.isUpperCase(ch))
                return true;
        }
        return false;
    }

    //check lowercase
    public static boolean checkLowerCase(String LW){
        for (char ch : LW.toCharArray()){
            if (Character.isLowerCase(ch))
                return true;
        }
        return false;
    }
    //check digit
    public static boolean checkDigit(String password) {
        for (char ch : password.toCharArray()){
            if (Character.isDigit(ch))
                return true;
        }
        return false;
    }
    //check specialcase
    public static boolean checkSpecialCase(String DIGIT){
        for (char ch : DIGIT.toCharArray()){
            if (!Character.isLetterOrDigit(ch))
                return true;
        }
        return false;
    }

    //check all conditons
    public static boolean isStrong(String password){
        return checkLength(password)&&checkUpercase(password)&&
                checkLowerCase(password)&&checkSpecialCase(password)&&
                checkSpecialCase(password);
    }
}


