package com.prajwal.workflow.dto;

public class TaskResponse {

    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;

    private Long projectId;
    private String projectName;

    private Long assignedUserId;
    private String assignedUserName;

    public TaskResponse() {
    }

    public TaskResponse(
            Long id,
            String title,
            String description,
            String status,
            String priority,
            Long projectId,
            String projectName,
            Long assignedUserId,
            String assignedUserName) {

        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.projectId = projectId;
        this.projectName = projectName;
        this.assignedUserId = assignedUserId;
        this.assignedUserName = assignedUserName;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public Long getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public Long getAssignedUserId() {
        return assignedUserId;
    }

    public String getAssignedUserName() {
        return assignedUserName;
    }
}