package _03_To_Do_List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ToDoList {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	
	public static void main(String[] args) {
		ToDoList list = new ToDoList();
		list.main2();
	}
	
	public void main2() {
		JFrame frame = new JFrame();
		frame.show();
		frame.setSize(500, 500);
		JPanel panel = new JPanel();
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JButton button5 = new JButton();
		frame.add(panel);
		panel.add(button1);
		button1.setText("add task");
		panel.add(button2);
		button2.setText("view tasks");
		panel.add(button3);
		button3.setText("remove task");
		panel.add(button4);
		button4.setText("save list");
		panel.add(button5);
		button5.setText("load list");
		
		JOptionPane.show
	}
}
