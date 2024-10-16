public class Players {
	private String PlayerName;
	private int playerPosition;
	
	public Players(String name) {
		this.PlayerName = name;
		this.playerPosition = 0;
	}
	
	// Returns the current player's name
	public String getPlayerName() {
		return this.PlayerName;
	}
	
	// Returns the current player's position on the board
	public int getPlayerPosition() {
		return this.playerPosition;
	}

	// Updates the player's position after a move
	public void setPlayerPosition(int position) {
		this.playerPosition = position;
	}
}

