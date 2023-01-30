package day28_tasks;

public class TestCredentials {
    public static void main(String[] args) {


        Credentials creds = new Credentials("AnitaTaksa","tAksa3440!");

        System.out.println(creds.getUsername());
        System.out.println(creds.getPassword());
    }
}
