import java.util.*;

public class Board {
	private Map<Integer, Integer> ladders;
	private Map<Integer, Integer> snakes;
	
	public Board() {
		ladders = new HashMap<>();
		snakes = new HashMap<>();
		putSnakes();
		putLadders();
	}
	
	//putting snakes into that board
	public void putSnakes() {
		snakes.put(37, 3);
		snakes.put(97, 15);
		snakes.put(50, 12);
		snakes.put(94, 71);
		snakes.put(45, 16);
		snakes.put(66, 20);
		snakes.put(86, 78);
	}
	
	//putting ladders into that board
	public void putLadders() {
		ladders.put(4,  56);
		ladders.put(12,  50);
		ladders.put(14, 35);
		ladders.put(22, 48);
		ladders.put(41, 79);
		ladders.put(64, 95);
	}
	
	//Checking if there is any ladder or snakes in that position. if it is then returning the new position.
	public int getMoves(int position) {
		int newPosition = position;
		if(snakes.containsKey(position)) {
            System.out.println("Snake from "+position+" to "+snakes.get(position));
			newPosition = snakes.get(position);
		}
		if(ladders.containsKey(position)) {
            System.out.println("Ladder from "+position+" to "+ladders.get(position));
			newPosition = ladders.get(position);
		}
		return newPosition;
	}

	//printing the board
    public void printBoard(Map<String, Integer> playerPositions) {
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 10; i > 0; i--) { 
            if (i % 2 == 0) { 
                for (int j = (i * 10); j > (i - 1) * 10; j--) {
                    printPosition(j, playerPositions);
                }
            } else {
                for (int j = (i - 1) * 10 + 1; j <= i * 10; j++) {
                    printPosition(j, playerPositions);
                }
            }
            System.out.println("|");
			System.out.println("---------------------------------------------------------------------------------");
        }
       
    }
    
	//printing the player's current position
    private void printPosition(int position, Map<String, Integer> playerPositions) {
        String pos = String.valueOf(position);
        for (Map.Entry<String, Integer> entry : playerPositions.entrySet()) {
            if (entry.getValue() == position) {
                pos = String.valueOf(entry.getKey().charAt(0)) + String.valueOf(entry.getKey().charAt(entry.getKey().length()-1));
            }
        }
        System.out.print("| " + pos + "\t");
    }
    
	
}
