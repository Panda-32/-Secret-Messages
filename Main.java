import java.util.Scanner;

class Main {
String alphabet="abcdefghijklmnpqrstuvwxyz";
  public static void main(String[] args) {
    
    System.out.println("Welcome to Caser Cipher Encryption tool");
    System.out.println("Encrypt a word for yoour feirnds to sovle or solve your friends sercret message");
    System.out.println("All you will need is a key and a message ");
    Scanner keyInput = new Scanner(System.in);
    Scanner messageInput = new Scanner(System.in);
    System.out.println("Pick a key");
    int key = keyInput.nextInt();
    System.out.println("Write your message here");
    String message = messageInput.nextLine();
    Main encryption = new Main();
    String newmessage = encryption.encrypt(key , message);
    System.out.println("your secret message is :");
    System.out.println(newmessage);
  }

  public int GOPIA(char letter)
  {
    return alphabet.indexOf(letter);
  }
  public int GEP(int position , int key)
  {
    key = key%26;
    return position+key;
  }
  public char GEL(int position)
  {
    return alphabet.charAt(position);
  }

  public boolean isSymbol(String letter)
  {
    if (letter.equals("!"))
    {
      return true;
      
    }
    else
    {
      return false;
    }
  }


public String encrypt(int key , String message )
{
  String encryptedTxt = "";
  int messagelenght = message.length();
  for(int i=0; i< messagelenght ; i++)
  {
    char letter=message.charAt(i);
    String l = Character.toString(letter);
  if( isSymbol(l))
    {
      encryptedTxt = encryptedTxt+letter;
    }
  if (Character.isWhitespace(letter))
  {
    encryptedTxt = encryptedTxt+letter;
  }
  else
  {
    int alphabetPostion  = GOPIA(letter);
    int encryptPosition = GEP(alphabetPostion, key);
    char newLetter = GEL(encryptPosition);
    encryptedTxt = encryptedTxt+newLetter;
  }

  }
return encryptedTxt;
}



}
