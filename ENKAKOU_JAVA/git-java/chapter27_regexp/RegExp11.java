package chapter27_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {

    public static void main(String[] args) {

//        String content = "https://www.bilibili.com/video/BV1fh411y7R8?" +
//                "from=search&seid=1831060912083761326";
        String content = "http://edu.3dsmax.tech/yg/bilibili/my6652/pc/qg" +
                "/05-51/index.html#201211-1?track_id=jMc0jn-hm-yHrNfVad37" +
                "YdhOUh41XYmjlss9zocM26gspY5ArwWuxb4wYWpmh2Q7GzR7doU0wLkV" +
                "iEhUlO1qNtukyAgake2jG1bTd23lR57XzV83E9bAXWkStcAh4j9Dz7a8" +
                "7ThGlqgdCZ2zpQy33a0SVNMfmJLSNnDzJ71TU68Rc-3PKE7VA3kYzjk" +
                "4RrKU";

        //[. ? *]表示匹配就是.本身
        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

        System.out.println(Pattern.matches(regStr, content));   //这里如果使用Pattern的matches 整体匹配 比较简洁

    }
}
