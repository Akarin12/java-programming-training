package com.soft1841.jpt.aw;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.IOException;

public class LinkStart implements Runnable {
    private JTextArea textArea;
    private JTextField textField;

    public void setArea(JTextArea textArea) {
        this.textArea = textArea;
    }

    public void setField(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void run() {
        String url = textField.getText();
        Connection connection = Jsoup.connect(url);
        Document document = null;
        try {
            document = connection.get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements elements = document.getElementsByClass("show-content-free");

        for (Element element : elements) {
            Element link = element;

            String titleString = link.text();
            textArea.append(titleString);
        }
    }
}