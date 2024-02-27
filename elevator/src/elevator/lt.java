package elevator;

import javax.swing.SwingUtilities;

public class lt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("asda");
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	MainMenu ventana = new MainMenu();
                ventana.setVisible(true);
            }
        });
	}

}
