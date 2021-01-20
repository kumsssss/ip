import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Duke {
    //keeps taking in user input and carrying out manage method
    //until the input is "bye"
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hey there! This is Kums");
        System.out.println("How can i help?");
        ArrayList<Task> list = new ArrayList<>();
        int listLength = 0;
        System.out.println("---------------------------------------");
        String command = br.readLine();
        String[] arr = command.split(" ");
        System.out.println("---------------------------------------");
        while (!command.equals("bye")) {
            try {
                TaskManager.manage(list, arr);
            } catch (DukeException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("---------------------------------------");
            command = br.readLine();
            arr = command.split(" ");
            System.out.println("---------------------------------------");
        }
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println("---------------------------------------");
    }
}
