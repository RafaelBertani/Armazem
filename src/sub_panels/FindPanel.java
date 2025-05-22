package sub_panels;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import screen.Screen;
import screen.ScreenFunctions;

public class FindPanel {
    
    public JPanel getPanel() {
        return panel;
    }

    private JPanel panel = new JPanel();
    private JLabel title = new JLabel();
    private JLabel subtitle = new JLabel();

    public JButton find_btn = new JButton();

    public FindPanel(int WIDTH, int HEIGHT){

        panel.setBounds(0,0, WIDTH, HEIGHT);
        panel.setLayout(null);
        panel.setOpaque(true);
        panel.setBackground(new Color(32,32,32));
        panel.setBorder(new LineBorder(new Color(0,0,172), 2));

        ScreenFunctions.label_setup(title, "Gerenciamento do armazém", false, 0, 0, WIDTH, 10*HEIGHT/85-3, panel);
        ScreenFunctions.label_edit(title,new Font("Arial",Font.PLAIN,25),null,Color.WHITE);
        
        ScreenFunctions.label_setup(subtitle, "Encontrar valor específico", false, 0, HEIGHT/10, WIDTH, HEIGHT/8, panel);
        ScreenFunctions.label_edit(subtitle,new Font("Arial",Font.PLAIN,20),null,Color.WHITE);        



        //OK BUTTON
        ScreenFunctions.button_setup(find_btn, "Encontrar valor!", 4*WIDTH/10, 8*HEIGHT/10, 2*WIDTH/10, HEIGHT/10, Screen.myActionListener, panel);
        ScreenFunctions.button_edit(find_btn,new Font("Arial",Font.PLAIN,16),new Color(200,200,200),Color.BLACK);
        find_btn.setFocusable(false);
        find_btn.setBorder(new LineBorder(new Color(0,0,0), 2));
        
    }

}
