// Yichen Chen
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 20-QUESTION BANK (FIRST 10 = PART A, LAST 10 = PART B)
        String[] questions = {
                // PART A (10)
                "What must you do at a stop sign?", "What does a flashing red light mean?", "Who has the right-of-way at a four-way stop?", "What does a solid yellow line beside your lane mean?", "When are headlights required?", "What does a yield sign require you to do?", "At an uncontrolled intersection, what should you do?", "What does a school zone warning sign indicate?", "What must drivers do at a pedestrian crossover?", "What does a steady red traffic light mean?",

                // PART B (10)
                "What should you do if your brakes stop working?", "Driving while tired is considered:", "If your vehicle begins to skid, what should you do?", "After a minor collision, what must you do?", "Hydroplaning happens when:", "If your vehicle drifts onto the shoulder, what should you do?", "Using a handheld phone while driving is:", "When following another vehicle, you should:", "What must you do when an emergency vehicle approaches with lights on?", "What is the safest way to make a turn?"
        };

        String[] A = {
                // PART A
                "Come to a full stop", "Proceed with caution", "Pedestrians go first", "Passing is allowed", "Use them between sunset and sunrise", "Speed up to merge", "Yield to traffic on the right", "Children may be present", "Stop and let pedestrians cross", "Stop and wait for green",

                // PART B
                "Pump the brakes to regain pressure", "Very dangerous and unsafe", "Steer in the opposite direction of the skid", "Exchange information with the other driver", "Tires ride on top of water", "Brake hard and hold", "Not allowed and illegal", "Follow very closely", "Pull over to the right and stop", "Turn without signaling"
        };

        String[] B = {
                // PART A
                "Slow down and proceed", "Stop, then go when safe", "The vehicle that arrived first", "No passing allowed", "Only when visibility is poor", "Stop and give way", "Drive through normally", "No children nearby", "Drive through if clear", "Turn immediately",

                // PART B
                "Turn off the engine immediately", "Helps keep you alert", "Steer in the direction of the skid", "Leave the scene quickly", "The engine suddenly stops", "Steer gently back onto the road", "Always allowed", "Keep a safe following distance", "Ignore it and continue driving", "Signal, check mirrors, and turn safely"
        };

        String[] C = {
                // PART A
                "Roll through slowly", "Same as a green light", "Vehicles behind you go first", "Road is closed ahead", "Only when raining", "Give right-of-way if needed", "Ignore other vehicles", "Speed up to pass quickly", "Honk and continue", "Proceed with caution",

                // PART B
                "Jump out of the vehicle", "Recommended for long trips", "Turn the wheel randomly", "Argue with the other driver", "Brakes stop working", "Make a sharp turn back onto the road", "Allowed only at night", "Speed up to pass", "Stop in the middle of the road", "Turn from any lane"
        };

        String[] D = {
                // PART A
                "Honk and proceed", "Turn right only", "Emergency vehicles only", "School zone ahead", "Never use headlights", "No entry", "Stop in the middle", "Parking allowed", "Reverse through the crossing", "None of the above",

                // PART B
                "Honk continuously", "Required by law", "Accelerate quickly", "Hide from the other driver", "Steering wheel locks", "Close your eyes briefly", "Required by law", "Drive with no headlights", "Race the emergency vehicle", "Check blind spots and turn safely"
        };

        String[] correct = {
                // PART A
                "A","B","C","B","A","C","B","D","B","A",

                // PART B
                "B","A","C","B","A","D","B","C","B","D"
        };

        int totalQuestions = 20; // fixed size

        // Greeting user
        System.out.println("Welcome to the G1 Road Rules Practice Test!");

        // MAIN LOOP
        while (true) {

            System.out.println();
            System.out.println("MAIN MENU");
            System.out.println("1. Write a G1 test");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            String choice = sc.nextLine();

            // WRITE TEST
            if (choice.equals("1")) {

                int correctA = 0;
                int correctB = 0;

                // ADDED: separate wrong counters
                int wrongA = 0;
                int wrongB = 0;

                // PART A
                System.out.println("PART A");

                int[] orderA = {0,1,2,3,4,5,6,7,8,9};
                for (int i = 0; i < 10; i++) {
                    int r = (int)(Math.random() * 10);
                    int temp = orderA[i];
                    orderA[i] = orderA[r];
                    orderA[r] = temp;
                }

                for (int i = 0; i < 6; i++) {
                    int index = orderA[i];

                    System.out.println("Q" + (i+1) + ": " + questions[index]);
                    System.out.println("A) " + A[index]);
                    System.out.println("B) " + B[index]);
                    System.out.println("C) " + C[index]);
                    System.out.println("D) " + D[index]);

                    String ans = "";
                    while (true) {
                        System.out.print("Answer (A/B/C/D): ");
                        ans = sc.nextLine().toUpperCase();
                        if (ans.equals("A") || ans.equals("B") || ans.equals("C") || ans.equals("D")) break;
                        System.out.println("Invalid.");
                    }

                    if (ans.equals(correct[index])) {
                        correctA++;
                        System.out.println("Correct!");
                    } else {
                        wrongA++;
                        System.out.println("Incorrect.");
                    }

                    System.out.println("Score: " + (correctA + correctB) + " correct, " + (wrongA + wrongB) + " wrong");

                    // stop Part A at 2 wrong
                    if (wrongA == 2) {
                        System.out.println("You got 2 wrong in Part A. Test ended.");
                        break;
                    }
                }

                if (wrongA == 2) continue;
                if (correctA < 4) {
                    System.out.println("You scored less than 4 in Part A. Cannot pass.");
                    continue;
                }

                // PART B
                System.out.println("PART B");

                int[] orderB = {10,11,12,13,14,15,16,17,18,19};
                for (int i = 0; i < 10; i++) {
                    int r = (int)(Math.random() * 10);
                    int temp = orderB[i];
                    orderB[i] = orderB[r];
                    orderB[r] = temp;
                }

                for (int i = 0; i < 6; i++) {
                    int index = orderB[i];

                    System.out.println("Q" + (6 + i + 1) + ": " + questions[index]);
                    System.out.println("A) " + A[index]);
                    System.out.println("B) " + B[index]);
                    System.out.println("C) " + C[index]);
                    System.out.println("D) " + D[index]);

                    String ans = "";
                    while (true) {
                        System.out.print("Answer (A/B/C/D): ");
                        ans = sc.nextLine().toUpperCase();
                        if (ans.equals("A") || ans.equals("B") || ans.equals("C") || ans.equals("D")) break;
                        System.out.println("Invalid.");
                    }

                    if (ans.equals(correct[index])) {
                        correctB++;
                        System.out.println("Correct!");
                    } else {
                        wrongB++;
                        System.out.println("Incorrect.");
                    }

                    System.out.println("Score: " + (correctA + correctB) + " correct, " + (wrongA + wrongB) + " wrong");

                    // stop Part B at 2 wrong
                    if (wrongB == 2) {
                        System.out.println("You got 2 wrong in Part B. Test ended.");
                        break;
                    }
                }

                if (wrongB == 2) continue;

                // RESULTS
                int total = correctA + correctB;
                System.out.println("RESULTS");
                System.out.println("Part A: " + correctA + "/6");
                System.out.println("Part B: " + correctB + "/6");
                System.out.println("Total: " + total + "/12");

                if (correctA >= 4 && correctB >= 4 && total >= 9)
                    System.out.println("PASS");
                else
                    System.out.println("FAIL");
            }

            // ADMIN MODE
            else if (choice.equals("2")) {

                System.out.print("Password: ");
                String pw = sc.nextLine();

                if (!pw.equals("admin")) {
                    System.out.println("Incorrect password.");
                    continue;
                }

                while (true) {
                    System.out.println("ADMIN MENU");
                    System.out.println("1. Add a question");
                    System.out.println("2. Remove a question");
                    System.out.println("3. Back");
                    System.out.print("Choose: ");
                    String adminChoice = sc.nextLine();

                    // ADD
                    if (adminChoice.equals("1")) {

                        System.out.println("Enter question:");
                        String q = sc.nextLine();

                        System.out.println("Option A:");
                        String oa = sc.nextLine();

                        System.out.println("Option B:");
                        String ob = sc.nextLine();

                        System.out.println("Option C:");
                        String oc = sc.nextLine();

                        System.out.println("Option D:");
                        String od = sc.nextLine();

                        String corr = "";
                        while (true) {
                            System.out.print("Correct (A/B/C/D): ");
                            corr = sc.nextLine().toUpperCase();
                            if (corr.equals("A") || corr.equals("B") || corr.equals("C") || corr.equals("D")) break;
                            System.out.println("Invalid.");
                        }

                        // Find first empty slot
                        int slot = -1;
                        for (int i = 0; i < totalQuestions; i++) {
                            if (questions[i].equals("")) {
                                slot = i;
                                break;
                            }
                        }

                        if (slot == -1) {
                            System.out.println("Bank is full.");
                        } else {
                            questions[slot] = q;
                            A[slot] = oa;
                            B[slot] = ob;
                            C[slot] = oc;
                            D[slot] = od;
                            correct[slot] = corr;
                            System.out.println("Question added.");
                        }
                    }

                    // REMOVE
                    else if (adminChoice.equals("2")) {

                        System.out.println("Questions:");
                        for (int i = 0; i < totalQuestions; i++) {
                            System.out.println((i + 1) + ". " + questions[i]);
                        }

                        System.out.print("Enter number to remove: ");
                        String numStr = sc.nextLine();

                        boolean isNum = true;
                        for (int i = 0; i < numStr.length(); i++) {
                            if (numStr.charAt(i) < '0' || numStr.charAt(i) > '9') {
                                isNum = false;
                                break;
                            }
                        }

                        if (!isNum) {
                            System.out.println("Invalid.");
                            continue;
                        }

                        int num = Integer.parseInt(numStr);
                        if (num < 1 || num > totalQuestions) {
                            System.out.println("Invalid.");
                            continue;
                        }

                        int index = num - 1;

                        questions[index] = "";
                        A[index] = "";
                        B[index] = "";
                        C[index] = "";
                        D[index] = "";
                        correct[index] = "";

                        System.out.println("Removed.");
                    }

                    else if (adminChoice.equals("3")) break;
                    else System.out.println("Invalid.");
                }
            }

            // EXIT
            else if (choice.equals("3")) {
                System.out.println("Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid.");
            }
        }

        sc.close();
    }
}