package practice14;

import java.util.regex.Pattern;

public class num7 {
    public static void main(String[] args) {

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_]{8,}$";

        String[] tests = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007",
                "Passw0rd"
        };

        for (String password : tests) {
            boolean isSecure = Pattern.matches(regex, password);
            System.out.println("Пароль: \"" + password + "\" -> Надежный: " + isSecure);
        }
    }
}