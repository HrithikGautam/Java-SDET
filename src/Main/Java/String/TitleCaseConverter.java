package Main.Java.String;

public class TitleCaseConverter {
    public static void main(String[] args) {
        String input = "java is fun";
        System.out.println(toTitleCase(input));
    }

    public static String toTitleCase(String str) {
        String[] words = str.split("\\s");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return titleCase.toString().trim();
    }
}
