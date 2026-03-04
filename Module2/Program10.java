//10.Represent email as a object
class Email
{
    String sender;
    String receiver;
    String subject;
    String content;
    String timestamp;
}
class Program10
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Email e1 = new Email();
        e1.sender="Sundar";
        e1.receiver="somu";
        e1.subject="Hello, hi";
        e1.content="This is a email content";
        e1.timestamp="2024-06-30 10:00:00";

        System.out.println("Email.Sender: "+e1.sender);
        System.out.println("Email.Receiver: "+e1.receiver);
        System.out.println("Email.Subject: "+e1.subject);
        System.out.println("Email.Content: "+e1.content);
        System.out.println("Email.Timestamp: "+e1.timestamp);

        System.out.println("main method ended");
        
    }
}