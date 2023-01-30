package day28_tasks;

public class Credentials {

    private String username, password;

    public void setUsername (String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword (String password){
        boolean isStrongPassword = isStrongPassWord(password);
        if (isStrongPassword == false){
            System.err.println("Not a strong password");
            System.exit(1);
        }
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }


    public boolean isStrongPassWord( String password) {

        boolean isStrongPassWord = true;

        if (password.length() < 8 || password.contains(" ")) {
            System.err.println("password MUST be at least have 8 characters long, and should not contain space");
            isStrongPassWord = false;
        }

        int countOfDigits = 0;

        for (char each : password.toCharArray()) {

            if (Character.isDigit(each)) {
                countOfDigits++;
            }

        }
        if (countOfDigits == 0) {
            System.err.println("Password should at least contain a digit");
            isStrongPassWord = false;
        }

        int countOfSpecialCharacters = 0;

        for (char each : password.toCharArray()) {
            if (!Character.isLetter(each) && !Character.isDigit(each)) {
                countOfSpecialCharacters++;
            }
        }
        if (countOfSpecialCharacters == 0) {
            System.err.println("Password should at least contain one special characters");
            isStrongPassWord = false;
        }

        int countOfLetters = 0;
        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) {
                countOfLetters++;
            }
        }
        if (countOfLetters == 0) {
            System.err.println("PassWord should at least contain one letter ");
            isStrongPassWord = false;

        }

        return isStrongPassWord;
    }


    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    /*


            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password, returns boolean
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                toString()

     */
}
