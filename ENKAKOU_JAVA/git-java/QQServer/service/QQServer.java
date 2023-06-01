package QQServer.service;

import QQServer.qqcommon.Message;
import QQServer.qqcommon.MessageType;
import QQServer.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class QQServer {
    private ServerSocket ss = null;

    private static ConcurrentHashMap<String, User> validUsers = new ConcurrentHashMap<>();
    //private static ConcurrentHashMap<String, ArrayList<Message>> offLineDb = new ConcurrentHashMap<>();
    static {
        validUsers.put("100", new User("100", "123456"));
        validUsers.put("200", new User("200", "123456"));
        validUsers.put("300", new User("300", "123456"));
        validUsers.put("至尊宝", new User("至尊宝", "123456"));
        validUsers.put("紫霞仙子", new User("紫霞仙子", "123456"));
        validUsers.put("菩提老祖", new User("菩提老祖", "123456"));

    }

    private boolean checkUser(String userId, String passwd) {

        User user = validUsers.get(userId);

        if(user == null) {
            return  false;
        }
        if(!user.getPasswd().equals(passwd)) {
            return false;
        }
        return  true;
    }

    public QQServer() {
        try {
            System.out.println("服务端在9999端口监听...");
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);

            while (true) {
                Socket socket = ss.accept();
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject();   //读取客户端发送的User对象
                Message message = new Message();
                if (checkUser(u.getUserId(), u.getPasswd())) {   //登录通过
                   message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    oos.writeObject(message);   //将message对象回复客户端
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, u.getUserId());
                    serverConnectClientThread.start();
                    ManageClientThreads.addClientThread(u.getUserId(), serverConnectClientThread);

                } else { // 登录失败
                    System.out.println("用户 id=" + u.getUserId() + " pwd=" + u.getPasswd() + " 验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //关闭socket
                    socket.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
