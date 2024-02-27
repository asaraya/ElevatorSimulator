package elevator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class MainMenu extends JFrame {
    public MainMenu() {
        this.setLayout(null);
        
        setTitle("Simulador de Elevador");
        setSize(560,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Botón Usuario
        JButton userButton = new JButton("Usuario");
        userButton.setBounds(60, 50, 150, 30);
        userButton.addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				UserMenu userMenu = new UserMenu();
				userMenu.setVisible(true);
			}
        });
        
        // Botón técnico
        JButton techButton = new JButton("Técnico");
        techButton.setBounds(330, 50, 150, 30);
        techButton.addActionListener(new ActionListener() {@Override
			public void actionPerformed(ActionEvent e) {
				UserMenu userMenu = new UserMenu();
				userMenu.setVisible(true);
			}
        });
        
        // Agregar al Frame principal
        this.add(userButton);
        this.add(techButton);
    }
}
