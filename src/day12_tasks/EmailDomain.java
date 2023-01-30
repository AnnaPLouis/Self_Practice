package day12_tasks;

public class EmailDomain {
    public static void main(String[] args) {


        domain("anna@yahoo.com");

    }


    public static void domain (String email){

        String domain = email.substring(email.indexOf('@'));
        System.out.println(domain);
    }
}
