# Hamming

Calculate the Hamming Distance between two DNA strands.

Your body is made up of cells that contain DNA. Those cells regularly wear out and need replacing, which they achieve by dividing into daughter cells. In fact, the average human body experiences about 10 quadrillion cell divisions in a lifetime!

When cells divide, their DNA replicates too. Sometimes during this process mistakes happen and single pieces of DNA get encoded with the incorrect information. If we compare two strands of DNA and count the differences between them we can see how many mistakes occurred. This is known as the "Hamming Distance".

We read DNA using the letters C,A,G and T. Two strands might look like this:

    GAGCCTACTAACGGGAT
    CATCGTAATGACGGCCT
    ^ ^ ^  ^ ^    ^^

They have 7 differences, and therefore the Hamming Distance is 7.

The Hamming Distance is useful for lots of things in science, not just biology, so it's a nice phrase to be familiar with :)

# Implementation notes

The Hamming distance is only defined for sequences of equal length, so
an attempt to calculate it between sequences of different lengths should
not work. The general handling of this situation (e.g., raising an
exception vs returning a special value) may differ between languages.
Here, we ask that you throw an IllegalArgumentException with the following
message "leftStrand and rightStrand must be of equal length.".

# Tips

## Hints

This is the first exercise with tests that require you to throw an
[`Exception`](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html). `Exception`s are typically thrown to
indicate that a program has encountered an unexpected input or state.

We use JUnit's [`ExpectedException`](http://junit.org/junit4/javadoc/4.12/org/junit/rules/ExpectedException.html)
[rule](https://github.com/junit-team/junit4/wiki/rules) throughout the track to verify that the exceptions you throw
are:

1. instances of a specified Java type (in this case : "IllegalArgumentException");
2. initialized with a specified message (in this case : "leftStrand and rightStrand must be of equal length.").


## Setup

Go through the setup instructions for Java to install the necessary
dependencies:

[https://exercism.io/tracks/java/installation](https://exercism.io/tracks/java/installation)

# Running the tests

You can run all the tests for an exercise by entering the following in your
terminal:

```sh
$ gradle test
```

In the test suites all tests but the first have been skipped.

Once you get a test passing, you can enable the next one by removing the
`@Ignore("Remove to run test")` annotation.

## Source

The Calculating Point Mutations problem at Rosalind [http://rosalind.info/problems/hamm/](http://rosalind.info/problems/hamm/)

## Submitting Incomplete Solutions
It's possible to submit an incomplete solution so you can see how others have
completed the exercise.
