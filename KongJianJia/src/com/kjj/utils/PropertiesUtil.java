package com.kjj.utils;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by cfldcn on 2017/7/26.
 */
public class PropertiesUtil {
    private Properties prop = new Properties();
    private String fileadd = "F:\\IdeaProjects\\KongJianJia\\src\\com\\kjj\\"+"globalsetting.properties";
    public  PropertiesUtil() {
        try{
            InputStreamReader inputsr = new InputStreamReader(new FileInputStream(fileadd),"UTF-8");
            prop.load(inputsr);
            System.out.println("load Success !");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getPropertyValue(String key){
        if(!key.isEmpty()){
            String value = prop.getProperty(key);
            return value;
        }else
            return "";
    }

    public static void main(String[] args) {
        PropertiesUtil pu = new PropertiesUtil();
        System.out.println("driver : "+pu.getPropertyValue("driverClass"));
    }
}
