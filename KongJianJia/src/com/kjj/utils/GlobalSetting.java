package com.kjj.utils;

import java.util.logging.Logger;

/**
 * Created by cfldcn on 2017/7/27.
 * 返回自定义参数，包括：数据库参数、系统帐户、密码等；
 */
public class GlobalSetting {
    private static  PropertiesUtil  propertyu = new PropertiesUtil();
    //public static final Logger log = Logger.getLogger(GlobalSetting.class.getName());
    /*
    * 返回数据库 driver
    * */
    public static String getDBDriver(){
        String dbdriver = propertyu.getPropertyValue("driverClass");
        return dbdriver;
    }
    public static String getDBurl(){
        String dburl = propertyu.getPropertyValue("dbUrl");
        return dburl;
    }
    public static String getDBuser(){
        String dbuser = propertyu.getPropertyValue("dbUser");
        return dbuser;
    }
    public static String getDBpwd(){
        String dbpwd = propertyu.getPropertyValue("dbPassword");
        return dbpwd;
    }
    public static String getDBsql(){
        String sql = propertyu.getPropertyValue("dbsql");
        return sql;
    }
    public static String getAdminPhone(){
        String adminphone = propertyu.getPropertyValue("adminPhone");
        return adminphone;
    }
    public static String getAdminPwd(){
        String adminpwd = propertyu.getPropertyValue("adminPwd");
        return adminpwd;
    }
    public static String getBPhone(){
        String bphone = propertyu.getPropertyValue("bPhone");
        return bphone;
    }
    public static String getBPwd(){
        String bpwd = propertyu.getPropertyValue("bPwd");
        return bpwd;
    }
    public static String getSPhone(){
        String sphone = propertyu.getPropertyValue("sPhone");
        return sphone;
    }
    public static String getSPwd(){
        String spwd = propertyu.getPropertyValue("sPwd");
        return spwd;
    }
}
