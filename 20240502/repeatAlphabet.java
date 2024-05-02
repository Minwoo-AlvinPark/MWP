public class Repeat {
    public static String Repeat(String str, int repeat) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < repeat; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hi";
        int repeat = 2;
        String output = Repeat(input, repeat);
        System.out.println(output);
    }
}
