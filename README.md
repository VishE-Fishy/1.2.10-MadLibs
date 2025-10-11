The madlibs input story is used for the used two test cases as it can input storyu template. The madlibs orginal file has and orginal n built story - 3rd test case

# Approach

I followed milestones and concepts from the **PLTW CSA** book.

## Milestone 1: String Creation
Used string literals to declare variables such as `noun`, `verb`, and `adjective`.

```java
String noun1 = "cat";
String verb1 = "skipped";
String adjective1 = "shiny";

```
## Milestone 2: String Concatenation

Combined user-provided strings using the `+` and `+=` operators to form complete sentences.

```java
String newOriginal = "Today, "+name+" went to the "+place+" to "+verb+" a "+adjective+" "+noun+" very "+adverb+". The end.";
```
## Milestone 3: User Input

Use the `Scanner` class to collect words (noun, verb, adjective) from the user, store them in variables, and later use them in string concatenation.

```java
import java.util.Scanner;

public class Etikela_MadLibsInputStory {
    public static void main(String[] args) {
        Scanner dg = new Scanner(System.in);
        System.out.println("Press Enter after your template (The cues for words be in this formatt: [NOUN], [ADJECTIVE], ...):\n"); // This is the prompt to ask user for story with specific format
        String template = dg.nextLine(); // this alows user to input the story template

```
ect..

## Milestone 4: Output Formatting

Displayed the generated story using `System.out.println()` with clean formatting and spacing.

```java
        System.out.println();
        System.out.println("the mad lib");
        System.out.println();
        System.out.println(newOriginal);
```


This image shows the verson of the code where the indexOf and substring methods used for adverb are un commented. I replaced adverb with one of the uces to demonstrate these feature
<img width="1479" height="1024" alt="image" src="https://github.com/user-attachments/assets/bf76eb13-628c-409e-b59e-2101c45d03d2" />

This is the story one of the inputs
<img width="1590" height="1012" alt="image" src="https://github.com/user-attachments/assets/8a79576c-9965-4837-877a-43fbff78d4aa" />

This is input story 2
<img width="1440" height="994" alt="image" src="https://github.com/user-attachments/assets/51b33bd9-952f-4dcb-9711-cd5aaf4f4cdc" />

This is my own orginal story with no story input
<img width="1240" height="678" alt="image" src="https://github.com/user-attachments/assets/fbcedcfd-8bb3-4397-a846-7a6737ca452c" />
