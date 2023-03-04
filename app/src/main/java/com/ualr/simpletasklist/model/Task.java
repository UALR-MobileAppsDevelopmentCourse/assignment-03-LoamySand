package com.ualr.simpletasklist.model;

public class Task {
    // TODO 01. DONE Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    String description;
    boolean isDone;


    // TODO 02. DONE Define the class constructor and the corresponding getters and setters.
    public Task() {
        description = "";
        isDone = false;
    }
    public String getDescription() {
        return description;
    }
    public boolean getIsDone() {
        return isDone;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDone(boolean isdone) {
        this.isDone = isdone;
    }
}
