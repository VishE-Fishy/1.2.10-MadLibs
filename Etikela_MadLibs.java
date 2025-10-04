import java.util.Scanner;

public class MadLibsNoControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Press Enter after your template (Make sure to format the word cues like this Ex.[NOUN], [VERB], [COLOR] ect.\n");
        String template = input.nextLine();
// all this stufh as the code to ask user forr differnt types of words that acount forr dif scanrios and stories.
        System.out.print("Enter a NAME: ");
        String name = input.nextLine();

        System.out.print("Enter a PLACE: ");
        String place = input.nextLine();

        System.out.print("Enter a VERB (it should be base form, ex., run): ");
        String verb = input.nextLine();

        System.out.print("Enter an ADJECTIVE: ");
        String adjective = input.nextLine();

        System.out.print("Enter a NOUN: ");
        String noun = input.nextLine();

        System.out.print("Enter an ADVERB (ex. quickly): ");
        String adverb = input.nextLine();

        System.out.print("Enter a FEELING (ex. excited): ");
        String feeling = input.nextLine();

        System.out.print("Enter a COLOR: ");
        String color = input.nextLine();

        System.out.print("Enter an ANIMAL: ");
        String animal = input.nextLine();

        System.out.print("Enter a NUMBER: ");
        String number = input.nextLine();

        System.out.print("Enter a PROPER_NOUN (ex.Alex): ");
        String properNoun = input.nextLine();

        // this part of the code finds the eepsericc cues, then replaces them with the variables
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

        //this prrints out the final story
        System.out.println("\n=== YOUR MAD LIB ===");
        System.out.println(finalStory);

        input.close();
    }
}
