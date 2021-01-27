package com.cxc.day12Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/29 23:04
 * @Version 1.0
 * @Email cxc_work@163.com
 * �ļ�����  �����
 */
public class FileTCPServer {
    public static void main(String[] args) throws IOException {
        //��ȡ�˿�
        ServerSocket server = new ServerSocket(8899);
        //�����ͻ��˶���
        Socket socket = server.accept();
        while (true) {

            new Thread(() -> {

                //�������������ֽ�������
                InputStream is = null;
                try {
                    is = socket.getInputStream();
                    //�����������������
                    long fileName = System.currentTimeMillis();
                    FileOutputStream bos = new FileOutputStream("C:\\Users\\13768238378\\Pictures\\ideaInmage - ����\\" + fileName + ".png");
                    int len = 0;
                    byte[] bytes = new byte[1024];
                    //�������յ�
                    while ((len = is.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }
                    //���������ֽ������
                    OutputStream os = socket.getOutputStream();
                    os.write("�ϴ��ɹ�".getBytes());
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
