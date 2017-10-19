package basic;

/**
 *变量的定义是: 用来命名一个数据的标示符
 */
public class Variable {
    public  static void main(String args[]) {
        //整型变量,区别在于取值范围不一样
        byte b = 1;
        short s = 20;
        int i = 300;
        long l = 400;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        //字符型char只能存放一个字符 ，用''表示
        char c = 'a';
        System.out.println(c);
        //浮点型，取值范围double范围大于float
        float f = 52.1f;
        double d = 13.14;
        System.out.println(f);
        System.out.println(d);
        //布尔型，只能取true false
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);
        //String类型
        String st = "为美好而奋斗！";
        System.out.println(st);
        //转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠
        System.out.println(tab);
        System.out.println(carriageReturn);
        System.out.println(newLine);
        System.out.println(doubleQuote);
        System.out.println(singleQuote);
        System.out.println(backslash);
    }
}