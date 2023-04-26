package classes;

import java.awt.EventQueue;

import telas.LoginFrame;

public class Main {

	public static void main(String [] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
			
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}
}
