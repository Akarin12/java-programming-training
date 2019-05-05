package com.soft1841.jpt.day28;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;

public class JSoupDemo2 {
    public static void main(String[] args) throws Exception {
            File file;
            InputStream in;
            OutputStream out;
            String url ="https://www.jianshu.com/p/610c99da01e7";
            Connection connection = Jsoup.connect(url);
            Document document = connection.get();
//            Element elementDiv = document.getElementsByTag("")
            Elements elements = document.getElementsByClass("show-content");
            System.out.println(elements.size());
            for (Element e:elements) {
                Element imgElement = e;
                UUID uuid = UUID.randomUUID();

                URL url1 = new URL(imgElement.attr("data-original-src"));
                System.out.println(url1);
                URLConnection uc = url1.openConnection();
                in = uc.getInputStream();

                String imgName = uuid + ".jpg";
                file = new File("F:/22/" +imgName);

                out = new FileOutputStream(file);
                int temp;
                byte[] buf = new byte[1024];
                while ((temp = in .read(buf)) != -1){
                    out.write(buf,0,temp);
                }
                out.close();
                in.close();
            }
        }
}