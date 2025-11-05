package de.thbrandenburg.rt.timetracker.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TIMESHEETENTRIES")
public class TimesheetEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIMESHEETENTRYID", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "HOURSWORKED")
    private Long hoursWorked;


    //@ManyToOne
    //@JoinColumn(name="TIMEHSEETID", nullable=false)
    //private Timesheet timesheet;

}