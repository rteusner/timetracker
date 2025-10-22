package de.thbrandenburg.rt.timetracker.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TIMESHEETENTRIES")
public class TimesheetEntry {
    @Id
    @NotNull
    @Column(name = "TIMESHEETENTRYID", nullable = false)
    private Long timesheetentryid;

    @Size(max = 255)
    @Column(name = "COMMENT")
    private String comment;

    public Long getTimesheetentryid() {
        return timesheetentryid;
    }

    public void setTimesheetentryid(Long timesheetentryid) {
        this.timesheetentryid = timesheetentryid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}