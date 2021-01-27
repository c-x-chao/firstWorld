package com.cxc.day12Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/29 22:35
 * @Version 1.0
 * @Email cxc_work@163.com
 * TCP  服务器端
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个服务端对象,并指定端口
        ServerSocket server = new ServerSocket(8888);
        //2.根据服务器对象,获取到客户端socket对象
        Socket socket = server.accept();
        //3.根据客户端对象,获取网络字节输入流
        InputStream is = socket.getInputStream();
        //4.读取客户端发送过来的数据
        int len = 0;
        byte[] bytes = new byte[1024];
        System.out.println(new String(bytes,0,len));
        //5.获取网络字节输出流对象
        OutputStream os = socket.getOutputStream();
        //6. 向客户端返回数据
        os.write("收到,谢谢".getBytes());
        // 7.释放资源
        socket.close();
        server.close();
    }
}
