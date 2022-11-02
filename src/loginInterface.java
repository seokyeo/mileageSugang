import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginInterface extends JFrame {
    public loginInterface() {

        setTitle("마일리지 수강신청");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout loginUiGrid = new GridLayout(3,2); 
        loginUiGrid.setVgap(5);
        loginUiGrid.setHgap(3);

        Container loginUi = getContentPane();
        loginUi.setLayout(loginUiGrid);
        
        loginUi.add(new JLabel("ID"));
        loginUi.add(new JTextField(""));
        loginUi.add(new JLabel("Password"));
        loginUi.add(new JTextField(""));
        JButton signUpButton = new JButton("회원가입");
        signUpButton.addActionListener(signUpButtonAction);
        loginUi.add(signUpButton);
        JButton loginButton = new JButton("로그인");
        loginButton.addActionListener(loginButtonAction);
        loginUi.add(loginButton);

        setSize(320, 180);
        setVisible(true);

    }
    ActionListener signUpButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //new signup();
            dispose();
    }
    };
    ActionListener loginButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            new mainInterface();
            dispose();
    }
    };
}