package ru.job4j.search;

import java.util.LinkedList;
import java.util.Objects;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task var) {
        int index = 0;
        for (var element : tasks) {
            if (var.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, var);
    }

    public Task take() {
        return tasks.poll();
    }
}


