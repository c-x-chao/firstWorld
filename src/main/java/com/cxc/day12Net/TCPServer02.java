package com.cxc.day12Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author cxc
 * @Date 2020/12/30 21:30
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class TCPServer02 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
       /* byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }*/

        //�������ֽ�������ת��Ϊ�ַ�����������
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = br.readLine();
        //�Ѷ�ȡ����Ϣ�����и�
        String[] arr = line.split(" ");
        String htmlpath = arr[1].substring(1);
        System.out.println(htmlpath );

        //����һ������������,��ȡhtml·��
        FileInputStream fis = new FileInputStream(htmlpath);
        //��ȡ�����ֽ������
        OutputStream os = socket.getOutputStream();
        os.write("HTTP/1.1 200 OK".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        //һ��һЩ
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        fis.close();
        socket.close();
        server.close();

    }
}
