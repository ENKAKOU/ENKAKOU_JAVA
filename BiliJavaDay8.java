public class BiliJavaDay8 {
	
    public static void main(String[] args){
        // java进制的转换
            /* 第一组  二进制 转 十进制:  最低为开始，每个位上的数提出来，乘以2的 位数-1次方，然后求和。
                      八进制 转 十进制:  最低为开始，每个位上的数提出来，乘以8的 位数-1次方，然后求和。
                      十六进制 转 十进制:  最低为开始，每个位上的数提出来，乘以16的 位数-1次方，然后求和。  */
        System.out.println(0x23A);
            /* ox23A = 10*16^0 + 3*16^1 + 2*16^2
                     = 10 + 48 + 512 = 570   */
        System.out.println(0b110001100);   // 作业 1   二进制 转 十进制
            /* 0b110001100 = 0*2^0 + 0*2^1 + 1*2^2 + 1*2^3 +  0*2^4 +  0*2^5 +  0*2^6 +
                             1*2^7 + 1*2^8 = 396  */
        System.out.println(02456);   //作业 2  八进制 转 十进制
            /* 02456 = 6*8^0 + 5*8^1 + 4*8^2 + 2*8^3 = 1326  */

        // 位运算 - 思考题
        int a = 1 >> 2;   // 算术右移     1 向右位移 2位
        int b = -1 >> 2;  // 算术右移    -1 向右位移 2位
        int c = 1 << 2;   // 算术左移     1 向左位移 2位
        int d = -1 << 2;  // 算术左移     1 向左位移 2位
        int e = 1 >>> 2;  //  无符号右移
            // a , b , c , d 结果
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // 位运算
        System.out.println(2&3);   // 按位与&      结果：2
        System.out.println(~-2);   // 按位取反~    结果：1
        System.out.println(~2);    // 按位取反~    结果：3
        System.out.println(2|3);   // 按位或|      结果：3
        System.out.println(2^3);   // 按位异或^    结果：1

        int aa = 1 >> 2;
        int cc = 1 << 2;
        System.out.println("aa = " + aa);     // aa=0
        System.out.println("cc = " + cc);     // cc=4
        int dd = 4 << 3;
        int bb = 15 >> 2;
        System.out.println("dd = " + dd);     // dd=32
        System.out.println("bb = " + bb);     // bb=3 (取整)

            // 作业 1
        System.out.println(10/3);      // 3
        System.out.println(10/5);      // 2
        System.out.println(10%3);      // 1
        System.out.println(-10.5%3);   // 1.5
            /*  a % b :当 a 是小数时，公式 = a（int）a / b * b
                       -10.5 % 3 = (-10)/3*3 =  -10.3 + 9 = 1.5 */

        int i = 66;
        System.out.println(++i+i);     // 134


    }
}