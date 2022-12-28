package TM;

import TM.Model.EventOrganizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestRecord {
    static BufferedReader inputDataQuest = new BufferedReader(new InputStreamReader(System.in));
    static Scanner inputChoice = new Scanner(System.in);
    public static void main(String[] args) {
        EventOrganizer[] listQuests = new EventOrganizer[10];
        boolean isLooping = true;
        int inputUserChoice;

        while (isLooping) {
            System.out.println("\n[[-------------<< Event Organizer >>-------------]]");
            System.out.println("List Menu : ");
            System.out.println("-------------");
            System.out.println("1. input data quest");
            System.out.println("2. print data quest");
            System.out.println("3. exit program");
            System.out.println("-------------");
            System.out.print("your choice : ");

            try {
                inputUserChoice = inputChoice.nextInt();
                System.out.println("-------------");
                switch (inputUserChoice) {
                    case 1 -> addQuest(listQuests);
                    case 2 -> {
                        ArrayList<EventOrganizer> listQuest = new ArrayList<>(Arrays.asList(listQuests));
                        EventOrganizer.PrintQuest(listQuest);
                    }
                    case 3 -> isLooping = false;
                    default -> System.out.println("=> Inputan Salah!\n");
                }
            } catch (Exception err) {
                System.out.println("Ups error : "+err.getMessage());
            }

        }
    }

    private static void addQuest(EventOrganizer[] list_quests) {
        System.out.println("\n[[-------------<< Add New Quest >>-------------]]");
        for (int x = 0; x < list_quests.length; x++) {
            try {
                EventOrganizer quest = new EventOrganizer();

                System.out.print("- ID\t\t : ");
                quest.setCustId(Integer.parseInt(inputDataQuest.readLine()));

                System.out.print("- Nama\t\t : ");
                quest.setCustName(inputDataQuest.readLine());

                System.out.print("- Alamat\t : ");
                quest.setCustAddres(inputDataQuest.readLine());

                System.out.print("- Nomor HP\t : ");
                quest.setCustPhone(inputDataQuest.readLine());

                System.out.print("- Email\t\t : ");
                quest.setCustEmail(inputDataQuest.readLine());

                System.out.println("--------------------------------");
                list_quests[x] = quest;

            } catch (Exception err) {
                System.out.println("Ups error : "+ err.getMessage());
                System.out.println("Pastikan input ID dengan angka");
                break;
            }
        }

    }
}
