### Java interview test

This project has a service that reads data from a CSV file with book data. The service is supposed to reads the data from the CSV and convert it to ```Book``` and ```Author``` objects. 

The developer team of this project likes TDD approach, so they created the interface, an empty implementation of the service and model objects. After that they wrote two tests and now tests are failing.

Your task, if you accept, to complete the implementation for the service and make the tests pass.

You can run the tests using Maven:

```
mvn test
```

---

Remarks:

- Be aware the first line of the CSV file includes field names.
- Author field is another delimited value, with another delimiter. You should also parse this field and implement ```getAuthors()``` method to return a list of ```Author``` object.
- The chief architect decided to limit visibility of the constructor, so nobody can create an instance of model objects easily. You neither. Try to solve this problem using reflection.
    