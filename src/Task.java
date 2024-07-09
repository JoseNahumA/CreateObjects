public class Task {
    public String name;
    public String deadline;
    public boolean complete;

    public Task(String name, String deadline) {
        this.name = name;
        this.deadline = deadline;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public boolean isComplete() {
        return complete;
    }

    public void completeTask() {
        this.complete = true;
    }

    public void showInformation() {
        System.out.println("Task: " + name);
        System.out.println("Dead Line: " + deadline);
        System.out.println("State: " + (complete ? "Complete" : "Pending"));
    }
}
