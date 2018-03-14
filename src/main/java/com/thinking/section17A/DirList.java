package com.thinking.section17A;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by yuanjie.fang on 2017/12/20.
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list((java.io.FilenameFilter) new DirFilter(args[0]));
        }
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String dirItem:list) {
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
