package QQClient.qqclient.service;

import QQClient.qqcommon.Message;
import QQClient.qqcommon.MessageType;

import java.io.*;

public class FileClientService {

    public void sendFileToOne(String src, String dest, String senderId, String getterId) {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setSrc(src);
        message.setDest(dest);

        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[(int)new File(src).length()];

        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes);
            message.setFileBytes(fileBytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //close
            if(fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\n" + senderId + " 给 " + getterId + " 发送文件: " + src
                + " 到对方的电脑的目录 " + dest);

        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
