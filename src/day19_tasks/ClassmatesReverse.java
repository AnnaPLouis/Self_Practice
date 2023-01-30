package day19_tasks;

public class ClassmatesReverse {
    public static void main(String[] args) {

        String[] classmates = {"Ann Ivanova", "Sasha Khristova", "Olessya Foxborn", "Natalia Kvasha", "Alyona Sharonina"};

        String reverse = "";

        for (int i = 0; i < classmates.length; i++) {

            for (int j = classmates[i].length()-1; j >= 0; j--){

                reverse += classmates[i].charAt(j);

            }

        }

        System.out.println(reverse);

        }


    }

