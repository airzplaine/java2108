package com.example.demo;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(DBUtil.dbconn == null) DBUtil.DBConnect();
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("\uB85C\uADF8\uC778");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cheap Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(133, 28, 167, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_1.setBounds(23, 90, 82, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_2.setBounds(23, 145, 82, 35);
		contentPane.add(lblNewLabel_2);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("굴림", Font.PLAIN, 16));
		txtUserName.setBounds(140, 97, 154, 21);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("굴림", Font.PLAIN, 16));
		txtPassword.setBounds(140, 152, 154, 21);
		contentPane.add(txtPassword);
		
		JButton btnLogin = new JButton("\uB85C\uADF8\uC778");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DBUtil.dbconn == null) DBUtil.DBConnect();
				String username = txtUserName.getText();
				String password = new String(txtPassword.getPassword());
				
				String query = "SELECT * FROM users WHERE username = ? and password = ?";
				
				try {
					PreparedStatement pstmt = DBUtil.dbconn.prepareStatement(query);
					pstmt.setString(1, username);
					pstmt.setString(2, password);
					ResultSet rs = pstmt.executeQuery();
					if(rs.next()) { // 해당 계정 비밀번호가 존재, 정상 로그인
						rs.close();
						pstmt.close();
						dispose();
						AppHome apphome = new AppHome();
						apphome.setVisible(true);
					}{
						System.out.println("계정 및 비밀번호를 확인해주세요.");
					}
				}catch(SQLException elogin) {
					System.out.println("계정 및 비밀번호를 확인해주세요.");
				}
			}
		});
		btnLogin.setBounds(203, 213, 97, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("\uC885\uB8CC");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(DBUtil.dbconn != null) DBUtil.DBClose();
				System.exit(0);
			}
		});
		btnExit.setBounds(83, 213, 97, 23);
		contentPane.add(btnExit);
	}
}
