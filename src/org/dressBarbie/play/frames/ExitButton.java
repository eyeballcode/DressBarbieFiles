package org.dressBarbie.play.frames;

import javax.swing.JButton;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ExitButton {

	public static Component getExitButton() {
		JButton b = new JButton("Exit Game");
		ActionListener l = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("[INFO] "+new Date()+": Exiting...");
				System.exit(0);
			}
		};
		b.addActionListener(l);
		return b;
	}

}
