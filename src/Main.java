import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Player 1's Name: ");
        String playerName = s.nextLine();
        Player p1 = new Player(playerName);
        System.out.println("Enter Player 2's Name: ");
        playerName = s.nextLine();
        Player p2 = new Player(playerName);
        System.out.println("How many sides on our dice?");
        int sides = Integer.parseInt(s.nextLine());

        Game game = new Game(p1, p2, new Dice(sides));

        game.play();
    }
}
