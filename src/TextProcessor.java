public class TextProcessor {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful";
        System.out.println("Words: " + (text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length));
        System.out.println("Replaced: " + text.replaceAll("\\bJava\\b", "Programming"));
    }
}

