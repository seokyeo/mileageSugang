import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

public class studentAddInterface extends JFrame {
    JTextField idTextfield, nameTextfield, passwordTextfield, majorTextfield, emailTextfield;

    public studentAddInterface() {
        setTitle("학생 등록");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout studentAddUiGrid = new GridLayout(6, 2);
        studentAddUiGrid.setVgap(5);
        studentAddUiGrid.setHgap(3);

        Container studentAddUi = getContentPane();
        studentAddUi.setLayout(studentAddUiGrid);

        studentAddUi.add(new JLabel("학번"));
        idTextfield = new JTextField();
        studentAddUi.add(idTextfield);

        studentAddUi.add(new JLabel("이름"));
        nameTextfield = new JTextField();
        studentAddUi.add(nameTextfield);

        studentAddUi.add(new JLabel("비밀번호"));
        passwordTextfield = new JTextField();
        studentAddUi.add(passwordTextfield);

        studentAddUi.add(new JLabel("학과"));
        majorTextfield = new JTextField();
        studentAddUi.add(majorTextfield);

        studentAddUi.add(new JLabel("이메일"));
        emailTextfield = new JTextField();
        studentAddUi.add(emailTextfield);

        JButton studentAddButton = new JButton("등록하기");
        studentAddButton.addActionListener(studentAddButtonAction);
        studentAddUi.add(studentAddButton);

        setLocation(400, 400);
        setSize(320, 180);
        setVisible(true);
    }

    ActionListener studentAddButtonAction = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // studentAdd처리
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
            // if(true) 회원가입성공
            // studentstudentAdd(id,name,password,major,email);
            // else 회원가입 실패,id겹침

        }
    };
}
