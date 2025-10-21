package de.thbrandenburg.rt.timetracker;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimesheetRepository extends JpaRepository<Timesheet2, Long>{
    List<Timesheet2> findByComment(String comment);

    Timesheet2 findById(long id);
}
