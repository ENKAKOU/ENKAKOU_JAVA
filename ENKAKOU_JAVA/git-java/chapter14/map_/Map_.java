package chapter14.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "萧楚河");
        map.put("no2", "雷无杰");
        map.put("no1", "唐莲");
        map.put("no3", "唐莲");
        map.put(null, null);
        map.put(null, "abc");
        map.put("no4", null);
        map.put("no5", null);
        map.put(1, "无心");
        map.put(new Object(), "少年歌行");

        System.out.println("no2");
        System.out.println("map=" + map);

    }
}
