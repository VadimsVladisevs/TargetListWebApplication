# TargetListWebApplication

TargetListWebApplication tutorial project created for the [JavaGuru](https://javaguru.lv/) Java 2 – Agile Web Development course

## About application
Main task - develop `to-do` list Web Application.

For execution this task, was created 3 MySQL databases:
1) Targets - database contain all info about targets.
2) Users - database contain all info abouts users.
3) Board - database contain all records. (Record - info about target (what needs to do), info about user (who needs to do), targets addition date and date of target completion.

Implemented functionality
* For Targets:
 * add/delete target
 * show all targets
 * change target parameters (name/description/deadline)
 * search target (search by name/description)

* For Users:
 * add/delete user
 * show all users
 * change target parameters (first name/last name)
 * search target (search by first name/last name)

* For Records:
 * add/delete record
 * show all records
 * show unfinished record 
 * set date of target completion
  
## Used libs

At different stages of development was used:

* Spring framework
  * Spring Web
  * Spring Security
  * Spring Boot 
  * Spring Data JPA  
* MySQL database
* Thymeleaf  
* JUnit and Mockito  
* JDBC Api
* Hibernate ORM
* REST Api
* Liquibase
