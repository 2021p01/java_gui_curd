package finalPriceSystem;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


 class DBConnection{ //�������ݿ���,��Ϊ�������û�������Ϣʹ��ֻ�ܰ�������
     public static Connection getConnection() throws ClassNotFoundException {  
/**
 * throws�Ƿ��������׳��쳣��������(������������ʱ����ʾ�÷�������Ҫ�׳��쳣)   ��
 * �﷨��[(���η�)](����ֵ����)(������)([�����б�])[throws(�쳣��)]{......}      
 * ��ĳ���������ܻ��׳�ĳ���쳣ʱ����throws ���������׳����쳣��Ȼ�󽻸��ϲ�������ķ���������
 */
//�˴�Ϊ��������д�����ڵ���洢�ڴ����е�URL���˺ź�����
     String JDBC_DRIVER = "com.mysql.jdbc.Driver";//������
     String URL = "jdbc:mysql://localhost:3306/price";//mysql.url
     String USER = "root"; //mysql.u�û���root
     String PASSWORD = "123456";//����123456
     Connection conn = null;  //connection�����ڰ���

                                         //�����ݿ⽨������  
             Class.forName(JDBC_DRIVER);
         try {
             conn=  (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("�������ݿ�");

         } catch (SQLException ex) {
             Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
         } 								//��������д��,��ģ��



        return conn;  
    }  

}
