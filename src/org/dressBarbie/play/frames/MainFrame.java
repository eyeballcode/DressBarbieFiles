package org.dressBarbie.play.frames;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainFrame {

    private final static void setDesign() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {   
        }
    }

	public MainFrame() {
		setDesign();
		JFrame f = new JFrame("Dress the Barbie");
		f.add(ExitButton.getExitButton(), BorderLayout.LINE_END);
		f.add(StartButton.getStartButton(), BorderLayout.LINE_START);
		f.pack();
		f.setVisible(true);
		}

}
