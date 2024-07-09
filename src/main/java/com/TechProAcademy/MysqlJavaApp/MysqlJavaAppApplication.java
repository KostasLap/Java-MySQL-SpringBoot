package com.TechProAcademy.MysqlJavaApp;


import com.TechProAcademy.MysqlJavaApp.Entity.BugReport;
import com.TechProAcademy.MysqlJavaApp.Entity.Bugs;
import com.TechProAcademy.MysqlJavaApp.Entity.Dependencies;
import com.TechProAcademy.MysqlJavaApp.Entity.Users;
import com.TechProAcademy.MysqlJavaApp.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MysqlJavaAppApplication implements CommandLineRunner {
	@Autowired
	BugsRepository bugsRepository;

	@Autowired
	BugReportRepository bugReportRepository;

	@Autowired
	UsersRepository usersRepository;

	@Autowired
	DependenciesRepository dependenciesRepository;

	@Autowired
	EntityHelper entityHelper;

	public static void main(String[] args) {
		SpringApplication.run(MysqlJavaAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		entityHelper.resetAutoIncrementAndDeleteAll();


//		entityHelper.readAndAddUsersFromCSV("users.csv");
//		entityHelper.readAndAddBugsFromCSV("bugs.csv");
//		entityHelper.readAndAddDependenciesFromCSV("dependencies.csv");
//		entityHelper.readAndAddBugsReportsFromCSV("bugreport.csv");

//		entityHelper.findMutualDependencies();


//		entityHelper.exportUserCSV();
//		entityHelper.exportBugsCSV();
//		entityHelper.exportBugReportCSV();
//		entityHelper.exportDependenciesCSV();

//		BugReport report = bugReportRepository.findById(5).get();
//		System.out.println(report.toString());
//		report.setResolved(false);
//		System.out.println(report.toString());
//		bugReportRepository.save(report);

//		entityHelper.updateStateResolved();




	}
}
