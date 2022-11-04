import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signupInterface extends JFrame{
    JTextField id,name,password,major,email;

    public signupInterface(){
        setTitle("회원가입");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout signupUiGrid = new GridLayout(5,2); 
        signupUiGrid.setVgap(5);
        signupUiGrid.setHgap(3);

        Container signupUi = getContentPane();
        signupUi.setLayout(signupUiGrid);

        signupUi.add(new JLabel("학번"));
        id = new JTextField();
        signupUi.add(id);
        
        signupUi.add(new JLabel("이름"));
        name = new JTextField();
        signupUi.add(name);

        signupUi.add(new JLabel("비밀번호"));
        password = new JTextField();
        signupUi.add(password);
        
        signupUi.add(new JLabel("학과"));
        major = new JTextField();
        signupUi.add(major);
        
        signupUi.add(new JLabel("이메일"));
        email = new JTextField();
        signupUi.add(email);

        JButton signupButton = new JButton("가입하기");
        signupButton.addActionListener(signupButtonAction);
        signupUi.add(signupButton);

        setLocation(400, 400);
        setSize(320, 180);
        setVisible(true);
    }
    ActionListener signupButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //signup처리
    }
    };
}

//수강신청결과를 이메일로 보내주는것까지?
