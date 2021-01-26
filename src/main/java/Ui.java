import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Ui {
    BufferedReader reader;

    public Ui() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    void intro() {
        System.out.println("Hey there! This is Kums");
        System.out.println("How can i help?");
    }

    void showLine() {
        System.out.println("---------------------------------------");
    }

    void showError(String message) {
        System.out.println(message);
    }

    void bye() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    String readCommand() throws IOException {
        return this.reader.readLine();
    }

    void showLoadingError() {
        System.out.println("OOPS! The file hasn't been created yet");
    }

    void addedTask(TaskList tasks) {
        Task task = tasks.taskList.get(tasks.listLength - 1);
        System.out.println("Got it. I've added this task:");
        System.out.println("    " + task);
        System.out.println("Now you have " + (tasks.listLength) + " tasks in the list.");
    }

    void printList(TaskList tasks) {
        ArrayList<Task> list = tasks.taskList;
        System.out.println("Here are the tasks in your list:");
        for (int i = 0;  i < tasks.listLength; i++) {
            System.out.println( (i+1) + "."  + list.get(i));
        }
    }

    void deletedTask(Task task, int listLength) {
        System.out.println(" Noted. I've removed this task:");
        System.out.println(task);
        System.out.println("Now you have " + listLength + " tasks in the list.");
    }

    void didTask(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("    " + task);
    }

    void printFilteredList(TaskList tasks) {
        ArrayList<Task> list = tasks.taskList;
        System.out.println("Here are the matching tasks in your list:");
        for (int i = 0;  i < tasks.listLength; i++) {
            System.out.println( (i+1) + "."  + list.get(i));
        }
    }
}
