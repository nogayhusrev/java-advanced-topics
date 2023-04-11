package com.nogayhusrev;

public enum ProjectStatus {
    OPEN, CLOSED, PROGRESS("IN PROGRESS");

    String status;

    ProjectStatus() {
    }

    ProjectStatus(String status) {
        this.status = status;
    }
}
