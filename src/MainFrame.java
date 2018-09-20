import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private Container cp;
//    private JPanel A = new JPanel(new GridLayout(1, 1, 3, 3));
//    private JPanel B = new JPanel(new GridLayout(3, 4, 3, 3));
    private JLabel jlb = new JLabel("華氏");
    private JTextField jtf =new JTextField();
    private float x;
    private JButton chang=new JButton("轉換");

    public MainFrame() {
        mean();
    }

    public void mean() {
        this.setDefaultCloseOperation(3);//設定關閉視窗的按鈕
        this.setLayout(null);//設置布局為空
        this.setBounds(100, 100, 450, 300);//設置介面大小
        MainFrame.this.setTitle("攝氏轉華氏");//視窗上的名字

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        cp.setLayout(null);

        jtf.setBounds(20,20,100,50);
        cp.add(jtf);
        chang.setBounds(140,20,100,50);
        cp.add(chang);
        jlb.setBounds(250,20,100,50);
        cp.add(jlb);
        chang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=((Float.parseFloat(jtf.getText()))*9/5)+32;
                jlb.setText("華氏"+Float.toString(x)+"度");
            }
        });

    }
}