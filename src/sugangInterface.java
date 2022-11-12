import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sugangInterface extends JFrame {
    public sugangInterface(){
        DefaultListModel model;
        String[] lectures={"선대수","컴구","유닉스"};
        setTitle("수강신청");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Container sugangUi = getContentPane();
        model = new DefaultListModel();

        sugangUi.setLayout(null);
        
        sugangUi.add(new JLabel("강의 목록"));
        
        //내정보 띄우기
        //강의 목록 쭈르륵

        JList lectureList = new JList(lectures);
        lectureList.setBounds(50,60,60,320);
        sugangUi.add(lectureList);

        JButton sugangAddButton =new JButton("수강 추가");
        sugangAddButton.setBounds(300,60,90,30);
        sugangAddButton.addActionListener(sugangAddButtonAction);
        sugangUi.add(sugangAddButton);

        JButton sugangDelButton =new JButton("되돌리기");
        sugangDelButton.setBounds(300,90,90,30);
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
