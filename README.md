# java-basic
Data Structures and Algorithms 
## *Data Structures*
### Strings
declare string bariables:
```java  
  
//String name = "Apple";
  
```

****
*Useful String Methods*
1. startsWith("a")
2. endsWith("a")
3. length()
length() String Method in Java

In Java, the length() string method returns the total number of characters – the length – of a String.

```java  
  
//String str = "Codecademy";  

System.out.println(str.length());
// prints 10
  
```
4. indexOf("a")

```java  
  
//String str = "Hello World!";

System.out.println(str.indexOf("l"));
//prints 2

System.out.println(str.indexOf("Wor");
// prints 10
  
```
5. replace("a","b")
```java  
  
//public String replace(char oldChar, char newChar)
//public class Test{
    public static void main(String[] args){
        
        String oldString = "ABC";
        
        String newString = oldString.replace("A","B");
        
        System.out.println("Old string:" + oldString);
        System.out.println("New string:" + newString);
    }
}
//Old string: ABC
//New string: BBC
  
```
Parameters
oldChar − This is the old character.

newChar − This is the new character.


6. toUpperCase()
7. toLowerCase()

```java  
  
//String str = "Hello World!";

String uppercase =str.toUpperCase();
//uppercase ="HELLO WORLD!"
String lowercase =str.toLowerCase();
//lowercase = "hello world!"

  
```
8. concat() 

In Java, the concat() string method is used to append one String to the end of another String. This method returns a String representing the text of the combined strings.

```java  
  
//String s1 = "Hello";
String s2 = "World!";

String s3 = s1.concat(s2);
// concatenates strings s1 and s2

System.out.println(s3);
//prints "Hello World!"

  
```
****
### Arrays



