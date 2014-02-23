package org.dressBarbie.play.frames;

import javax.swing.JButton;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class StartButton {

	public static Component getStartButton() {
		JButton b = new JButton("Start Game");
		ActionListener l = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("[INFO] "+new Date()+": Starting...");
				System.exit(0);
			}
		};
		b.addActionListener(l);
		return b;
	}

}
