package Game.Memory;

import javax.swing.SwingUtilities;

public class LaunchGame {

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MemoryGame inst = new MemoryGame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
}
