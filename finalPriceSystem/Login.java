package finalPriceSystem;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Login extends javax.swing.JFrame { //��½ҳ�洰��
	// ����������
         
	   private javax.swing.JButton JButton1;
	   private javax.swing.JButton JButton2;
	   private javax.swing.JLabel jLabel1;
	   private javax.swing.JLabel jLabel2;
	   private javax.swing.JLabel jLabel3;
	   private javax.swing.JPasswordField jPasswordField1;
	   private javax.swing.JTextField jTextField2;
	   private javax.swing.JTextField jTextField3;

	   public static String priceUserName = null ;//�����û��������ڴ��ݸ������ƶ�


   public Login() { //���壺���췽��
	   super("PriceSystem��½");
       initComponents();//�ɹ�����ת�����������ơ�
   }
   @SuppressWarnings("unchecked")  //���Ա�����Ϣ
   private void initComponents() { //��������
	   this.setLocationRelativeTo(null);
       jLabel1 = new javax.swing.JLabel(); //����һ���յ�jLabel	   																						// JLabel ���������ʾ�ı���ͼ���ͬʱ��ʾ���ߡ�����ͨ�����ô�ֱ��ˮƽ���뷽ʽ�� 
       jLabel2 = new javax.swing.JLabel(); //���õڶ����յ�jLabel
       jLabel3 = new javax.swing.JLabel(); //����ǰ��ѡ��       										
/**
 * JTextField ��һ�������������������༭�����ı��� JTextField Ӧ�� 
 * java.awt.TextField ����Դ��������ԣ���Ӧ��ˡ���������� java.awt.TextField ����û�еĹ��ܡ�
 */
       jTextField2 = new javax.swing.JTextField();//����һ���յĵ������룬û��1��
       jTextField3 = new javax.swing.JTextField();//ǰ��ѡ��
/**
 * JPasswordField ��һ�����������������༭һ�������ı�������ͼָʾ�������ݣ�������ʾԭʼ�ַ���
 */
       jPasswordField1 = new javax.swing.JPasswordField(); //һ�������
/**
 * JButton���ǰ�ť��ʵ�֡���������б�ǩ�����ڰ���ʱ�����¼�����Ҳ������һ��ͼ��
 */
       JButton1 = new javax.swing.JButton();
       JButton2 = new javax.swing.JButton();
       //�رմ��ڣ��û��������ڵĹرհ�ťʱ����ִ�еĲ���
       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jLabel1.setText("�˺�"); //�ѵ�һ��jLabel�������롰�˺š������з�ʽĬ��
       jLabel2.setText("����"); //�ѵڶ���jLabel�������롰���롱�����з�ʽĬ��
       jLabel3.setText("���");
       jTextField2.setText(" ");// ����ʹ��ָ���ı���һ���ո��ַ�����ʼ������TextField��
       jTextField3.setText(" ");
       JButton1.setText("��¼");//����½������������ť��
/**
 * �������ť���һ�������ߣ�һ�����¼�������������������������߶����Եõ�����¼���
 * �����԰��¼���Ϣ�������¼�Դ�������¼���������
 */
       JButton1.addActionListener(new java.awt.event.ActionListener() 
       {
           public void actionPerformed(java.awt.event.ActionEvent evt) //ִ�в���
           {
               System.out.println("'��½' ��ť������");
        	   JButton1ActionPerformed(evt);//��ת����½��ťִ�г���
           }
       }
    );

       JButton2.setText("�˳�");//���˳���������������ť��
       JButton2.addActionListener(new java.awt.event.ActionListener() 
       {
           public void actionPerformed(java.awt.event.ActionEvent evt) //ִ�в���
           {
        	   System.out.println("'�˳�'  ��ť������");
               JButton2ActionPerformed(evt);//��ת���˳���ťִ�г���
           }
       });
       
       
       
       
       
       
       
       
       
       
       
       
       
       

/**
 * GroupLayout�����鲼�ֹ������������齨����η��飬�Ծ��������� Container �е�λ�á�
 * GroupLayout ��Ҫ��������ʹ�ã����� ������ �� �����飩��������GroupLayout.Group���ʵ������ɣ�
 * ÿ������԰�������������Ԫ�أ�Group��Component �� Gap����
 */
       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());//�ȴ������鲼�֣�����������
       getContentPane().setLayout(layout);
       
       
       layout.setHorizontalGroup( //����ˮƽ��
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)//���ò�������䷽ʽ���ײ���
           .addGroup(layout.createSequentialGroup()//�������崮���飬���ҽṹ
               .addGap(90, 90, 90)//���߾��С Ĭ��103              
               //����ָ��x�����У�����ֱ��Ŀ��Ϊһ��
               .addGroup/*�����Ԫ��*/(layout.createParallelGroup/*����������*/(javax.swing.GroupLayout.Alignment.TRAILING)
               //public static final grouplayout.alignment trailing
               //ָʾԪ��Ӧ��������׶˶��롣���ڴ����ҵ�ˮƽ�ᣬ���ʾ���Ҷ˶��롣���ڴ�ֱ�ᣬtrailing ��ʾ��׶˶��롣
            		.addComponent(jLabel3)
                   .addComponent(jLabel2)//���˺š�
                   .addComponent(jLabel1)//�����롱
               )//������ϣ� ���˺š����벢��
               
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
/**
 * addpreferredgap(layoutstyle.componentplacement type,int pref,int max)
 * ���һ����ʾ����������������֮����ѡ��϶��Ԫ�ء��ڲ��ֹ����У��ҵ�����Ԫ�أ��������������֮�����ѡ��϶��С�����ô˼�϶����С��С��
 * ����Ҳ����������������С��С������Ϊ 0��                  * ������
type - ��϶�����ͣ�layoutstyle.componentplacement.related �� layoutstyle.componentplacement.unrelated������ò����
pref - ��϶����ѡ��С��default_size ����ڵ��� 0 ��ֵ
max - ��϶������С��default_size��preferred_size ����ڵ��� 0 ��ֵ
 */         
               .addGroup(layout.createParallelGroup/*����������*/(javax.swing.GroupLayout.Alignment.TRAILING, false)/*�����Ԫ�أ�����������*/
                   .addGroup(layout.createSequentialGroup() //����������
                       .addComponent(JButton1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                       .addComponent(JButton2))//������ϣ� ����½���˳���ť����
                   
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)//����������
                		.addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                       .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                       .addComponent(jPasswordField1))//������ϣ���������������
                   )//������ϣ���������Ͱ�ť�鲢��
               .addContainerGap(114, Short.MAX_VALUE))//�ұߵı߿�Ĭ��114
/**
 * ���һ����ʾ������Ե�ʹ��������߿�����֮����ѡ��϶��Ԫ�ء������ӵļ�϶û�д����������ı�Ե����˷���û���κ�Ч����
 * ����������ʾ��϶��Ԫ���ǲ��ɵ�����С�ġ�
 */
           
       );//ˮƽ�����
       
       
       layout.setVerticalGroup( //���ô�ֱ��
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)//���ò�������䷽ʽ���ײ���
           .addGroup(layout.createSequentialGroup()//�������崮���飬Ӧ���� ���½ṹ
        		   
               .addGap(69, 69, 69)//����ı߿�
               
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)//���ò�����
                       .addComponent(jLabel3)
                       .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                       )//�������
               
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)//���ò�����
                   .addComponent(jLabel1)//�˺�
                   .addComponent(jTextField2/*�˺������*/, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   )//������ϣ� ���˺ź��˺��������
               
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)//���ò�����
                   .addComponent(jLabel2/*����*/, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)//ָʾ������϶����ѡ��СӦ�������ض��ķ�Χֵ���������������ʾ��Χ
                   .addComponent(jPasswordField1/*�����*/, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   )//������ϣ���������������
               
               .addGap(18, 18, 18)//�Ͱ�ť�ľ���
               
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)//������
                   .addComponent(JButton1)
                   .addComponent(JButton2)
                   )//������ϣ�������ť
               
               .addContainerGap(49, Short.MAX_VALUE))//���õײ��߿�
       );//��ֱ���������
       

       
       
       pack();//��������õ�����趨���ڵĴ�С ʹ֮��������������õ��������
   }                  

   
   
   
   
   
   
   
   
   
   
   
   //�˳���ť
   private void JButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       System.exit(0);
   }                                        

   
   //  ��½��ťִ�г��� 
   private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
       try {
           Connection con = DBConnection.getConnection();//ָ�����ݿ�����
           Statement stmt = con.createStatement();//��
           String sql="select *from user";//SQLɸѡ
           ResultSet rs = stmt.executeQuery(sql);
           
           String usename=jTextField2.getText().trim();//�½��ַ�����ȡ�û�����
           String plate  =jTextField3.getText().trim();//7.1new
           //getText().trim() �ڻ�õ��ı��г�ȥ�ո�
           
           char[] p=jPasswordField1.getPassword();//�½��ַ������ȡ����
           String pwd=new String(p);//ת��Ϊ�ַ���
           
           String   name = null;//�½������Ա��ַ���
           String pass = null;
           while(rs.next()){
                name=rs.getString(1);
                pass=rs.getString(2);//��ȡ���ݿ����˺�����
                
                if(usename.equals(name)&&pwd.equals(pass)){
                    System.out.println("��¼�ɹ�����deal late no more!!!!");
                    priceUserName = usename ;//����½�û������ݸ������û���
                    System.out.println("��ǰ�û�Ϊ��"+priceUserName);
                    //�ְ�鼤��
                    if(plate.equals("laptop"))
                    {
                    	new laptop_InfoGui().setVisible(true);//��ת�������򣬲�����ɼ�
                    	this.dispose(); //�رյ�ǰ��½����
                    }
                    
                    
                    else
                    {
                    	JOptionPane.showMessageDialog(null, "��������ȷ�����", "deal late no more", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    
                    
                    

             }    
                } 



       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
       }
   }                                        

   
   
  
   
   public static void main(String args[]) {
     //�����������Nimbuslookandfeel
       try {
    	   
    	   UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
           
       } catch (Exception e) {
    	   e.printStackTrace();
       }
       

     //���浥���ԣ�awt���¼������߳�
       java.awt.EventQueue.invokeLater(new Runnable() 
       {
           public void run() 
           {
               new Login().setVisible(true);//�򿪵�½����
           }
       });
   }

                      
}
