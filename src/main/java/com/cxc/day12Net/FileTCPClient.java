package com.cxc.day12Net;

import java.io.*;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/29 23:04
 * @Version 1.0
 * @Email cxc_work@163.com
 * 文件上传  客户端
 */
public class FileTCPClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象,连接到服务器端
        Socket socket = new Socket("127.0.0.1", 8899);
        //读取本地文件,创建缓冲流
        FileInputStream fis = new FileInputStream("C:\\Users\\13768238378\\Pictures\\ideaInmage - 副本\\timg.png");
        int len = 0;
        byte[] bytes = new byte[1024];
        // 创建网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        while ((len = fis.read(bytes)) != -1) {
            //输入读取到的数据
            os.write(bytes, 0, len);
        }

        //此时 会产生一个阻塞  进入死循环中
        socket.shutdownOutput();
        //获取服务端的响应数据
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            //输入读取到的数据
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
        socket.close();
    }
}
