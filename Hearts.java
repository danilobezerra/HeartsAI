public class Hearts {
	public static void main(String[] args) {
		System.out.println("Welcome to Hearts version 0.0.3.");

		// separate deck and four players from game
		Deck thing = new Deck();

		// assume this order is clockwise
		Player p1 = new HumanPlayer("Wells");
		Player p2 = new HumanPlayer("Jai");
		Player p3 = new HumanPlayer("Ant");
		Player p4 = new HumanPlayer("Julian");

		// 1. Play Single Game
		// pass in four players and a deck to game
		//Game round = new Game(thing, p1, p2, p3, p4);
		//round.playGame();

		// at the end of every game, we will have all the cards back in the deck
		// thing.printDeck();

		// 2. Play Multiple Games
		int numberOfGames = 100;
		for (int i = 1; i <= numberOfGames; i++) {
			System.out.println("\n--------------------------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("Playing Game #"+i);
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------");
			System.out.println("--------------------------------------------\n");
			Game round = new Game(thing, p1, p2, p3, p4);
			round.playGame();
		}

	}
}