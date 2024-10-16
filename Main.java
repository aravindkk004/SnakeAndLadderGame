import java.util.*;

public class Main {
	private List<Players> players;
	private Board board;
		
	public Main(String[] playerNames) {
        this.players = new ArrayList<>();
        for (String playerName : playerNames) {
            this.players.add(new Players(playerName)); 
        }
        board = new Board();
    }
	
	// Starts the game and gets input from the user for rolling the dice
	public void StartGame() {
		Scanner ab = new Scanner(System.in);
		boolean isMatchOver = false;
		Map<String, Integer> playerPositions = new HashMap<>();
		while (!isMatchOver) {
			// Iterates through each player and processes their moves
			for(Players player: players) {
				playerPositions.put(player.getPlayerName(), player.getPlayerPosition());
				System.out.println("Player 1 position: " + playerPositions.getOrDefault("Player 1", 0));
            	System.out.println("Player 2 position: " + playerPositions.getOrDefault("Player 2", 0));
				System.out.println(player.getPlayerName() + "'s turn");
				int userInput = 0;
				while (userInput != 1) { 
					System.out.println("Press 1 to roll the dice");
					userInput = ab.nextInt();
					if (userInput != 1) {
						System.out.println("Please enter a valid input.");
					}
				}
				if (processPlayerMove(player, playerPositions)) {
					isMatchOver = true;
					break;  
				}
			}
		}
		ab.close();
	}
	
	// Handles the player's move after rolling the dice
	public boolean processPlayerMove(Players player, Map<String, Integer> playerPositions) {
		int currentPosition = player.getPlayerPosition();
		int rollDice = RollDice();
		int newPosition;
		// Checks if the player can move without exceeding 100
		if(currentPosition + rollDice > 100) {
			newPosition = currentPosition;
			System.out.println(player.getPlayerName() + " rolled the dice but can't move as it exceeds 100.");
		}else {
			newPosition = board.getMoves(currentPosition+rollDice);
			player.setPlayerPosition(newPosition);
			System.out.println(player.getPlayerName() + " moves to position " + newPosition);
		}
		playerPositions.put(player.getPlayerName(), player.getPlayerPosition());
		board.printBoard(playerPositions);
		if (newPosition==100) {
			System.out.println(player.getPlayerName() + " wins the game!");
			return true;
		}
		return false;
	}
	
	// Simulates rolling a dice and returns a value between 1 and 6
	public int RollDice() {
		int rolledPosition = (int) (Math.random() * 6) + 1;
		System.out.println("You rolled a " + rolledPosition);
		return rolledPosition;
	}
	
	// Main function to initialize the game with player names
	public static void main(String[] args) {
		String[] playerNames = {"Player 1", "Player 2"}; 
        Main gamePlay = new Main(playerNames);  
        gamePlay.StartGame();
	}
}
