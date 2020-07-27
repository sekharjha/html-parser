# HTML PARSER FOR RADIUS AGENT LEADS

### Prerequisites
 - Java 8 or above
 - Maven3 or above
 
### Instrcutions for running the program

 - Create a runnable jar by running the following command in the root directory 
    - ```mvn clean install shade:shade```
    
 - Your jar would be created at target directory as ```html-parser-1.0-SNAPSHOT.jar```
 - To run this executable use the following command
    - ```java -cp html-parser-1.0-SNAPSHOT.jar HTMLParser /path/to/your/file.html```
 - This would create a file named output.json in the same target directory, that contains your output.
 
 
### Third Party Dependencies Used : 
  - Jsoup  for HTML Parsing
  - Jackson for Java Objects Marshalling/Unmarshalling