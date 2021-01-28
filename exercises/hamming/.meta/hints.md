## Hints

This is the first exercise with tests that require you to throw an
[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html). `Exception`s are typically thrown to
indicate that a program has encountered an unexpected input or state.

We use JUnit's [`ExpectedException`](http://junit.org/junit4/javadoc/4.12/org/junit/rules/ExpectedException.html)
[rule](https://github.com/junit-team/junit4/wiki/rules) throughout the track to verify that the exceptions you throw
are:

1. instances of a specified Java type (in this case : "IllegalArgumentException");
2. initialized with a specified message (in this case : "leftStrand and rightStrand must be of equal length.").
