package com.jdbcdemo.client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class StudentRegistration extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblFirstName;
	private JTextField txtFirstName;
	private JLabel lblMiddleName;
	private JTextField txtMiddleName;
	private JLabel lblLastName;
	private JTextField txtLastName;
	private JLabel lblFirstName_1_2;
	private JTextField txtRollNo;
	private JPanel panel_1;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnOther;
	private JLabel lblDob;
	private JComboBox<Object> cmBoxYear;
	private JComboBox<Object> cmBoxMonth;
	private JComboBox<Object> cmBoxDay;
	private JLabel lblAddress;
	private JTextField txtAddress;
	private JLabel lblPhoneNo;
	private JTextField txtPhoneNo;
	private JButton btnSave;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnView;
	private JButton btnDelete;
	private JButton btnUpdate;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRegistration frame = new StudentRegistration();
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
	public StudentRegistration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 874, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(238, 232, 170));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		contentPane.add(getPanel());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnView());
		contentPane.add(getBtnDelete());
		contentPane.add(getBtnUpdate());
		contentPane.add(getBtnExit());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(189, 183, 107));
			panel.setBounds(0, 0, 855, 288);
			panel.setLayout(null);
			panel.add(getLblFirstName());
			panel.add(getTxtFirstName());
			panel.add(getLblMiddleName());
			panel.add(getTxtMiddleName());
			panel.add(getLblLastName());
			panel.add(getTxtLastName());
			panel.add(getLblFirstName_1_2());
			panel.add(getTxtRollNo());
			panel.add(getPanel_1());
			panel.add(getLblDob());
			panel.add(getCmBoxYear());
			panel.add(getCmBoxMonth());
			panel.add(getCmBoxDay());
			panel.add(getLblAddress());
			panel.add(getTxtAddress());
			panel.add(getLblPhoneNo());
			panel.add(getTxtPhoneNo());
			panel.add(getBtnSave());
		}
		return panel;
	}

	private JLabel getLblFirstName() {
		if (lblFirstName == null) {
			lblFirstName = new JLabel("First Name");
			lblFirstName.setBounds(10, 11, 73, 24);
		}
		return lblFirstName;
	}

	private JTextField getTxtFirstName() {
		if (txtFirstName == null) {
			txtFirstName = new JTextField();
			txtFirstName.setBounds(109, 11, 259, 24);
			txtFirstName.setColumns(10);
		}
		return txtFirstName;
	}

	private JLabel getLblMiddleName() {
		if (lblMiddleName == null) {
			lblMiddleName = new JLabel("Middle Name");
			lblMiddleName.setBounds(10, 54, 73, 24);
		}
		return lblMiddleName;
	}

	private JTextField getTxtMiddleName() {
		if (txtMiddleName == null) {
			txtMiddleName = new JTextField();
			txtMiddleName.setColumns(10);
			txtMiddleName.setBounds(109, 54, 259, 24);
		}
		return txtMiddleName;
	}

	private JLabel getLblLastName() {
		if (lblLastName == null) {
			lblLastName = new JLabel("Last Name");
			lblLastName.setBounds(10, 94, 73, 24);
		}
		return lblLastName;
	}

	private JTextField getTxtLastName() {
		if (txtLastName == null) {
			txtLastName = new JTextField();
			txtLastName.setColumns(10);
			txtLastName.setBounds(109, 94, 259, 24);
		}
		return txtLastName;
	}

	private JLabel getLblFirstName_1_2() {
		if (lblFirstName_1_2 == null) {
			lblFirstName_1_2 = new JLabel("Roll No");
			lblFirstName_1_2.setBounds(10, 144, 73, 24);
		}
		return lblFirstName_1_2;
	}

	private JTextField getTxtRollNo() {
		if (txtRollNo == null) {
			txtRollNo = new JTextField();
			txtRollNo.setColumns(10);
			txtRollNo.setBounds(109, 144, 259, 24);
		}
		return txtRollNo;
	}

	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBackground(new Color(189, 183, 107));
			panel_1.setBorder(new TitledBorder(
					new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
					"Gender", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_1.setBounds(10, 179, 358, 84);
			panel_1.setLayout(null);
			panel_1.add(getRdbtnMale());
			panel_1.add(getRdbtnFemale());
			panel_1.add(getRdbtnOther());
		}
		return panel_1;
	}

	private JRadioButton getRdbtnMale() {
		if (rdbtnMale == null) {
			rdbtnMale = new JRadioButton("Male");
			buttonGroup.add(rdbtnMale);
			rdbtnMale.setBounds(17, 26, 70, 23);
		}
		return rdbtnMale;
	}

	private JRadioButton getRdbtnFemale() {
		if (rdbtnFemale == null) {
			rdbtnFemale = new JRadioButton("Female");
			buttonGroup.add(rdbtnFemale);
			rdbtnFemale.setBounds(110, 26, 70, 23);
		}
		return rdbtnFemale;
	}

	private JRadioButton getRdbtnOther() {
		if (rdbtnOther == null) {
			rdbtnOther = new JRadioButton("Other");
			buttonGroup.add(rdbtnOther);
			rdbtnOther.setBounds(212, 26, 70, 23);
		}
		return rdbtnOther;
	}

	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DoB");
			lblDob.setBounds(434, 16, 73, 24);
		}
		return lblDob;
	}

	private JComboBox getCmBoxYear() {
		if (cmBoxYear == null) {
			cmBoxYear = new JComboBox<Object>();
			cmBoxYear.setModel(new DefaultComboBoxModel(new String[] { "YYYY" }));
			cmBoxYear.setBounds(533, 13, 64, 22);

			for (int i = 1922; i < 2030; i++) {
				cmBoxYear.addItem(i);
			}
		}
		return cmBoxYear;
	}

	private JComboBox getCmBoxMonth() {
		if (cmBoxMonth == null) {
			cmBoxMonth = new JComboBox<Object>();
			cmBoxMonth.setModel(new DefaultComboBoxModel(new String[] { "MM" }));
			cmBoxMonth.setBounds(630, 13, 64, 22);

			for (int i = 1; i < 13; i++) {
				cmBoxMonth.addItem(i);
			}

		}
		return cmBoxMonth;
	}

	private JComboBox getCmBoxDay() {
		if (cmBoxDay == null) {
			cmBoxDay = new JComboBox<Object>();
			cmBoxDay.setModel(new DefaultComboBoxModel(new String[] { "DD" }));
			cmBoxDay.setBounds(725, 13, 64, 22);

			for (int i = 1; i < 33; i++) {
				cmBoxDay.addItem(i);
			}
		}
		return cmBoxDay;
	}

	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("Address");
			lblAddress.setBounds(434, 54, 73, 24);
		}
		return lblAddress;
	}

	private JTextField getTxtAddress() {
		if (txtAddress == null) {
			txtAddress = new JTextField();
			txtAddress.setColumns(10);
			txtAddress.setBounds(533, 54, 259, 24);
		}
		return txtAddress;
	}

	private JLabel getLblPhoneNo() {
		if (lblPhoneNo == null) {
			lblPhoneNo = new JLabel("PhoneNo");
			lblPhoneNo.setBounds(434, 94, 73, 24);
		}
		return lblPhoneNo;
	}

	private JTextField getTxtPhoneNo() {
		if (txtPhoneNo == null) {
			txtPhoneNo = new JTextField();
			txtPhoneNo.setColumns(10);
			txtPhoneNo.setBounds(533, 94, 259, 24);
		}
		return txtPhoneNo;
	}

	private JButton getBtnSave() {
		if (btnSave == null) {
			btnSave = new JButton("SAVE");
			btnSave.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnSave.setBounds(578, 208, 89, 23);
		}
		return btnSave;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 299, 837, 155);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "SID", "First Name", "Middle Name",
					"Last Name", "Gender", "Address", "PhoneNo", "RollNo", "DoB" }));
		}
		return table;
	}

	

	private JButton getBtnView() {
		if (btnView == null) {
			btnView = new JButton("View");
			btnView.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnView.setBounds(10, 491, 89, 23);
		}
		return btnView;
	}

	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton("Delete");
			btnDelete.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnDelete.setBounds(128, 491, 89, 23);
		}
		return btnDelete;
	}

	private JButton getBtnUpdate() {
		if (btnUpdate == null) {
			btnUpdate = new JButton("Update");
			btnUpdate.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnUpdate.setBounds(260, 491, 122, 23);
		}
		return btnUpdate;
	}

	private JButton getBtnExit() {
		if (btnExit == null) {
			btnExit = new JButton("Exit");
			btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
			btnExit.setBounds(443, 491, 89, 23);
		}
		return btnExit;
	}
}
