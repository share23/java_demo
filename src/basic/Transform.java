package basic;

/**
 * 数据类型转换
 * 从大到小自动转，从小到大强制转
 */
public class Transform {
    public static void main(String[] args) {
        char c = 'a';
        short s = 80;//虽然char和short长度都是16,但是仍需要强制类型转换
        c = (char)s;
        //s = c;
        //直接转换会出现编译错误
        System.out.println(c+"  "+s);

        //String和int之间的转换
        int a = 1;
        String b = "2";
        String str = String.valueOf(a);
        int d = Integer.valueOf(b);
        System.out.println(a+d);
        System.out.println(b+str);
    }
}
