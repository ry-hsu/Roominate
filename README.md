# CS 665 Final Project - Roominate

# 2.1 Design Pattern and its Use Case Scenario
The main design pattern of study in this system is the Builder Pattern. This pattern is used to encapsulate the construction of a product (rooms in a house) and allow it to be constructed in steps. This is allows for the complex construction of a room to be created with a flexible data structure. The RoomBuilder.java interface provides the necessary steps to build a room. In the case of Roominate, that includes placing furniture, choosing a paint color and in a future release adding any appliances. The two concrete builders, DiningRoomBuilder.java and BedroomBuilder.java each can construct a room with the necessary items. The KitchenRoomBuilder.java creates a kitchen room that adds the step of appliances. The Builder Pattern is used here to reach one of the design goals of building a system that is reusable. There are many different types of rooms that could be built and each could be different, such as a bathroom that needs to also include plumbing, or a garage that needs to include a garage door, this pattern allows for future implementations of these rooms easily. 

One other design goal for this project was design with a visual product in view. Because the nature of the problem of scaling in interior design is best solved with a visual solution, the Roominate system also provides a display for the user with which they can view their design of the room.

The simplicity of this code is mainly becuase of the builder pattern because the creation of a room would be quite complex if it was done by instantiating a room and then adding all the steps so it is easier to do this where the builder allows ther user to create a certain Room type and allow the system to take care of the steps while allowing a user to go back in and change all the values to be more customized. 


# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the Main Java executable. 




# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




