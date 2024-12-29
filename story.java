import java.util.Scanner;
import java.util.ArrayList;

public class StoryMode {
  private int intelligence;
  private int strength;
  private int karma;
  private String names;
  private ArrayList < String > questions;

  public StoryMode(String ns) {
    intelligence = 0;
    strength = 0;
    karma = 0;
    names = ns;
    questions = new ArrayList < String > ();
  }
  public void intelligencePoint() {
    intelligence++;
  }
  public void strengthPoint() {
    strength++;
  }
  public void karmaPoint() {
    karma++;
  }

  public String getName() {
    return names;
  }
  public String Story() {

    questions.add("It was the summer of 1996. My family and I decided to take a flight to the carribeans for a nice, relaxing vacation. It was none of those things. During the flight, the captain announceed that he was losing control of the airplane due to extreme turbulence, I remember the looks on the faces of the people around me. The silence in this room was deafening as fear and panick quickly swept through the room. Next thing I remember, my brother was yelling at me to wake up with tears falling from his eyes. As I regain consciousness I saw things I never wished to see. Me and my brother were the only surviors. My brother seemed to have a worried look on his face, when all of a sudden, I felt quesy. There were lacerations all over my left leg with a large chunk of glass suck in my thigh due to shattered glass. My leg was in extreme pain. Here I was presented with two choices. Do I leave this glass in my thigh until I can properly stop the bleeding, or do I take it out now, and stop the bleeding with my shirt. \n Type in a to remove the glass \n Type in b to leave it in \n");
    Scanner choice = new Scanner(System.in);
    System.out.println(questions.get(0));
    String c;
    c = choice.next();
    if (c.equals("a") || c.equals("A")) {
      strength++;
      questions.add("\n I indicate to my brother to remove the glass with the shirt on standby. He carefully removes the glass from my thigh. As soon as the glass was removed, he quickly grabbed the shirt and tightly wrapped it around my thigh to stop the bleeding. I could feel my leg beginning to heal. \n Strength +1 \n");
      System.out.println(questions.get(1));
    } else if (c.equals("b") || c.equals("B")) {
      strength--;
      questions.add("\n I lean on my brother for support and we slowly get out of the plane, my leg is in extreme pain and I lost so much strength \n strength -1 \n");
      System.out.println(questions.get(1));
    }
    questions.add("\n As we exited the plane we noticed it was getting dark and we were on the shore of an island. The only thing around us was a forest. I recommended to my brother that we try to cross the forest as soon as possible and try finding some sort of civilization. My brother notes that we could use some rest and we could spend the night on the shore and cross the forest in the morning. \n Press a to cross the forest immediately \n Press b to spend the night on the shore \n");
    Scanner choice2 = new Scanner(System.in);
    String c2;
    System.out.println(questions.get(2));
    c2 = choice2.next();
    if (c2.equals("a") || c2.equals("A")) {
      questions.add("\n The forest was dense, we could hear the sound of crickets chirping in night. After hours of walking we noticed a sleeping, baby tiger through the corner of our eyes. Hearing the grumbling in our stomachs, we knew we needed food soon. There were plently of sticks around us to make a fire and cook the tiger. Before we made our choice, I noticed that this tiger was a bengal tiger, an endangered species. \n Press a to cook and eat the tiger \n press b to continue walking with an empty stomach. \n");
      Scanner choice3 = new Scanner(System.in);
      String c3;
      System.out.println(questions.get(3));
      c3 = choice3.next();
      if (c3.equals("a") || c3.equals("A")) {
        karma--;
        strength++;
        questions.add("\n We ate the tiger and felt so much better, but a sense of guilt quickly filled our consious. \n Karma -1 \n Strength +1 \n");
        System.out.println(questions.get(4));
      } else if (c3.equals("b") || c3.equals("B")) {
        karma++;
        questions.add("\n We continued walking, ignoring the hunger but we felt good about our choice. \n Karma +1 \n");
        System.out.println(questions.get(4));
      }
    } else if (c2.equals("b") || c2.equals("B")) {
      strength += 2;
      questions.add("\n We slept throughout the night and woke up at the crack of dawn to begin our journey across the forest. Before we left, we noticed some food on the plane and decided to salvage as much as we could to quench our hunger and thirst. The journey across the forest wasn't really eventful as we never came across any challenges. \n Strength +2 \n");
      System.out.println(questions.get(3));
      questions.add("");
    }
    questions.add("\n As we exit the forest we see a small little house, we got excited as we had a thought that we were alone on the island. As we get closer to the house, we saw an old man, sitting on his porch. He invited us in, saying he didn't get many visitors. Inside the house, we told him our story; we shouldn't be here. Then, he responded by telling us the situation on this island. In his words, he said, \"Not too far from my home, a gang of pirates arrived on the island and swiftly took it over. Some people managed to flee while I fled to the outskirts of the island.\" Before you leave, the old man asks you to take a charm to help you on your journey but he asks you to return it.\n  Press a if you keep the charm and later sell it off \n  Press b if you return the charm when your completed with your journey.\n");
    Scanner choice4 = new Scanner(System.in);
    String c4;
    System.out.println(questions.get(5));
    c4 = choice4.next();
    if (c4.equals("a") || c4.equals("A")) {
      karma--;
      intelligence++;
      questions.add("\n I noticed that this charm was made of gold and we could make a mini fortune selling it off, so we decided to never return to the old man's home. \n Karma -1 \n Intelligence +1 \n");
      System.out.println(questions.get(6));
    } else if (c4.equals("b") || c4.equals("B")) {
      karma += 2;
      questions.add("\n We promised to return to him later on, I felt good about my decision. \n Karma +2 \n");
      System.out.println(questions.get(6));
    }
    questions.add("As we come across a village, we discover many homes all destroyed. It looks like the pirates came onto the island and lit the village on fire. What the pirates wanted was a mystery at this point but, it seems like they mean business. escaping the island might be the smartest move as the my brother and I have already escaped death once, twice might be too much to ask for. We remember emergency life rafts were back at the plane, if we went back there, we could probably escape. \n type in a to escape the island and return home. \n type in b to continue your quest to liberate this island.\n ");
    Scanner choice5 = new Scanner(System.in);
    String c5;
    System.out.println(questions.get(7));
    c5 = choice5.next();
    if (c5.equals("a") || c5.equals("A")) {

      questions.add("\n We crossed the forest once more, to return back to the plane. My brother and I took the raft, some flares and some food and water. We then took off. We were on open waters for what seemed to be 3 or 4 days when a fishing boat stumbled upon us. They brought us in and took us to the nearest mainland. There we informed the authorities of what was going on in the island. They didn't believe anything we said and thought we were delusional. We completely abandoned those people. They needed someone to save them, but we just left. I carried this guilt with me for the rest of my life. \n");
      System.out.println(questions.get(8));
    } else if (c5.equals("b") || c5.equals("B")) {
      karma++;
      questions.add("\n We decided that we would try our hardest to save these people. We couldn't just abandon them, they needed help. \n Karma +1");
      System.out.println(questions.get(8));

    }
    questions.add("\n After walking around for a little bit, we stumbled across a civilian. We begin talking to him and we question him about the situation; Who this pirate is and what he is after. The civilian said that he would help us if we manage to beat him in rock, paper, scissors. I agreed knowing my chances of winning would be 33.33333333%. \n type 0 for rocks, 1 for scissors, 2 for paper (type your answer in, press enter, then retype it in again and press enter again)");
    Scanner choice6 = new Scanner(System.in);
    String c6;

    System.out.println(questions.get(9));
    c6 = choice6.next();
    int s = 0;
    String won = "" + false;
    int num;
    String ran;
    String u;
    num = (int)(Math.random() * 3);
    u = num + "";
    Scanner myObj = new Scanner(System.in);

    ran = myObj.nextLine();
    if (ran.equals("1") && u.equals("0")) {
      won = "" + "loss";
    }
    if (ran.equals("0") && u.equals("1")) {
      won = "" + "win";
    }
    if (ran.equals("1") && u.equals("2")) {
      won = "" + "win";
    }
    if (ran.equals("2") && u.equals("1")) {
      won = "" + "loss";
    }
    if (ran.equals("2") && u.equals("0")) {
      won = "" + "win";
    }
    if (ran.equals("0") && u.equals("2")) {
      won = "" + "loss";
    }
    if (ran.equals("0") && u.equals("0")) {
      won = "" + "tie";
    }
    if (ran.equals("1") && u.equals("1")) {
      won = "" + "tie";
    }
    if (ran.equals("2") && u.equals("2")) {
      won = "" + "tie";
    }
    if (won.equals("win")) {
      System.out.println("Congratulations! You " + won + "\n Intelligence +3");
      intelligence += 3;
    } else if (won.equals("loss")) {
      System.out.println("You lost your match of rock paper scissors, but the civilian agrees to tell you the situation regardless");
    } else if (won.equals("tie")) {
      System.out.println("You tied in your match of rock paper scissors, but the civilian agrees to tell you the situation regardless \n intelligence +1");
      intelligence++;
    }
    questions.add("This old man called himself josh. He brought us to his home and informed us that this group of pirates came here one day in search of a special treasure on a map that they found. He called it the treasure of jack sparrow. The   islanders had no idea what he was talking about but in the time he was searching for Sparrows's treasure, he took over the island and stole from all the civilians. He called the leader of those pirates, Neev. After hearing all of this, I wanted to help them out but my brother reminded me that we stand no chance against Neev. If we want to put up a fight, we needed to get stronger. The old man offers to either tell us more about Neev so we could understand his weaknesses or he could teach us some martial arts that could pose useful in defeating him. \n Type in a to learn more about Neev.\n Type in b to train in the martial arts style");
    Scanner choice7 = new Scanner(System.in);
    String c7;
    System.out.println(questions.get(10));
    c7 = choice7.next();
    if (c7.equals("a") || c7.equals("A")) {
      intelligence += 2;
      questions.add("\n Josh told us everything he knew about Neev. He told us that Neev seemed very arrogant and overestimated his strength. He had a group of people who were always around him. These crewmates seemed to be idiots who relied on brute strength alone. With this, we formulated a plan, we distract his crewmates and when we get alone with Neev, we should try to get under his skin and take advantage of that situation. \n Intelligence +2");
      System.out.println(questions.get(11));
    } else if (c5.equals("b") || c5.equals("B")) {
      strength += 2;
      questions.add("\n Throughout the night, he tought me and my brother the basics of the village's ancient martial arts. We grew stronger in such a short amount of time. We became confident in our skills. \n Strength +2");
      System.out.println(questions.get(11));
    }
    questions.add("In the morning, we set off to confront Neev. The old man told us that Neev would be on the shore opposite to the city. We quickly realized that he was at the crash site. Before we left, the old man said he wanted to give us with a weapon. He reached into his pocket and pulled out a normal, ordinary pen. At this point, my brother and I thought he had gone completely senile. How could a pen help us beat Neev. The old man said, \"click the button when in times of severe distress, make sure you don't press it before; this trick only works once.\" Confused, my brother and I left, to confront the final boss. The journey felt quick, and we ended up on the same shore where our story began. As we scouted around the area, we heard noise coming from the plane, and through the window, we saw a group of people talking. Far away from the group, there was someone sitting on the sand. He was huge. My brother thought that this giant was Neev. He was right. We couldn't get to him though as the plane was in between us and Neev. We first needed to go into the plane and beat the guards, then we could go fight Neev. My brother charges at one of the guards, taking him by surprise and subduing him. Silmultaneuosly, I dashed and took the second guard to the ground. There was only one left; One more I needed to stop. I quickly turned around, trying to save my brother, but it was already too late. I saw a sword through my brother's chest. I noticed a sword by my side. \n Press a to kill the guard \n Press b to knock out the guard");
    Scanner choice8 = new Scanner(System.in);
    String c8;
    System.out.println(questions.get(12));
    c8 = choice8.next();
    if (c8.equals("a") || c8.equals("A")) {
      karma--;
      questions.add("Filled with pure rage, I let out a earth shattering yell as I picked up one of the guards's swords and dashed towards the man who stabbed my brother, and slashed him. I quickly ran to aid my brother. Karma -1");
      System.out.println(questions.get(13));
    } else if (c8.equals("b") || c8.equals("B")) {
      karma += 2;
      questions.add("In that moment, I've never felt more rage in my life, but, I couldn't bring myself to kill another person. I ran towards the guard, knocking him out with one punch. Immediately after, I aided my brother. Karma +2");
      System.out.println(questions.get(13));
    }
    questions.add("I don't really remember much of what happened next, but all I remember is Neev standing at the entrance of the plane; Staring me down. He had a gun in hand. I lost all hope to continue on. Weakly, in my ear I heared my brother say,\"run.\" But towards the back of my mind, I knew that if I left him, he would die. I notice a shattered window on my right. \n Press a to abandon your brother and run \n Press b to fight Neev in order to save your brother.");
    Scanner choice9 = new Scanner(System.in);
    String c9;
    System.out.println(questions.get(14));
    c9 = choice9.next();
    if (c9.equals("a") || c9.equals("A")) {
      karma--;
      intelligence++;
      questions.add("Listening to my brother's final request, I jumped out through the window, narrowly avoiding the gun shots. I ran fast as I could towards the forest, but Neev was in my pursuit. I couldn't keep up for long and right at my tail. I had to fight him. Karma -1. Intelligence +1.");
      System.out.println(questions.get(15));
    } else if (c9.equals("b") || c9.equals("B")) {
      karma++;
      questions.add("I couldn't just abandon my brother, knowing he would die if I didn't help him. I decided I needed to figt Neev. Karma +1");
      System.out.println(questions.get(15));
    }
    questions.add("I managed to strike Neev when he was off guard, disarming him. He didn't need the gun though as he quickly overpowered me with his brute strength. This was my fight to lose. I had lost all hope and was preparing to charge at him for one final attack, when I remembered the pen that the old man gave me. Maybe the pen could help me out. \n Press a to click the pen \n Press b to charge at Neev");
    Scanner choice10 = new Scanner(System.in);
    String c10;
    System.out.println(questions.get(16));
    c10 = choice10.next();
    if (c10.equals("a") || c10.equals("A")) {
      strength += 2;
      questions.add("I pulled the pen out of my pocket and clicked it, when it suddenly turned into a sword. I knew that pen would help me out eventually. I made one final charge at Neev, ready to end this. Strength +2");
      System.out.println(questions.get(17));
    } else if (c10.equals("b") || c10.equals("B")) {
      questions.add("\"That pen couldn't possibly do anything,\" I thought to myself. Josh must've been crazy. Ready to end this, I made one final charge at Neev. ");
      System.out.println(questions.get(17));
    }
    return "";
  }

  public String results(int intThreshold, int strThreshold, int karThreshold, String n) {

    if (intelligence >= intThreshold && strength >= strThreshold && karma >= karThreshold) {
      names = n;
      return "Congratulations " + names + ". You have beaten Neev. This victory felt bittersweet as you lost so many people along your journey, but alas, you saved so many people. Your stat totals for this playthrough are as follows. \n Intelligence: " + intelligence + "\n strength: " + strength + "\n Karma: " + karma;
    } else {
      return "You make a grave error in your judgement during your final battle with Neev. You weren't prepared. He countered your charge with a fatal blow. \n Try again";
    }
  }

}
