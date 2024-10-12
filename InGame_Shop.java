package modul_1;

import java.util.Scanner;

public class InGame_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        //Schlüssel
        int schluesselSpeicher = 0;
        double schluesselPreis = 2.99;

        System.out.println("Wie viele Schlüssel möchtest du kaufen?");
        int schluesselKauf = scan.nextInt();
        int schluesselGeschenk = 0;

        schluesselSpeicher = schluesselSpeicher + schluesselKauf;
        schluesselPreis = schluesselPreis * schluesselKauf;

        System.out.println("Die " + schluesselSpeicher + " Schlüssel haben dich " + Math.round(schluesselPreis * 100.0) /100.0 + " gekostet.");

        if (schluesselSpeicher >= 50 && schluesselSpeicher < 100) {
            schluesselSpeicher = schluesselSpeicher + 8;
            schluesselGeschenk = schluesselGeschenk + 8;
        } else if (schluesselSpeicher >= 100 && schluesselSpeicher < 200) {
            schluesselSpeicher = schluesselSpeicher + 16;
            schluesselGeschenk = schluesselGeschenk + 16;
        } else if (schluesselSpeicher >= 200) {
            schluesselSpeicher = schluesselSpeicher + 32;
            schluesselGeschenk = schluesselGeschenk + 32;
        }
        System.out.println("Herzlichen Glückwunsch, du hast " + schluesselGeschenk + " Schlüssel geschenkt bekommen.");
        System.out.println("Deine neue Schlüsselanzahl lautet " + schluesselSpeicher);

        //Kisten
        while (schluesselSpeicher != 0) {
            System.out.println("Wie viele Kisten möchtest du öffnen?");
            int kistenOeffnen = scan.nextInt();

            if (kistenOeffnen <= schluesselSpeicher) {
                System.out.println("Du hast " + kistenOeffnen + " Kisten geöffnet.");
                schluesselSpeicher = schluesselSpeicher - kistenOeffnen;
            } else if (kistenOeffnen > schluesselSpeicher) {
                System.out.println("Du hast nicht genügend Schlüssel.");
            } else {
                System.out.println("Das funktioniert nicht.");
            }

            if (schluesselSpeicher != 0) {
                System.out.println("Du hast noch " + schluesselSpeicher + " Schlüssel übrig, möchtest du sie jetzt nutzen?.");
                String wahl = input.next();
                if ("y".equals(wahl)) {
                    System.out.println("Alles klar, probiere es erneut!");
                } else if ("n".equals(wahl)) {
                    schluesselSpeicher = 0;
                    System.out.println("Okay, schönen Tag noch.");
                } else {
                    System.out.println("Tut mir leid deine Eingabe wurde nicht erkannt, versuche es mit y für Ja oder n für Nein.");
                }
            }
        }
        System.out.println("Vielen Dank für deinen Kauf, komme bald wieder!");
    }
}