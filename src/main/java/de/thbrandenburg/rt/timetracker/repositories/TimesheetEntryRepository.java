package de.thbrandenburg.rt.timetracker.repositories;

import de.thbrandenburg.rt.timetracker.entities.TimesheetEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimesheetEntryRepository extends JpaRepository<TimesheetEntry, Long> {
    List<TimesheetEntry> findByCommentContaining(String comment);
    List<TimesheetEntry> findByHoursWorkedGreaterThan(Long hoursWorkedIsGreaterThan);
}
