import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sugangInterface extends JFrame {
    public sugangInterface(){

        setTitle("수강신청");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container sugangUi = getContentPane();

        sugangUi.setLayout(null);
        
        sugangUi.add(new JLabel("강의 목록"));
        
        //내정보 띄우기
        //강의 목록 쭈르륵

        JButton sugangAddButton =new JButton("수강 추가");
        sugangAddButton.setBounds(50,60,90,30);
        sugangAddButton.addActionListener(sugangAddButtonAction);
        sugangUi.add(sugangAddButton);

        JButton sugangDelButton =new JButton("되돌리기");
        sugangDelButton.setBounds(50,90,90,30);
        sugangDelButton.addActionListener(sugangDelButtonAction);
        sugangUi.add(sugangDelButton);

        setSize(720,480);
        setVisible(true);



    }
    ActionListener sugangAddButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            dispose();
    }
    }; 
    ActionListener sugangDelButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            dispose();
    }
    };   
}
