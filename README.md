"# CUCUMBER_SECOND_PROJECT" 
I create a BDD framework and i used  tools like maven, JUnit, cucumber, WEBDriver Manager, POM and Singleton design patterns, Java language, all OOP principals, Collections. My folder staracture test package with java packaqge in it. From the java package I crete Pages repository, and I use it for all the web elements and related methods, to store them.
I have runner package with runner class, from where i run my regression and smoke suite. In that class I have, RunWith annotation which helps me to run the class,  Cucumber option tag, where  I have anotations like feature, glue, tag, monohrome, dryRun. 
I have Step definition classes where I implement the steps from feature file.
I have util package with classes like, Driver, ConfigReader, Waiter, DropdownHandler and more
I have feature file where I implement all the Gherkin steps schenarios. I start with Feature, then Scenario, and steps given, when, and, then. I can use scheanarion outline which follows by Examples to execute steps with different data. Also it hase Background anotation which aluminates lines of code. before each scenarion I can give tags like Regression and smoke to be able to run my suites in the runners class
Target folder where I have sureFire plagin where I get emailable reports with the help of mvn test command. 
POM.XML where I have all the profiles and builds , plagins stored.
