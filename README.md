# Hotel Management Project
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a Hotel Management System that allows CRUD operations on Hotel Room Entity with added validation on the entity class. The project is built using Spring Boot and H2 Database.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The data model is defined in the Hotel Room Model class, which has the following attributes
```
* Hotel Room

roomId (Integer) : Unique identifier for Room and Room ID Generation Type AUTO.
roomNum (Integer) : Unique identifier for Room Number.
roomType (String-Enum) : Type of Room ( AC,NON_AC).
roomPrice (Double) : Price of Room.
roomStatus (Boolean) : Room available or not.

```
## Validation
```
To validate the input we get from client, we've used validation annotations that are used to enforce specific constraints on the values of the variables. These constraints ensure that the data input by the user is of the correct format and meets certain criteria.
* @Valid - In Spring Framework, the @Valid annotation is used in conjunction with @PostMapping and @PutMapping annotations, which are used to handle POST and PUT requests, respectively. When used with @PostMapping or @PutMapping, the @Valid annotation is typically applied to a method parameter annotated with @RequestBody.
* @NotEmpty: This annotation is used to validate that the annotated field is not null or empty.
* @NotNull: This annotation is used to validate that the annotated field is not null.
* @Max : This annotation is used to validate that the annotated field is not greater than the mentioned value in field.
* @Min : This annotation is used to validate that the annotated field is not smaller than the mentioned value in field.
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Function Used

# Roon-Controller

* GetMapping("rooms")
```
This endpoint makes a call to method in RoomService class which retrieves data of all users from database through API.
```
* GetMapping("rooms/Id/{ID}")
```
This endpoint makes a call to method in RoomService class which retrieves data of Hotel Room by id from database by implementing method "getRoomById()" present in JPA repository.
```
* PostMapping("rooms")
```
This endpoint makes a call to method in RoomService class where we implement method "save()" which is in JPA Repository.
```
* PutMapping("room/Id/{ID}")
```
This endpoint makes a call to method in RoomService class which is connected to database. In database we update Room by room Id.
```

## Data Structure Used
* 
```
We have used InMemory database H2 to implement CRUD Operations.
```

## Project Summary
```
The project is a Hotel Management built using Spring Boot and H2 Database. It allows CRUD operations on a Student and Event entity with added validation using Spring Boot validation. The Student entity class has fields for Hotel Room details like roomId , room number , room price , room status and roo type. The project supports various endpoints for CRUD operations and searching for Hotel room based on id and date.
