package finalPriceSystem;

import java.awt.event.*;
import javax.swing.*;

public class laptop_InfoGui extends  JFrame {
	// ����������
	private  JButton Updatajbt;
	private  JButton deletejbt;
	private  JLabel jLabel1;
	private  JLabel jLabel4;
	private  JLabel jLabel5;
	private  JLabel jLabel6;
	private  JLabel jLabel7;
	private  JLabel jLabeluser1;
	private  JLabel jLabeluser2;
	private  JLabel jLabelmoney1;
	private  JLabel jLabelmoney2;
	private  JLabel jLabelnumber1;
	private  JLabel jLabelnumber2;
	private  JScrollPane jScrollPane1;
	private  JScrollPane jScrollPane2;
	private  JTable jTable1;

	private  JButton jbtAdd;
	private  JButton jbtClear;
	private  JButton jbtF5;

	private  JTextField jtfprice;
	private  JTextField jtfgoods;
	private  JTextField jtfnumber;
	private  JTextField jtfname;
	private  JTextField jtfno;
//�������
	
	
	
	// �ع�
	public laptop_InfoGui() {
		super("PriceSystem�ʼǱ����Խ������");
		initComponents();// ��ʼ��ʼ�����
		String sql = "select*from sell_info";
		laptop_Info d = new laptop_Info(sql);
		jTable1.setModel(d);
		System.out.println(" �������������ϣ�");
	}
	//�ع����
	
	// ��ʼ�����
	private void initComponents() {
		this.setLocationRelativeTo(null);
//��һ�������ڷ�����������������������ʾ��������ͬʱ��ʾ�������ʱ���������������������ͨ���ƶ��������Ļ��飬������λ���ϵ�������ܿ������������JScrollPane��ʵ��������Ҫ��JScrollPane�Ǵ��й���������塣JScrollPane��Container������࣬Ҳ��һ������������ֻ�����һ�������JScrollPane��һ���÷����Ƚ�һЩ�����ӵ�һ��JPanel�У�Ȼ���ٰ����JPanel��ӵ�JScrollPane�С��������ӽ����Ͽ����ڹ�������ϣ�����Ҳ�ж���������Swing�У���JTextArea��JList��JTable�������û���Դ�������������Ҫ�����Ƿ����ڹ�����壬���ù������Ĺ��������������е����ݡ�
		jScrollPane1 = new  JScrollPane();// �������
		jScrollPane2 = new  JScrollPane();
		jTable1 = new  JTable();// ��
		jLabel1 = new  JLabel();// ��ʾ
		jLabel4 = new  JLabel();
		jLabel5 = new  JLabel();
		jLabel6 = new  JLabel();// ��ʾ
		jLabel7 = new  JLabel();// ��ʾ
		jLabeluser1 = new  JLabel();// ��ǰ�û�Ϊ
		jLabeluser2 = new  JLabel();// �û�������̬
		jLabelmoney1 = new  JLabel();// ��ǰ�û���Ǯ��
		jLabelmoney2 = new  JLabel();
		jLabelnumber1 = new  JLabel();// ��ǰ�û���棺
		jLabelnumber2 = new  JLabel();
		jtfno = new  JTextField();// ���������
		jtfname = new  JTextField();// ���������
		jtfgoods = new  JTextField();// ����
		jtfnumber = new  JTextField();// ����
		jtfprice = new  JTextField();// �Һŷ�
		jbtAdd = new  JButton();// ��Ӱ�ť
		Updatajbt = new  JButton();// �޸� ��Ϊ ����
		deletejbt = new  JButton();// ɾ��
		jbtClear = new  JButton();// ���
		jbtF5 = new  JButton();// f5ˢ��

		// ���ùر�Ч��
		setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);

		// ���ѡ��
		jTable1.addMouseListener(new  MouseAdapter() {
			public void mouseClicked( MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});

		jLabeluser1.setText("��ǰ�û�Ϊ��"); // 7.1
		jLabeluser2.setText(Login.priceUserName);
		jLabelmoney1.setText("��ǰ�������Ϊ��");
		laptop_Info dq = new laptop_Info();
		String sql = "select*from user where username='" + Login.priceUserName + "'";
		int userassets = dq.readuserM(sql);
		jLabelmoney2.setText("0");
		jLabelmoney2.setText(String.valueOf(userassets));
		jLabelnumber1.setText("��ǰ�������Ϊ��");
		int usernumber = dq.readuserN(sql);
		jLabelnumber2.setText("0");
		jLabelnumber2.setText(String.valueOf(usernumber));
		jScrollPane2.setViewportView(jTable1);// ��ʾ����������
		jScrollPane1.setViewportView(jScrollPane2);// װ������
		jLabel1.setText("���");
		jLabel6.setText("�û�");
		jLabel7.setText("��Ʒ");
		jLabel4.setText("����");
		jLabel5.setText("����");

		jtfno.setText(" ");
		jtfname.setText(" ");
		jtfnumber.setText(" ");
		jtfprice.setText(" ");
		jtfgoods.setText(" ");

		jbtAdd.setText("����");
		jbtAdd.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent evt) {
				jbtAddActionPerformed(evt);
			}
		});

		jbtF5.setText("ˢ��"); // ˢ�±��
		jbtF5.addActionListener(new  ActionListener() {
			public void actionPerformed( ActionEvent evt) {
				F5AP(evt);
			}
		});

		Updatajbt.setText("����");
		Updatajbt.addActionListener(new  ActionListener() {
			public void actionPerformed( ActionEvent evt) {
				BuyjbtAP(evt);
			}
		});

		jbtClear.setText("���");
		jbtClear.addActionListener(new  ActionListener() {
			public void actionPerformed( ActionEvent evt) {
				jbtClearActionPerformed(evt);
			}
		});

		
		
		
		
		
		
		
		
		/**
		 * GroupLayout�����鲼�ֹ������������齨����η��飬�Ծ��������� Container �е�λ�á� GroupLayout ��Ҫ��������ʹ�ã�����
		 * ������ �� �����飩��������GroupLayout.Group���ʵ������ɣ� ÿ������԰�������������Ԫ�أ�Group��Component ��
		 * Gap����
		 */
		 GroupLayout layout = new  GroupLayout(getContentPane());
		getContentPane().setLayout(layout);// ����

		layout.setHorizontalGroup(// ����ˮƽ��
				layout.createParallelGroup( GroupLayout.Alignment.LEADING)// ���ò����� ���䷽ʽ���ײ���
						.addGroup(layout.createSequentialGroup()// �������崮���飬���ҽṹ

						.addGroup(layout.createParallelGroup/* ���������� */( GroupLayout.Alignment.LEADING)
										/* ���������� ͷ�� */
										.addGroup(layout.createSequentialGroup()
												.addGap(32, 32, 32).addComponent(jLabeluser1).addComponent(jLabeluser2)
												.addGap(32, 32, 32).addComponent(jLabelmoney1)
												.addComponent(jLabelmoney2).addGap(32, 32, 32)
												.addComponent(jLabelnumber1).addComponent(jLabelnumber2)
												.addGap(32, 32, 32).addComponent(jbtF5)
										)
										// ������ͷ������
										
										/* ���������� ���� */
										.addGroup(layout.createSequentialGroup()
												.addContainerGap() /* ���һ����ʾ������Ե�ʹ��������߿�����֮����ѡ��϶��Ԫ�ء� */
												.addComponent(jScrollPane1,  GroupLayout.DEFAULT_SIZE, 515,
														Short.MAX_VALUE)) 
										// ����������
										
										// �˴����в�������ť
										.addGroup(layout.createSequentialGroup()/* ���������� */ 
												.addContainerGap()/* ���һ����ʾ������Ե�ʹ��������߿�����֮����ѡ��϶��Ԫ�ء� */
												.addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
																.addComponent(jLabel5)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jtfprice,
																		 GroupLayout.PREFERRED_SIZE, 74,
																		 GroupLayout.PREFERRED_SIZE))// ����
												)// ������2.1���
												
												.addGroup(layout
														.createParallelGroup( GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup().addGap(32, 32, 32)// ��Ҫ����һ��
																.addComponent(jLabel4)
																.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jtfnumber,GroupLayout.PREFERRED_SIZE, 74,GroupLayout.PREFERRED_SIZE))// ����
												)// ������2.2���
												
												// �����ڵĲ�������
												.addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()// ���������� �ӵ����
																.addGap(30, 30, 30)
																.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)// �������ײ�

																		.addGroup(layout.createSequentialGroup()// ���������飺��Ʒ��
																				.addComponent(jLabel7)
																				.addPreferredGap(
																						 LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(jtfgoods,
																						 GroupLayout.PREFERRED_SIZE,
																						74,
																						 GroupLayout.PREFERRED_SIZE))// ��Ʒ�������

																		.addGroup(layout.createSequentialGroup()//// ���������飬������ť
																				.addComponent(jbtAdd)// ���
																				.addGap(10, 10, 10)
																				.addComponent(jbtClear)// ���
																				.addPreferredGap(
																						 LayoutStyle.ComponentPlacement.UNRELATED)// �߿����
																				.addComponent(Updatajbt)// ����
																		))// �������ײ�
														)// �ӵ����
												)// �����������

										)// �������������

								).addContainerGap()// �߽�
						).addGroup(layout.createSequentialGroup()// ���� �Ա���
								.addContainerGap()// �߽�
								
								.addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)// ��϶

						
						));// ˮƽ�������

		layout.setVerticalGroup(// ���ô�ֱ��
				layout.createParallelGroup( GroupLayout.Alignment.LEADING)// ���ò����� ���䷽ʽ���ײ���
						.addGroup(layout.createSequentialGroup()// �������崮���飬���½ṹ

								.addGap(17, 17, 17)// �ϲ���λ

								.addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)// ����ͷ��
										.addComponent(jLabeluser1).addComponent(jLabeluser2).addComponent(jLabelmoney1)
										.addComponent(jLabelmoney2).addComponent(jLabelnumber1)
										.addComponent(jLabelnumber2).addComponent(jbtF5))// ͷ������

								.addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)// ���

								.addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane1,  GroupLayout.PREFERRED_SIZE, 172,
												 GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
												
										)
										)// ���

								.addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)// ���

								.addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)// �ײ�����

										.addGroup(layout.createSequentialGroup()// ����
												.addGroup(layout
														.createParallelGroup( GroupLayout.Alignment.BASELINE)// ��һ��
														.addComponent(jLabel5)// ����
														.addComponent(jtfprice,  GroupLayout.PREFERRED_SIZE,
																 GroupLayout.DEFAULT_SIZE,
																 GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)// ����
														.addComponent(jtfnumber/* ���� */,
																 GroupLayout.PREFERRED_SIZE,
																 GroupLayout.DEFAULT_SIZE,
																 GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel7/* ��Ʒ */)
														.addComponent(jtfgoods/* ��Ʒ */,
																 GroupLayout.PREFERRED_SIZE,
																 GroupLayout.DEFAULT_SIZE,
																 GroupLayout.PREFERRED_SIZE))// ��һ��

												.addGap(8, 8, 8)// ���

												.addGroup(layout
														.createParallelGroup( GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)// ����
														.addComponent(jtfprice,  GroupLayout.PREFERRED_SIZE,
																 GroupLayout.DEFAULT_SIZE,
																 GroupLayout.PREFERRED_SIZE)
												)// �ڶ���

												.addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)// ���

											
												// ����
												.addContainerGap(39, Short.MAX_VALUE)// �ײ��ռ�
										)// ���е�һ�к͵ڶ���

										.addGroup( GroupLayout.Alignment.TRAILING, layout
												.createSequentialGroup()// ����
												.addGroup(layout
														.createParallelGroup( GroupLayout.Alignment.TRAILING)// ����
														.addGroup(layout
																.createParallelGroup(
																		 GroupLayout.Alignment.BASELINE)// ����
																.addComponent(jbtClear).addComponent(Updatajbt))
														.addComponent(jbtAdd,
																 GroupLayout.Alignment.LEADING))
												.addGap(43, 43, 43)))// �ײ�һ��
						));

		pack();
	}


//GUI������ϣ����濪ʼ���þ���ִ�з���
	
	
	
	
	
	
	
	
	
	private void jbtAddActionPerformed( ActionEvent evt) {// ��ӳ�����Ϣ
		/* ����³�� */
		int GUIsellno = laptop_Info.sellNo + 1;
		String no = String.valueOf(GUIsellno);// �Զ���д�����������
		String name = Login.priceUserName;// ������ǰ�û�
		// ��ȡ��Ϣ
		String ks = jtfgoods.getText().trim();// ������Ʒ
		String level = jtfnumber.getText().trim();// ����
		String ghf = jtfprice.getText().trim();// ����

		// ִ�����sql��䣬�ٶ�ȡ���� //�ȼ����û��ס�����
		laptop_Info addprice = new laptop_Info();
		String sql = "select*from user where username='" + name + "'";
		int beforson = addprice.readuserN(sql);
		int selloutnumber = Integer.parseInt(level);
		if (beforson >= selloutnumber) {
			sql = "INSERT INTO sell_info(no,name ,goods,number,price) VALUES('" + no + "','" + name + "',   '" + ks
					+ "',   '" + level + "','" + ghf + "')";
			addprice.Add(sql);
			beforson = beforson - selloutnumber;
			sql = "UPDATE user SET laptop = '" + beforson + "' WHERE username = '" + name + "' ";
			addprice.Update(sql);// ������������

		}

		// ���¶�ȡ����
		String sql1 = "select*from sell_info";
		laptop_Info d = new laptop_Info(sql1);
		jTable1.setModel(d);
		jtfno.setText("");
		jtfname.setText("");
		jtfnumber.setText("");
		jtfprice.setText("");
		jtfgoods.setText("");
	}

	
	
	
	
	private void F5AP( ActionEvent evt) { // f5ˢ��
		// ���¶�ȡ����
		String sql = "select*from sell_info";
		laptop_Info d = new laptop_Info(sql);
		jTable1.setModel(d);

		sql = "select*from user where username='" + Login.priceUserName + "'";
		int userassets = d.readuserM(sql);
		jLabelmoney2.setText(String.valueOf(userassets));
		int usernumber = d.readuserN(sql);
		jLabelnumber2.setText(String.valueOf(usernumber));

	}

	
	
	
	
	
	public void F5AUTO() { // f5ˢ��
		// ���¶�ȡ����
		String sql = "select*from sell_info";
		laptop_Info d = new laptop_Info(sql);
		jTable1.setModel(d);

		sql = "select*from user where username='" + Login.priceUserName + "'";
		int userassets = d.readuserM(sql);
		jLabelmoney2.setText(String.valueOf(userassets));
		int usernumber = d.readuserN(sql);
		jLabelnumber2.setText(String.valueOf(usernumber));

	}

	


	private void BuyjbtAP( ActionEvent evt) { //  ����2.0
		// ��ȡ��ǰλ��
		// ��������Զ�����
		String no = jtfno.getText().trim();
		String name = jtfname.getText().trim();
		String goods = jtfgoods.getText().trim();
		String number = jtfnumber.getText().trim();
		String oneprice = jtfprice.getText().trim();
		// ��ʼ�ύ��
		int sumPrice, inumber, ioneprice, lessmoney, lessnumber, smoney, snumber;
		inumber = Integer.parseInt(number);
		ioneprice = Integer.parseInt(oneprice);
		sumPrice = inumber * ioneprice;

		String usn = Login.priceUserName;
		System.out.println("test1��ǰ�û�Ϊ" + usn);
		String sql = "select*from user where username='" + usn + "'";
		laptop_Info buyin = new laptop_Info();

		int userassets = buyin.readuserM(sql);
		lessnumber = buyin.readuserN(sql);

		if (sumPrice <= userassets) {
			lessmoney = userassets - sumPrice;
			lessnumber = inumber + lessnumber;

			// �޸����ݿ�
			sql = "UPDATE user SET assets ='" + lessmoney + "',laptop = '" + lessnumber + "' WHERE username = '" + usn
					+ "' ";
			buyin.Update(sql);// ����������

			sql = "select*from user where username='" + name + "'";
			smoney = buyin.readuserM(sql);
			snumber = buyin.readuserN(sql);
			smoney = smoney + sumPrice;

			sql = "UPDATE user SET assets ='" + smoney + "' WHERE username = '" + name + "' ";
			buyin.Update(sql);// ������������
			System.out.println("���׳ɹ�����ǰ���" + lessmoney + "��ǰ����" + lessnumber);
			// ɾ����¼
			sql = "DELETE from sell_info  WHERE no = '" + no + "' ";
			buyin.delete(sql);
		} else {
			System.out.println("����ʧ�ܣ��㲻��Ǯ");
			JOptionPane.showMessageDialog(null, "����ʧ�ܣ��㲻��Ǯ", "deal late no more", JOptionPane.ERROR_MESSAGE);
		}

		jtfno.setText("");
		jtfname.setText("");
		jtfnumber.setText("");
		jtfprice.setText("");
		jtfgoods.setText("");

		// ���¶�ȡ����
		String sql1 = "select*from sell_info";
		laptop_Info d = new laptop_Info(sql1);
		jTable1.setModel(d);

	}// ����������� ��
	
	
	
	// �������ѡ��
	private void jTable1MouseClicked( MouseEvent evt) {
		// ��ȡĳһ�еľ���ֵ����������ʾ���ı�����
		String no = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
		String name = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
		String ks = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
		String level = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
		String ghf = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
		// �ѵ����������ʾ���ı�����
		jtfno.setText(no);
		jtfname.setText(name);
		jtfgoods.setText(ks);
		jtfnumber.setText(level);
		jtfprice.setText(ghf);

	}

	

	
	// ���������
	private void jbtClearActionPerformed( ActionEvent evt) { 
		jtfno.setText("");
		jtfname.setText("");
		jtfnumber.setText("");
		jtfprice.setText("");
		jtfgoods.setText("");
	}
	
	
	
	
	

	public static void main(String args[]) {
		 //�����������Nimbuslookandfeel
	       try {
	    	   
	    	   UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
	           
	       } catch (Exception e) {
	    	   e.printStackTrace();
	       }
		

		//���浥���ԣ�awt���¼������߳�
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new laptop_InfoGui().setVisible(true);

			}
		}

		);
		

	}// main

}
