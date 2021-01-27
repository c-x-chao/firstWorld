package com.cxc.day12Net;

import java.io.*;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/29 23:04
 * @Version 1.0
 * @Email cxc_work@163.com
 * �ļ��ϴ�  �ͻ���
 */
public class FileTCPClient {
    public static void main(String[] args) throws IOException {
        //����socket����,���ӵ���������
        Socket socket = new Socket("127.0.0.1", 8899);
        //��ȡ�����ļ�,����������
        FileInputStream fis = new FileInputStream("C:\\Users\\13768238378\\Pictures\\ideaInmage - ����\\timg.png");
        int len = 0;
        byte[] bytes = new byte[1024];
        // ���������ֽ����������
        OutputStream os = socket.getOutputStream();
        while ((len = fis.read(bytes)) != -1) {
            //�����ȡ��������
            os.write(bytes, 0, len);
        }

        //��ʱ �����һ������  ������ѭ����
        socket.shutdownOutput();
        //��ȡ����˵���Ӧ����
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            //�����ȡ��������
            System.out.println(new String(bytes, 0, len));
        }
        fis.close();
        socket.close();
    }
}
