package AdvancedLibrarySystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import AdvancedLibrarySystem.MainSystem;


public class MainSystem {

	public static void LoginModule() {
		 
		JFrame libraryManagementDashboard = new JFrame("Satanick's Library System Login!");    
		JPanel mainPanel = new JPanel();
		JLabel libraryManagementLabel = new JLabel("Library Management - JavaTpoint");
		JButton adminLoginButton = new JButton("Admin Login");
		JButton librarianLoginButton = new JButton("Librarian Login");
		
		ImageIcon img = new ImageIcon("C://the.png");
		libraryManagementDashboard.setIconImage(img.getImage());
		
		libraryManagementLabel.setBounds(100, 30, 200, 40);
		libraryManagementLabel.setLayout(null);
		libraryManagementLabel.setFont(new Font("Comic Sans", Font.BOLD, 12));    
		
		adminLoginButton.setBounds(120, 100, 150, 40);
		adminLoginButton.setFocusable(false);
		adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagementDashboard.dispose();
				adminLogin();
			}
		});
		
		librarianLoginButton.setBounds(120, 160, 150, 40);
		librarianLoginButton.setFocusable(false);
		librarianLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagementDashboard.dispose();
				librarianLogin();
			}
		});
		
		mainPanel.setLayout(null);
		mainPanel.add(libraryManagementLabel);
		mainPanel.add(adminLoginButton);
		mainPanel.add(librarianLoginButton);
		
		
		libraryManagementDashboard.setLocation(400, 100);
		libraryManagementDashboard.setSize(400, 300);
		libraryManagementDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libraryManagementDashboard.setLayout(null);
		libraryManagementDashboard.setVisible(true);	
		libraryManagementDashboard.add(mainPanel);
		libraryManagementDashboard.add(libraryManagementLabel);
		libraryManagementDashboard.add(adminLoginButton);
		libraryManagementDashboard.add(librarianLoginButton);
	}
	
	public static void adminLogin() {
		
		JFrame adminLoginFrame = new JFrame("Login as Admin");
		JPanel adminFramePanel = new JPanel();
		JLabel adminText = new JLabel("Hello!");
		JLabel adminUsername = new JLabel("Username:");
		JLabel adminPassword = new JLabel("Password:");
		JTextField adminUserInput = new JTextField();
		JPasswordField adminPassInput = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		ImageIcon img = new ImageIcon("C://the.png");
		adminLoginFrame.setIconImage(img.getImage());
		
		adminText.setBounds(150, 30, 200, 40);
		adminText.setFont(new Font("Comic Sans",Font.BOLD, 14));
		adminUsername.setBounds(50, 95, 80, 25);
		adminPassword.setBounds(50, 140, 80, 25);
		
	
		adminUserInput.setLayout(null);
		adminUserInput.setBounds(120, 95, 200, 25);
		adminPassInput.setLayout(null);
		adminPassInput.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(165, 190, 115, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = adminUserInput.getText();
				String password = adminPassInput.getText();
				
				if ((username.equals("Admin_01") && password.equals("AdminOne")) || (username.equals("Admin_02") && password.equals("AdminTwo")) || (username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "SUCCESFULLY LOGIN");
					adminLoginFrame.dispose();
					adminModule();

				} else if ((!username.equals("Admin_01") && password.equals("AdminOne")) || (!username.equals("Admin_02") && password.equals("AdminTwo")) || (!username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME.");
					
				} else if ((username.equals("Admin_01") && !password.equals("AdminOne")) || (username.equals("Admin_02") && !password.equals("AdminTwo")) || (username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT PASSWORD.");
					
				} else if ((!username.equals("Admin_01") && !password.equals("AdminOne")) || (!username.equals("Admin_02") && !password.equals("AdminTwo")) || (!username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME and PASSWORD.");
					
				} 
			}
		});
		

		adminFramePanel.setLayout(null);
		adminFramePanel.add(adminText);
		adminFramePanel.add(adminUsername);
		adminFramePanel.add(adminPassword);
		adminFramePanel.add(adminUserInput);
		adminFramePanel.add(adminPassInput);
		adminFramePanel.add(loginButton);
		
		adminLoginFrame.setLocation(400, 100);
		adminLoginFrame.setSize(400, 300);
		adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLoginFrame.setLayout(null);
		adminLoginFrame.setVisible(true);
		adminLoginFrame.add(adminFramePanel);
		adminLoginFrame.add(adminText);
		adminLoginFrame.add(adminUsername);
		adminLoginFrame.add(adminPassword);
		adminLoginFrame.add(adminUserInput);
		adminLoginFrame.add(adminPassInput);
		adminLoginFrame.add(loginButton);
		
	}
	
	public static void librarianLogin() {
		
		JFrame librarianLoginFrame = new JFrame("Login as Librarian");
		JPanel librarianFramePanel = new JPanel();
		JLabel librarianText = new JLabel("Hello!");
		JLabel librarianUsername = new JLabel("Username:");
		JLabel librarianPassword = new JLabel("Password:");
		JTextField librarianUserInput = new JTextField();
		JPasswordField librarianPassInput = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		ImageIcon img = new ImageIcon("C://the.png");
		librarianLoginFrame.setIconImage(img.getImage());
		
		librarianText.setBounds(140, 30, 200, 40);
		librarianText.setFont(new Font("Comic Sans",Font.BOLD, 14));
		librarianUsername.setBounds(50, 95, 80, 25);
		librarianPassword.setBounds(50, 140, 80, 25);
		
		librarianUserInput.setLayout(null);
		librarianUserInput.setBounds(120, 95, 200, 25);
		librarianPassInput.setLayout(null);
		librarianPassInput.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(165, 190, 115, 40);
		loginButton.addActionListener(new ActionListener() {
        
			public void actionPerformed(ActionEvent e) {
				String username = librarianUserInput.getText();
				String password = librarianPassInput.getText();
				
				if ((username.equals("Librarian_01") && password.equals("LibOne")) || (username.equals("Librarian_02") && password.equals("LibTwo")) || (username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "SUCCESFULLY LOGIN");
					librarianLoginFrame.dispose();
					librarianModule();
			
				} else if ((!username.equals("Librarian_01") && password.equals("LibOne")) || (!username.equals("Librarian_02") && password.equals("LibTwo")) || (!username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME.");
					
				} else if ((username.equals("Librarian_01") && !password.equals("LibOne")) || (username.equals("Librarian_02") && !password.equals("LibTwo")) || (username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT PASSWORD.");
					
				} else if ((!username.equals("Librarian_01") && !password.equals("LibOne")) || (!username.equals("Librarian_02") && !password.equals("LibTwo")) || (!username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME and PASSWORD.");
					
				} 
			}
		});
		
		librarianFramePanel.setLayout(null);
		librarianFramePanel.add(librarianText);
		librarianFramePanel.add(librarianUsername);
		librarianFramePanel.add(librarianPassword);
		librarianFramePanel.add(librarianUserInput);
		librarianFramePanel.add(librarianPassInput);
		librarianFramePanel.add(loginButton);
		
		librarianLoginFrame.setLocation(400, 100);
		librarianLoginFrame.setSize(400, 300);
		librarianLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianLoginFrame.setLayout(null);
		librarianLoginFrame.setVisible(true);
		librarianLoginFrame.add(librarianFramePanel);
		librarianLoginFrame.add(librarianText);
		librarianLoginFrame.add(librarianUsername);
		librarianLoginFrame.add(librarianPassword);
		librarianLoginFrame.add(librarianUserInput);
		librarianLoginFrame.add(librarianPassInput);
		librarianLoginFrame.add(loginButton);
		
	}
	
	public static void adminModule() {
		
		JFrame adminModuleFrame = new JFrame("Admin Module");
		JPanel adminModulePanel = new JPanel();
		JLabel adminModuleText = new JLabel("Welcome to NU Library System!");
		
		ImageIcon img = new ImageIcon("C://the.png");
		adminModuleFrame.setIconImage(img.getImage());
		
		adminModulePanel.setLayout(null);
		adminModulePanel.add(adminModuleText);
		
		adminModuleText.setBounds(90, 100, 300, 40);
		adminModuleText.setLayout(null);
		adminModuleText.setFont(new Font("Comic Sans", Font.BOLD, 14));
		
		adminModuleFrame.setLocation(400, 100);
		adminModuleFrame.setSize(400, 300);
		adminModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminModuleFrame.setLayout(null);
		adminModuleFrame.setVisible(true);
		adminModuleFrame.add(adminModulePanel);
		adminModuleFrame.add(adminModuleText);
	}
	
	public static void librarianModule() {
		
		JFrame libModuleFrame = new JFrame("Librarian Module");
		JPanel libModulePanel = new JPanel();
		JLabel libModuleText = new JLabel("Electronic Book Rental System");
                JLabel libBookList = new JLabel("List of Books");
                
                ImageIcon img = new ImageIcon("C://the.png");
                libModuleFrame.setIconImage(img.getImage());
		
		libModuleText.setBounds(135, 20, 300, 40);
		libModuleText.setLayout(null);
		libModuleText.setFont(new Font("Comic Sans", Font.BOLD, 14));
                
                libBookList.setBounds(200, 50, 200, 40);
		libBookList.setLayout(null);
		libBookList.setFont(new Font("Comic Sans", Font.BOLD, 14));
		
		JLabel bookIndex1 = new JLabel("1.");
		bookIndex1.setBounds(50, 100, 80, 25);
		JLabel bookIndex2 = new JLabel("2.");
		bookIndex2.setBounds(50, 130, 80, 25);
		JLabel bookIndex3 = new JLabel("3.");
		bookIndex3.setBounds(50, 160, 80, 25);
		
		JLabel bookTitle1 = new JLabel("No Longer Human");
		bookTitle1.setBounds(70, 100, 150, 25);
		JLabel bookTitle2 = new JLabel("Crime and Punishment");
		bookTitle2.setBounds(70, 130, 150, 25);
		JLabel bookTitle3 = new JLabel("Seaside Dispatches 2");
		bookTitle3.setBounds(70, 160, 150, 25);
		
		JLabel bookAuthor1 = new JLabel("Osamu Dazai");
		bookAuthor1.setBounds(230, 100, 150, 25);
		JLabel bookAuthor2 = new JLabel("Fyodor Dostoevsky");
		bookAuthor2.setBounds(230, 130, 150, 25);
		JLabel bookAuthor3 = new JLabel("Deep-Sea Prisoner");
		bookAuthor3.setBounds(230, 160, 150, 25);
		
                JLabel bookCopy1 = new JLabel("3 Copies");
                bookCopy1.setBounds(360, 100, 150, 25);
                JLabel bookCopy2 = new JLabel("8 Copies");
                bookCopy2.setBounds(360, 130, 150, 25);
                JLabel bookCopy3 = new JLabel("10 Copies");
                bookCopy3.setBounds(360, 160, 150, 25);
                
		libModulePanel.setLayout(null);
		libModulePanel.add(libModuleText);
                libModulePanel.add(libBookList);
		libModulePanel.add(bookIndex1);
		libModulePanel.add(bookIndex2);
		libModulePanel.add(bookIndex3);
		libModulePanel.add(bookTitle1);
		libModulePanel.add(bookTitle2);
		libModulePanel.add(bookTitle3);
		libModulePanel.add(bookAuthor1);
		libModulePanel.add(bookAuthor2);
		libModulePanel.add(bookAuthor3);
                libModulePanel.add(bookCopy1);
                libModulePanel.add(bookCopy2);
                libModulePanel.add(bookCopy3);
		
		libModuleFrame.setLocation(400, 100);
		libModuleFrame.setSize(500, 265);
		libModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libModuleFrame.setLayout(null);
		libModuleFrame.setVisible(true);
		libModuleFrame.add(libModulePanel);
		libModuleFrame.add(libModuleText);
                libModuleFrame.add(libBookList);
		libModuleFrame.add(bookIndex1);
		libModuleFrame.add(bookIndex2);
		libModuleFrame.add(bookIndex3);
		libModuleFrame.add(bookTitle1);
		libModuleFrame.add(bookTitle2);
		libModuleFrame.add(bookTitle3);
		libModuleFrame.add(bookAuthor1);
		libModuleFrame.add(bookAuthor2);
		libModuleFrame.add(bookAuthor3);
                libModuleFrame.add(bookCopy1);
                libModuleFrame.add(bookCopy2);
                libModuleFrame.add(bookCopy3);
		
	}
	
	public static void main(String[] args) {
		LoginModule();
		
	}
}