public class Repeat2 {
    public static String Repeat2(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < n; j++) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(Repeat2("easy", 3));
    }
}
