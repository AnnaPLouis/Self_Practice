package day12_tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {



        int frequencyOfJava = frequency("I love Java, JAVA, java, JaVa", "java");

        System.out.println(frequencyOfJava);



    }public static int frequency (String sentence, String word){

        String sentence1 = sentence.toLowerCase();

        String sentence2 = sentence1.replace(word, word.substring(0,word.length()-1));

        int frequency = sentence1.length() - sentence2.length();

        return frequency;

    }
}
