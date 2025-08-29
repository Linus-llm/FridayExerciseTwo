import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task myTask = new Task("Clean","Room needs to be cleaned", LocalDate.of(2025, Month.SEPTEMBER,7));
        Task myGardenTask = new GardenTask("Trim","Trim bushes",LocalDate.of(2025,Month.SEPTEMBER,8),"backyard");
        Task myTask1 = new Task("Fix","Fix the cooler", LocalDate.of(2025, Month.AUGUST,25));
        Task myTask2 = new Task("Make","Make food", LocalDate.of(2025, Month.SEPTEMBER,10));
        Task myTask3 = new Task("Fix","Dishwasher needs fixing", LocalDate.of(2025, Month.SEPTEMBER,19));
        Task myTask4 = new Task("Fix","Cabinet needs fixing", LocalDate.of(2025, Month.SEPTEMBER,22));
        TaskList myTaskList = new TaskList();
        myTaskList.addTasksToList(myTask);
        myTaskList.addTasksToList(myTask1);
        myTaskList.addTasksToList(myTask2);
        myTaskList.addTasksToList(myTask3);
        myTaskList.addTasksToList(myTask4);
        myTaskList.addTasksToList(myGardenTask);


        myTaskList.printListOfTasks(myTaskList.filterTasksOnKeyword("Fix"));
        System.out.println("\n");
        myTaskList.printListOfTasks(myTaskList.sortTasksByDueDate());
        System.out.println("\n");
        myTaskList.printListOfTasks(myTaskList.getOverDueTasks());
        System.out.println("\n");
        myTaskList.printListOfTasks(myTaskList.getTaskDueToday());

    }
}
