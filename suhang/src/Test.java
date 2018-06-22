import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.BevelBorder;

public class Test extends JFrame {

	String[] titles;
	Object[][] stats;
	
	public Test() {
		super("Network Scanner");

		String myIP;
		String myHostName;
		
		InetAddress ia = null;
		try {
			ia = InetAddress.getLocalHost();
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// menu begin
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu scanMenu = new JMenu("Scan");
		JMenu gotoMenu = new JMenu("Go to");
		JMenu CommandsMenu = new JMenu("Commands");
		JMenu favoriteMenu = new JMenu("Favorites");
		JMenu toolsMenu = new JMenu("Tools");
		JMenu helpMenu = new JMenu("Help");
		JMenu openMenu = new JMenu("open");
		JMenu SelectionMenu = new JMenu("Selection");
		
		
		menuBar.add(scanMenu);
		menuBar.add(gotoMenu);
		menuBar.add(CommandsMenu);
		menuBar.add(favoriteMenu);
		menuBar.add(toolsMenu);
		menuBar.add(helpMenu);
		

		JMenuItem loadFromFile = new JMenuItem("Load From Item");
		JMenuItem exportAll = new JMenuItem("Export All");
		JMenuItem exportSelection = new JMenuItem("Export Selection");
		JMenuItem quitAction = new JMenuItem("Quit");

		scanMenu.add(loadFromFile);
		scanMenu.add(exportAll);
		scanMenu.add(exportSelection);
		scanMenu.addSeparator();
		scanMenu.add(quitAction);
		
		
		JMenuItem nextAliveHost = new JMenuItem("Next alive host");
		JMenuItem nextOpenPort = new JMenuItem("Next open port");
		JMenuItem nextDeadHost = new JMenuItem("Next dead host");
		JMenuItem previousAlivehost = new JMenuItem("Previous alive host");
		JMenuItem previousOpenPort = new JMenuItem("Previous open port");
		JMenuItem preciousdeadHost = new JMenuItem("Previous dead host");
		JMenuItem findAction = new JMenuItem("Find");
		
		gotoMenu.add(nextAliveHost);
		gotoMenu.add(nextOpenPort);
		gotoMenu.add(nextDeadHost);
		gotoMenu.addSeparator();
		gotoMenu.add(previousAlivehost);
		gotoMenu.add(previousOpenPort);
		gotoMenu.add(preciousdeadHost);
		gotoMenu.addSeparator();
		gotoMenu.add(findAction);
		
		JMenuItem showDetails = new JMenuItem("Show details");
		JMenuItem rescanIP = new JMenuItem("Rescan IP(s)");
		JMenuItem deletIP = new JMenuItem("Delete IP(s)");
		JMenuItem copyIP = new JMenuItem("Copy IP");
		JMenuItem copyDetails = new JMenuItem("Copy details");
		

		
		JMenuItem Action1 = new JMenuItem("Edit openers...");
		JMenuItem Action2 = new JMenuItem("Windows Shares");
		JMenuItem Action3 = new JMenuItem("Web Browser");
		JMenuItem Action4 = new JMenuItem("FTP");
		JMenuItem Action5 = new JMenuItem("Telnet");
		JMenuItem Action6 = new JMenuItem("Ping");
		JMenuItem Action7 = new JMenuItem("Trace route");
		JMenuItem Action8 = new JMenuItem("Geo locate");
		JMenuItem Action9 = new JMenuItem("E-mail sample");
		JMenuItem Action10 = new JMenuItem("Alive hosts");
		JMenuItem Action11 = new JMenuItem("Dead hosts");
		JMenuItem Action12 = new JMenuItem("with open ports");
		JMenuItem Action13 = new JMenuItem("without open ports");
		JMenuItem Action14 = new JMenuItem("Invert selection");
		

		CommandsMenu.add(showDetails);
		CommandsMenu.addSeparator();
		CommandsMenu.add(rescanIP);
		CommandsMenu.add(deletIP);
		CommandsMenu.addSeparator();
		CommandsMenu.add(copyIP);
		CommandsMenu.add(copyDetails);
		CommandsMenu.addSeparator();
		CommandsMenu.add(openMenu);
		
		CommandsMenu.add(openMenu);
		openMenu.add(Action1);
		openMenu.addSeparator();
		openMenu.add(Action2);
		openMenu.add(Action3);
		openMenu.add(Action4);
		openMenu.add(Action5);
		openMenu.add(Action6);
		openMenu.add(Action7);
		openMenu.add(Action8);
		openMenu.add(Action9);
		
		SelectionMenu.add(Action10);
		SelectionMenu.add(Action11);
		SelectionMenu.add(Action12);
		SelectionMenu.add(Action13);
		SelectionMenu.addSeparator();
		SelectionMenu.add(Action14);
		
		JMenuItem addCurrent = new JMenuItem("Add current");
		JMenuItem manageFavorite = new JMenuItem("Manage favorites");
		
		favoriteMenu.add(addCurrent);
		favoriteMenu.add(manageFavorite);
		favoriteMenu.addSeparator();
		
		JMenuItem prefrence = new JMenuItem("Preference");
		JMenuItem fetchers = new JMenuItem("Fetchers");
		JMenuItem scanStatics = new JMenuItem("Scan statistics");
		
		toolsMenu.add(prefrence);
		toolsMenu.add(fetchers);
		toolsMenu.addSeparator();
		toolsMenu.add(SelectionMenu);
		toolsMenu.add(scanStatics);
		
		JMenuItem gettingStarted = new JMenuItem("Getting Started");
		JMenuItem officialWebsite = new JMenuItem("Official Website");
		JMenuItem faqAction = new JMenuItem("FAQ");
		JMenuItem reportAnIssue = new JMenuItem("Report an issue");
		JMenuItem pluginsAction = new JMenuItem("Plugins");
		JMenuItem commandLineUsage = new JMenuItem("Command-line usage");
		JMenuItem checkForNewerVersion = new JMenuItem("Check for newer version");
		JMenuItem aboutAction = new JMenuItem("About");

		helpMenu.add(gettingStarted);
		helpMenu.addSeparator();
		helpMenu.add(officialWebsite);
		helpMenu.add(faqAction);
		helpMenu.add(reportAnIssue);
		helpMenu.add(pluginsAction);
		helpMenu.addSeparator();
		helpMenu.add(commandLineUsage);
		helpMenu.addSeparator();
		helpMenu.add(checkForNewerVersion);
		helpMenu.addSeparator();
		helpMenu.add(aboutAction);
		// menu end
		
		
		
		// toolbar begin
		JToolBar toolbar1 = new JToolBar();
		toolbar1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JToolBar toolbar2 = new JToolBar();
		toolbar2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel iprangeLabel = new JLabel("IP Range:");
		JTextField ipStartTextField = new JTextField(10);
		ipStartTextField.setPreferredSize(new Dimension(90, 30));
		JLabel toLabel = new JLabel("to ");
		JTextField ipEndTextField = new JTextField(10);
		ipEndTextField.setPreferredSize(new Dimension(90, 30));
		JComboBox sourceSelectionComboBox = new JComboBox();
		sourceSelectionComboBox.addItem("IP Range");
		sourceSelectionComboBox.addItem("Random");
		sourceSelectionComboBox.addItem("File");
		
		iprangeLabel.setPreferredSize(new Dimension(70, 30));
		toLabel.setPreferredSize(new Dimension(20, 30));
		sourceSelectionComboBox.setPreferredSize(new Dimension(90, 30));
		
		
		JButton btset;
		ImageIcon img1 = new ImageIcon("./Start/set.jpg");
		btset= new JButton(img1);
		btset.setPreferredSize(new Dimension(35, 30));

		
		
		JButton btline;
		ImageIcon img2 = new ImageIcon("./Start/line.jpg");
		btline= new JButton(img2);
		btline.setPreferredSize(new Dimension(35, 30));
		
		
		
		toolbar1.add(iprangeLabel);
		toolbar1.add(ipStartTextField);
		toolbar1.add(toLabel);
		toolbar1.add(ipEndTextField);
		toolbar1.add(sourceSelectionComboBox);
		toolbar1.add(btset);
		
		JLabel hostNameLabel = new JLabel("Hostname: ");
		JTextField hostNameTextField = new JTextField(10);
		hostNameTextField.setPreferredSize(new Dimension(90, 30));
		JButton ipButton = new JButton("IP ↑");
		JComboBox netMaskComboBox = new JComboBox();
		netMaskComboBox.addItem("Netmask");
		netMaskComboBox.addItem("/26");
		netMaskComboBox.addItem("/24");
		netMaskComboBox.addItem("/16");
		netMaskComboBox.addItem("255...192");
		netMaskComboBox.addItem("255...128");
		netMaskComboBox.addItem("255...0");
		netMaskComboBox.addItem("255..0.0");
		netMaskComboBox.addItem("255.0.0.0");
		JButton startButton = new JButton("▶ Start");

		hostNameLabel.setPreferredSize(new Dimension(72, 30));
		ipButton.setPreferredSize(new Dimension(40, 30));
		netMaskComboBox.setPreferredSize(new Dimension(92, 30));
		startButton.setPreferredSize(new Dimension(90, 30));
		
		toolbar2.add(hostNameLabel);
		toolbar2.add(hostNameTextField);
		toolbar2.add(ipButton);
		toolbar2.add(netMaskComboBox);
		toolbar2.add(startButton);
		toolbar2.add(btline);

		JPanel pane = new JPanel(new BorderLayout());
		pane.add(toolbar1, BorderLayout.NORTH);
		pane.add(toolbar2, BorderLayout.SOUTH);
		
		add(pane, BorderLayout.NORTH);
		// toolbar end
		
		// table begin
		titles = new String[] {"IP", "Ping", "TTL", "Hostname", "Port"};
		stats = initializeTable();
		
		JTable jTable = new JTable(stats, titles);
		
		JScrollPane jScrollPane = new JScrollPane(jTable);
		add(jScrollPane, BorderLayout.CENTER);
		// table end
		
		//statusbar start
		JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(statusPanel, BorderLayout.SOUTH);
		JLabel readyLabel = new JLabel("Ready");
		JLabel displayLabel = new JLabel("Display All");
		JLabel threadLabel = new JLabel("Thread: 0");
		statusPanel.add(readyLabel);
		statusPanel.add(displayLabel);
		statusPanel.add(threadLabel);
		readyLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		displayLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		threadLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		readyLabel.setPreferredSize(new Dimension(300, 20));
		displayLabel.setPreferredSize(new Dimension(150, 20));
		threadLabel.setPreferredSize(new Dimension(150, 20));
		/*readyLabel.setFont(myFont);
		displayLabel.setFont(myFont);
		threadLabel.setFont(myFont);*/
		// statusbar end
		
		quitAction.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		loadFromFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		exportAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		exportSelection.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});
		
		showDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		rescanIP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		deletIP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		copyIP.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		copyDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		
		
		Action2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		Action3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});

		Action4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

	Action5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

	Action6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

	Action7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

	Action8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

	Action9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});




		
		myIP = ia.getHostAddress();
		myHostName = ia.getHostName();
		
		String fixedIP = myIP.substring(0, myIP.lastIndexOf(".") + 1);
		
		
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, " 실행을 시작합니다.", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				if(e.getSource()==startButton)
					startButton.setText("■ stop");
				Pinging[] pg = new Pinging[254];
				
				for(int i=0; i<254; i++) {
					pg[i] = new Pinging(fixedIP+(i+1));
					pg[i].start();
				}
				for(int i=0; i<254; i++) {
					Object[] msg = pg[i].getMsg();
					stats[i][0] = msg[0];
					if(msg[1] != null)
						stats[i][1] = msg[1];
					else
						stats[i][1] = "[n/a]";
					if(msg[2] != null)
						stats[i][2] = msg[2];

					else							
						stats[i][2] = "[n/s]";
					if(msg[3] != null)
						stats[i][3] = msg[3];
					else
						stats[i][3] = "[n/a]";
					stats[i][4] = "[n/s]";

					if(msg[2] == null) 
						stats[i][3] = "[n/s]";
					
					
				}
		
				for(int i=0; i<254; i++) {
					//port scan
					if(stats[i][1] != "[n/a]" || 
							stats[i][2] != "[n/s]" || stats[i][3] != "[n/s]") {
						
					}
				}
				jTable.repaint();
				JOptionPane.showMessageDialog(null, "실행완료!", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		ipStartTextField.setText(fixedIP + 1);
		ipEndTextField.setText(fixedIP + 254);
		hostNameTextField.setText(myHostName);
		
		
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	private Object[][] initializeTable() {
		// TODO Auto-generated method stub
		Object[][] results = new Object[254][titles.length];
		return results;
	}
	private Object[][] getPingStats(String string) {
		Object[][] results = new Object[254][titles.length];
		for(int i=0; i<254; i++) {
			
			results[i][0] = string + (i + 1);
			results[i][1] = "[n/a]";
			results[i][2] = "[n/s]";
			results[i][3] = "[n/s]";
			results[i][4] = "[n/s]";
			
			
		}
		
		
		return results;
	}
	public static void main(String[] args) {
		Test test = new Test();
	}

}



