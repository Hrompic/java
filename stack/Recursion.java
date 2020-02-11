public class Recursion{
    static int depth;

    static void recursion() {
        depth++;
        recursion();
    }

    public static void main(String[] args) {
        try {
            recursion();
        } catch (StackOverflowError e) {
            System.out.println(depth);
        }
    }
}
