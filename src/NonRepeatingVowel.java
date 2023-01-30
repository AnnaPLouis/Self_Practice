public class NonRepeatingVowel {

    public static void main(String[] args) {

        int indexOfFirstNonRepeatingVowel = NonRepeatingVowel("aaaaafffffejjjjjifffffo");

        System.out.println(indexOfFirstNonRepeatingVowel);


    }

    public static int NonRepeatingVowel (String word){

        String onlyVowels = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o'
                    || word.charAt(i)=='u'){

                onlyVowels += word.charAt(i);
            }
        }

        if(onlyVowels.length() == 0){

            return -1;

        }

        String nonRepeatingVowel = "";
        

        for (int i = 0; i < onlyVowels.length(); i++) {

            char ch = onlyVowels.charAt(i);

            int frequency = 0;

            for (int j = 0; j < onlyVowels.length(); j++) {

                if (onlyVowels.charAt(j) == ch){
                    frequency++;
                }
            }

            if (frequency == 1){

                nonRepeatingVowel += "" + ch;

                break;

            }

        }

        return word.indexOf(nonRepeatingVowel);
    }
}
