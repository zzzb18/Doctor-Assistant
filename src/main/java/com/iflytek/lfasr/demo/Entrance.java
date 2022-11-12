package com.iflytek.lfasr.demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Entrance {
    private JPanel controlPanel;
    private JFrame mainFrame;
    public Entrance(){
        prepareGUI();
    }
    public static void main(String[] args) {
        Entrance start = new Entrance();
        start.showPanel();
    }
    private void prepareGUI(){
        //mainFrame init
        mainFrame = new JFrame("Doctor-Assistant");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //controlPanel init
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }
    private void showPanel(){
        JButton addButton = new JButton("添加一位新医生");
        JButton startButton = new JButton("启动手术");
        addButton.setActionCommand("Add");
        startButton.setActionCommand("start");
        addButton.addActionListener(new ButtonClickListener());
        controlPanel.add(addButton);
        controlPanel.add(startButton);
        mainFrame.setVisible(true);
    }
    class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if(command.equals("Add")){
                System.out.print("添加一位医生\n");
                AddDoctor addDoctor = new AddDoctor();
            }

        }
    }
}
