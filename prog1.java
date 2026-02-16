package recurssion;

public class fact {

    static int show(int num) {   // FIXED: void → int
        if (num == 1) {
            return 1;
        }
        int result = show(num - 1);
        return result * num;
    }

    static void show(int num, int result) {

        if (num == 1) {
            System.out.println(result);
            return;
        }
        show(num - 1, result * num);
    }

    public static void main(String[] args) {
        show(5, 1);   // works fine
        // System.out.println(show(5)); // also works if you want
    }
}
