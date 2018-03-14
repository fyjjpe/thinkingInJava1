package com.thinking.section18A;

import java.io.*;

/**
 * Created by yuanjie.fang on 2017/12/21.
 */
public class StoringAndRecoveringData {
    public static void main(String[] args) throws Exception{
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("Data.txt")));
        out.writeDouble(3.14125);
        out.writeUTF("That was pi");
        out.writeDouble(1.414);
        out.writeUTF("Square root of 2");
        out.close();
        DataInputStream in = new DataInputStream(
                new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }
}
