package kanban.task.comparator;

import kanban.task.Task;
import java.util.Comparator;

public class TasksByStartTimeComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        if (task1.getStartTime() == null && task2.getStartTime() != null) {
            return 1;
        } else if (task1.getStartTime() != null && task2.getStartTime() == null) {
            return -1;
        } else if (task1.getStartTime() == null && task2.getStartTime() == null) {
            return task1.getId() - task2.getId();
        } else if (task1.getStartTime().isAfter(task2.getStartTime())) {
            return 1;
        } else if (task1.getStartTime().isBefore(task2.getStartTime())) {
            return -1;
        } else {
            return task1.getId() - task2.getId();
        }
    }
}
