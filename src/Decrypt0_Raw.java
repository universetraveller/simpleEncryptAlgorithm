import java.util.*;
public class Decrypt0 {
    public static void main(String[] args){
        System.out.println("输入需要解密的字符(what need to be decrypted)");
        Scanner secret0 = new Scanner(System.in);
        String ori = secret0.next();
        System.out.println("输入密码(字母和数字)(enter password)");
        Scanner mid = new Scanner(System.in);
        String via = mid.next();//可作为密码
        char[] group = ori.toCharArray();
        char[] plug =  via.toCharArray();
        System.out.println("解密后为(the result)");
        int num = plug.length - 1;
        for(long times:group){
            char sc = (char)(times-3*plug[0]-139+plug[num]);//加密计算反过来
            System.out.print(sc);
            num = num-1;
            if(num <= 0){
                if(plug.length == 1){
                    num = 0;
                }else {
                    num = plug.length-2;
                }
            }
        }
    }
}
