import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private JButton jbt = new JButton("-->");
    private JButton jbt2 = new JButton("<--");
    private JButton jbt3 = new JButton("EXIT");
    private JButton jbt4[][]  = new JButton[5][5];
    private Container cp;
    private JPanel jpnn = new JPanel(new GridLayout(3,1,3,3));
    private JPanel jpnc = new JPanel(new GridLayout(5,5,3,3));
    private Timer t1;
    private int round=0;
    private int dir;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,300,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(jpnn, BorderLayout.NORTH);
        cp.add(jpnc,BorderLayout.CENTER);

        jpnn.add(jbt);
        jpnn.add(jbt2);
        jpnn.add(jbt3);


         for (int i= 0 ; i < 5 ; i++){
             for (int j = 0 ; j < 5 ; j++){
                 jbt4[i][j]=new JButton();
                 jpnc.add(jbt4[i][j]);
             }
         }

         t1 = new Timer(200, new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 switch (dir){
                     case 0:

                 }
             }
         });


         jbt3.addActionListener(new AbstractAction() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 System.exit(0);
             }
         });

    }

}
