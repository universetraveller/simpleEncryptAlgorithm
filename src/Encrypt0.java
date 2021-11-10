import java.util.*;
public class Encrypt0 {
    public static void main(String[] args){
        System.out.println("输入需要加密的字符(what need to be encrypted)");
        Scanner enter = new Scanner(System.in);
        String ori = enter.next();
        System.out.println("输入密码(字母和数字)(enter num/character as a password)");
        Scanner mid = new Scanner(System.in);
        String via = mid.next();//可作为密码
        char[] group = ori.toCharArray();//利用数组和遍历实现加密
        char[] plug =  via.toCharArray();
        System.out.println("加密后为(the result)");
        int num = plug.length - 1;
        for(long times:group){
            char sc = (char)(times+3*plug[0]+139-plug[num]);//3p0-pn最低为22
            System.out.print(sc);                           //128-160为空
            num = num-1;                                    //加上139即可超过160
            if(num <= 0){                                   //缺点是密文不包括字母
                if(plug.length == 1){
                    num = 0;
                }else {
                    num = plug.length-2;
                }
            }
        }
    }
}
