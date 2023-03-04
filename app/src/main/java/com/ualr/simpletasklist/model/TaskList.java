package com.ualr.simpletasklist.model;


import android.util.Log;

import java.util.HashMap;

public class TaskList {

    // TODO 03. DONE Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.
    HashMap<Integer, Task> tasks;
    Integer curID = 0;
    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. DONE Define the class constructor and the corresponding getters and setters.
    public TaskList(HashMap<Integer,Task> theTasks) {
        theTasks.put(0,new Task());
        tasks = theTasks;//tasks);
    }
    public HashMap<Integer, Task> getTasks() {
        return tasks;
    }
    public void setTasks(HashMap<Integer, Task> tasks) {
        this.tasks = tasks;
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void addTask(String taskDescription) {
        curID++;
        Task addedTask = new Task();
        addedTask.setDescription(taskDescription);

        tasks.put(curID, addedTask);
    }
    // TODO 06.04. DONE Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line
    public String formatString(){
        String formattedString = "";

        for (Integer key: tasks.keySet()){//Integer i=1; i<tasks.size(); i++) {
            if (tasks.get(key).description != "") {
                //     formattedString=formattedString.concat("");
                // } else {
                formattedString = formattedString.concat(Integer.toString(key));
                formattedString = formattedString.concat("  -   ");
                formattedString = formattedString.concat(tasks.get(key).description);
                if (tasks.get(key).isDone) {
                    formattedString = formattedString.concat("    DONE\n");
                } else {
                    formattedString = formattedString.concat("\n");
                }
                //i++;
            }
        }
            //i++;

        return formattedString;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void deleteTask(String id) {
        tasks.remove(Integer.parseInt(id));
    }
    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(String id) {
        tasks.get(Integer.parseInt(id)).setDone(true);
    }
}
