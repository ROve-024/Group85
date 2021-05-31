/*
 * Created by JFormDesigner on Fri Apr 23 10:41:24 CST 2021
 */

package gui.member;

import controller.ClassFunction;
import controller.CoachFunction;
import gui.coach.ViewCoachProfile;
import gui.others.LessonBuffer;
import gui.others.UserBuffer;
import gui.others.ViewBuffer;
import gui.others.Warning;
import io.classes.ClassData;
import io.client.ClientData;
import io.coach.CoachData;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>
 *     This class is used to view course details.
 * </p>
 * @author Anna
 */
public class LessonDetailMember extends JFrame {
    public LessonDetailMember() {
        initComponents();
    }

    /**
     * <p>
     *     This function is used to join the live broadcast.
     * </p>
     * @param e
     */
    private void joinButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonVideo.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function is used to book coaching sessions.
     * </p>
     * @param e
     */
    private void bookButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        ClientData clientData = UserBuffer.getClientSession();
        int clientVIP = Integer.parseInt(clientData.getVIPlevel());
        System.out.println(clientVIP);
        if(clientVIP >= Integer.parseInt(this.classData.getVIPLevel())) {
            Book.run();
            this.dispose();
        } else {
            Warning.run("Sorry! Your VIP level is not enough!");
        }
    }

    /**
     * <p>
     *     This function is used to view the details of the course coach.
     * </p>
     * @param e
     */
    private void coachDetailButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewBuffer.setBuffer("");
        ViewBuffer.setBuffer(this.classData.getCoachID());
        ViewCoachProfile.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function returns a list of courses.
     * </p>
     * @param e
     */
    private void homeButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        LessonHomeMember.run();
        this.dispose();
    }

    /**
     * <p>
     *     This function defines the variables and layout structure of the GUI.
     * </p>
     */
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        body = new JPanel();
        decorationLine = new JLabel();
        title = new JLabel();
        lessonPicture = new JLabel();
        lessonName = new JLabel();
        lessonMsg = new JTextPane();
        joinButton = new JButton();
        bookButton = new JButton();
        coachAvatar = new JLabel();
        coachName = new JLabel();
        coachMsg = new JTextPane();
        coachDetailButton = new JButton();
        homeButton2 = new JButton();
        lessonType = new JLabel();
        needVIP = new JLabel();

        //======== this ========
        setBackground(Color.white);
        setIconImage(new ImageIcon(getClass().getResource("/resources/icons/gym.png")).getImage());
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== body ========
        {
            body.setBackground(Color.white);
            body.setBorder(null);
            body.setLayout(null);

            //---- decorationLine ----
            decorationLine.setBackground(Color.black);
            decorationLine.setBorder(LineBorder.createBlackLineBorder());
            body.add(decorationLine);
            decorationLine.setBounds(35, 115, 730, decorationLine.getPreferredSize().height);

            //---- title ----
            title.setText("Detail of Lesson ");
            title.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 32));
            title.setBackground(Color.white);
            body.add(title);
            title.setBounds(new Rectangle(new Point(25, 45), title.getPreferredSize()));

            //---- lessonPicture ----
            lessonPicture.setBorder(new LineBorder(Color.lightGray));
            lessonPicture.setHorizontalAlignment(SwingConstants.CENTER);
            lessonPicture.setIcon(null);
            body.add(lessonPicture);
            lessonPicture.setBounds(30, 165, 300, 251);

            //---- lessonName ----
            lessonName.setText("Lesson Name");
            lessonName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 32));
            lessonName.setBackground(Color.white);
            body.add(lessonName);
            lessonName.setBounds(350, 160, 305, 42);

            //---- lessonMsg ----
            lessonMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar sic tempor. Sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nam fermentum, nulla luctus pharetra vulputate, felis tellus mollis orci, sed rhoncus pronin sapien nunc accuan eget.");
            lessonMsg.setBackground(Color.white);
            lessonMsg.setBorder(null);
            lessonMsg.setCaretColor(Color.white);
            lessonMsg.setDisabledTextColor(Color.white);
            lessonMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            lessonMsg.setEditable(false);
            body.add(lessonMsg);
            lessonMsg.setBounds(350, 235, 398, 110);

            //---- joinButton ----
            joinButton.setText("JOIN NOW");
            joinButton.setBackground(SystemColor.menu);
            joinButton.setBorder(null);
            joinButton.addActionListener(e -> joinButtonActionPerformed(e));
            body.add(joinButton);
            joinButton.setBounds(350, 365, 100, 50);

            //---- bookButton ----
            bookButton.setText("BOOK(vip)");
            bookButton.setBackground(new Color(217, 0, 27));
            bookButton.setBorder(null);
            bookButton.setForeground(Color.white);
            bookButton.addActionListener(e -> bookButtonActionPerformed(e));
            body.add(bookButton);
            bookButton.setBounds(450, 365, 100, 50);

            //---- coachAvatar ----
            coachAvatar.setBorder(new LineBorder(Color.white));
            coachAvatar.setHorizontalAlignment(SwingConstants.CENTER);
            coachAvatar.setIcon(null);
            body.add(coachAvatar);
            coachAvatar.setBounds(30, 485, 75, 75);

            //---- coachName ----
            coachName.setText("Coach Name");
            coachName.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
            coachName.setBackground(Color.white);
            body.add(coachName);
            coachName.setBounds(115, 485, 400, 42);

            //---- coachMsg ----
            coachMsg.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo.");
            coachMsg.setBackground(Color.white);
            coachMsg.setBorder(null);
            coachMsg.setCaretColor(Color.white);
            coachMsg.setDisabledTextColor(Color.white);
            coachMsg.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
            coachMsg.setEditable(false);
            body.add(coachMsg);
            coachMsg.setBounds(115, 520, 530, 45);

            //---- coachDetailButton ----
            coachDetailButton.setText("DETAIL");
            coachDetailButton.setBackground(SystemColor.menu);
            coachDetailButton.setBorder(null);
            coachDetailButton.addActionListener(e -> coachDetailButtonActionPerformed(e));
            body.add(coachDetailButton);
            coachDetailButton.setBounds(650, 505, 100, 50);

            //---- homeButton2 ----
            homeButton2.setBorderPainted(false);
            homeButton2.setBackground(SystemColor.menu);
            homeButton2.setIcon(new ImageIcon(getClass().getResource("/resources/icons/home.png")));
            homeButton2.addActionListener(e -> homeButtonActionPerformed(e));
            body.add(homeButton2);
            homeButton2.setBounds(675, 45, 100, 40);

            //---- lessonType ----
            lessonType.setText("Type");
            lessonType.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
            body.add(lessonType);
            lessonType.setBounds(350, 200, 400, 30);

            //---- needVIP ----
            needVIP.setText("VIP");
            needVIP.setForeground(new Color(255, 100, 100));
            needVIP.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 16));
            body.add(needVIP);
            needVIP.setBounds(685, 175, 70, needVIP.getPreferredSize().height);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < body.getComponentCount(); i++) {
                    Rectangle bounds = body.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = body.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                body.setMinimumSize(preferredSize);
                body.setPreferredSize(preferredSize);
            }
        }
        contentPane.add(body);
        body.setBounds(0, 0, 800, 655);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel body;
    private JLabel decorationLine;
    private JLabel title;
    private JLabel lessonPicture;
    private JLabel lessonName;
    private JTextPane lessonMsg;
    private JButton joinButton;
    private JButton bookButton;
    private JLabel coachAvatar;
    private JLabel coachName;
    private JTextPane coachMsg;
    private JButton coachDetailButton;
    private JButton homeButton2;
    private JLabel lessonType;
    private JLabel needVIP;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        LessonDetailMember.run();
    }

    private String lessonID = LessonBuffer.getBuffer();
    ClassData classData = ClassFunction.searchClassByID(this.lessonID);

    /**
     * <p>
     *     This function provides the ability to run.
     * </p>
     */
    public static void run(){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LessonDetailMember frame = new LessonDetailMember();
                    frame.init();
                    Dimension screenSize =Toolkit.getDefaultToolkit().getScreenSize();
                    frame.setLocation(screenSize.width/2-400/2,screenSize.height/2-700/2);
                    frame.setResizable(false);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * <p>
     *     This function initializes the contents of the GUI.
     * </p>
     */
    private void init() {
        this.lessonName.setText(this.classData.getName());
        this.needVIP.setText("VIP " + this.classData.getVIPLevel());
        this.lessonMsg.setText(this.classData.getDetail());
        this.lessonType.setText(this.classData.getCategory());
        CoachData coachData = CoachFunction.searchCoachByID(this.classData.getCoachID());
        this.coachName.setText("Name: " + coachData.getName());
        this.coachMsg.setText("Phone: " + coachData.getPhonenumber());
        try{
            this.coachAvatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/" + coachData.getFileAddress())));
        }catch (NullPointerException miss){
            this.coachAvatar.setIcon(new ImageIcon(getClass().getResource("/resources/images/avatar/404.jpg")));
        }
        try{
            this.lessonPicture.setIcon(new ImageIcon(getClass().getResource("/resources/images/lessonPic/" + classData.getFileAddress())));
        }catch (NullPointerException miss){
            this.lessonPicture.setIcon(new ImageIcon(getClass().getResource("/resources/images/lessonPic/404.png")));
        }
    }
}
