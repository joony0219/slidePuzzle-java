package slidePuzzle;

import javax.swing.*; 
import java.awt.event.*; 

public class PuzzleButton extends JButton implements ActionListener { 
	private SlidePuzzleBoard puzzle;
	private PuzzleFrame view; 
	
	public PuzzleButton(SlidePuzzleBoard p, PuzzleFrame v) { 
		puzzle = p; 
		view = v; 
		addActionListener(this);
	}
	public void actionPerformed(ActionEvent evt) { 
		String s = getText(); 
		if (! s.equals("")) {
			boolean ok = puzzle.move(Integer.parseInt(s));
			if (ok) view.update();
		}
	}
}