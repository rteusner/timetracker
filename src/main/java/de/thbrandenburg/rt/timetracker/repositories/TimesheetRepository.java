package de.thbrandenburg.rt.timetracker.repositories;

import de.thbrandenburg.rt.timetracker.entities.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimesheetRepository extends JpaRepository<Timesheet, Long>{

}
