public class Main {

    static final int MAX= 4;

    public static void main(String[] args) {
        int row, column;

        for (row = 1; row <=  MAX; row++) {
            for (column = 1; column <= row; column++) {
                System.out.print(row * 1 + "\t");
            }
            System.out.println(); //Takes us to the next line
        }
    }
}

