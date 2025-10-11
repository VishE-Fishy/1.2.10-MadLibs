

import java.util.Scanner;

public class Etikela_MadLibsInputStory {
    public static void main(String[] args) {
        Scanner dg = new Scanner(System.in);
        System.out.println("Press Enter after your template (The cues for words be in this formatt: [NOUN], [ADJECTIVE], ...):\n"); // This is the prompt to ask user for story with specific format
        String template = dg.nextLine(); // this alows user to input the story template

        // all of this is the prmpts to ask for different types of words to fill story
        System.out.print("Enter a NAME: ");
        String name = dg.nextLine();

        System.out.print("Enter a PLACE: ");
        String place = dg.nextLine();

        System.out.print("Enter a VERB (it should be in base form - ex. run): ");
        String verb = dg.nextLine();

        System.out.print("Enter an ADJECTIVE: ");
        String adjective= dg.nextLine();

        System.out.print("Enter a NOUN: ");
        String noun = dg.nextLine();

        System.out.print("Enter an ADVERB (ex. quickly): ");
        String adverb = dg.nextLine();

        System.out.print("Enter a FEELING (ex. excited): ");
        String feeling =  dg.nextLine();

        System.out.print("Enter a COLOR: ");
        String color = dg.nextLine();

        System.out.print("Enter an ANIMAL: ");
        String animal = dg.nextLine();

        System.out.print("Enter a NUMBER: ");
        String number = dg.nextLine();

        System.out.print("Enter a PROPER_NOUN (ex. Alex): ");
        String properNoun = dg.nextLine();
        // this is where the code uses the reeplace string method to find the cues and replace them with the inoputed words
        String finalStory = template;
        finalStory = finalStory.replace("[NAME]", name);
        finalStory = finalStory.replace("[PLACE]", place);
        finalStory = finalStory.replace("[VERB]", verb);
        finalStory = finalStory.replace("[ADJECTIVE]", adjective);
        finalStory = finalStory.replace("[NOUN]", noun);
        finalStory = finalStory.replace("[ADVERB]", adverb);

        //un comment these parts if you want to use substring and indexOf
        
        // String target = "[ADVERB]"; // I used index and substring to insterrad of replace 
        // int idx = finalStory.indexOf(target); // this finds where the adveb in the template
        // finalStory = finalStory.substring(0, idx) + adverb + finalStory.substring(idx + target.length()); // this line take the stuff before the word comvbiens theem witht he inputed adverb and adds the rest using the index gathered before
        finalStory = finalStory.replace("[FEELING]", feeling);
        finalStory = finalStory.replace("[COLOR]", color);
        finalStory = finalStory.replace("[ANIMAL]", animal);
        finalStory = finalStory.replace("[NUMBER]", number);
        finalStory = finalStory.replace("[PROPER_NOUN]", properNoun);

        System.out.println("the mad lib");
        System.out.println(finalStory); // this prints the final story
        dg.close();
    }
}

