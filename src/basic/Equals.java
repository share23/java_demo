package basic;

public class Equals {
    public static void main(String[] args) {
        String a = new String("su");
        String b = a;
        String c = new String("su");
        if(a==b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(a==c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(a.equals(c)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
