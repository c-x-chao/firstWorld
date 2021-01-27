package com.cxc.day12Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/29 23:04
 * @Version 1.0
 * @Email cxc_work@163.com
 * 文件保存  服务端
 */
public class FileTCPServer {
    public static void main(String[] args) throws IOException {
        //读取端口
        ServerSocket server = new ServerSocket(8899);
        //创建客户端对象
        Socket socket = server.accept();
        while (true) {

            new Thread(() -> {

                //创建网络输入字节流对象
                InputStream is = null;
                try {
                    is = socket.getInputStream();
                    //创建本地输出流对象
                    long fileName = System.currentTimeMillis();
                    FileOutputStream bos = new FileOutputStream("C:\\Users\\13768238378\\Pictures\\ideaInmage - 副本\\" + fileName + ".png");
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    //服务器收到
                    while ((len = is.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }
                    //创建网络字节输出流
                    OutputStream os = socket.getOutputStream();
                    os.write("上传成功".getBytes());
                    bos.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }
//        server.close();
    }
}
