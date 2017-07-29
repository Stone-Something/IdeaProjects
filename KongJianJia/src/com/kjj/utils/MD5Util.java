package com.kjj.utils;

import java.security.MessageDigest;

/**
 * Created by cfldcn on 2017/7/14.
 */
public class MD5Util {

    public String toMD5(String password){
        if(!password.isEmpty()){
            StringBuffer sb = null;
            try{
                MessageDigest md = MessageDigest.getInstance("MD5");
                //字节数组
                md.update(password.getBytes());
                byte[] result = md.digest();
                //生成具体的md5密码到buf数组
                int i;
                sb = new StringBuffer("");
                for(byte b : result){
                    i   = b & 0xff;//转成16进制；
                    String str = Integer.toHexString(i);
                    if(str.length() == 1){
                        sb.append("0");
                    }
                    sb.append(str);
                }
            }
            catch (Exception e){
                e.printStackTrace();
                return "";
            }
            return  sb.toString();
        }
        else {
            throw new NullPointerException ("String(toMD5)  is null !");
        }
    }
    public static  void  main(String[] args){
       System.out.print(new MD5Util().toMD5("123456"));
    }
}
