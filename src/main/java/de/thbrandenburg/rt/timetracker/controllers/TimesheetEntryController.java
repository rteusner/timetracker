package de.thbrandenburg.rt.timetracker.controllers;

import de.thbrandenburg.rt.timetracker.entities.User;
import de.thbrandenburg.rt.timetracker.repositories.TimesheetEntryRepository;
import de.thbrandenburg.rt.timetracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;

@RestController
public class TimesheetEntryController {

    @Autowired
    TimesheetEntryRepository timesheetEntryRepository;

    @GetMapping("/getWorkEntriesGreaterThan")
    public String getWorkEntriesGreaterThan(@RequestParam long hoursWorked) {
        System.out.println(timesheetEntryRepository.findByHoursWorkedGreaterThan(hoursWorked));
        return "test";
    }

    @GetMapping("/getNiceEntries")
    public String getNiceEntries() {
        System.out.println(timesheetEntryRepository.findByCommentContaining("super"));
        return "test";
    }

    @GetMapping("/getLongWorkEntries")
    public String getLongWorkEntries() {
        System.out.println(timesheetEntryRepository.findByHoursWorkedGreaterThan(8L));
        return "test";
    }
}
