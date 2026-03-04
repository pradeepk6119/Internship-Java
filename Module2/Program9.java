//9.Represent chat as a object
// content, chatid, sender, receiver, timestamp
class Chat
{
    String content;
    String chatid;
    String sender;
    String receiver;
    String timestamp;
}
class Program9
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Chat c1 = new Chat();
        c1.content="Hello, hi";
        c1.chatid="1234567890";
        c1.sender="Sundar";
        c1.receiver="Sundar";
        c1.timestamp="2024-06-30 10:00:00";

        System.out.println("Chat.Content: "+c1.content);
        System.out.println("Chat.Chatid: "+c1.chatid);
        System.out.println("Chat.Sender: "+c1.sender);
        System.out.println("Chat.Receiver: "+c1.receiver);
        System.out.println("Chat.Timestamp: "+c1.timestamp);

        System.out.println("main method ended");
        
    }
}