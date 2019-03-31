package com.soft1841.jpt.io;

import java.io.File;

/**
 * 文件输出
 *
 * @author Yue Tang
 * 2019.4.1
 */
public class FolderTest {
    public static void main(String[] args) {
        String path = "F:\\ttt";
        File file = new File(path);
        File[] fs = file.listFiles();
        for (File f : fs) {
            String srcFileName = f.getName();
            int position = srcFileName.indexOf(".");
            String suffixName = srcFileName.substring(position);
            if (suffixName.equals(".gif") | suffixName.equals(".png")) {
                System.out.println(f);
            }
        }
    }
}
