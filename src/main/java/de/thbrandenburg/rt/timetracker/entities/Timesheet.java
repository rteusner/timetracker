package de.thbrandenburg.rt.timetracker.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TIMESHEETS")
public class Timesheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIMESHEETID", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "COMMENT")
    private String comment;

    @OneToMany(mappedBy = "timesheet")
    private List<TimesheetEntry> timesheetEntries = new ArrayList<>();

}