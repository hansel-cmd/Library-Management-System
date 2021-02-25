package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6,b7;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {

            setBounds(400, 150, 1000, 800);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            setLocationRelativeTo(null);

            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(0, 153, 0));
            l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
            l1.setBounds(268, 8, 701, 80);
            contentPane.add(l1);

            JMenuBar menuBar = new JMenuBar();
            menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 102), new Color(255, 255, 102)));
            menuBar.setBackground(new Color(255, 255, 102));
            menuBar.setBounds(0, 10, 1000, 85);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Menu");
            mnExit.setPreferredSize(new Dimension(75, 40));
            mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 25));

            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setPreferredSize(new Dimension(100, 40));
            mntmLogout.setBackground(new Color(211, 211, 211));
            mntmLogout.setForeground(new Color(105, 105, 105));
            mntmLogout.setBounds(95, 95, 95, 95);
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);

            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setPreferredSize(new Dimension(100, 40));
            mntmExit.setForeground(new Color(105, 105, 105));
            mntmExit.setBackground(new Color(211, 211, 211));
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);


//            JMenu mnHelp = new JMenu("Help");
//            mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));

//            JMenuItem mntmReadme = new JMenuItem("Read Me");
//            mntmReadme.setBackground(new Color(211, 211, 211));
//            mntmReadme.setForeground(new Color(105, 105, 105));
//            mnHelp.add(mntmReadme);

//            JMenuItem mntmAboutUs = new JMenuItem("About Us");
//            mntmAboutUs.setForeground(new Color(105, 105, 105));
//            mntmAboutUs.setBackground(new Color(211, 211, 211));
//            mntmAboutUs.addActionListener(this);
//            mnHelp.add(mntmAboutUs);

//            JMenu mnRecord = new JMenu("Record");
//            mnRecord.setFont(new Font("Trebuchet MS", Font.BOLD, 17));


//            JMenuItem bookdetails = new JMenuItem("Book Details");
//            bookdetails.addActionListener(this);
//            bookdetails.setBackground(new Color(211, 211, 211));
//            bookdetails.setForeground(Color.DARK_GRAY);
//            mnRecord.add(bookdetails);
//
//            JMenuItem studentdetails = new JMenuItem("Student Details");
//            studentdetails.setBackground(new Color(211, 211, 211));
//            studentdetails.setForeground(Color.DARK_GRAY);
//            studentdetails.addActionListener(this);
//            mnRecord.add(studentdetails);
//
//            menuBar.add(mnRecord);
//            menuBar.add(mnHelp);
            menuBar.add(mnExit);


            JLabel l2 = new JLabel("");
            l2.setVerticalAlignment(SwingConstants.TOP);
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/2.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(55, 160, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fifth.png"));
            Image i5 = i4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(305, 160, 159, 152);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/4.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(535, 160, 159, 152);
            contentPane.add(l4);

            b1 = new JButton("Add Books");
            b1.addActionListener(this);
            b1.setFont(new Font("Papyrus", Font.BOLD, 15));
            b1.setBackground(new Color(255, 0, 94));
            b1.setForeground(Color.WHITE);
            b1.setBounds(60, 320, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Issue Book");
            b2.addActionListener(this);
            b2.setFont(new Font("Papyrus", Font.BOLD, 15));
            b2.setBackground(new Color(255, 0, 94));
            b2.setForeground(Color.WHITE);
            b2.setBounds(313, 320, 139, 44);
            contentPane.add(b2);

            b3 = new JButton("Add Student");
            b3.addActionListener(this);
            b3.setFont(new Font("Papyrus", Font.BOLD, 15));
            b3.setBackground(new Color(255, 0, 94));
            b3.setForeground(Color.WHITE);
            b3.setBounds(532, 320, 167, 44);
            contentPane.add(b3);

            b5 = new JButton("Return Book");
            b5.addActionListener(this);
            b5.setFont(new Font("Papyrus", Font.BOLD, 15));
            b5.setBackground(new Color(255, 0, 94));
            b5.setForeground(Color.WHITE);
            b5.setBounds(760, 320, 167, 44);
            contentPane.add(b5);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sixth.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(760, 160, 159, 152);
            contentPane.add(l6);

            JPanel panel = new JPanel();
            panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(220, 20, 60)));
            panel.setBounds(20, 120, 950, 260);
            panel.setBackground(Color.WHITE);
            contentPane.add(panel);


            b4 = new JButton("Rent Details");
            b4.addActionListener(this);
            b4.setFont(new Font("Papyrus", Font.BOLD, 15));
            b4.setBackground(new Color(255, 0, 94));
            b4.setForeground(Color.WHITE);
            b4.setBounds(195, 620, 143, 41);
            contentPane.add(b4);

            b6 = new JButton("Book Details");
            b6.addActionListener(this);
            b6.setFont(new Font("Papyrus", Font.BOLD, 15));
            b6.setBackground(new Color(255, 0, 94));
            b6.setForeground(Color.WHITE);
            b6.setBounds(650, 620, 159, 41);
            contentPane.add(b6);

            b7 = new JButton("Student Details");
            b7.addActionListener(this);
            b7.setFont(new Font("Papyrus", Font.BOLD, 15));
            b7.setBackground(new Color(255, 0, 94));
            b7.setForeground(Color.WHITE);
            b7.setBounds(420, 620, 159, 41);
            contentPane.add(b7);

            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/third.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(180, 450, 159, 152);
            contentPane.add(l5);

            JLabel l7 = new JLabel("");
            ImageIcon i16  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/ib.png"));
            Image i17 = i16.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i18 = new ImageIcon(i17);
            l7 = new JLabel(i18);
            l7.setBounds(650, 450, 159, 152);
            contentPane.add(l7);

            JLabel l8 = new JLabel("");
            ImageIcon i20  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/si.png"));
            Image i21 = i20.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i22 = new ImageIcon(i21);
            l8 = new JLabel(i22);
            l8.setBounds(420, 450, 159, 152);
            contentPane.add(l8);

            JPanel panel2 = new JPanel();
            panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING,
				TitledBorder.TOP, null, new Color(233, 150, 122)));
            panel2.setBounds(20, 420, 950, 270);
            panel2.setBackground(Color.WHITE);
            contentPane.add(panel2);

            getContentPane().setBackground(Color.WHITE);
            contentPane.setBackground(Color.WHITE);
	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		        new Login_user().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            }
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new AddBook().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new IssueBook().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new Statistics().setVisible(true);
            }
            if(ae.getSource() == b5){
                this.setVisible(false);
                new ReturnBook().setVisible(true);
            
            }
            if(ae.getSource() == b6){
                this.setVisible(false);
                new BookDetails().setVisible(true);
            
            }

            if (ae.getSource() == b7) {
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }
            
        }

}
