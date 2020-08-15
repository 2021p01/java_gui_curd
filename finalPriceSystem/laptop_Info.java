package finalPriceSystem;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class laptop_Info extends AbstractTableModel  {
	//��׼sql��䴫�ͷ���
       Connection con=null;//�������ݿ�
       PreparedStatement ps=null;//����sql���
       ResultSet rs=null;//���շ��ص�����
       Vector<Serializable> rowData,columnName;//
       public static int sellNo = 0;
       
       public laptop_Info(String sql){//�ع�
          init( sql) ;
       }

       public laptop_Info(){//�ع�

        }
       public void init(String sql){//��sql���ĳ�ʼ��

                //columnName�����ͷ��Ϣ
               columnName=new Vector<Serializable>();//��������
               columnName.add("���׵���");
               columnName.add("�����û�");
               columnName.add("������Ʒ");
               columnName.add("��������");
               columnName.add("����");//5��


            //rowData��������ÿһ�е���Ϣ
       String lastSellNo = null;//�������һ�����
            rowData=new Vector<Serializable>();//��������
           try {
            con = DBConnection.getConnection();//�������ݿ�
             ps=(PreparedStatement)con.prepareStatement(sql);
             rs=ps.executeQuery();//����     
            while(rs.next()){//��������
                   Vector bang=new Vector();
                   bang.add(rs.getString(1) );//������ԽӴ������һ�����
                   lastSellNo=rs.getString(1);                 
                   bang.add(rs.getString(2) );
                   bang.add(rs.getString(3) );
                   bang.add(rs.getString(4) );
                   bang.add(rs.getString(5) );

                   //����ȡ��ÿһ��������ӵ�bang�У�Ȼ���ٰ�bang��ӵ�rowData������
                    rowData.add(bang);
            }System.out.println("�������Ϊ"+lastSellNo);
            try {//stringת��Ϊint
            	sellNo = Integer.parseInt(lastSellNo);
            }catch (NumberFormatException e) {
            	e.printStackTrace();
            }
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            if(con!=null&&ps!=null&rs!=null){
                try {
                    con.close();
                    ps.close();
                    rs.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }

            }
        }//finally
  }//��ʼ�����
       
       
    public void chushihua(String sql){//��ʼ����������ʼ����д���ɻ���
         Connection con=null;
         PreparedStatement ps=null;
        int rs;

        try {
            con = DBConnection.getConnection();//�������ݿ�
             ps=(PreparedStatement) con.prepareStatement( sql);//����sql���
             rs=ps.executeUpdate();//���շ��ؽ��

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }  
    
    public int readuserM(String sql) { 
    	String name = null;
    	String passw = null;
    	String utype = null;
    	String assets = null;
    	String laptop = null;
    	//rowData=new Vector<Serializable>();//��������
        try {
         con = DBConnection.getConnection();//�������ݿ�
          ps=(PreparedStatement)con.prepareStatement(sql);
          rs=ps.executeQuery();//����     
         while(rs.next()){//��������
        	 name = rs.getString(1) ;
        	 passw = rs.getString(2) ; 
        	 utype = rs.getString(3) ;
        	 assets = rs.getString(4) ;
        	 laptop = rs.getString(5) ;
        	 
        	System.out.println("Ҫ����Ǯ��Ŀ��"+ Integer.parseInt(assets)) ;
        	 return Integer.parseInt(assets);
         }
   } catch (ClassNotFoundException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
   } catch (SQLException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
   }finally {
       if(con!=null&&ps!=null&rs!=null){
           try {
               con.close();
               ps.close();
               rs.close();
           } catch (SQLException e) {

               e.printStackTrace();
           }

       }
   }//finally
		return Integer.parseInt(assets);
    }
    public int readuserN(String sql) { 
    	String name = null;
    	String passw = null;
    	String utype = null;
    	String assets = null;
    	String laptop = null;
    	//rowData=new Vector<Serializable>();//��������
        try {
         con = DBConnection.getConnection();//�������ݿ�
          ps=(PreparedStatement)con.prepareStatement(sql);
          rs=ps.executeQuery();//����     
         while(rs.next()){//��������
        	 name = rs.getString(1) ;
        	 passw = rs.getString(2) ; 
        	 utype = rs.getString(3) ;
        	 assets = rs.getString(4) ;
        	 laptop = rs.getString(5) ;
        	 
        	System.out.println("Ҫ����Ʒ��Ŀ��"+ Integer.parseInt(laptop)) ;
        	 return Integer.parseInt(laptop);
         }
   } catch (ClassNotFoundException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
   } catch (SQLException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
   }finally {
       if(con!=null&&ps!=null&rs!=null){
           try {
               con.close();
               ps.close();
               rs.close();
           } catch (SQLException e) {

               e.printStackTrace();
           }

       }
   }//finally
		return Integer.parseInt(laptop);
    }
    
    
    
    
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void delete(String sql){//�򹤵�
        chushihua( sql);

    }
    public void Add(String sql){
        chushihua( sql);

    }
    public void Update(String sql){
        chushihua( sql);

    }

  

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

   public int getRowCount() {
        return this.rowData.size();
   }

   public int getColumnCount() {
      return this.columnName.size();
   }

   public Object getValueAt(int  row, int column) {
        return  ((Vector ) this.rowData.get(row)).get(column);
   }
   public String getColumnName(int column) {

        return   (String) this.columnName.get(column);
    }


   
   
   
  }

