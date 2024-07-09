# Bug Tracking System with Java and MySQL

This repository contains a Java application for managing bug reports using MySQL as the database. Below is a detailed README file outlining the project's structure, functionality, tools used, and other relevant information.

## Project Structure

The project consists of several packages and classes:

- **Entity Package**: Contains entity classes representing database tables (`BugReport`, `Bugs`, `Users`, `Dependencies`).
- **Repository Package**: Contains repositories for database operations (`BugReportRepository`, `BugsRepository`, `UsersRepository`, `DependenciesRepository`).
- **EntityHelper Class**: Provides helper methods to interact with entities, perform CRUD operations, and manage dependencies between bugs.
- **CSV Import/Export**: Supports CSV import/export functionality for users, bugs, dependencies, and bug reports.
- **Spring Boot Configuration**: Uses Spring Boot annotations (`@Entity`, `@Repository`, `@Autowired`) for dependency injection and ORM (Object-Relational Mapping).

## Functionality

1. **Bug Management**: 
   - Create, read, update, and delete bug reports (`BugReport` entity).
   - Assign bugs to users (`Users` entity).
   - Track bug severity (`Bugs` entity) and dependencies between bugs (`Dependencies` entity).

2. **User Management**: 
   - Create and manage users (`Users` entity).
   - Assign bug reports to users for tracking.

3. **Dependency Management**: 
   - Define relationships (`Dependencies` entity) between bugs to manage dependencies.

4. **BugReport Class Functionality**: 
   - **Creation and Modification**: Create new bug reports with details such as bug, user, date added, resolution status, and date resolved (`BugReport` entity).
   - **State Management**: Track the state of bug reports, whether resolved or unresolved (`resolved` attribute).
   - **Association**: Associate bug reports with bugs (`Bugs` entity) and users (`Users` entity) for comprehensive bug tracking.

5. **Automated State Resolution**: 
   - **Update Bug State Resolved**: The application automatically updates bug report states based on resolved dependencies. When a bug report's dependencies are resolved, it marks the bug report as resolved (`BugReport` entity).
   - **Find Mutual Dependencies**: The system identifies mutual dependencies between bugs (`Dependencies` entity) to understand interdependencies and their impact on bug resolution.
 

6. **CSV Import/Export**: 
   - Import users, bugs, dependencies, and bug reports from CSV files.
   - Export data to CSV files for reporting and backup purposes.

## EntityHelper Class Functions

The `EntityHelper` class provides essential methods for managing entities and supporting operations within the bug tracking system:

- **findOrCreateUser(String userName)**: Searches for an existing user by username in the database. If not found, creates a new user and saves it.
- **findOrCreateBug(String name, String description, Integer severity)**: Searches for an existing bug by name in the database. If not found, creates a new bug with provided details and saves it.
- **findOrCreateDependency(Bugs bug, Bugs dependBug)**: Searches for an existing dependency between bugs in the database. If not found, creates a new dependency relationship and saves it.
- **createBugReportAndUserAndBug(String bugName, String bugDescription, Integer bugSeverity, String dependOnBug, String userName)**: Combines functionality to create a new bug report associated with a bug, user, and potential dependency. Saves the bug report to the database.
- **updateStateResolved()**: Implements logic to automatically update bug report states based on resolved dependencies. Recursively checks and updates bug reports when dependencies are resolved.
- **noResolvedReportsList()**: Retrieves and prints a list of bug reports that are unresolved (`resolved` attribute is false).
- **resolvedReportsList()**: Retrieves and prints a list of bug reports that are resolved (`resolved` attribute is true).
- **allReportsList()**: Retrieves and prints a list of all bug reports in the database.
- **findMutualDependencies()**: Analyzes dependencies between bugs to identify mutual dependency groups. Prints the groups of bugs that depend on each other in a circular manner.
- **exportUserCSV()**: Generates a CSV file (`users.csv`) containing details of all users in the database.
- **exportBugsCSV()**: Generates a CSV file (`bugs.csv`) containing details of all bugs in the database.
- **exportDependenciesCSV()**: Generates a CSV file (`dependencies.csv`) containing details of all dependencies between bugs in the database.
- **exportBugReportCSV()**: Generates a CSV file (`bugreport.csv`) containing details of all bug reports in the database.
- **readAndAddUsersFromCSV(String filename)**: Reads user data from a CSV file and adds new users to the database if they do not already exist.
- **readAndAddBugsFromCSV(String filename)**: Reads bug data from a CSV file and adds new bugs to the database if they do not already exist.
- **readAndAddDependenciesFromCSV(String filename)**: Reads dependency data from a CSV file and adds new dependency relationships between bugs to the database if they do not already exist.
- **readAndAddBugsReportsFromCSV(String filename)**: Reads bug report data from a CSV file and adds new bug reports to the database if they do not already exist.
- **resetAutoIncrementAndDeleteAll()**: Delete all records from all tables and reset the ID values to 1. Otherwise, the ID values would continue to increment from the last recorded value. 

## Tools Used

- **Java**: Core programming language used for application logic.
- **Spring Boot**: Framework for building and running Java applications.
- **MySQL**: Relational database management system for storing bug reports, users, bugs, and dependencies.
- **Hibernate**: ORM tool for mapping Java objects to database entities.
- **Apache Commons CSV**: Library for reading and writing CSV files.
- **Maven**: Dependency management tool used for building and managing Java-based projects.
- **Git**: Version control system for tracking changes in source code during development.
- **IntelliJ IDEA**: Integrated development environment (IDE) used for Java development.

## Setup Instructions

To set up and run the project locally:

1. **Clone the Repository**: `git clone <repository_url>`
2. **Import Project**: Open the project in IntelliJ IDEA or your preferred IDE.
3. **Configure MySQL**: Set up a MySQL database and update `application.properties` with database credentials.
4. **Build and Run**: Use Maven to build the project (`mvn clean install`) and run it as a Spring Boot application (`mvn spring-boot:run`).

## Additional Notes

- Ensure Java Development Kit (JDK) is installed (version compatible with Spring Boot version used).
- Update database connection details (`application.properties`) to match your local MySQL setup.
- Customize CSV file paths in `EntityHelper` for import/export functionality.
- Explore additional Spring Boot features and libraries for enhancing functionality (e.g., security, logging).

## Contributors

- Include a section listing contributors if applicable.

## License

- Specify the project's license terms (e.g., MIT License, Apache License).

---

This README provides a comprehensive overview of the bug tracking system, highlighting its structure, functionality, tools used, setup instructions, and additional notes for customization and usage. Adjust and expand sections as necessary to reflect specific project details and requirements.
