package intro_to_file_io;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	
	ArrayList<String> Tasks = new ArrayList<String>();
	
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	
	JButton addTask = new JButton("Add Task");
	JButton removeTask = new JButton("Remove Task");
	JButton save = new JButton("Save");
	JButton load = new JButton("Load");
	JButton program = new JButton("Progam");

	public static void main(String[] args) {
		ToDoList toDoList = new ToDoList();
	}
	

	ToDoList(){
		frame.setVisible(true);
		frame.setSize(1000, 500);
		panel.setSize(1000, 500);
		frame.add(panel);
		panel.add(addTask);
		panel.add(removeTask);
		panel.add(save);
		panel.add(load);
		panel.add(program);
		
		addTask.setSize(100, 50);
		removeTask.setSize(100, 50);
		save.setSize(100, 50);
		load.setSize(100, 50);
		program.setSize(100, 50);
		
		addTask.addActionListener(this);
		removeTask.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		program.addActionListener(this);
	}
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == addTask){
				String task = JOptionPane.showInputDialog("What is your task?");
				Tasks.add(task);
			}
			if(e.getSource() == removeTask){
				Tasks.remove(0);
			}
			if(e.getSource() == save){
				try {
					FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);
					
					fw.write(Tasks.toString());
						
					fw.close();
				} catch (IOException f) {
					f.printStackTrace();
				}
			}
			if(e.getSource() == load){
				ArrayList<String> Tasks1 = new ArrayList<String>();
				JOptionPane.showMessageDialog(null, Tasks1);
			}
			if (e.getSource() == program){
				try {
					BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test2.txt"));
					
					String line = br.readLine();
					while(line != null){
						JOptionPane.showMessageDialog(null, line);
						line = br.readLine();
					}
					
					br.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException f) {
					// TODO Auto-generated catch block
					f.printStackTrace();
				}	
			}
		}
}





/*Create a window with four buttons: add task, remove task, save, and load.
The add task button will display a JOptionPane to get a task from the user and add it to the list.
Remove task will remove a task from the list. You can choose your own method of how to select a task from the list.
The save button will save the current task list to a file.
The load button will load a new task list into the program and display it.
The program should automatically load the last saved list from the file at startup and display it.*/