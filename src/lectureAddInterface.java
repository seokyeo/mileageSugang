import javax.swing.*;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lectureAddInterface extends JFrame{
    JTextField lectureNameTextField,lectureCodeTextField,lectureMajorTextField,lectureDivisionTextField;
    public lectureAddInterface(){
        setTitle("강의추가");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        GridLayout lectureAddUiGrid = new GridLayout(6, 2);
        lectureAddUiGrid.setVgap(5);
        lectureAddUiGrid.setHgap(3);

        Container lectureAddUi = getContentPane();
        lectureAddUi.setLayout(lectureAddUiGrid);

        lectureAddUi.add(new JLabel("과목명"));
        lectureNameTextField = new JTextField();
        lectureAddUi.add(lectureNameTextField);

        lectureAddUi.add(new JLabel("개설학과"));
        lectureMajorTextField = new JTextField();
        lectureAddUi.add(lectureMajorTextField);

        lectureAddUi.add(new JLabel("구분"));
        lectureDivisionTextField = new JTextField();
        lectureAddUi.add(lectureDivisionTextField);

        JButton lectureAddButton = new JButton("가입하기");
        lectureAddButton.addActionListener(lectureAddButtonAction);
        lectureAddUi.add(lectureAddButton);

        setLocation(400, 400);
        setSize(320, 180);
        setVisible(true);
    }
    ActionListener lectureAddButtonAction = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // signup처리
            // 빈칸있으면 오류 반환
            String name = lectureNameTextField.getText();
            System.out.println(name);
            String major = lectureMajorTextField.getText();
            System.out.println(major);
            String division = lectureDivisionTextField.getText();
            System.out.println(division);
            

        }
    };


}
