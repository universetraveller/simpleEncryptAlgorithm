public class Encrypt0 {
    String ori;
    String via;
    String res = "";
    char sc;
    public String getEncry(){
        this.res = "";
        char[] group = ori.toCharArray();//利用数组和遍历实现加密
        char[] plug =  via.toCharArray();//密码
        int num = plug.length - 1;
        for(long times:group){
            sc = (char)(times+3*plug[0]+139-plug[num]);     //3p0-pn最低为22
            num = num-1;                                    //加上139即可超过160
            res = res + sc;
            if(num <= 0){                                   //缺点是密文不包括字母
                if(plug.length == 1){
                    num = 0;
                }else {
                    num = plug.length-2;
                }
            }
        }
        return res;
    }
    public void setOri(String mid){
        ori = mid;
    }
    public void setVia(String mid){
        via = mid;
    }
}
