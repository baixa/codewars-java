# Make the Deadfish Swim

*6 kyu*

Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

    i increments the value (initially 0)
    d decrements the value
    s squares the value
    o outputs the value into the return array

Invalid characters should be ignored.
```java
Deadfish.parse("iiisdoso") =- new int[] {8, 64};
```