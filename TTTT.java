
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.color.*;

class TTTT {

    JFrame f = new JFrame("Snake & Ladder");
    JLabel a3, x, l[], m[], dc[], z, k;
    JTextField tf1, tf2;
    JButton b1;
    JButton au, reset, start;
    JTextField screen;
    JLabel myimage = new JLabel(" ");
    Listener o = new Listener(this);

    TTTT() {
        JLabel bg = new JLabel(new ImageIcon(".//images/background.jpg"));
        bg.setBounds(0, 0, 0, 735);

        l = new JLabel[101];
        m = new JLabel[6];

// Starting point
        m[1] = new JLabel();
        m[1].setBounds(140, 650, 20, 52);
        m[1].setIcon(new ImageIcon(".//images/player2.png"));
        f.add(m[1]);

        m[2] = new JLabel();
        m[2].setBounds(70, 650, 20, 52);
        m[2].setIcon(new ImageIcon(".//images/player1.png"));
        f.add(m[2]);

        m[4] = new JLabel();
        m[4].setBounds(5, 290, 20, 52);
        m[4].setIcon(new ImageIcon(".//images/player2.png"));
        f.add(m[4]);

        m[5] = new JLabel();
        m[5].setBounds(5, 340, 20, 52);
        m[5].setIcon(new ImageIcon(".//images/player1.png"));
        f.add(m[5]);

        m[3] = new JLabel();
        m[3].setBounds(50, 570, 150, 150);
        m[3].setIcon(new ImageIcon(".//images/start.jpg"));
        f.add(m[3]);

//	Labels for Board boxes 100-90, 80-70, 60-50, 40-30, 20-10  
        int j = 0;
        for (int i = 100; i > 90; i--) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 0, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 80; i > 70; i--) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 140, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 60; i > 50; i--) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 280, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 40; i > 30; i--) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 420, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 20; i > 10; i--) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 560, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

// Labels for REMAINING Board boxes 
        j = 0;
        for (int i = 81; i < 91; i++) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 70, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 61; i < 71; i++) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 210, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 41; i < 51; i++) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 350, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 21; i < 31; i++) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 490, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        j = 0;
        for (int i = 1; i < 11; i++) {
            l[i] = new JLabel();
            l[i].setBounds((200 + j * 70), 630, 70, 70);
            l[i].setIcon(new ImageIcon(".//cut/" + i + ".jpg"));
            f.add(l[i]);
            j++;
        }

        z = new JLabel();
        z.setBounds(0, 0, 200, 100);
        z.setIcon(new ImageIcon(".//images/rms.jpg"));
        f.add(z);

        screen = new JTextField("Roll The Dice");
        screen.setBounds(25, 250, 150, 40);
        screen.setBackground(Color.BLACK);
        screen.setForeground(Color.GREEN);
        f.add(screen);

        tf1 = new JTextField();
        tf1.setBounds(25, 310, 150, 35);
        tf1.setText("Player 1 ");
        f.add(tf1);
        tf1.setBackground(Color.YELLOW);

        tf2 = new JTextField();
        tf2.setBounds(25, 350, 150, 35);
        tf2.setText("Player 2");
        f.add(tf2);
        tf2.setBackground(Color.YELLOW);

        k = new JLabel();
        k.setBounds(60, 400, 100, 100);
        f.add(k);

        a3 = new JLabel();
        a3.setBounds(50, 400, 100, 100);
        a3.setText("");
        a3.setIcon(new ImageIcon(".//images/dice.gif"));

        f.add(a3);

        b1 = new JButton();
        b1.setBounds(25, 490, 150, 40);
        b1.setText("Roll");
        b1.addActionListener(o);
        f.add(b1);

        myimage = new JLabel(" ");
        myimage.setForeground(Color.BLACK);
        myimage.setBounds(120, 400, 100, 100);
        f.add(myimage);

        //FONTS used
        Font font = new Font("Book Antiqua", Font.BOLD, 20);
        Font font1 = new Font("Tecton Pro", Font.BOLD, 26);
        Font font2 = new Font("Comic Sans MS", Font.BOLD, 18);
        Font font3 = new Font("forte", Font.BOLD, 30);

        tf1.setFont(font);
        screen.setFont(font2);
        tf2.setFont(font);
        myimage.setFont(font3);

        a3.setFont(font1);
        b1.setFont(font3);
        f.setLayout(null);

        start = new JButton();
        start.setIcon(new ImageIcon(".//images/start.gif"));
        start.setBounds(50, 580, 150, 60);
        start.addActionListener(o);
        f.add(start);

        reset = new JButton("reset");
        reset.addActionListener(o);
        reset.setBounds(40, 170, 120, 40);
        reset.setIcon(new ImageIcon(".//images/reset.png"));
        f.add(reset);

// dices images 
        f.setLayout(null);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.add(bg);

        f.setSize(990, 735);

        f.getContentPane().setBackground(new Color(250, 250, 210));

    }

    public static void main(String[] s) {
        new TTTT();
    }
}
//LISTNER CLASS 

class Listener implements ActionListener {

    TTTT d;
    int rno, x1, y1;
    static int pc1, pc2;
    static int w;
    Rectangle r = new Rectangle();
    double y, z;

    Listener(TTTT d) {
        this.d = d;
    }

    //  giving the random number 
    void randomNumber() {
        Random generator = new Random();
        rno = generator.nextInt(6) + 1;  // random number storing to rno

        d.myimage.setText(String.valueOf(rno));

        d.a3.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == d.reset) {
            d.m[1].setBounds(140, 650, 20, 52);
            d.m[2].setBounds(70, 650, 20, 52);
            d.myimage.setText(" ");
            pc1 = 0;
            w = 0;
            pc2 = 0;

        } else if (e.getSource() == d.b1) {

            randomNumber();

            if (w % 2 == 0) {
                d.screen.setText("Chance: Player 2");

                w++;

                if ((pc1 + rno) < 101) // checking wheather the value of player1 not exceed more than 100 while playing
                {
                    //add the move of player 1 and change its position according to the dice(rno) 
                    pc1 = pc1 + rno;
                    r = d.l[pc1].getBounds();
                    y = r.getX();
                    z = r.getY();
                    x1 = (int) Math.round(y);
                    y1 = (int) Math.round(z);
                    d.m[1].setBounds((x1 + 10), (y1 + 20), 20, 52);

                    //checking wheather a snake is their at our position or not 
                    int a[] = new int[]{27, 40, 43, 54, 66, 76, 89, 99};
                    int b[] = new int[]{5, 3, 18, 31, 45, 58, 53, 41};

                    for (int i = 0; i < 8; i++) {
                        if (pc1 == a[i]) {
                            r = d.l[b[i]].getBounds();
                            y = r.getX();
                            z = r.getY();
                            x1 = (int) Math.round(y);
                            y1 = (int) Math.round(z);
                            d.m[1].setBounds((x1 + 10), (y1 + 17), 20, 52);
                            pc1 = b[i];

                        }
                    }
                    //checking for the ladder

                    int c[] = new int[]{4, 13, 33, 42, 50, 62, 74};
                    int f[] = new int[]{25, 46, 49, 63, 69, 81, 92};
                    for (int i = 0; i < 7; i++) {
                        if (pc1 == c[i]) {
                            r = d.l[f[i]].getBounds();
                            y = r.getX();
                            z = r.getY();
                            x1 = (int) Math.round(y);
                            y1 = (int) Math.round(z);
                            d.m[1].setBounds((x1 + 10), (y1 + 16), 20, 52);
                            pc1 = f[i];

                        }
                    }

                }

            } //this loop is for player 2 if w is odd then then player2 moves to next position and pc2 contain all the moves of player 2  and all the
            //rest of the conditions is same as above loop 
            else {
                d.screen.setText("Chance: Player 1");

                w++;

                if ((pc2 + rno) < 101) {
                    pc2 = pc2 + rno;
                    r = d.l[pc2].getBounds();
                    y = r.getX();
                    z = r.getY();
                    x1 = (int) Math.round(y);
                    y1 = (int) Math.round(z);
                    d.m[2].setBounds((x1 + 30), (y1 + 20), 20, 52);

                    int a[] = new int[]{27, 40, 43, 54, 66, 76, 89, 99};
                    int b[] = new int[]{5, 3, 18, 31, 45, 58, 53, 41};

                    for (int i = 0; i < 8; i++) {
                        if (pc2 == a[i]) {
                            r = d.l[b[i]].getBounds();
                            y = r.getX();
                            z = r.getY();
                            x1 = (int) Math.round(y);
                            y1 = (int) Math.round(z);
                            d.m[2].setBounds((x1 + 30), (y1 + 17), 20, 52);
                            pc2 = b[i];

                        }
                    }
                    int c[] = new int[]{4, 13, 33, 42, 50, 62, 74};
                    int f[] = new int[]{25, 46, 49, 63, 69, 81, 92};
                    for (int i = 0; i < 7; i++) {
                        if (pc2 == c[i]) {
                            r = d.l[f[i]].getBounds();
                            y = r.getX();
                            z = r.getY();
                            x1 = (int) Math.round(y);
                            y1 = (int) Math.round(z);
                            d.m[2].setBounds((x1 + 30), (y1 + 16), 20, 52);
                            pc2 = f[i];

                        }
                    }

                }
            }
            if (pc1 == 101) {
                d.screen.setText("Player 1 wins");
            } else if (pc2 == 101) {
                d.screen.setText("Player 2 wins");
            }
        }
    }
}
