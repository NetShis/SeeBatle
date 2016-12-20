
import java.util.Random;

/**
 * @ Author Created by Denis on 12.12.2016.
 */
public class Ship {
    int coordinateOfShipX;
    int coordinateOfShipY;
    int lengthOfShip;

    public Ship(int lengthOfShip) {
        this.lengthOfShip = lengthOfShip;
        boolean isNotShipsApart;
        isNotShipsApart = true;
        do {
            Random rd = new Random();
            boolean isHorizon;
            isHorizon = rd.nextBoolean();
            this.coordinateOfShipY = rd.nextInt(Field.SIZE_OF_FIELD);
            this.coordinateOfShipX = rd.nextInt(Field.SIZE_OF_FIELD);

            isNotShipsApart = false;
            if (isHorizon) {
                for (int i = coordinateOfShipY - 1; i < coordinateOfShipY + 2; i++) {
                    for (int j = coordinateOfShipX - 1; j < coordinateOfShipX + lengthOfShip; j++) {
                        if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                            if (Field.cells[i][j] == 'X') {
                                isNotShipsApart = true;
                            }
                        } else {
                            isNotShipsApart = true;
                        }
                    }
                }

                if (!isNotShipsApart) {
                    for (int i = coordinateOfShipX; i < coordinateOfShipX + lengthOfShip; i++) {
                        Field.cells[coordinateOfShipY][i] = 'X';
                    }
                    //System.out.println(coordinateOfShipX + "  " + coordinateOfShipY + " " + lengthOfShip);
                }

            } else {
                for (int i = coordinateOfShipY - 1; i < coordinateOfShipY + 2; i++) {
                    for (int j = coordinateOfShipX - 1; j < coordinateOfShipX + lengthOfShip; j++) {
                        if (i >= 0 && i < 10 && j >= 0 && j < 10) {
                            if (Field.cells[j][i] == 'X') {
                                isNotShipsApart = true;
                            }
                        } else {
                            isNotShipsApart = true;
                        }
                    }
                }
                if (!isNotShipsApart) {
                    for (int i = coordinateOfShipX; i < coordinateOfShipX + lengthOfShip; i++) {
                        Field.cells[i][coordinateOfShipY] = 'X';
                    }
                    //System.out.println(coordinateOfShipX + "  " + coordinateOfShipY + " " + lengthOfShip);
                }
            }


        } while (isNotShipsApart);
    }
}
