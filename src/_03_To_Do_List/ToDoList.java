package _03_To_Do_List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.*; //action listener

import java.util.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ToDoList implements ActionListener {
	JButton add;
	JButton view;
	JButton remove;
	JButton save;
	JButton load;

	String newTask;

	ArrayList<String> list = new ArrayList<String>();

	File f = new File("src/_02_File_Encrypt_Decrypt/encryptedFile.txt");
	FileWriter fw;
	Scanner scan;

	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save
	 * list, and load list.
	 *
	 * When add task is clicked: Create a JOptionPane to ask the user for a task and
	 * add it to an ArrayList
	 * 
	 * When the view tasks button is clicked: show all the tasks in the list
	 * 
	 * When the remove task button is clicked: Create a JOptionPane to prompt the
	 * user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked: Save the list to a file
	 * 
	 * When the load list button is clicked: Create a JOptionPane to Prompt the user
	 * for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file
	 * into the list.
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

		add = new JButton();
		view = new JButton();
		remove = new JButton();
		save = new JButton();
		load = new JButton();

		frame.add(panel);
		panel.add(add);

		add.setText("add task");
		add.addActionListener(this);

		panel.add(view);
		view.setText("view tasks");
		view.addActionListener(this);

		panel.add(remove);
		remove.setText("remove task");
		remove.addActionListener(this);

		panel.add(save);
		save.setText("save list");
		save.addActionListener(this);

		panel.add(load);
		load.setText("load list");
		load.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			newTask = JOptionPane.showInputDialog("Enter a task.");
			list.add(newTask + "\n");
			System.out.println(newTask);
		}

		if (e.getSource() == save) {
			try {
				fw = new FileWriter("src/_03_To_Do_List/ToDoList.txt");
				for (int i = 0; i < list.size(); i++) {
					fw.write(list.get(i));
				}
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
