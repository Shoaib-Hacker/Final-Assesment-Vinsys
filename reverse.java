
class Main {

    public static void main(String[] args) {
        String sentence = "Hello world this is Java";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversed = new StringBuilder(word);
            result.append(reversed.reverse()).append(" ");
        }

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed Words: " + result.toString().trim());
    }
}