package fr.ensai.mediaplayer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Song newSong = new Song(
            "Papaoutai",
            232,
            "Dites-moi d'où il vient\n" + //
            "Enfin je saurai où je vais\n" + //
            "Maman dit que lorsqu'on cherche bien\n" + //
            "On finit toujours par trouver\n" + //
            "Elle dit qu'il n'est jamais très loin\n" + //
            "Qu'il part très souvent travailler\n" + //
            "Maman dit, \"Travailler, c'est bien\"\n" + //
            "Bien mieux qu'être mal accompagné\n" + //
            "Pas vrai?\n" + //
            "Où est ton papa?\n" + //
            "Dis-moi, où est ton papa?\n" + //
            "Sans même devoir lui parler\n" + //
            "Il sait ce qui ne va pas\n" + //
            "Ah, sacré papa\n" + //
            "Dis-moi, où es-tu caché?\n" + //
            "Ça doit faire au moins mille fois que j'ai\n" + //
            "Compté mes doigts\n" + //
            "Hey\n" + //
            "Où t'es, papaoutai?\n" + //
            "Où t'es, papaoutai?\n" + //
            "Où t'es, papaoutai?\n" + //
            "Où t'es, où t'es où, papaoutai?\n" + //
            "Où t'es, papaoutai?\n" + //
            "Où t'es, papaoutai?\n" + //
            "Où t'es, papaoutai?\n" + //
            "Où t'es, où t'es où, papaoutai?\n",
            2013,
            List.of(Genre.POP, Genre.ELECTRO),
            new Artist("Stromae", "", "Belgium"),
            null,
            null
        );

        newSong.play();

        Podcast newPodcast = new Podcast(
            "Un album déjà annule",
            4500,
            "Bonjour et bienvenue dans le podcast dédié à la sortie de mon dernier album !\n" + //
            "J'ai toujours voulu faire un album sur l'Asie parce que j'adore ce pays \n" + //
            "Je vais vous en interpréter un extrait \n" + // 
            "*chante* Les samouraïs de la muraille de Chine font du karaté contre les moines shaolin \n",
            2026,
            new Artist("Jean-François", "François", "French"),
            "Asian Music"
        );

        newPodcast.play();
    }
}
