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

        JButton closeButton = new JButton("닫기");
        closeButton.setBounds(50,90,90,30);
        closeButton.addActionListener(closeButtonAction);
        mainUi.add(closeButton);

        setSize(720, 480);
        setVisible(true);
    }
    ActionListener myAccountButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            //myAccount();
            dispose();
    }
    };
    ActionListener closeButtonAction = new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            dispose();
    }
    };
}
