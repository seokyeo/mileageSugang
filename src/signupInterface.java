import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;


public class signupInterface extends JFrame {
    JTextField idTextfield, nameTextfield, passwordTextfield, majorTextfield, emailTextfield;

    public signupInterface() {
        setTitle("회원가입");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout signupUiGrid = new GridLayout(6, 2);
        signupUiGrid.setVgap(5);
        signupUiGrid.setHgap(3);

        Container signupUi = getContentPane();
        signupUi.setLayout(signupUiGrid);

        signupUi.add(new JLabel("학번"));
        idTextfield = new JTextField();
        signupUi.add(idTextfield);

        signupUi.add(new JLabel("이름"));
        nameTextfield = new JTextField();
        signupUi.add(nameTextfield);

        signupUi.add(new JLabel("비밀번호"));
        passwordTextfield = new JTextField();
        signupUi.add(passwordTextfield);

        signupUi.add(new JLabel("학과"));
        majorTextfield = new JTextField();
        signupUi.add(majorTextfield);

        signupUi.add(new JLabel("이메일"));
        emailTextfield = new JTextField();
        signupUi.add(emailTextfield);

        JButton signupButton = new JButton("가입하기");
        signupButton.addActionListener(signupButtonAction);
        signupUi.add(signupButton);

        setLocation(400, 400);
        setSize(320, 180);
        setVisible(true);
    }

    ActionListener signupButtonAction = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // signup처리
            // 빈칸있으면 오류 반환
            String id = idTextfield.getText();
            System.out.println(id);
            String name = nameTextfield.getText();
            System.out.println(name);
            String password = passwordTextfield.getText();
            System.out.println(password);
            String major = majorTextfield.getText();
            System.out.println(major);
            String email = emailTextfield.getText();
            System.out.println(email);
            //if(true) 회원가입성공
            //studentsignup(id,name,password,major,email);          
            //else 회원가입 실패,id겹침

        }
    };
}
