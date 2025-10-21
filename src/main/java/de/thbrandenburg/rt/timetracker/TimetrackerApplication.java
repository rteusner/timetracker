package de.thbrandenburg.rt.timetracker;

import com.google.j2objc.annotations.AutoreleasePool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@Theme("my-theme")
public class TimetrackerApplication implements AppShellConfigurator {

    @Autowired
    TimesheetRepository myRepo;

    public static void main(String[] args) {
       // SpringApplication.run(TimetrackerApplication.class, args);

        Timesheet timesheet = new Timesheet();
        timesheet.setComment("Hallo THB!");

        myRepo.save(timesheet);

        Timesheet mysecondTimesheet = myRepo.findByComment("Hallo THB!");

    }
}
