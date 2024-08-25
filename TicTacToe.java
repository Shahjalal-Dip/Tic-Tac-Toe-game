package Tic_Tac_Toe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe extends JFrame implements ActionListener {
    private Container c;
    private ImageIcon icon,icon1,icon2,icon3,icon4;
    private GridLayout gLayout;
    private JPanel jp;
    private JButton [][]B;
    private JButton B1;
    private Font f1;
    private JLabel jl,jl1;
    private Cursor cursor;

    TicTacToe(){
        initComponents();
    }
    public void initComponents() {
        c = this.getContentPane();
        c.setBackground(Color.ORANGE);
        c.setLayout(null);

        f1= new Font("Arial",Font.BOLD,20);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        icon = new ImageIcon(getClass().getResource("tic-tac-toe.png"));
        this.setIconImage(icon.getImage());
        icon1 = new ImageIcon("F:/Anisul Islam (JAVA Swing)/Dialogue Window/Tic_Tac_Toe/tic-tac-toe (1).png");
        icon2 = new ImageIcon(getClass().getResource("reset.png"));
        icon3 = new ImageIcon(getClass().getResource("happy.png"));
        icon4 = new ImageIcon(getClass().getResource("emoji.png"));

        jl = new JLabel(icon1);
        jl.setBounds(55,20,icon1.getIconWidth(),icon1.getIconHeight());
        c.add(jl);

        jl1 = new JLabel("Let's Play TIC_TAC_TOE");
        jl1.setBounds(20,290,250,60);
        jl1.setFont(f1);
        c.add(jl1);

        B1=new JButton(icon2);
        B1.setBounds(300,350,45,45);
        B1.setFont(f1);
        c.add(B1);

        B=new JButton[3][3];

        B[0][0] = new JButton();
        B[0][0].setFont(f1);
        B[0][0].setCursor(cursor);
        B[0][1] = new JButton();
        B[0][1].setFont(f1);
        B[0][1].setCursor(cursor);
        B[0][2] = new JButton();
        B[0][2].setFont(f1);
        B[0][2].setCursor(cursor);
        B[1][0] = new JButton();
        B[1][0].setFont(f1);
        B[1][0].setCursor(cursor);
        B[1][1] = new JButton();
        B[1][1].setFont(f1);
        B[1][1].setCursor(cursor);
        B[1][2] = new JButton();
        B[1][2].setFont(f1);
        B[1][2].setCursor(cursor);
        B[2][0] = new JButton();
        B[2][0].setFont(f1);
        B[2][0].setCursor(cursor);
        B[2][1] = new JButton();
        B[2][1].setFont(f1);
        B[2][1].setCursor(cursor);
        B[2][2] = new JButton();
        B[2][2].setFont(f1);
        B[2][2].setCursor(cursor);

        gLayout = new GridLayout(3, 3, 5, 5);
        jp = new JPanel(gLayout);
        jp.setBounds(80, 380, 200, 200);
        jp.setBackground(Color.DARK_GRAY);
        c.add(jp);

        jp.add(B[0][0]);
        jp.add(B[0][1]);
        jp.add(B[0][2]);
        jp.add(B[1][0]);
        jp.add(B[1][1]);
        jp.add(B[1][2]);
        jp.add(B[2][0]);
        jp.add(B[2][1]);
        jp.add(B[2][2]);

        B[0][0].addActionListener(this);
        B[0][1].addActionListener(this);
        B[0][2].addActionListener(this);
        B[1][0].addActionListener(this);
        B[1][1].addActionListener(this);
        B[1][2].addActionListener(this);
        B[2][0].addActionListener(this);
        B[2][1].addActionListener(this);
        B[2][2].addActionListener(this);
        B1.addActionListener(this);
    }
    public void erase(){
        B[0][0].setText("");
        B[0][1].setText("");
        B[0][2].setText("");
        B[1][0].setText("");
        B[1][1].setText("");
        B[1][2].setText("");
        B[2][0].setText("");
        B[2][1].setText("");
        B[2][2].setText("");
    }
	
	 public void user(){
        if (B[0][0].getText().equals("O") && B[0][1].getText().equals( "O") && B[0][2].getText().equals("O")){
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[1][0].getText().equals("O") && B[1][1].getText().equals( "O") && B[1][2].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[2][0].getText().equals("O") && B[2][1].getText().equals( "O") && B[2][2].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[0][0].getText().equals("O") && B[1][0].getText().equals( "O") && B[2][0].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[0][1].getText().equals("O") && B[1][1].getText().equals( "O") && B[2][1].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[0][2].getText().equals("O") && B[1][2].getText().equals( "O") && B[2][2].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[0][0].getText().equals("O") && B[1][1].getText().equals( "O") && B[2][2].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        } else if (B[2][0].getText().equals("O") && B[1][1].getText().equals( "O") && B[0][2].getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "You're Winner", "Congratulation", JOptionPane.PLAIN_MESSAGE,icon3);
            erase();
        }
    }
	
	 public void computer(){
        if (B[0][0].getText().equals("X") && B[0][1].getText().equals( "X") && B[0][2].getText().equals("X")){
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[1][0].getText().equals("X") && B[1][1].getText().equals( "X") && B[1][2].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[2][0].getText().equals("X") && B[2][1].getText().equals( "X") && B[2][2].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[0][0].getText().equals("X") && B[1][0].getText().equals( "X") && B[2][0].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[0][1].getText().equals("X") && B[1][1].getText().equals( "X") && B[2][1].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[0][2].getText().equals("X") && B[1][2].getText().equals( "X") && B[2][2].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[0][0].getText().equals("X") && B[1][1].getText().equals( "X") && B[2][2].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        } else if (B[2][0].getText().equals("X") && B[1][1].getText().equals( "X") && B[0][2].getText().equals("X")) {
            JOptionPane.showMessageDialog(null, "Computer Winner", "It's hurt for you", JOptionPane.PLAIN_MESSAGE,icon4);
            erase();
        }
    }
 
    public void computer1(){
        Random ran = new Random();
        if (B[0][0].getText().equals("X") && B[0][1].getText().equals("X")&&B[0][2].getText().isEmpty()) {
            B[0][2].setText("X");
            computer();
        } else if (B[0][0].getText().equals("X") && B[0][2].getText().equals("X")&&B[0][1].getText().isEmpty()) {
            B[0][1].setText("X");
            computer();
        } else if (B[0][2].getText().equals("X") && B[0][1].getText().equals("X")&&B[0][0].getText().isEmpty()) {
            B[0][0].setText("X");
            computer();
        } else if (B[1][0].getText().equals("X") && B[1][1].getText().equals("X")&&B[1][2].getText().isEmpty()) {
            B[1][2].setText("X");
            computer();
        } else if (B[1][0].getText().equals("X") && B[1][2].getText().equals("X")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][2].getText().equals("X") && B[1][1].getText().equals("X")&&B[1][0].getText().isEmpty()) {
            B[1][0].setText("X");
            computer();
        } else if (B[2][0].getText().equals("X") && B[2][1].getText().equals("X")&&B[2][2].getText().isEmpty()) {
            B[2][2].setText("X");
            computer();
        } else if (B[2][0].getText().equals("X") && B[2][2].getText().equals("X")&&B[2][1].getText().isEmpty()) {
            B[2][1].setText("X");
            computer();
        } else if (B[2][2].getText().equals("X") && B[2][1].getText().equals("X")&&B[2][0].getText().isEmpty()) {
            B[2][0].setText("X");
            computer();
        } else if (B[0][0].getText().equals("X") && B[1][0].getText().equals("X")&&B[2][0].getText().isEmpty()) {
            B[2][0].setText("X");
            computer();
        } else if (B[0][0].getText().equals("X") && B[2][0].getText().equals("X")&&B[1][0].getText().isEmpty()) {
            B[1][0].setText("X");
            computer();
        } else if (B[1][0].getText().equals("X") && B[2][0].getText().equals("X")&&B[0][0].getText().isEmpty()) {
            B[0][0].setText("X");
            computer();
        } else if (B[0][1].getText().equals("X") && B[1][1].getText().equals("X")&&B[2][1].getText().isEmpty()) {
            B[2][1].setText("X");
            computer();
        } else if (B[0][1].getText().equals("X") && B[2][1].getText().equals("X")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][1].getText().equals("X") && B[2][1].getText().equals("X")&&B[0][1].getText().isEmpty()) {
            B[0][1].setText("X");
            computer();
        } else if (B[0][2].getText().equals("X") && B[1][2].getText().equals("X")&&B[2][2].getText().isEmpty()) {
            B[2][2].setText("X");
            computer();
        } else if (B[0][2].getText().equals("X") && B[2][2].getText().equals("X")&&B[1][2].getText().isEmpty()) {
            B[1][2].setText("X");
            computer();
        } else if (B[1][2].getText().equals("X") && B[2][2].getText().equals("X")&&B[0][2].getText().isEmpty()) {
            B[0][2].setText("X");
            computer();
        } else if (B[0][0].getText().equals("X") && B[1][1].getText().equals("X")&&B[2][2].getText().isEmpty()) {
            B[2][2].setText("X");
            computer();
        } else if (B[0][0].getText().equals("X") && B[2][2].getText().equals("X")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][1].getText().equals("X") && B[2][2].getText().equals("X")&&B[0][0].getText().isEmpty()) {
            B[0][0].setText("X");
            computer();
        } else if (B[0][2].getText().equals("X") && B[1][1].getText().equals("X")&&B[2][0].getText().isEmpty()) {
            B[2][0].setText("X");
            computer();
        } else if (B[0][2].getText().equals("X") && B[2][0].getText().equals("X")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][1].getText().equals("X") && B[2][0].getText().equals("X")&&B[0][2].getText().isEmpty()) {
            B[0][2].setText("X");
            computer();
        }
        else if (B[0][0].getText().equals("O") && B[0][1].getText().equals("O")&&B[0][2].getText().isEmpty()) {
            B[0][2].setText("X");
            computer();
        } else if (B[0][0].getText().equals("O") && B[0][2].getText().equals("O")&&B[0][1].getText().isEmpty()) {
            B[0][1].setText("X");
            computer();
        } else if (B[0][2].getText().equals("O") && B[0][1].getText().equals("O")&&B[0][0].getText().isEmpty()) {
            B[0][0].setText("X");
            computer();
        } else if (B[1][0].getText().equals("O") && B[1][1].getText().equals("O")&&B[1][2].getText().isEmpty()) {
            B[1][2].setText("X");
            computer();
        } else if (B[1][0].getText().equals("O") && B[1][2].getText().equals("O")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][2].getText().equals("O") && B[1][1].getText().equals("O")&&B[1][0].getText().isEmpty()) {
            B[1][0].setText("X");
            computer();
        } else if (B[2][0].getText().equals("O") && B[2][1].getText().equals("O")&&B[2][2].getText().isEmpty()) {
            B[2][2].setText("X");
            computer();
        } else if (B[2][0].getText().equals("O") && B[2][2].getText().equals("O")&&B[2][1].getText().isEmpty()) {
            B[2][1].setText("X");
            computer();
        } else if (B[2][2].getText().equals("O") && B[2][1].getText().equals("O")&&B[2][0].getText().isEmpty()) {
            B[2][0].setText("X");
            computer();
        } else if (B[0][0].getText().equals("O") && B[1][0].getText().equals("O")&&B[2][0].getText().isEmpty()) {
            B[2][0].setText("X");
            computer();
        } else if (B[0][0].getText().equals("O") && B[2][0].getText().equals("O")&&B[1][0].getText().isEmpty()) {
            B[1][0].setText("X");
            computer();
        } else if (B[1][0].getText().equals("O") && B[2][0].getText().equals("O")&&B[0][0].getText().isEmpty()) {
            B[0][0].setText("X");
            computer();
        } else if (B[0][1].getText().equals("O") && B[1][1].getText().equals("O")&&B[2][1].getText().isEmpty()) {
            B[2][1].setText("X");
            computer();
        } else if (B[0][1].getText().equals("O") && B[2][1].getText().equals("O")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][1].getText().equals("O") && B[2][1].getText().equals("O")&&B[0][1].getText().isEmpty()) {
            B[0][1].setText("X");
            computer();
        } else if (B[0][2].getText().equals("O") && B[1][2].getText().equals("O")&&B[2][2].getText().isEmpty()) {
            B[2][2].setText("X");
            computer();
        } else if (B[0][2].getText().equals("O") && B[2][2].getText().equals("O")&&B[1][2].getText().isEmpty()) {
            B[1][2].setText("X");
            computer();
        } else if (B[1][2].getText().equals("O") && B[2][2].getText().equals("O")&&B[0][2].getText().isEmpty()) {
            B[0][2].setText("X");
            computer();
        } else if (B[0][0].getText().equals("O") && B[1][1].getText().equals("O")&&B[2][2].getText().isEmpty()) {
            B[2][2].setText("X");
            computer();
        } else if (B[0][0].getText().equals("O") && B[2][2].getText().equals("O")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][1].getText().equals("O") && B[2][2].getText().equals("O")&&B[0][0].getText().isEmpty()) {
            B[0][0].setText("X");
            computer();
        } else if (B[0][2].getText().equals("O") && B[1][1].getText().equals("O")&&B[2][0].getText().isEmpty()) {
            B[2][0].setText("X");
            computer();
        } else if (B[0][2].getText().equals("O") && B[2][0].getText().equals("O")&&B[1][1].getText().isEmpty()) {
            B[1][1].setText("X");
            computer();
        } else if (B[1][1].getText().equals("O") && B[2][0].getText().equals("O")&&B[0][2].getText().isEmpty()) {
            B[0][2].setText("X");
            computer();
        }  else{
            for (int i = 0; i < 20; i++) {
                int r1 = ran.nextInt(3);
                int c1 = ran.nextInt(3);
                if (B[r1][c1].getText().isEmpty()) {
                    B[r1][c1].setText("X");
                    break;
                }
            }
            computer();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B[0][0]) {
            if (B[0][0].getText().isEmpty()){
                B[0][0].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B[0][1]){
            if (B[0][1].getText().isEmpty()) {
                B[0][1].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B[0][2]){
            if (B[0][2].getText().isEmpty()){
                B[0][2].setText("O");
                user();
               computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B[1][0]){
            if (B[1][0].getText().isEmpty()){
                B[1][0].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
        else if(e.getSource()==B[1][1]){
            if (B[1][1].getText().isEmpty()){
                B[1][1].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
        else if(e.getSource()==B[1][2]){
            if (B[1][2].getText().isEmpty()){
                B[1][2].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B[2][0]){
            if (B[2][0].getText().isEmpty()){
                B[2][0].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B[2][1]){
            if (B[2][1].getText().isEmpty()){
                B[2][1].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B[2][2]){
            if (B[2][2].getText().isEmpty()){
                B[2][2].setText("O");
                user();
                computer1();
            } else {
                JOptionPane.showMessageDialog(null, "Kindly Choose Another One ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(e.getSource()==B1){
            B[0][0].setText("");
            B[0][1].setText("");
            B[0][2].setText("");
            B[1][0].setText("");
            B[1][1].setText("");
            B[1][2].setText("");
            B[2][0].setText("");
            B[2][1].setText("");
            B[2][2].setText("");
        }
    }
    public static void main(String[] args) {
        TicTacToe frame = new TicTacToe();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 30, 400, 700);
        frame.setTitle("Tic Tac Toe");
        frame.setResizable(false);
    }
}
