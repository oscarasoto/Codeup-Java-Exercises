import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {

        String userInput;
        int firstVowelIndex;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        userInput = sc.nextLine();
        firstVowelIndex = findVowel(userInput.toLowerCase());
        System.out.println(firstVowelIndex);
        System.out.println(userInput.charAt(firstVowelIndex));

    }

    private static int findVowel (String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                return i;
            }
        }

        return -1;
    }


}

