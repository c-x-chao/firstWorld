package com.cxc.day12Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/29 22:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * TCP 通信 客户端  socket类
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1.创建一个客户端socket对象
        Socket socket = new Socket("127.0.0.1", 8888);
        // 2.获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        // 3.向服务器发送数据
        os.write("你好服务器".getBytes());
        // 4.获取网络字节输入流对象
        InputStream is = socket.getInputStream();
        // 5.读取服务器响应的数据
        int len = 0;
        byte[] bytes = new byte[1024];
        len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        // 6. 释放资源
        socket.close();
    }
}
