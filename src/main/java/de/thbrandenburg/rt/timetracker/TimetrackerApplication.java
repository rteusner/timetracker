package de.thbrandenburg.rt.timetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.component.page.AppShellConfigurator;

@SpringBootApplication
@Theme("my-theme")
public class TimetrackerApplication implements AppShellConfigurator {


    public static void main(String[] args) {
        SpringApplication.run(TimetrackerApplication.class, args);

        Timesheet2 timesheet = new Timesheet2();
        timesheet.setComment("Hallo THB!");

        //myRepo.save(timesheet);

        //Timesheet mysecondTimesheet = myRepo.findByComment("Hallo THB!");

    }
}
