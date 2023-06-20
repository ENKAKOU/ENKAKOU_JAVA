package chapter27_regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTheory {

    public static void main(String[] args) {

        String content = "1998年12月8日，第二代Java平台的企业版J2EE发布。1999年6月，Sun公司发布了" +
                "第二代Java平台（简称为Java2）的3个版本：J2ME（Java2 Micro Edition，Java2平台的微型" +
                "版），应用于移动、无线及有限资源的环境；J2SE（Java 2 Standard Edition，Java 2平台的" +
                "标准版），应用于桌面环境；J2EE（Java 2Enterprise Edition，Java 2平台的企业版），应" +
                "用3443于基于Java的应用服务器。Java 2平台的发布，是Java发展过程中最重要的一个" +
                "里程碑，标志着Java的应用开始普及9889 ";

        //目标：匹配所有四个数字
        //1.\\d,表示一个任意的数字
        String regStr = "(\\d\\d)(\\d\\d)";
        //2.创建模式对象（正则表达式）
        Pattern pattern = Pattern.compile(regStr);
        //3.创建匹配器
        //匹配器matcher，按照”正则表达式“的规则，去匹配content字符串
        Matcher matcher = pattern.matcher(content);

        //4.开始匹配
//         matcher.group(0) 分析

//         源码:
//         public String group(int group) {
//                 if (first < 0)
//                     throw new IllegalStateException("No match found");
//                 if (group < 0 || group > groupCount())
//                     throw new IndexOutOfBoundsException("No group " + group);
//                 if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
//                     return null;
//                 return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
//             }

        while (matcher.find()) {
            //1. 如果正则表达式有() 即分组, 取出匹配的字符串规则
            //2. group(0) 表示匹配到的子字符串
            //3. group(1) 表示匹配到的子字符串的第一组字串
            //4. .group(2) 表示匹配到的子字符串的第2组字串
            //5. 但是分组的数不能越界
            System.out.println("找到: " + matcher.group(0));
            System.out.println("第1组()匹配到的值=" + matcher.group(1));
            System.out.println("第2组()匹配到的值=" + matcher.group(2));

        }
    }
}
