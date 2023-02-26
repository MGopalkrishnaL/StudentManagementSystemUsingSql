
# Project : StudentManagementSystem Project
# Using_Sql

## Frameworks and languages used
* SpringBoot
* Java

## Data flow in the project
1. Controller - It is used to define the path flow of service.
2. Services - It is used to perform the bussiness logics to get desired out put.
3. Repository - it is used to store the data modeling methods.
4. DataBase Design - it is used to store the data.


## Data Structure Used in Project
* ArrayList
## Project Summary
StudentManagementSystem is project where We used to store the data of Students,Courses,Books,Laptops in Mysql Database.
In this project we had used MVC(Model View Controller) Design.
* When ever we click on the link the action takes place in the Contoller.
* Then it goes to Service layer to perform some business operation and according to the request we had given it will perform.
* Then it goes to the dao layer which is known as Repository layer to store and manipulate the date of user.

## API's
### Students
#### Get : fetch data
* Get All Students
```
http://localhost:8080/api/Student/getAll
```
* Get Student by their Name :- required Id in String format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/Student/getusingName/{StudentName}
```
#### Post : add data
* Add Student
```
http://localhost:8080/api/Student/savestudent
```
#### Delete : delete data
* Delete Student by their Id :- required Id in String format.
```http
http://localhost:8080/api/Student/deleteStudent/{userId}
```
#### Put : Update data
* Update Student by their Id :- required Id in String format.
* we need to provide the param of UserId 
```http
http://localhost:8080/api/Student/updatestudent/{userId}
```
#### The above Links are used to perform operation on the Student.

### Courses
#### Get : fetch data
* Get All Courses 
```
http://localhost:8080/api/course/getall
```
* Get course by their Name :- required Id in String format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/course/listStudent/{coursename}
```
#### Post : add data
* Add Course
```
 http://localhost:8080/api/course/addCourse
```
#### Delete : delete data
* delete course
```
http://localhost:8080/api/course/deletecourse/{name}
```
#### Update : update data
* To update Course
```
http://localhost:8080/api/course/updatecourse/{coursename}
```
#### The above Links are used to perform operation on the Course.


### Books
#### Get : fetch data
* Get All Books 
```
http://localhost:8080/api/book/getall
```
* Get Book by their Student Name :- required Name in String format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/book/getstudents/{StudentName}
```
#### Post : add data
* Add Course
```
http://localhost:8080/api/book/savebook
```
#### Delete : delete data
* delete Book
```
http://localhost:8080/api/book/deleteBookusingBookId/{id}
```
#### Update : update data
* To update Book Details
```
http://localhost:8080/api/book/updateBookdetails/{BookId}
```
#### The above Links are used to perform operation on the Books.

### Laptops
#### Get : fetch data
* Get All Laptops
```
 http://localhost:8080/api/Laptop/getalllap
```
* Get Laptops by their Name :- required Id in String format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/Laptop/getlaptopusingStudentname/{name}
```
#### Post : add data
* Add Laptops
```
http://localhost:8080/api/Laptop/saveLaptop
```
#### Delete : delete data
* delete Laptops
```
 http://localhost:8080/api/Laptop/deleteLaptop/{brand}
```
#### Update : update data
* To update Laptops
```
 http://localhost:8080/api/Laptop/UpdateLaptop/{laptopId}
```
#### The above Links are used to perform operation on the Laptops.
