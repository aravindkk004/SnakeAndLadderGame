# Snake and Ladder Game

## Overview
The Snake and Ladder game is a classic board game played between two players. 
Players move their tokens along a linear board based on the roll of a die. 
The objective is to reach the last square (100) before the opponent. 
The game includes special elements like snakes that hinder progress and ladders that accelerate advancement, adding unpredictability and excitement to the gameplay.

## Features
- **Two-player Gameplay:** Supports head-to-head competition.
- **Randomized Dice Rolls:** Players roll a six-sided die to determine movement.
- **Dynamic Board:** Integrates snakes and ladders that change player positions.
- **Console Interface:** Easy-to-use text-based interface for player interaction.
- **Win Condition:** The first player to reach square 100 wins the game.

## Installation

### Prerequisites
- Java Development Kit (JDK) installed on your system (Java 8 or higher recommended).

### Cloning the Repository
Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/aravindkk004/SnakeAndLadderGame.git


## File Descriptions

### Main.java

The `Main` class serves as the entry point for the Snake and Ladder Game. This file handles the following:

- **Game Initialization**: It creates instances of the `Players` class to set up player details and initializes the game board.
- **Game Loop**: It contains the main loop that continuously manages player turns and checks for win conditions.
- **User Input Handling**: It captures user commands for rolling the dice and processes player movements based on the rolled values.
- **Display**: It manages the display of the current state of the game board and player positions after each turn, allowing players to visualize progress.

### Board.java

The `Board` class represents the game board and manages the snakes and ladders. This file handles the following:

- **Board Management**: It initializes the game board and populates it with the positions of snakes and ladders using hash maps.
- **Player Position Updates**: It defines methods to check if a player lands on a snake or ladder, updating their position accordingly.
- **Display Functionality**: It provides methods for displaying the current state of the board after each player's turn.

### Players.java

The `Players` class represents individual players in the game. This file handles the following:

- **Player Management**: It stores each player's name and current position on the board.
- **Player Information**: It provides getter and setter methods for player details, allowing easy access to player data.
- **Turn Management**: It manages the logic related to player turns, ensuring the game flow remains consistent.

Together, these files create a complete implementation of the Snake and Ladder Game, allowing players to enjoy this classic challenge through a console interface.
