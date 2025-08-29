import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskList<T extends Task> {
    private List<T> listOfTasks;

    public TaskList(){
        this.listOfTasks = new ArrayList<>();
    }

    public void addTasksToList(T task){
        this.listOfTasks.add(task);
    }
    public List<T> filterTasksOnKeyword(CharSequence input){

       List<T> resultList = listOfTasks.stream().filter(x -> x.getDescription().contains(input) || x.getTitle().contains(input)).toList();
        return resultList;
    }
    public List<?> sortTasksByDueDate(){
       List<T> resultList = listOfTasks.stream().sorted(Comparator.comparingLong(i-> i.getLocalDate().getDayOfMonth() + i.getLocalDate().getMonthValue())).toList();
        return resultList;
    }

    public List<?> getTaskDueToday(){
        List<T> resultList = listOfTasks.stream().filter(x -> x.getLocalDate().isEqual(LocalDate.now())).toList();
        return resultList;
    }
    public List<T> getOverDueTasks(){
        List<T> resultList = listOfTasks.stream().filter(x-> x.getLocalDate().isBefore(LocalDate.now())).toList();
        return resultList;
    }
    public void printListOfTasks(List<T> input){
        input.stream().forEach(System.out::println);
    }
}
