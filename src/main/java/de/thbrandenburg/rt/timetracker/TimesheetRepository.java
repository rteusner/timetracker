package de.thbrandenburg.rt.timetracker;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long>{
    List<Timesheet> findByComment(String comment);

    Timesheet findById(long id);
}
