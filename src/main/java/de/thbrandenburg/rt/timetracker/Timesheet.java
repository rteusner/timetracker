package de.thbrandenburg.rt.timetracker;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Timesheet {

    @Id
    private Long id;
    private Long hoursWorked;
    private String comment;

    public Timesheet() {
    }

    public Timesheet(Long hoursWorked, String comment) {
        this.hoursWorked = hoursWorked;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Long hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
