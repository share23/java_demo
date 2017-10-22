package medium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Java的异常处理
 * throw和throws的区别
 * throws 出现在方法声明上，而throw通常都出现在方法体内
 * throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象
 *
 * 异常分为: 可查异常，运行时异常和错误3种,其中，运行时异常和错误又叫非可查异常
 * 可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理，比如 FileNotFoundException,如果不处理，编译器，就不让你通过
 *
 * 运行时异常RuntimeException指: 不是必须进行try catch的异常
 * 常见运行时异常: 除数不能为0异常:ArithmeticException   下标越界异常:ArrayIndexOutOfBoundsException   空指针异常:NullPointerException
 *
 * 面试题常问题：运行时异常与非运行时异常的区别
 * 运行时异常是不需要捕获的，会自动抛出，像除数为0、下标越界、空指针异常
 * 非运行时异常是必须捕获，否则无法编译，常见的如IO异常、SQL异常
 */
public class JavaException {

    public static void main(String[] args) {
        File f= new File("d:/QQ.exe");
        try{
            System.out.println("试图打开 d:/QQ.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("201222");
            System.out.println(d);
        }

        /*
        catch(FileNotFoundException e){
            System.out.println("d:/QQ.exe不存在");
            e.printStackTrace();
        }*/

        catch(Exception e){
            if (e instanceof FileNotFoundException)
                System.out.println("d:/QQ.exe不存在");
            if (e instanceof ParseException)
                System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
        finally {
            System.out.println("无论文件是否存在， 都会执行的代码");
        }
    }
}