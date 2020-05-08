public class NestingLoops {
    public static void main(String[] args) {
        // this is #1 - I'll call it "CN"
        for (int n = 1; n <= 3; n++) {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c + " " + n);
            }
        }

        // 1. The n changes faster because it is inn the inner loop, because the outer
        // loop changes only after the inner loop is completly finished.

        // 2. The output changes from A1,A2,A3, B1.. to A1, B1, C1, D1, E1, A2...

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.print(a + "-" + b + " ");
            }
            System.out.println();
        }

        // 3. Each output is on its own line.
        // 4. It prints out all the 1-int on one line, all the 2-int on the next line
        // and all the 3-int on the last line. So different from println() within the
        // inner loop because it groups all the same a's on the same line

        System.out.println("\n");

    }
}