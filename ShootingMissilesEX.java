package uzaygemisi;

import javax.swing.*;
import java.awt.*;

public class ShootingMissilesEX extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ShootingMissilesEX(){
        initUI();
    }
    private void initUI(){
        add(new Board());
        setSize(400,400);
        setResizable(false);
        setTitle("Uzay Gemisi Oyunu");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        EventQueue.invokeLater(() ->{
            ShootingMissilesEX ex = new ShootingMissilesEX();
            ex.setVisible(true);
        });
    }
}
