package _01_File_Recorder;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Enter a message");
		
		try {
			FileWriter fw = new FileWriter("src/_00_Intro_To_File_Input_and_Output/FileRecorder.txt");
			fw.write(answer);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
