import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    LocalDate dueDate;

    public Task(String title,String description,LocalDate dueDate){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public LocalDate getLocalDate(){
        return dueDate;
    }

    public String toString(){
        return "Title: "+title+" description: "+description+" date: "+dueDate;
    }
}
