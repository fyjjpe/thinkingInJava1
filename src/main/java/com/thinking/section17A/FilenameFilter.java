package com.thinking.section17A;

import java.io.File;

/**
 * Created by yuanjie.fang on 2017/12/20.
 */
public interface FilenameFilter {
    boolean accept(File dir, String name);
}
