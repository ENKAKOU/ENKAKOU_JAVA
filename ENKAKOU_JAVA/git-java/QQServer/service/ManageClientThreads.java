package QQServer.service;

import java.util.HashMap;
import java.util.Iterator;

public class ManageClientThreads {
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    public static HashMap<String, ServerConnectClientThread> getHm() {   //返回 hm
        return hm;
    }
    //添加线程对象到 hm 集合
    public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId, serverConnectClientThread);
    }

    public static ServerConnectClientThread getServerConnectClientThread(String userId) {
        return hm.get(userId);
    }

    public static void removeServerConnectClientThread(String userId) {
        hm.remove(userId);
    }

    public static String getOnlineUser() {
        Iterator<String> iterator = hm.keySet().iterator();   //遍历 hashmap的key
        String onlineUserList = "";
        while (iterator.hasNext()) {
            onlineUserList += iterator.next().toString() + " ";
        }
        return  onlineUserList;

    }
}
