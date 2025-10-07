

import java.util.Scanner;

public class MadLibsInputStory {
    public static void main(String[] args) {
        Scanner dg = new Scanner(System.in);
        System.out.println("Press Enter after your template (The cues for words be in this formatt: [NOUN], [ADJECTIVE], ...):\n");
        String template = dg.nextLine();

        System.out.print("Enter a NAME: ");
        String name = dg.nextLine();

        System.out.print("Enter a PLACE: ");
        String place = dg.nextLine();

        System.out.print("Enter a VERB (base form, e.g., run): ");
        String verb = dg.nextLine();

        System.out.print("Enter an ADJECTIVE: ");
        String adjective = dg.nextLine();

        System.out.print("Enter a NOUN: ");
        String noun = dg.nextLine();

        System.out.print("Enter an ADVERB (e.g., quickly): ");
        String adverb = dg.nextLine();

        System.out.print("Enter a FEELING (e.g., excited): ");
        String feeling = dg.nextLine();

        System.out.print("Enter a COLOR: ");
        String color = dg.nextLine();

        System.out.print("Enter an ANIMAL: ");
        String animal = dg.nextLine();

        System.out.print("Enter a NUMBER: ");
        String number = dg.nextLine();

        System.out.print("Enter a PROPER_NOUN (e.g., Alex): ");
        String properNoun = dg.nextLine();

        String finalStory = template;
        finalStory = finalStory.replace("[NAME]", name);
        finalStory = finalStory.replace("[PLACE]", place);
        finalStory = finalStory.replace("[VERB]", verb);
        finalStory = finalStory.replace("[ADJECTIVE]", adjective);
        finalStory = finalStory.replace("[NOUN]", noun);
        finalStory = finalStory.replace("[ADVERB]", adverb);
        finalStory = finalStory.replace("[FEELING]", feeling);
        finalStory = finalStory.replace("[COLOR]", color);
        finalStory = finalStory.replace("[ANIMAL]", animal);
        finalStory = finalStory.replace("[NUMBER]", number);
        finalStory = finalStory.replace("[PROPER_NOUN]", properNoun);

        System.out.println("\n=== YOUR MAD LIB ===");
        System.out.println(finalStory);

        dg.close();
    }
}
