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
 * TCP  ��������
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.����һ������˶���,��ָ���˿�
        ServerSocket server = new ServerSocket(8888);
        //2.���ݷ���������,��ȡ���ͻ���socket����
        Socket socket = server.accept();
        //3.���ݿͻ��˶���,��ȡ�����ֽ�������
        InputStream is = socket.getInputStream();
        //4.��ȡ�ͻ��˷��͹���������
        int len = 0;
        byte[] bytes = new byte[1024];
        System.out.println(new String(bytes,0,len));
        //5.��ȡ�����ֽ����������
        OutputStream os = socket.getOutputStream();
        //6. ��ͻ��˷�������
        os.write("�յ�,лл".getBytes());
        // 7.�ͷ���Դ
        socket.close();
        server.close();
    }
}
