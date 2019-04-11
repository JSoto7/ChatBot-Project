class Main 
{
   public static void main(String[] args)
   {
      //Chatbot sven = new Chatbot();
      //System.out.println(sven.getGreeting());

      ApexBot a = new ApexBot();
      MinecraftBot b = new MinecraftBot();

      System.out.println("");
      System.out.println("*A Nether Portal Appears, Dropping MineBot from it*");
      System.out.println("");
      System.out.println("*Mine falls into a place he's not familiar with*");
      System.out.println("");
      System.out.println("Mine: " + b.getGreeting());
      System.out.println("Apex: " + a.getGreeting());

      System.out.println("Mine: Who are you?");
      System.out.println("Apex: " + a.keywordResponsePairs[0][1]);
      System.out.println("Mine: " + b.getRandomQuestion());
      System.out.println("Apex: Listen, I don't know what I'm doing here, but we both know we need to find a way out of here, whatever this place is.");
      System.out.println("Mine: Yea, you're right.");
      System.out.println("Mine: *Checks Inventory* || Current Tools: " + b.myTools + " ||");
      System.out.println("Mine: All my tools are broken too!");
      System.out.println("\\\\\\\\\\\\|-| PORTAL ACTIVATED. |-|/////////");
      System.out.println("Apex: Well, looks like that's my que, " + a.getGoodbye() + "!");
      System.out.println("Mine: See ya. Will you be back?");
      System.out.println("Apex: I guess you will have to wait and see.");
      System.out.println("--------------------------------------------------------------------");
      System.out.println("30 minutes later");
      System.out.println("--------------------------------------------------------------------");
      System.out.println("Apex: Aye yo aye, LOOK OUT!!!!");
      System.out.println("*Apex slams into Mine while on zipline*");
      System.out.println("Mine: Uh dude, could you watch out next time?");
      System.out.println("Apex: I said look out. I thought you would've at least heard me.");
      System.out.println("Mine: " + b.getRandomQuestion());
      System.out.println("Apex: Bro, I'm in the middle of a game right now and I'm close to becoming the Apex Champion.");
      System.out.println("Mine: Ohhhhhhhh. So that's what this place is.");
      System.out.println("Apex: Yeah. I just said that I didn't know where I was earlier because I'm new to this game and I was just a little confused.");
      System.out.println("Mine: Oh okay. Anyways, how many people are left??");
      System.out.println("Apex: It's me and one other person. So, if you will excuse me, I gotta get moving. I won't be back this time so you dont gotta worry.");
      System.out.println("\\\\\\\\\\\\|-| PORTAL ACTIVATED. |-|/////////");
      System.out.println("Mine: Alright, well I'll see ya later!");
      System.out.println("Apex: " + a.getGoodbye());
      System.out.println("");
      System.out.println("*Both bots go through portal*");
      System.out.println("");
      System.out.println("--------------------------------------------------------------------");
      System.out.println("[The next day...]");
      System.out.println("--------------------------------------------------------------------");
      System.out.println("");
      System.out.println("*Both bots exit the portal*");
      System.out.println("Loud Speaker: [ Welcome, to Minecraft! ]");
      System.out.println("Apex: Oh great, where am I now?");
      System.out.println("Mine: Don't hate. Remember, I was the OG in your Battle Royal Game. I survived wit absolutely nothing to help me.");
      System.out.println("[END SESSION]");
    }

}
