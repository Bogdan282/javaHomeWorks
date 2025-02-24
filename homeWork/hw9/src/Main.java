public class Main {
    public static void main(String[] args) {
        //Матриця 4x4:
        //23 45 12 37
        //50 11 42 20
        //33 27 19 48
        //8   39  6  4
        //
        //Сума елементів у парних рядках (рядок 0, 2): 224
        //Сума елементів у непарних рядках (рядок 1, 3): 180
        //Добуток елементів у парних стовпцях (стовпець 0, 2): 17443641600
        //Добуток елементів у непарних стовпцях (стовпець 1, 3): 74057068800
        //
        //Матриця не є магічним квадратом.

        int Matrix[][] = new int[4][4];
        int min = 1;
        int max = 50;
        int sum = 0;
        long prod = 1;

        for (int i = 0; i < Matrix.length; i++) {             // Перебирає рядки
            for (int j = 0; j <Matrix[i].length; j++) {       // Перебирає стовпці
                Matrix[i][j] = min + (int) (Math.random() * (max - min + 1));
            }
        }
        System.out.println("Матриця: ");
        matrixPrint(Matrix);

        for (int i = 0; i < Matrix.length; i += 2) {
            for (int j = 0; j < Matrix[i].length; j++) {
                sum += Matrix[i][j];
            }
        }
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + sum);
        sum = 0;

        for (int i = 1; i < Matrix.length; i += 2) {
            for (int j = 0; j < Matrix[i].length; j++) {
                sum += Matrix[i][j];
            }
        }
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + sum);

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j += 2) {
                prod *= Matrix[i][j];
            }
        }
        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + prod);
        prod = 1;

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 1; j < Matrix[i].length; j += 2) {
                prod *= Matrix[i][j];
            }
        }
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + prod);
    }
    public static void matrixPrint(int Matrix[][]) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}