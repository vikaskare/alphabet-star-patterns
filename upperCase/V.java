class V {
    public static void printPattern() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i < n / 2) || (j == n - 1 && i < n / 2) || (i - j == n / 2) || (i + j == n + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printPattern();
    }
}