package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     * <p/>
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        // TODO: Write this method.

        String finalString = "";
        //iterate through each char in string and check if vowel
        for (char letter : string.toCharArray()) {
            if(letter == 'a'||letter == 'i' ||
                    letter == 'o' || letter == 'u'){
                finalString += "";
            }else{
                 finalString += letter;
            }
        }
        return finalString;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
//        System.out.println(abbreviate("Ello"));

    }

}
