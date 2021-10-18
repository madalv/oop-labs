package lab3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String text = "Following the colonization of Mars, a brief but catastrophic civil war takes place between Mars and Earth." +
                " After both planets make peace with each other, a large-scale colonization initiative is carried out by " +
                "genetically-engineered humans called Star People throughout the galaxy. " +
                "Humans then encounter a malevolent and superior alien race called the Qu." +
                " The Qu's religion motivates them to remake the universe through genetic engineering." +
                " A short war follows in which humanity is defeated." +
                " The Qu bioengineer the surviving humans as punishment into a range of exotic forms, many of them unintelligent." +
                " They are left to evolve on their own as the Qu leave the galaxy." +
                " The bioengineered humans range from worm-like humans to insectivores and modular and cell-based species." +
                " The book follows the progress of these new humans as they either go extinct or regain sentience in wildly" +
                " different forms and gradually discover that the Qu experimented on them." +
                " One race, known as the Ruin Haunters, eventually replaces their bodies with mechanical forms. " +
                "They now call themselves the Gravitals. " +
                "The Gravitals colonize the rest of the galaxy, while annihilating most life within it, including" +
                " the other post-human species. They are, themselves, destroyed by the Asteromorphs, the descendants" +
                " of the human species who escaped experimentation by the Qu. The final chapters of the book detail " +
                "humanity's rebound as a posthuman species, and their first contact with another galaxy's life, " +
                "rediscovering and defeating the Qu, and concluding with the rediscovery of Earth. ";


        System.out.println(TextManipulator.wordAndSentenceCounter(text)); // basic level
        System.out.println(TextManipulator.letterCounter(text)); // medium level
        System.out.println(TextManipulator.wordInfo(text)); // advanced level

    }
}
