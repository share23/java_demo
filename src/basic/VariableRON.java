package basic;

/**
 * 变量的命名规则
 * 变量命名只能使用字母 数字 $ _
 * 变量第一个字符 只能使用 字母 $ _
 * 变量第一个字符 不能使用数字
 */
public class VariableRON {
    public static void main(String[] args) {
        int _b = 1;
        int i_3 = 2;
        //error
        //int 3_o = 3;
        System.out.println(_b+"   "+i_3);
    }
}
