package com.iozeta.SpringIOZeta.Controllers.utilities;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Getter
public class NewTaskForm {

    @NotNull
    private String taskName;

    @NotNull
    private String repositoryLink;

    @NotNull
    private String subject;

    @NotNull
    private String repositoryName;

    @NotNull
    private String lecturerGitNick;

    private ContentHandler[] checkpointsContent;

    @Override
    public String toString() {
        return "NewTaskForm{" +
                "taskName='" + taskName + '\'' +
                ", repositoryLink='" + repositoryLink + '\'' +
                ", subject='" + subject + '\'' +
                ", repositoryName='" + repositoryName + '\'' +
                ", checkpointsContent=" + Arrays.toString(checkpointsContent) +
                '}';
    }
}
