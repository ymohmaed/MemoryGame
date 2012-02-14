package Game.Memory;

import info.clearthought.layout.TableLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

class MemoryGame extends JFrame implements ActionListener {

  

    /**
     * @category Fields & Properties
     */

    private static final long serialVersionUID = 1L;
    private JMenuBar mnub_Game;
    private JMenu mnu_Game;
    private JMenuItem muni_ExitGame;
    private JMenuItem muni_NewGame;
    private JSeparator muns_Game;

    private JButton btn_15;
    private JButton btn_14;
    private JButton btn_13;
    private JButton btn_12;
    private JButton btn_11;
    private JButton btn_10;
    private JButton btn_9;
    private JButton btn_8;
    private JButton btn_7;
    private JButton btn_6;
    private JButton btn_5;
    private JButton btn_4;
    private JButton btn_3;
    private JButton btn_2;
    private JButton btn_1;
    private JButton btn_0;
    private ImageIcon firstCard;
    private ImageIcon secondCard;
    private JButton btnAlfa;
    private JButton btnBeta;

    private JTextField txt_Score;
    private JLabel lbl_Score;

    private ImageIcon icn_bk;
    private ArrayList<ImageIcon> icn_img;

    private int cardsCount = 0;
    private int matchedCards=0;
    private int gameScore=-1;
    private boolean matched=true;
    /**
     * Images Path
     */
    final String icn_bck = "/images/back.jpg";
    final String icn_1 = "/images/1.jpg";
    final String icn_2 = "/images/2.jpg";
    final String icn_3 = "/images/3.jpg";
    final String icn_4 = "/images/4.jpg";
    final String icn_5 = "/images/5.jpg";
    final String icn_6 = "/images/6.jpg";
    final String icn_7 = "/images/7.jpg";
    final String icn_8 = "/images/8.jpg";

    /**
     * @category Class Constructor
     */
    MemoryGame() {
	super();

	initGUI();
    }

    /**
     * Initialize the Frame
     */
    private void initGUI() {
	try {

	    this.setTitle("Memory Game");
	    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    TableLayout thisLayout = new TableLayout(new double[][] {
		    { TableLayout.FILL, TableLayout.FILL, TableLayout.FILL,
			    TableLayout.FILL },
		    { TableLayout.PREFERRED, TableLayout.FILL,
			    TableLayout.FILL, TableLayout.FILL,
			    TableLayout.FILL } });
	    thisLayout.setHGap(2);
	    thisLayout.setVGap(2);
	    getContentPane().setLayout(thisLayout);
	    this.setResizable(false);
	    this.setSize(800, 700);
	    initMenu();
	    this.setJMenuBar(mnub_Game);
	    initBoard();
	    RandomizeImages();

	} catch (Exception e) {
	    // add your error handling code here
	    e.printStackTrace();
	}
    }

    /**
     * Initialize the Menu bar
     */
    private void initMenu()

    {
	try {

	    mnub_Game = new JMenuBar();

	    mnub_Game.setSize(792, 20);
	    {
		mnu_Game = new JMenu();
		mnub_Game.add(mnu_Game);
		mnu_Game.setText("Game");
		{
		    muni_NewGame = new JMenuItem();
		    mnu_Game.add(muni_NewGame);
		    muni_NewGame.setText("New");
		    muni_NewGame.addActionListener(this);
		    muni_NewGame.setActionCommand("New");
		}
		{
		    muns_Game = new JSeparator();
		    mnu_Game.add(muns_Game);
		}
		{
		    muni_ExitGame = new JMenuItem();
		    mnu_Game.add(muni_ExitGame);
		    muni_ExitGame.setText("Exit");
		    muni_ExitGame.addActionListener(this);
		    muni_ExitGame.setActionCommand("Exit");
		}
	    }

	} catch (Exception e) {
	    // add your error handling code here
	    e.printStackTrace();
	}

    }

    /**
     * Initialize the Board and images
     */
    private void initBoard() {
	try {
	    
	    
	    icn_bk = new ImageIcon(getClass().getResource(icn_bck));

	    btn_0 = new JButton();
	    getContentPane().add(btn_0, "0, 1");
	    btn_0.setIcon(icn_bk);
	    btn_0.addActionListener(this);
	    btn_0.setActionCommand("btn:0");

	    btn_1 = new JButton();
	    getContentPane().add(btn_1, "1, 1");
	    btn_1.setIcon(icn_bk);
	    btn_1.addActionListener(this);
	    btn_1.setActionCommand("btn:1");

	    btn_2 = new JButton();
	    getContentPane().add(btn_2, "2, 1");
	    btn_2.setIcon(icn_bk);
	    btn_2.addActionListener(this);
	    btn_2.setActionCommand("btn:2");

	    btn_3 = new JButton();
	    getContentPane().add(btn_3, "3, 1");
	    btn_3.setIcon(icn_bk);
	    btn_3.addActionListener(this);
	    btn_3.setActionCommand("btn:3");

	    btn_4 = new JButton();
	    getContentPane().add(btn_4, "0, 2");
	    btn_4.setIcon(icn_bk);
	    btn_4.addActionListener(this);
	    btn_4.setActionCommand("btn:4");

	    btn_5 = new JButton();
	    getContentPane().add(btn_5, "1, 2");
	    btn_5.setIcon(icn_bk);
	    btn_5.addActionListener(this);
	    btn_5.setActionCommand("btn:5");

	    btn_6 = new JButton();
	    getContentPane().add(btn_6, "2, 2");
	    btn_6.setIcon(icn_bk);
	    btn_6.addActionListener(this);
	    btn_6.setActionCommand("btn:6");

	    btn_7 = new JButton();
	    getContentPane().add(btn_7, "3, 2");
	    btn_7.setIcon(icn_bk);
	    btn_7.addActionListener(this);
	    btn_7.setActionCommand("btn:7");

	    btn_8 = new JButton();
	    getContentPane().add(btn_8, "0, 3");
	    btn_8.setIcon(icn_bk);
	    btn_8.addActionListener(this);
	    btn_8.setActionCommand("btn:8");

	    btn_9 = new JButton();
	    getContentPane().add(btn_9, "1, 3");
	    btn_9.setIcon(icn_bk);
	    btn_9.addActionListener(this);
	    btn_9.setActionCommand("btn:9");

	    btn_10 = new JButton();
	    getContentPane().add(btn_10, "2, 3");
	    btn_10.setIcon(icn_bk);
	    btn_10.addActionListener(this);
	    btn_10.setActionCommand("btn:10");

	    btn_11 = new JButton();
	    getContentPane().add(btn_11, "3, 3");
	    btn_11.setIcon(icn_bk);
	    btn_11.addActionListener(this);
	    btn_11.setActionCommand("btn:11");

	    btn_12 = new JButton();
	    getContentPane().add(btn_12, "0, 4");
	    btn_12.setIcon(icn_bk);
	    btn_12.addActionListener(this);
	    btn_12.setActionCommand("btn:12");

	    btn_13 = new JButton();
	    getContentPane().add(btn_13, "1, 4");
	    btn_13.setIcon(icn_bk);
	    btn_13.addActionListener(this);
	    btn_13.setActionCommand("btn:13");

	    btn_14 = new JButton();
	    getContentPane().add(btn_14, "2, 4");
	    btn_14.setIcon(icn_bk);
	    btn_14.addActionListener(this);
	    btn_14.setActionCommand("btn:14");

	    btn_15 = new JButton();
	    getContentPane().add(btn_15, "3, 4");
	    btn_15.setIcon(icn_bk);
	    btn_15.addActionListener(this);
	    btn_15.setActionCommand("btn:15");

	    lbl_Score = new JLabel();
	    getContentPane().add(lbl_Score, "0,0,f,t");
	    lbl_Score.setText("Your Score");

	    txt_Score = new JTextField();
	    getContentPane().add(txt_Score, "1,0,f,t");
	    txt_Score.setText("3000");

	} catch (Exception e) {
	    // add your error handling code here
	    e.printStackTrace();
	}
    }

    /**
     * When any component clicked (menus , buttons)
     */
    public void actionPerformed(ActionEvent e) {

	// check if the action command belongs to button or menu item
	String command = e.getActionCommand();
	String[] commandA;
	int index = 0;

	// If it belongs to button extract the number
	if (command.contains(":")) {
	    commandA = command.split(":");
	    command = commandA[0];
	    index = Integer.parseInt(commandA[1]);
	}
	switch (command) {
	case "New":
	    muni_NewGameActionPerformed();
	    break;
	case "Exit":
	    muni_ExitGameActionPerformed();
	    break;
	case "btn":
	    btnActionPerformed(index, e);
	    break;
	}
    }

    /**
     * New menu item event
     */
    private void muni_NewGameActionPerformed() {
	
	//reset board
	ResetBoard();
	// randomize
	RandomizeImages();
    }

    /**
     * Button Action performed
     */
    private void btnActionPerformed(int btnIndex, ActionEvent e) {
	// Increment the number of clicks
	cardsCount++;
	 
	int currentScore=Integer.parseInt(txt_Score.getText());
		
	// fill first card
	if (cardsCount == 1) {
	    btnAlfa = (JButton) e.getSource();
	    firstCard = icn_img.get(btnIndex);
	    btnAlfa.setDisabledIcon(firstCard);
	    btnAlfa.setEnabled(false);
	}
	
	else if (cardsCount == 2) {
	 // fill second card
	    btnBeta = (JButton) e.getSource();
	    secondCard = icn_img.get(btnIndex);
	    btnBeta.setDisabledIcon(secondCard);
	    btnBeta.setEnabled(false);
	    //1- Check if matched
	  if (!secondCard.getDescription().equalsIgnoreCase(firstCard.getDescription())) {
	      	//Set matched flag false
		matched=false;
		//Deduct 100 points from the score
		gameScore=(currentScore-100);
		txt_Score.setText(Integer.toString(gameScore));
	  }
	  else
	  {
	    matchedCards++;
	    matched=true;	}
		//2- Check if all the cards turned 
		if(matchedCards==8)
		{
		    int result = JOptionPane.showConfirmDialog((JButton)e.getSource(),
				"Congratulations!! New Game ?", "You Win",
				JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
			    muni_NewGameActionPerformed();
			}
			else
			{System.exit(0);}
			
		  }
		//check if score is consumed
		if(gameScore==0)
		{
		    int result = JOptionPane.showConfirmDialog((JButton)e.getSource(),
				"Game Over!! New Game ?", "You Lost",
				JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
			    muni_NewGameActionPerformed();
			}
			else
			{System.exit(0);}
		}
	
	}else{
	    // Check if the images are the same
	    if (!matched) {
		  
		// If Not equal :: Reset the buttons status
		btnAlfa.setEnabled(true);
		btnBeta.setEnabled(true);
	
	    }
	    //fill first card
	    btnAlfa = (JButton) e.getSource();
	    firstCard = icn_img.get(btnIndex);
	    btnAlfa.setDisabledIcon(firstCard);
	    btnAlfa.setEnabled(false);
	    cardsCount=1;
		
	}
	   
	    	
		 
    }

    /**
     * Exit menu item event
     */
    private void muni_ExitGameActionPerformed() {
	cardsCount = 0;
	int result = JOptionPane.showConfirmDialog(muni_ExitGame,
		"Would you like to exit", "Exit Game",
		JOptionPane.YES_NO_OPTION);
	if (result == JOptionPane.YES_OPTION) {
	    System.exit(0);
	}
    }

    /**
     * Randomize the cards
     */
    private void RandomizeImages() {
	icn_img = new ArrayList<ImageIcon>();
	// 1
	ImageIcon icn1 = new ImageIcon(getClass().getResource(icn_1));
	icn1.setDescription("1");
	icn_img.add(icn1);
	// 2
	ImageIcon icn2 = new ImageIcon(getClass().getResource(icn_3));
	icn2.setDescription("3");
	icn_img.add(icn2);
	// 3
	ImageIcon icn3 = new ImageIcon(getClass().getResource(icn_4));
	icn3.setDescription("4");
	icn_img.add(icn3);
	// 4
	ImageIcon icn4 = new ImageIcon(getClass().getResource(icn_2));
	icn4.setDescription("2");
	icn_img.add(icn4);
	// 5
	ImageIcon icn5 = new ImageIcon(getClass().getResource(icn_7));
	icn5.setDescription("7");
	icn_img.add(icn5);
	// 6
	ImageIcon icn6 = new ImageIcon(getClass().getResource(icn_8));
	icn6.setDescription("8");
	icn_img.add(icn6);
	// 7
	ImageIcon icn7 = new ImageIcon(getClass().getResource(icn_5));
	icn7.setDescription("5");
	icn_img.add(icn7);
	// 8
	ImageIcon icn8 = new ImageIcon(getClass().getResource(icn_6));
	icn8.setDescription("6");
	icn_img.add(icn8);
	// 9
	ImageIcon icn9 = new ImageIcon(getClass().getResource(icn_3));
	icn9.setDescription("3");
	icn_img.add(icn9);
	// 10
	ImageIcon icn10 = new ImageIcon(getClass().getResource(icn_2));
	icn10.setDescription("2");
	icn_img.add(icn10);
	// 11
	ImageIcon icn11 = new ImageIcon(getClass().getResource(icn_5));
	icn11.setDescription("5");
	icn_img.add(icn11);
	// 12
	ImageIcon icn12 = new ImageIcon(getClass().getResource(icn_1));
	icn12.setDescription("1");
	icn_img.add(icn12);
	// 13
	ImageIcon icn13 = new ImageIcon(getClass().getResource(icn_4));
	icn13.setDescription("4");
	icn_img.add(icn13);
	// 14
	ImageIcon icn14 = new ImageIcon(getClass().getResource(icn_7));
	icn14.setDescription("7");
	icn_img.add(icn14);
	// 15
	ImageIcon icn15 = new ImageIcon(getClass().getResource(icn_8));
	icn15.setDescription("8");
	icn_img.add(icn15);
	// 16
	ImageIcon icn16 = new ImageIcon(getClass().getResource(icn_6));
	icn16.setDescription("6");
	icn_img.add(icn16);
	// To randomize the list
	Collections.shuffle(icn_img);

    }
    /**
     * Turn the cards back to its initial state
     */
    private void ResetBoard()
    {
	btn_0.setEnabled(true);
	btn_1.setEnabled(true);
	btn_2.setEnabled(true);
	btn_3.setEnabled(true);
	btn_4.setEnabled(true);
	btn_5.setEnabled(true);
	btn_6.setEnabled(true);
	btn_7.setEnabled(true);
	btn_8.setEnabled(true);
	btn_9.setEnabled(true);
	btn_10.setEnabled(true);
	btn_11.setEnabled(true);
	btn_12.setEnabled(true);
	btn_13.setEnabled(true);
	btn_14.setEnabled(true);
	btn_15.setEnabled(true);
	gameScore=-1;
	cardsCount = 0;
	matchedCards=0;
	txt_Score.setText("3000");
	
    }
}
