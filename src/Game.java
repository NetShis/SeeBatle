import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Denis on 19.12.2016.
 */
public class Game {

    void gameStart() {
        Player player = new Player();
        player.setName();

        Field fl = new Field();
        fl.showField();

        boolean isNotGameOver;
        isNotGameOver = true;
        do {
            int x;
            int y;
            System.out.println(player.getName() + " укажи координаты X:");
            x = player.coordinateOfShutX();
            System.out.println(player.getName() + " укажи координаты Y:");
            y = player.coordinateOfShutX();

            switch (Field.cells[y][x]) {
                case 'X': {
                    System.out.println("Ранен или убит");
                    Field.cells[y][x] = 'O';
                    break;
                }
                case '.': {
                    System.out.println("Мимо");
                    Field.cells[y][x] = '-';
                    break;
                }
                case '-': {
                    System.out.println("Уже стрелял!");
                    break;
                }
                case 'O': {
                    System.out.println("Уже стрелял!");
                    break;
                }
            }

            fl.showField();
            isNotGameOver = false;
            for (int i = 0; i < Field.cells.length; i++) {
                for (int j = 0; j < Field.cells.length; j++) {
                    if (Field.cells[i][j] == 'X'){
                        isNotGameOver = true;
                    }
                }
            }
        } while (isNotGameOver);
        System.out.println(player.getName() + " ты победил!");
    }
}
