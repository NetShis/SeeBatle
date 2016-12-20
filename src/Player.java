import java.util.Scanner;

/**
 * Created by Denis on 19.12.2016.
 */
public class Player {
    private String name;

    void setName() {
        System.out.println("Игрок введи свое имя...");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }

    String getName() {
        return name;
    }

    int coordinateOfShutX (){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    int coordinateOfShutY (){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
