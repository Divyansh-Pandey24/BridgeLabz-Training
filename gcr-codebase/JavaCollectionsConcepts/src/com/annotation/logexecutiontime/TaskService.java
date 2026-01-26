package com.annotation.logexecutiontime;
class TaskService {

    @LogExecutionTime
    void fastTask() {
        for (int i = 0; i < 1000; i++) {
        }
    }

    @LogExecutionTime
    void slowTask() {
        for (int i = 0; i < 1000000; i++) {
        }
    }
}
