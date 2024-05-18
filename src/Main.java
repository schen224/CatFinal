import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setResizable(false);
        frame.setSize(1200, 1000);

        JPanel newPanel = new JPanel();
       newPanel.setLayout(null);


        JFrame newFrame = new JFrame();
        newFrame.setResizable(false);
        newFrame.setSize(1200, 1000);

        //Images
        ImageIcon backGround = new ImageIcon("Images/Box.PNG");
        ImageIcon newBackground = new ImageIcon("Images/EndScreen.PNG");



        ImageIcon pF = new ImageIcon("Images/PurpleFish.PNG");
        ImageIcon rF = new ImageIcon("Images/RedFish.PNG");
        ImageIcon oF = new ImageIcon("Images/OrangeFish.PNG");
        ImageIcon yF = new ImageIcon("Images/YellowFish.PNG");
        ImageIcon pFTwo = new ImageIcon("Images/PurpleFishTwo.PNG");

        ImageIcon rL = new ImageIcon("Images/RedLock.PNG");
        ImageIcon oL = new ImageIcon("Images/OrangeLock.PNG");
        ImageIcon yL = new ImageIcon("Images/YellowLock.PNG");


        //Declaring Images
        JLabel bG = new JLabel();
        bG.setIcon(backGround);
        JLabel newBG = new JLabel();
        newBG.setIcon(newBackground);

        JButton purpleFish = new JButton(pF);
        JButton redFish = new JButton(rF);
        JButton orangeFish = new JButton(oF);
        JButton yellowFish = new JButton(yF);
        JButton purpleFishTwo= new JButton(pFTwo);

        JButton redLock = new JButton(rL);
        JButton orangeLock = new JButton(oL);
        JButton yellowLock = new JButton(yL);



        //Image placements
        backGround.setImage(backGround.getImage().getScaledInstance(1200,1000, Image.SCALE_DEFAULT));
        bG.setBounds(0,0,1200,1000);

        newBackground.setImage(newBackground.getImage().getScaledInstance(1200,1000, Image.SCALE_DEFAULT));
        newBG.setBounds(0,0,1200,1000);


        purpleFish.setOpaque(false);
        purpleFish.setContentAreaFilled(false);
        purpleFish.setBorderPainted(false);
        pF.setImage(pF.getImage().getScaledInstance(300,150, Image.SCALE_DEFAULT));
        purpleFish.setBounds(10,115,300,150);

        redFish.setOpaque(false);
        redFish.setContentAreaFilled(false);
        redFish.setBorderPainted(false);
        rF.setImage(rF.getImage().getScaledInstance(300,150, Image.SCALE_DEFAULT));
        redFish.setBounds(400,115,300,150);

        orangeFish.setOpaque(false);
        orangeFish.setContentAreaFilled(false);
        orangeFish.setBorderPainted(false);
        oF.setImage(oF.getImage().getScaledInstance(300,150, Image.SCALE_DEFAULT));
        orangeFish.setBounds(205,400,300,150);

        yellowFish.setOpaque(false);
        yellowFish.setContentAreaFilled(false);
        yellowFish.setBorderPainted(false);
        yF.setImage(yF.getImage().getScaledInstance(300,150, Image.SCALE_DEFAULT));
        yellowFish.setBounds(10,685,300,150);

        purpleFishTwo.setOpaque(false);
        purpleFishTwo.setContentAreaFilled(false);
        purpleFishTwo.setBorderPainted(false);
        pFTwo.setImage(pFTwo.getImage().getScaledInstance(300,150, Image.SCALE_DEFAULT));
        purpleFishTwo.setBounds(400,685,300,150);

        redLock.setOpaque(false);
        redLock.setContentAreaFilled(false);
        redLock.setBorderPainted(false);
        rL.setImage(rL.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT));
        redLock.setBounds(800,75,250,250);

        orangeLock.setOpaque(false);
        orangeLock.setContentAreaFilled(false);
        orangeLock.setBorderPainted(false);
        oL.setImage(oL.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT));
        orangeLock.setBounds(800,360,250,250);

        yellowLock.setOpaque(false);
        yellowLock.setContentAreaFilled(false);
        yellowLock.setBorderPainted(false);
        yL.setImage(yL.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT));
        yellowLock.setBounds(800,645,250,250);

        //LISTENERS

        purpleFish.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame,
                        "Welcome,  you’re stuck in this box.  What a shame. " + "\n" +
                                "Try to get out if you feel like it. " + "\n" +
                                "There’s three locks to crack,  please attempt previous lock before trying the next." + "\n" + "GoodLuck.",
                        "Introduction",
                        JOptionPane.PLAIN_MESSAGE);


            }
        });

        redFish.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame,
                        "Your so soft, and colors bright," + "\n" + "Around fingers, weaving tight.\n"  + "Rows of stitches, neat and fine," + "\n" + "Needles dance, a wonderful design." + "\n" + "\n" + "\n" + "_ _ _ _",
                        "The Red Lock",
                        JOptionPane.PLAIN_MESSAGE);


            }
        });

        orangeFish.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame,
                        "Forward I catch fish." + "\n" + "Backwards I am the tenth of numbers." + "\n" + "What am I?" + "\n" + "\n" + " I am a _ _ _",
                        "The Orange Lock",
                        JOptionPane.PLAIN_MESSAGE);


            }
        });

        yellowFish.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame,
                        "00110101 00110110 00110111 \n\n _ _ _",
                        "The Yellow Lock",
                        JOptionPane.PLAIN_MESSAGE);


            }
        });

        purpleFishTwo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame,
                        "If you're reading this, then you haven't escaped yet. \nOr maybe you decided to click on all the fishies before cracking the code. \nBut if you're stuck, you're in luck.  Just make sure you capitalize all your words.\nThat's all I'm gonna tell ya. This room is pretty simple.\nHonestly you should just stay in the box, it's for your own safety :)",
                        "Final Words",
                        JOptionPane.PLAIN_MESSAGE);


            }
        });



        redLock.addActionListener(new ActionListener() {
            Boolean Red = false;
            Boolean Orange = false;
            Boolean Yellow = false;
            public void actionPerformed(ActionEvent arg0) {

                String inputValue = JOptionPane.showInputDialog("Please input the answer");

                    if(inputValue.equals("YARN"))
                    {
JOptionPane.showMessageDialog(frame, "You've unlocked the Red Lock :(");
panel.remove(redLock);
Red = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(frame, "That's not right :)");
                    }
                orangeLock.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent arg0) {
                        String inputValue = JOptionPane.showInputDialog("Please input the answer");

                        if(inputValue.equals("NET"))
                        {
                            JOptionPane.showMessageDialog(frame, "You've unlocked the Orange Lock :(");
                            panel.remove(orangeLock);
                            Orange = true;

                        }
                        else{
                            JOptionPane.showMessageDialog(frame, "You're wrong :)");
                        }
                        yellowLock.addActionListener(new ActionListener() {

                            public void actionPerformed(ActionEvent arg0) {
                                String inputValue = JOptionPane.showInputDialog("Please input the answer");



                                if(inputValue.equals("567"))
                                {
                                    JOptionPane.showMessageDialog(frame, "You've unlocked the Yellow Lock :(");
                                    panel.remove(yellowLock);
                                    Yellow = true;
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame, "What a shame :)");
                                }

                                if (Red && Orange && Yellow == true){
                                   newPanel.add(newBG);
                                    newFrame.add(newPanel);
                                    newFrame.setVisible(true);
                                    frame.remove(panel);
                                    frame.setVisible(false);

                                }
                            }
                        });

                    }

                });
            }


        });





        panel.add(purpleFish);
        panel.add(redFish);
        panel.add(orangeFish);
        panel.add(yellowFish);
        panel.add(purpleFishTwo);

        panel.add(redLock);
        panel.add(orangeLock);
        panel.add(yellowLock);

        panel.add(bG);

        frame.add(panel);
        frame.setVisible(true);

    }
}