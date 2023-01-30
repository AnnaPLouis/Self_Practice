package day19_tasks;

public class Classmates {

    public static void main(String[] args) {

        String[] classmates = {"Ann Ivanova","Sasha Khristova", "Olessya Foxborn","Natalia Kvasha", "Alyona Sharonina"};

        for (int i = 0; i < classmates.length; i++) {

            String initials = classmates[i].substring(0,1) + classmates[i].substring(classmates[i].indexOf(" ")+1,classmates[i].indexOf(" ")+2);

            System.out.println(initials);
        }

    }
}
