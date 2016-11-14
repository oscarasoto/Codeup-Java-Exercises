
public class StringBasics {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We don't need no education");
        System.out.println(sb);
        sb.replace(sb.indexOf("no"), sb.length(), "no thought control");

        System.out.println(sb);

        String message = "I can do back slashes \\, and double back slashes \\\\, and the amazing triple back-slash \\\\\\!";
        System.out.println(message);

    }
}
