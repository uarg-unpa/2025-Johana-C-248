package simcir;

import java.awt.*;
import java.awt.event.*;

import com.d_project.ui.*;

/**
 * CircuitFrame
 * @author Kazuhiko Arase
 */
class CircuitFrame extends Frame implements ActionListener {

    Main m;

    CircuitFrame() {
	super("Circuit Simulator");

	MenuBar bar = new MenuBar();
	setMenuBar(bar);
	Menu menu;

	bar.add(menu = new Menu("File") );
	menu.add(createMenuItem("New") );
	menu.add(createMenuItem("Open") );
	menu.add(createMenuItem("Save") );
	menu.add(createMenuItem("SaveAs") );
	menu.addSeparator();
	menu.add(createMenuItem("Exit") );

	bar.add(menu = new Menu("Edit") );
	menu.add(createMenuItem("Copy") );
	menu.add(createMenuItem("Cut") );
	menu.add(createMenuItem("Paste") );
	menu.add(createMenuItem("SelectAll") );

	enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    }

    protected void processWindowEvent(WindowEvent e) {
	if (e.getID() == WindowEvent.WINDOW_CLOSING) {
	    exit();
	}
    }

    private MenuItem createMenuItem(String label) {
	MenuItem item = new MenuItem(label);
	item.addActionListener(this);
	return item;
    }

    public void start(Main m) {
	add("Center", this.m = m);
	pack();
	show();
	m.newFile();
	m.initApp();
	m.start();
    }

/*
    public boolean action(Event  evt, Object  what) {
	String command = (String)what; 
*/

    public void exit() {
	dispose();
	System.exit(0);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
	if (command.equals("Exit") ) {
	    exit();
	} else {
	    if (m != null) m.action(command);
	}
    }
}


