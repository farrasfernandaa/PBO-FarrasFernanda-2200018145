import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class puzzle extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
 int score = 0; // Initialize score variable
 JLabel scoreLabel;
 JLabel welcomeLabel;
puzzle(){
super("puzzle game");
 b1=new JButton("I");
 b2=new JButton(" ");
 b3=new JButton("III");
 b4=new JButton("IV");
 b5=new JButton("V");
 b6=new JButton("VI");
 b7=new JButton("VII");
 b8=new JButton("VIII");
 b9=new JButton("II");
 next=new JButton("lanjut");

 int buttonWidth = 60;  // Decreased button width
 int buttonHeight = 40; // Decreased button height


 b1.setBounds(5, 25, buttonWidth, buttonHeight);
 b2.setBounds(75, 25, buttonWidth, buttonHeight);
 b3.setBounds(145, 25, buttonWidth, buttonHeight);
 b4.setBounds(5, 85, buttonWidth, buttonHeight);
 b5.setBounds(75, 85, buttonWidth, buttonHeight);
 b6.setBounds(145, 85, buttonWidth, buttonHeight);
 b7.setBounds(5, 145, buttonWidth, buttonHeight);
 b8.setBounds(75, 145, buttonWidth, buttonHeight);
 b9.setBounds(145, 145, buttonWidth, buttonHeight);
 next.setBounds(75, 200, 80, 25);

add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9); add(next);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
next.addActionListener(this);

next.setBackground(Color.black);
next.setForeground(Color.green);
setSize(220,300);
setLayout(null);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 welcomeLabel = new JLabel("Selamat Datang di Puzzle Game!");
 welcomeLabel.setBounds(15, 5, 200, 20);
 add(welcomeLabel);

 next.setBackground(Color.BLACK);
 next.setForeground(Color.GREEN);

 scoreLabel = new JLabel("Score: " + score);
 scoreLabel.setBounds(80, 180, 80, 20);  // Changed position above the "Lanjut" button
 add(scoreLabel);


 Font timesNewRoman = new Font("Times New Roman", Font.BOLD, 9); // Ganti dengan font dan ukuran yang kamu inginkan
 JButton[] numberButtons = {b1, b2, b3, b4, b5, b6, b7, b8, b9};
 for (JButton button : numberButtons) {
  button.setFont(timesNewRoman);



 }

// Mengubah warna latar belakang dan teks untuk semua tombol
 JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, next};
 Color buttonBackground = Color.GRAY;
 Color buttonForeground = Color.WHITE;

 for (JButton button : buttons) {
  button.setBackground(buttonBackground);
  button.setForeground(buttonForeground);

  getContentPane().setBackground(Color.PINK); //


 }
}//end of constuctor



public void actionPerformed(ActionEvent e){
if(e.getSource()==next){
String s=b4.getLabel();
b4.setLabel(b9.getLabel());
b9.setLabel(s);
s=b1.getLabel();
b1.setLabel(b5.getLabel());
b5.setLabel(s);
s=b2.getLabel();
b2.setLabel(b7.getLabel());
b7.setLabel(s);
}
if(e.getSource()==b1){
String s=b1.getLabel();
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b1.setLabel(" ");}
else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b1.setLabel(" ");}
 }//end of if

if(e.getSource()==b3){
String s=b3.getLabel();
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b3.setLabel(" ");}
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b3.setLabel(" ");}
 }//end of if

if(e.getSource()==b2){
String s=b2.getLabel();
if(b1.getLabel().equals(" ")){ b1.setLabel(s); b2.setLabel(" ");}
else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b2.setLabel(" ");}
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b2.setLabel(" ");}
 }//end of if

if(e.getSource()==b4){
String s=b4.getLabel();
if(b1.getLabel().equals(" ")){ b1.setLabel(s); b4.setLabel(" ");}
else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b4.setLabel(" ");}
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b4.setLabel(" ");}
 }//end of if

if(e.getSource()==b5){
String s=b5.getLabel();
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b5.setLabel(" ");}
else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b5.setLabel(" ");}
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b5.setLabel(" ");}
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b5.setLabel(" ");}
 }//end of if

if(e.getSource()==b6){

String s=b6.getLabel();
if(b9.getLabel().equals(" ")){ b9.setLabel(s); b6.setLabel(" ");}
else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b6.setLabel(" ");}
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b6.setLabel(" ");}

 }//end of if

if(e.getSource()==b7){
String s=b7.getLabel();
if(b4.getLabel().equals(" ")){ b4.setLabel(s); b7.setLabel(" ");}
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b7.setLabel(" ");}

 }//end of if

if(e.getSource()==b8){
String s=b8.getLabel();
if(b7.getLabel().equals(" ")){ b7.setLabel(s); b8.setLabel(" ");}
else if(b9.getLabel().equals(" ")){ b9.setLabel(s); b8.setLabel(" ");}
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b8.setLabel(" ");}

 }//end of if

if(e.getSource()==b9){
String s=b9.getLabel();
if(b6.getLabel().equals(" ")){ b6.setLabel(s); b9.setLabel(" ");}
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b9.setLabel(" ");}
 if (b1.getLabel().equals("I") && b2.getLabel().equals("II") && b3.getLabel().equals("III") &&
         b4.getLabel().equals("IV") && b5.getLabel().equals("V") && b6.getLabel().equals("VI") &&
         b7.getLabel().equals("VII") && b8.getLabel().equals("VIII") && b9.getLabel().equals(" ")) {
  JOptionPane.showMessageDialog(puzzle.this, "Congratulations! You solved the puzzle!");
}
 }//end of if
 score += 1; // Increase the score when the "lanjut" button is clicked
 updateScoreLabel();

 JButton clickedButton = (JButton) e.getSource();
 String buttonText = clickedButton.getText();

 if (buttonText.equals(String.valueOf(score + 1))) {
  score++;
  updateScoreLabel();
  clickedButton.setEnabled(false);

  if (score == 9) {
   JOptionPane.showMessageDialog(this, "Congratulations! You solved the puzzle!");
   dispose(); // Close the frame when the puzzle is solved
  }
 }
}//end of actionPerformed
 private void resetPuzzle() {
  // Reset the labels to their initial state
  b1.setLabel("I");
  b2.setLabel(" ");
  b3.setLabel("III");
  b4.setLabel("IV");
  b5.setLabel("V");
  b6.setLabel("VI");
  b7.setLabel("VII");
  b8.setLabel("VIII");
  b9.setLabel("II");

  // Enable all buttons
  for (JButton button : new JButton[]{b1, b2, b3, b4, b5, b6, b7, b8, b9}) {
   button.setEnabled(true);
  }

  // Reset the score
  score = 0;
  updateScoreLabel();
 }

 private void updateScoreLabel() {
  scoreLabel.setText("Score: " + score);
 }


public static void main(String[] args){
new puzzle();
}//end of main

}//end of class