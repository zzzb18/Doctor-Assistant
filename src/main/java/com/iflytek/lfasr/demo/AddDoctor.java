package com.iflytek.lfasr.demo;

import javax.swing.*;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDoctor {
    private JFrame window;
    private JButton button_file;
    private JButton button_live;
    private JLabel label;
    public AddDoctor(){
        window = new JFrame("Add_Doctor");
        window.setLayout(null);
        window.setSize(600,600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        button_file = new JButton("选择一段录音文件");
        button_file.setActionCommand("file");
        button_live = new JButton("录音进行录入");
        button_live.setActionCommand("live");
        button_file.setBounds(150,200,300,50);
        button_live.setBounds(150,300,300,50);

        button_file.addActionListener(new ButtonClickListener());
        window.add(button_live);
        window.add(button_file);
        window.setVisible(true);
    }


    class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String command = e.getActionCommand();
            if(command.equals("file")){
                System.out.print("通过文件添加\n");
                try {
                    FileChoser fileChoser = new FileChoser();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }
}
