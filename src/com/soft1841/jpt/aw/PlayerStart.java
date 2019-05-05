package com.soft1841.jpt.aw;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerStart implements Runnable {
    private JButton musicBtn;
    private Player player;
    private JFileChooser fileChooser;

    public  void setMusicBtn(JButton musicBtn){
        this.musicBtn = musicBtn;
    }

    @Override
    public void run() {
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("D:\\music"));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            FileInputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            BufferedInputStream stream = new BufferedInputStream(fis);
            try {
                player = new Player(stream);
                player.play();
            } catch (JavaLayerException ex) {
                ex.printStackTrace();
            }

        }
    }
}