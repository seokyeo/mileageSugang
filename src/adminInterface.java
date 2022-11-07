import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class adminInterface extends JFrame{
    public adminInterface(){
        setTitle("관리자 모드");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container mainUi = getContentPane();
        mainUi.setLayout(null);
        
        JButton studentAddButton = new JButton("학생 추가");
        studentAddButton.setBounds(50,30,90,30);
        studentAddButton.addActionListener(studentAddButtonAction);
        mainUi.add(studentAddButton);

        JButton studentDelButton = new JButton("학생 삭제");
        studentDelButton.setBounds(200,30,90,30);
        studentDelButton.addActionListener(studentDelButtonAction);
        mainUi.add(studentDelButton);

        JButton lectureAddButton = new JButton("강의 추가");
        lectureAddButton.setBounds(50,90,90,30);
        lectureAddButton.addActionListener(lectureAddButtonAction);
        mainUi.add(lectureAddButton);

        JButton lectureDelButton = new JButton("강의 삭제");
        lectureDelButton.setBounds(200,90,90,30);
        lectureDelButton.addActionListener(lectureDelButtonAction);
        mainUi.add(lectureDelButton);
        
        setSize(720, 480);
        setVisible(true);
    }


    ActionListener studentAddButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            new studentAddInterface();
    }
    };
    ActionListener studentDelButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //new studentdel();
            dispose();
    }
    };
    ActionListener lectureAddButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            new lectureAddInterface();
    }
    };
    ActionListener lectureDelButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //new lecturedel();
            dispose();
    }
    };
    
}


