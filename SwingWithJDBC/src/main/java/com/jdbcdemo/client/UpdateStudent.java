package com.jdbcdemo.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jdbcdemo.model.Student;
import com.jdbcdemo.service.StudentService;
import com.jdbcdemo.serviceimpl.StudentServiceImpl;

public class UpdateStudent extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblTitle;
	private JLabel lblFirstName;
	private JTextField txtFirstName;
	private JLabel lblMiddleName;
	private JTextField txtMiddleName;
	private JLabel lblLastName;
	private JTextField txtLastName;
	private JLabel lblFirstName_1_2;
	private JTextField txtRollNo;
	private JLabel lblAddress;
	private JTextField txtAddress;
	private JLabel lblPhoneNo;
	private JTextField txtPhoneNo;
	private JLabel lblGender;
	private JTextField txtGender;
	private JLabel lblDob;
	private JTextField txtDob;
	private JButton btnBack;
	private JButton btnUpdate;
	private int Sid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudent frame = new ViewStudent();
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
	public UpdateStudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.add(getPanel());

		setVisible(true);
		
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(112, 128, 144));
			panel.setBounds(10, 11, 745, 454);
			panel.setLayout(null);
			panel.add(getLblTitle());
			panel.add(getLblFirstName());
			panel.add(getTxtFirstName());
			panel.add(getLblMiddleName());
			panel.add(getTxtMiddleName());
			panel.add(getLblLastName());
			panel.add(getTxtLastName());
			panel.add(getLblFirstName_1_2());
			panel.add(getTxtRollNo());
			panel.add(getLblAddress());
			panel.add(getTxtAddress());
			panel.add(getLblPhoneNo());
			panel.add(getTxtPhoneNo());
			panel.add(getLblGender());
			panel.add(getTxtGender());
			panel.add(getLblDob());
			panel.add(getTxtDob());
			panel.add(getBtnBack());
			panel.add(getBtnUpdate());
		}
		return panel;
	}
	private JLabel getLblTitle() {
		if (lblTitle == null) {
			lblTitle = new JLabel("Update Student");
			lblTitle.setBounds(287, 11, 175, 38);
			lblTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblTitle;
	}
	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(182, 60, 73, 24);
		}
		return lblFirstName;
	}
	private JTextField getTxtFirstName() {
		if (txtFirstName == null) {
			txtFirstName = new JTextField();
			txtFirstName.setColumns(10);
			txtFirstName.setBounds(281, 60, 259, 24);
		}
		return txtFirstName;
	}
	private JLabel getLblMiddleName() {
		if (lblMiddleName == null) {
			lblMiddleName = new JLabel("Middle Name");
			lblMiddleName.setBounds(182, 103, 73, 24);
		}
		return lblMiddleName;
	}
	private JTextField getTxtMiddleName() {
		if (txtMiddleName == null) {
			txtMiddleName = new JTextField();
			txtMiddleName.setColumns(10);
			txtMiddleName.setBounds(281, 103, 259, 24);
		}
		return txtMiddleName;
	}
	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(182, 143, 73, 24);
		}
		return lblLastName;
	}
	private JTextField getTxtLastName() {
		if (txtLastName == null) {
			txtLastName = new JTextField();
			txtLastName.setColumns(10);
			txtLastName.setBounds(281, 143, 259, 24);
		}
		return txtLastName;
	}
	private JLabel getLblFirstName_1_2() {
		if (lblFirstName_1_2 == null) {
			lblFirstName_1_2 = new JLabel("Roll No");
			lblFirstName_1_2.setBounds(182, 193, 73, 24);
		}
		return lblFirstName_1_2;
	}
	private JTextField getTxtRollNo() {
		if (txtRollNo == null) {
			txtRollNo = new JTextField();
			txtRollNo.setColumns(10);
			txtRollNo.setBounds(281, 193, 259, 24);
		}
		return txtRollNo;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(182, 240, 73, 24);
		}
		return lblAddress;
	}
	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setColumns(10);
			txtAddress.setBounds(281, 240, 259, 24);
		}
		return txtAddress;
	}
	private JLabel getLblPhoneNo() {
		if (lblPhoneNo == null) {
			lblPhoneNo = new JLabel("PhoneNo");
			lblPhoneNo.setBounds(182, 280, 73, 24);
		}
		return lblPhoneNo;
	}
	private JTextField getTxtPhoneNo() {
		if (txtPhoneNo == null) {
			txtPhoneNo = new JTextField();
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(281, 280, 259, 24);
		}
		return txtPhoneNo;
	}
	private JLabel getLblGender() {
		if (lblGender == null) {
			lblGender = new JLabel("Gender");
			lblGender.setBounds(182, 331, 73, 24);
		}
		return lblGender;
	}
	private JTextField getTxtGender() {
		if (txtGender == null) {
			txtGender = new JTextField();
			txtGender.setColumns(10);
			txtGender.setBounds(281, 331, 259, 24);
		}
		return txtGender;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DoB");
			lblDob.setBounds(182, 384, 73, 24);
		}
		return lblDob;
	}
	private JTextField getTxtDob() {
		if (txtDob == null) {
			txtDob = new JTextField();
			txtDob.setColumns(10);
			txtDob.setBounds(281, 384, 259, 24);
		}
		return txtDob;
	}
	
	public void setDataInForm(int sid) {
		
		StudentService impl = new StudentServiceImpl();
		Student student = impl.getStudent(sid);
		
		Sid = sid;
		txtFirstName.setText(student.getfName());
		txtMiddleName.setText(student.getmName());
		txtLastName.setText(student.getlName());
		txtRollNo.setText(String.valueOf(student.getRollNo()));
		txtGender.setText(student.getGender());
		txtPhoneNo.setText(student.getPhoneNo());
		txtAddress.setText(student.getAddress());
		txtDob.setText(student.getDob());
	}
	
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("Back");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					new StudentRegistration();
					dispose();
				}
			});
			btnBack.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnBack.setBounds(22, 420, 89, 23);
		}
		return btnBack;
	}
	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					
					if (txtFirstName.getText().equals("") || txtFirstName.getText() == null) {
						JOptionPane.showMessageDialog(contentPane, "FirstName is required.");
						return;
					}

					if (txtLastName.getText().equals("") || txtLastName.getText() == null) {
						JOptionPane.showMessageDialog(contentPane, "LastName is required.");
						return;
					}

					if (txtRollNo.getText().equals("") || txtRollNo.getText() == null) {
						JOptionPane.showMessageDialog(contentPane, "RollNo is required.");
						return;
					}

					if (txtPhoneNo.getText().equals("") || txtPhoneNo.getText() == null) {
						JOptionPane.showMessageDialog(contentPane, "PhoneNo is required.");
						return;
					}

					if (txtAddress.getText().equals("") || txtAddress.getText() == null) {
						JOptionPane.showMessageDialog(contentPane, "Address is required.");
						return;
					}

					
					if(txtDob.getText().equals("") || txtDob.getText() ==null) {
					JOptionPane.showMessageDialog(contentPane, "Dob is required.");
						return;
					}
					
					if(txtGender.getText().equals("") || txtGender.getText() ==null) {
						JOptionPane.showMessageDialog(contentPane, "Gender is required.");
							return;
						}
						

					Student student2 = new Student();
					student2.setSid(Sid);
					student2.setfName(txtFirstName.getText());
					student2.setmName(txtMiddleName.getText());
					student2.setlName(txtLastName.getText());
					student2.setAddress(txtAddress.getText());
					student2.setDob(txtDob.getText());
					student2.setPhoneNo(txtPhoneNo.getText());
					student2.setRollNo(Integer.parseInt(txtRollNo.getText()));
					student2.setGender(txtGender.getText());

					StudentServiceImpl impl = new StudentServiceImpl();
					int result = impl.updateStudent(student2);
					if (result > 0) {
						JOptionPane.showMessageDialog(contentPane, "Data updated Successfully!");
						txtFirstName.setText("");
						txtLastName.setText("");
						txtAddress.setText("");
						txtRollNo.setText("");
						txtPhoneNo.setText("");
						txtMiddleName.setText("");
						
						new StudentRegistration();
						dispose();
					}
				}
			});
			btnUpdate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnUpdate.setBounds(338, 419, 132, 23);
		}
		return btnUpdate;
	}
}
