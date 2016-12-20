

/**
 * Created by Denis on 12.12.2016.
 */
public class Field {
    static final int SIZE_OF_FIELD = 10;
    static char[][] cells = new char[SIZE_OF_FIELD][SIZE_OF_FIELD];


    public Field() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }
        }
        Ship sp1 = new Ship(3);
        //Ship sp2 = new Ship(1);
        //Ship sp3 = new Ship(4);
        //Ship sp4 = new Ship(2);
        //Ship sp5 = new Ship(1);
    }

    void showField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }
}
