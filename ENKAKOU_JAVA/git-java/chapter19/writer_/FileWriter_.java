package chapter19.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {

    public static void main(String[] args) {
        String filePath = "e:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);

//            3) write(int):写入单个字符
            fileWriter.write('H');

//            4) write(char[]):写入指定数组
            fileWriter.write(chars);

//            5) write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("韩顺平教育".toCharArray(), 0, 3);

//            6) write（string）：写入整个字符串
            fileWriter.write(" 你好北京~");
            fileWriter.write("风雨之后，定见彩虹");

//            7) write(string,off,len):写入字符串的指定部分
            fileWriter.write("上海天津", 0, 2);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

//        private void writeBytes() throws IOException {
//        this.bb.flip();
//        int var1 = this.bb.limit();
//        int var2 = this.bb.position();
//
//        assert var2 <= var1;
//
//        int var3 = var2 <= var1 ? var1 - var2 : 0;
//        if (var3 > 0) {
//            if (this.ch != null) {
//                assert this.ch.write(this.bb) == var3 : var3;
//            } else {
//                this.out.write(this.bb.array(), this.bb.arrayOffset() + var2, var3);
//            }
//        }
//
//        this.bb.clear();
//    }
            try {
                //fileWriter.flush();
                //关闭文件流，等价 flush() + 关闭
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        System.out.println("程序结束...");

    }
}
