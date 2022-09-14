public class pattern_01 {
    public static void main(String[] args) {
        pattern01(5);
    }

    static void pattern01(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
