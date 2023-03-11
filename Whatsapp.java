import java.awt.*;

import javax.swing.*;



public class Whatsapp{

    public static void main(String[] args){

        //Adding Icon to frame
        ImageIcon image1 = new ImageIcon("icon.png");
        ImageIcon image2 = new ImageIcon("search.png");
        ImageIcon image3 = new ImageIcon("drop.png");
        ImageIcon image4 = new ImageIcon("archive.png");

        //Creating a new Frame
        JFrame frame = new JFrame("WhatsApp");
        
        frame.setSize(360,560);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setIconImage(image1.getImage());

        //Creating sub-Panel for the frame
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(8,1,0,0));
       
        panel1.setBackground(new Color(7,94,84));
        panel2.setBackground(new Color(7,25,35)); 

        panel1.setPreferredSize(new Dimension(400,80));
        panel2.setPreferredSize(new Dimension(400,420));

        //Adding components to frame
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.CENTER);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Creating the Labels for Panel:1

        //Label:1
        JLabel label1 = new JLabel("   WhatsApp");
        label1.setFont(new Font("",Font.PLAIN,20));
        label1.setBounds(0,0,100,80);
        label1.setForeground(Color.WHITE);   

        //Creating a Search and Menu panel
        JPanel s_and_m = new JPanel();
        s_and_m.setLayout(new GridLayout(1,2,0,0));
        s_and_m.setBackground(new Color(7,94,84));

        JButton search_button = new JButton();
        search_button.setIcon(image2);
        search_button.setOpaque(false);
        search_button.setContentAreaFilled(false);
        search_button.setBorderPainted(false);
//////////////////////////////////////////////////////////////////////////
        // JMenuBar menuBar = new JMenuBar();
        
        
        // JMenuItem loadItem = new JMenuItem("Load");
        // JMenuItem saveItem = new JMenuItem("Save");
        // JMenuItem exitItem = new JMenuItem("Exit");

        
/////////////////////////////////////////////////

        JButton menu_button = new JButton();
        menu_button.setIcon(image3);
        menu_button.setOpaque(false);
        menu_button.setContentAreaFilled(false);
        menu_button.setBorderPainted(false);
        
        // JMenu fileMenu = new JMenu("File"); 
        
        // fileMenu.add(loadItem);
        // fileMenu.add(saveItem);
        // fileMenu.add(exitItem);

        // menuBar.add(fileMenu);
        //Creating a PopUpMenu for the Menu button....
        // final JPopupMenu contextMenu = new JPopupMenu();
        // contextMenu.add(("Save"));
        // contextMenu.add(("Save As"));
        // contextMenu.add(("Close"));
        
        // menu_button.setComponentPopupMenu( contextMenu );

        //Adding buttons to Search and Menu Panel
        s_and_m.add(search_button);
        s_and_m.add(menu_button);
        // s_and_m.add(menuBar);
        
        JPanel menu_panel = new JPanel();
        menu_panel.setLayout(new GridLayout(1,3,0,0));
        menu_panel.setBackground(new Color(7,94,84));

        JButton chats_button = new JButton("CHATS");
        chats_button.setForeground(Color.lightGray);
        chats_button.setOpaque(false);
        chats_button.setContentAreaFilled(false);
        chats_button.setBorderPainted(false);

        JButton status_button = new JButton("STATUS");
        status_button.setForeground(Color.lightGray);
        status_button.setOpaque(false);
        status_button.setContentAreaFilled(false);
        status_button.setBorderPainted(false);
        
        JButton calls_button = new JButton("CALLS");
        calls_button.setForeground(Color.lightGray);
        calls_button.setOpaque(false);
        calls_button.setContentAreaFilled(false);
        calls_button.setBorderPainted(false);


        menu_panel.add(chats_button);
        menu_panel.add(status_button);
        menu_panel.add(calls_button);

        panel1.add(label1,BorderLayout.WEST);
        panel1.add(s_and_m,BorderLayout.EAST);
        panel1.add(menu_panel,BorderLayout.SOUTH);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Objects for Panel:2
        //The Archive button
        JButton button1 = new JButton(" Archived");
        button1.setHorizontalAlignment(JButton.LEFT);
        button1.setForeground(Color.lightGray);
        button1.setIcon(image4);
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);

        //Adding Label-> People for this Panel
        ImageIcon ada = new ImageIcon("1.png");
        ImageIcon andy = new ImageIcon("2.png");
        ImageIcon audrey = new ImageIcon("3.png");
        ImageIcon barak = new ImageIcon("4.png");
        ImageIcon charlie = new ImageIcon("5.png");
        ImageIcon charlotte = new ImageIcon("6.png");
        ImageIcon david = new ImageIcon("7.png");      

        JButton button2 = new JButton("   Ada Lovelace");
        button2.setHorizontalAlignment(JButton.LEFT);
        button2.setForeground(Color.white);
        button2.setIcon(ada);
        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        
        JButton button3 = new JButton("   Andy Warhol");
        button3.setHorizontalAlignment(JButton.LEFT);
        button3.setForeground(Color.white);
        button3.setIcon(andy);
        button3.setOpaque(false);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);

        JButton button4 = new JButton("   Audrey Hepburn");
        button4.setHorizontalAlignment(JButton.LEFT);
        button4.setForeground(Color.white);
        button4.setIcon(audrey);
        button4.setOpaque(false);
        button4.setContentAreaFilled(false);
        button4.setBorderPainted(false);

        JButton button5 = new JButton("   Barack Obama");
        button5.setHorizontalAlignment(JButton.LEFT);
        button5.setForeground(Color.white);
        button5.setIcon(barak);
        button5.setOpaque(false);
        button5.setContentAreaFilled(false);
        button5.setBorderPainted(false);

        JButton button6 = new JButton("   Charlie Chaplin");
        button6.setHorizontalAlignment(JButton.LEFT);
        button6.setForeground(Color.white);
        button6.setIcon(charlie);
        button6.setOpaque(false);
        button6.setContentAreaFilled(false);
        button6.setBorderPainted(false);

        JButton button7 = new JButton("   Charlotte Bronte");
        button7.setHorizontalAlignment(JButton.LEFT);
        button7.setForeground(Color.white);
        button7.setIcon(charlotte);
        button7.setOpaque(false);
        button7.setContentAreaFilled(false);
        button7.setBorderPainted(false);

        JButton button8 = new JButton("   David Bowie");
        button8.setHorizontalAlignment(JButton.LEFT);
        button8.setForeground(Color.white);
        button8.setIcon(david);
        button8.setOpaque(false);
        button8.setContentAreaFilled(false);
        button8.setBorderPainted(false);
        
        //Adding Components to Panel:2
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);

    }

}