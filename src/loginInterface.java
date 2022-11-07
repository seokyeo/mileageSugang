import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginInterface extends JFrame {
    JTextField idTextfield,passwordTextfield;
    public loginInterface() {

        setTitle("로그인");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout loginUiGrid = new GridLayout(3,2); 
        loginUiGrid.setVgap(5);
        loginUiGrid.setHgap(3);

        Container loginUi = getContentPane();
        loginUi.setLayout(loginUiGrid);
        
        loginUi.add(new JLabel("ID"));
        idTextfield = new JTextField();
        loginUi.add(idTextfield);

        loginUi.add(new JLabel("Password"));
        passwordTextfield = new JTextField();
        loginUi.add(passwordTextfield);

        JButton signUpButton = new JButton("회원가입");
        signUpButton.addActionListener(signUpButtonAction);
        loginUi.add(signUpButton);
        JButton loginButton = new JButton("로그인");
        loginButton.addActionListener(loginButtonAction);
        loginUi.add(loginButton);

        setLocation(400, 400);
        setSize(320, 180);
        setVisible(true);

    }
    ActionListener signUpButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            new signupInterface();
    }
    };
    ActionListener loginButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            String id = idTextfield.getText();
            System.out.println(id);
            String password = passwordTextfield.getText();
            System.out.println(password);
            if(true){
                new mainInterface();
            }
            else System.out.println("login fail");
            dispose();
    }
    };
}