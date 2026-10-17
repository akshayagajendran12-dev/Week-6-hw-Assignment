# Week-6-hw-Assignment
JAVA PROGRAMS – ALGORITHMS AND GIT COMMIT MESSAGES
1. Student Placement Record Management

Filename: PlacementRecord.java

Algorithm:

Start.
Define a class PlacementRecord with student name, company name, and package in LPA.
Create a constructor to initialize all three fields.
Define a method printRecord() to display the placement details.
Create an array containing three PlacementRecord objects.
Use a loop to access each object in the array.
Call printRecord() for each object.
Stop.

Commit Message: Add PlacementRecord class with constructor and array iteration

Git Commands:

git add PlacementRecord.java
git commit -m "Add PlacementRecord class with constructor and array iteration"

2. Hostel Mess Wallet Management

Filename: MessWallet.java

Algorithm:

Start.
Define a class MessWallet with a private variable balance.
Create a constructor that accepts the opening balance.
If the opening balance is negative, initialize it to zero and display a warning; otherwise, assign the given balance.
Define a topUp() method that rejects amounts less than or equal to zero; otherwise, add the amount to the balance.
Define a deduct() method that rejects invalid amounts or amounts greater than the current balance.
If the deduction is valid, subtract the amount from the balance.
Define a getBalance() method to return the current balance.
Create a wallet object, perform a top-up and deduction, and display the final balance.
Stop.

Commit Message: Implement MessWallet with encapsulation and balance validation

Git Commands:

git add MessWallet.java
git commit -m "Implement MessWallet with encapsulation and balance validation"

3. Course Credit Management

Filename: Course.java

Algorithm:

Start.
Define a class Course with course code, title, credits, and lab credits.
Create a four-argument constructor to initialize all fields.
Create a three-argument constructor for theory-only courses.
Use this() to call the four-argument constructor with lab credits set to zero.
Define a totalCredits() method that returns credits plus lab credits.
Create one theory course object and one practical course object.
Call totalCredits() for both objects.
Display the course codes and total credits.
Stop.

Commit Message: Add Course class with constructor overloading and constructor chaining

Git Commands:

git add Course.java
git commit -m "Add Course class with constructor overloading and constructor chaining"

4. Library ID Card Management

Filename: IdCard.java

Algorithm:

Start.
Define a class IdCard with name and number of books issued.
Create a constructor to initialize both fields.
Create an IdCard object for Ravi.
Assign a second reference variable to the same object.
Modify booksIssued through the second reference.
Display the updated value through the first reference.
Compare both references using == and display the result.
Create another IdCard object with identical field values.
Compare the new object with the first object using == and display the result.
Stop.

Commit Message: Demonstrate object references and identity comparison in IdCard

Git Commands:

git add IdCard.java
git commit -m "Demonstrate object references and identity comparison in IdCard"

5. Student Information Management

Filename: Student.java

Algorithm:

Start.
Define a class Student with student ID, name, department, and marks.
Create a constructor to initialize all four fields.
Define a method displayInfo() to display student details.
Create three Student objects with different student information.
Call displayInfo() for each object.
Display the details of all three students.
Stop.

Commit Message: Add Student class for student information management

Git Commands:

git add Student.java
git commit -m "Add Student class for student information management"

6. College Information Management

Filename: College.java

Algorithm:

Start.
Define a class College with college ID, college name, location, and total number of students.
Create a constructor to initialize all four fields.
Define a method displayInfo() to display college details.
Create three College objects with different college information.
Call displayInfo() for each object.
Display the details of all three colleges.
Stop.

Commit Message: Add College class for college information management

Git Commands:

git add College.java
git commit -m "Add College class for college information management"

SUMMARY
No.	Filename	Main Concept
1	PlacementRecord.java	Classes, objects, arrays
2	MessWallet.java	Encapsulation and validation
3	Course.java	Constructor overloading and chaining
4	IdCard.java	Object references and ==
5	Student.java	Constructors and methods
6	College.java	Constructors and methods

Note: Save each Java program in its own file. Run the Git commands separately for each file to create six individual commits.
