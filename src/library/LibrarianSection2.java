/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LibrarianSection2 extends JFrame implements ActionListener {

    JLabel l1;
    JPanel panel;
    Font f, f1;

    LibrarianSection2() {
        super("Librarian Section");
        setLocation(0, 0);
        setSize(1500, 800);

        f = new Font("Arial", Font.BOLD, 25);
        f1 = new Font("Arial", Font.BOLD, 20);

        // Create a JPanel to hold the components
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);

        JMenuBar menuBar = new JMenuBar();

        JMenu addMenu = new JMenu("Add Info");
        JMenuItem addBookMenuItem = new JMenuItem("Add Book");
        addBookMenuItem.addActionListener(this);
        addMenu.add(addBookMenuItem);

        JMenu viewMenu = new JMenu("View Info");
        JMenuItem viewBookMenuItem = new JMenuItem("View Book");
        viewBookMenuItem.addActionListener(this);
        JMenuItem viewIssueBookMenuItem = new JMenuItem("View Issue Book");
        viewIssueBookMenuItem.addActionListener(this);
        viewMenu.add(viewBookMenuItem);
        viewMenu.add(viewIssueBookMenuItem);

        JMenu issueMenu = new JMenu("Issue Info");
        JMenuItem issueBookMenuItem = new JMenuItem("Issue Book");
        issueBookMenuItem.addActionListener(this);
        issueMenu.add(issueBookMenuItem);

        JMenu returnMenu = new JMenu("Return");
        JMenuItem returnBookMenuItem = new JMenuItem("Return Book");
        returnBookMenuItem.addActionListener(this);
        returnMenu.add(returnBookMenuItem);

        JMenu exitMenu = new JMenu("Exit");
        JMenuItem logoutMenuItem = new JMenuItem("Logout");
        logoutMenuItem.addActionListener(this);
        exitMenu.add(logoutMenuItem);

        menuBar.add(addMenu);
        menuBar.add(viewMenu);
        menuBar.add(issueMenu);
        menuBar.add(returnMenu);
        menuBar.add(exitMenu);

        addMenu.setFont(f);
        viewMenu.setFont(f);
        issueMenu.setFont(f);
        returnMenu.setFont(f);
        exitMenu.setFont(f);

        addBookMenuItem.setFont(f1);
        viewBookMenuItem.setFont(f1);
        viewIssueBookMenuItem.setFont(f1);
        issueBookMenuItem.setFont(f1);
        returnBookMenuItem.setFont(f1);
        logoutMenuItem.setFont(f1);

        // Add the panel to the JFrame
        setJMenuBar(menuBar);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Add Book")) {
            new AddBook().setVisible(true);
        } else if (command.equals("View Book")) {
            new ViewBook().setVisible(true);
        } else if (command.equals("View Issue Book")) {
            System.out.println("View Issue Book");
        } else if (command.equals("Issue Book")) {
            new IssueBook().setVisible(true);
        } else if (command.equals("Return Book")) {
            new ReturnBook().setVisible(true);
        } else if (command.equals("Logout")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new LibrarianSection2();
    }
}
