package coursework1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.border.*;

/**
 *
 * @author Jakub Bachniak
 */
public class UniGui {
    
    private JFrame frame;
    private JPanel content;
    private JPanel contentPane;
    
    // hold reference to logged in user of the system
    private String loggedInUser;
    
    /**
     * Create the window and show it on screen
     * 
     */
    public UniGui() {
        
        makeFrame();
        showChooseUserScreen();
    }
    
    // define the main frame
    private void makeFrame(){
        // initialise new frame object - create window - the top level container
        frame = new JFrame("University staff management sytem");
        //frame.setMinimumSize(new Dimension(800, 500));
        // define default action when the window is closed using JFrams's constant
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create main container as JPanel
        content = new JPanel();
        // make the component to be the contentPane
        frame.setContentPane(content);
        // set the content pane layout
        content.setLayout(new BorderLayout());
        // create content pane to add components
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
        content.add(contentPane, BorderLayout.CENTER);       
        frame.pack();
        frame.setVisible(true);
    }
    
    private void showChooseUserScreen() {
        JLabel chooseUser = new JLabel("Please choose from the three options below and click your button");
        chooseUser.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.add(chooseUser, BorderLayout.NORTH);
        contentPane.add(userButtonsPanel(), BorderLayout.CENTER);
        frame.repaint();
        frame.pack();
        
    }
    private JPanel userButtonsPanel() {
        // outer container for adding document panel
        JPanel userCategoryCollection = new JPanel();
        // inner 'add category' panel for setting up Layout
        JPanel userCategoryCollectionLayout = new JPanel();
        userCategoryCollectionLayout.setLayout(new BoxLayout(userCategoryCollectionLayout, BoxLayout.X_AXIS));     
        userCategoryCollection.add(userCategoryCollectionLayout);
        // Create buttons to choose user
        JButton createStudentButton = new JButton("Student");
        // add action action listener
        createStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                studentsMenu();
            }
        });
        JButton createResearcherButton = new JButton("Resercher");
        JButton createVisitorButton = new JButton("Visitor");
        userCategoryCollectionLayout.add(createStudentButton);
        userCategoryCollectionLayout.add(createResearcherButton);
        userCategoryCollectionLayout.add(createVisitorButton);
        
        return userCategoryCollection;
    }
    
    // students' gui components
    // to be moved to seperate studentsGui class
    private JPanel studentsMenu() {
        JPanel studentsMenuCollection = new JPanel();
        studentsMenuCollection.setLayout(new BoxLayout(studentsMenuCollection, BoxLayout.Y_AXIS));
        JLabel studentsOptionsLabel = new JLabel("Enter your student's id number and click button to login.");
        // create text field
        JTextField studentIdTextField = new JTextField();
        studentIdTextField.setBounds(10, 10, 10, 10);
        // create button to submit input studentId
        JButton studnetIdButton = new JButton("Login");
        
        studentsMenuCollection.add(studentsOptionsLabel);
        studentsMenuCollection.add(studentIdTextField);
        studentsMenuCollection.add(studnetIdButton);
        
        // refresh
        contentPane.removeAll();
        contentPane.add(studentsMenuCollection);
        frame.repaint();
        frame.pack();
        
        return studentsMenuCollection;
    }
         
}
