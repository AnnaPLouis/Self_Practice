package day07_tasks;

public class GradeLevel {
    public static void main(String[] args) {

    byte gradeLevel =7;
    String result = "";

    if (gradeLevel >= 1 && gradeLevel <= 18) {
        if (gradeLevel <= 5) {
            result = "Elementary school";}
        else if (gradeLevel <= 8) {
            result = "Middle School";}
        else if (gradeLevel <= 12) {
            result = "High School";}
        else if (gradeLevel <= 16) {
            result = "College";}
        else if (gradeLevel <= 18) {
            result = "Grad School";}
    }else {
        result = "Invalid grade level given";

    }
        System.out.println(result);
}
}

