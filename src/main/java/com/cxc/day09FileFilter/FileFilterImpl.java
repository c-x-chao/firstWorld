package com.cxc.day09FileFilter;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author cxc
 * @Date 2020/12/18 22:07
 * @Version 1.0
 * @Email cxc_work@163.com
 * 过滤器实现类
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        if (pathname.toString().endsWith(".html")) {
            return true;
        } else {
            return false;
        }
    }
}
