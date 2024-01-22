import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import com.sun.source.util.TaskEvent;

import java.util.ArrayList;

public class Main {
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("Task-maker-counter thingy");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 360);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        JLabel label = new JLabel("The thing");
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(150, 100));

        label.setText("Why did these all have swing on them");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        jFrame.add(label);
        jFrame.setVisible(true);
      
public class TaskEntries {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        
        tasks.add("Task 1: Wow a task");
        tasks.add("Task 2: I wonder what it could be");
        tasks.add("Task 3: Hopefully this works");
        
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
      
public class TaskEntries {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        
        tasks.add("Task 1: Wow a task");
        tasks.add("Task 2: I wonder what it could be");
        tasks.add("Task 3: Hopefully this works");
        
        tasks.removeIf(task -> task.contains("completed"));
        for (String task : tasks) {
            System.out.println(task);
        }
        tasks.clearIf(task -> task.contains("completed"));
      
        
        for (String task : tasks) {
            System.out.println(task);
          
          
        }
    }
}
    public class TaskEntries {
    private String taskName;
    public static void main(String[] args) {
    ArrayList<TaskEntries> taskEntries = new ArrayList<>();
    ArrayList<String> tasks = new ArrayList<>();
    ArrayList<TaskEvent> events = new ArrayList<>();
  
        tasks.add("Task 1: Wow a task");
        tasks.add("Task 2: I wonder what it could be");
        tasks.add("Task 3: Hopefully this works");

        for (String task : tasks) {
        System.out.println(task);
          
              }
          }
      }
        jFrame.add(label);
        jFrame.setVisible(true);
    }
    
  public static void main(String[] args) {
    createAndShowGUI();
    
  }
}
