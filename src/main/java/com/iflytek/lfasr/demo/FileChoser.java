package com.iflytek.lfasr.demo;

import javax.swing.*;

public class FileChoser {
    private String filepath;
    public FileChoser() throws InterruptedException {
        JFrame frame = new JFrame();
        JFileChooser chooser = new JFileChooser();
        int flag = chooser.showOpenDialog(frame);
        if(flag == JFileChooser.APPROVE_OPTION){
            filepath = chooser.getSelectedFile().getPath();
            LfasrSDKDemo lfasrSDKDemo = new LfasrSDKDemo(filepath);
            System.out.print("用户选择了文件"+filepath);
        }
    }

}
