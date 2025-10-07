

import java.util.Scanner;

public class MadLibsOneStory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // The original story with placeholders
        String storyOriginal =
            "Today, [NAME] went to the [PLACE] to [VERB] a [ADJECTIVE] [NOUN] very [ADVERB]. The end.";

        // Show the original
        System.out.println("=== ORIGINAL STORY ===");
        System.out.println(storyOriginal);
        System.out.println();
        
        System.out.print("Enter a NAME: "); // this get words form the user
        String name = input.nextLine();

        System.out.print("Enter a PLACE: ");
        String place = input.nextLine();

        System.out.print("Enter a VERB (no Tense: E.g run, skip, punch..): ");
        String verb = input.nextLine();

        System.out.print("Enter an ADJECTIVE: ");
        String adjective = input.nextLine();

        System.out.print("Enter a NOUN: ");
        String noun = input.nextLine();

        System.out.print("Enter an ADVERB (e.g., quickly): ");
        String adverb = input.nextLine();
        // this takes the madlibs variables and inputs him
        String newOriginal = "Today, "+name+" went to the "+place+" to "+verb+" a "+adjective+" "+noun+" very "+adverb+". The end.";

        // this prints the final story
        System.out.println();
        System.out.println("=== YOUR MAD LIB ===");
        System.out.println(newOriginal);

        input.close();
    }
}
