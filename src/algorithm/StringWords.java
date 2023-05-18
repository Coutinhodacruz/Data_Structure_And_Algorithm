package algorithm;

public class StringWords {

    public static int countCapitalWords(String sentence) {
        int count = 0;
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String sentence = "Life Is Good My Help Is In You Have Mercy On Me Oh Lord";
        int capitalWordCount = StringWords.countCapitalWords(sentence);
        System.out.println(capitalWordCount);
    }


}
