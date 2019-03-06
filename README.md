# string-replacement-java

## Differences with JavaScript

While I have less experience with Java, the java solution uses the same concepts as the JavaScript one, but the split and join methods are slightly different. Whereas the JavaScript methods could be used one after the other in the same line, the Java methods had to be separated on different lines.

With the line `String[] words = strOrig.split(strFind);`, the original string is split on instances of strFind and stored as a string array called words. Then the line `String newString = String.join(strReplace, words);` rejoins the words array with strReplace where strFind used to be.

## Running in Command Line

I have already compiled the StringReplacer.java file, so, as long as Java is installed, it should be able to be run from the command line with `java StringReplacer` and yield the result of “The redbird is red” in place of “The bluebird is blue.”

## Testing

I did attempt to establish a JUnit test for the Java file but didn’t get it entirely working. I didn’t want to put off returning this assignment too long, but given more time, I’m sure I could find a way to get the Java test functional.

## Special Thanks

Thank you to SingleStone for giving me this assessment and helping me learn more about testing along the way.
