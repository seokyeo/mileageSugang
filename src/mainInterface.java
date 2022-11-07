import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainInterface extends JFrame {
    public mainInterface(){

        setTitle("마일리지 수강신청");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout mainUiGrid = new GridLayout(5,3);
        mainUiGrid.setHgap(5);
        mainUiGrid.setVgap(3);

        Container mainUi = getContentPane();
        mainUi.setLayout(null);

        JButton myAccountButton = new JButton("내정보");
        myAccountButton.setBounds(50,30,90,30);
        myAccountButton.addActionListener(myAccountButtonAction);
        mainUi.add(myAccountButton);

        JButton sugangButton =new JButton("수강신청");
        sugangButton.setBounds(50,60,90,30);
        sugangButton.addActionListener(sugangButtonAction);
        mainUi.add(sugangButton);

        JButton adminButton = new JButton("관리자모드");
        adminButton.setBounds(50, 120, 90, 30);
        adminButton.addActionListener(adminButtonAction);
        mainUi.add(adminButton);

        JButton closeButton = new JButton("닫기");
        closeButton.setBounds(50,90,90,30);
        closeButton.addActionListener(closeButtonAction);
        mainUi.add(closeButton);
        

        setSize(720, 480);
        setVisible(true);
    }

    ActionListener myAccountButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //new myAccount();
            dispose();
    }
    };
    ActionListener sugangButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        new sugangInterface();
    }
    };
    ActionListener adminButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            new adminInterface();
    }
    };
    ActionListener closeButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            dispose();
    }
    };
}
