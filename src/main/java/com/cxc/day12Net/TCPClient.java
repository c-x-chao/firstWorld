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
 * TCP ͨ�� �ͻ���  socket��
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 1.����һ���ͻ���socket����
        Socket socket = new Socket("127.0.0.1", 8888);
        // 2.��ȡ�����ֽ����������
        OutputStream os = socket.getOutputStream();
        // 3.���������������
        os.write("��÷�����".getBytes());
        // 4.��ȡ�����ֽ�����������
        InputStream is = socket.getInputStream();
        // 5.��ȡ��������Ӧ������
        int len = 0;
        byte[] bytes = new byte[1024];
        len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        // 6. �ͷ���Դ
        socket.close();
    }
}
