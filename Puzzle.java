package slidePuzzle;


public class Puzzle {

	public static void main(String[] args) {
		int size = 4;
		SlidePuzzleBoard board = new SlidePuzzleBoard(size);
		PuzzleFrame frame = new PuzzleFrame(size, board);
	}

}
