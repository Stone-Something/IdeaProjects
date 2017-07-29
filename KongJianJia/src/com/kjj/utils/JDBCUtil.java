package com.kjj.utils;

import org.apache.log4j.Logger;

import java.sql.*;


/**
 * Created by cfldcn on 2017/7/26.
 * 创建数据库
 */
public class JDBCUtil {
    public final Logger log = Logger.getLogger(JDBCUtil.class.getName());
    private Connection conn ;
    /*
    * 创建数据库连接
    * */
    public Connection getConn(){
        try{
            Class.forName(GlobalSetting.getDBDriver());
            conn = DriverManager.getConnection(GlobalSetting.getDBurl(),GlobalSetting.getDBuser(),GlobalSetting.getDBpwd());
            return conn;
        }catch (ClassNotFoundException e){
            log.info("驱程程序注册出错!");
            e.printStackTrace();
            throw new RuntimeException(e);
        }catch(SQLException e){
            log.info("数据库参数错误！");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    /*
     * 清理环境，关闭连接(顺序:后打开的先关闭)
     */
    public void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs != null){
            try{
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        if(ps != null){
            try{
                ps.close();
            }catch (SQLException e){
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        if(conn != null){
            try{
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }

}
