package com.thinking.ioTest;

import java.io.*;

/**
 * Created by yuanjie.fang on 2018/3/14.
 */
public class FileReadAndWriter {
    public static void main(String[] args) {

        File srcFile = new File("d:\\1.png");
        File targetFile = new File("d:\\3.png");
        try {
            InputStream in = new FileInputStream(srcFile);
            OutputStream out = new FileOutputStream(targetFile);
            byte[] bytes = new byte[1024];
            int len = -1;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件复制成功");


    }
}
