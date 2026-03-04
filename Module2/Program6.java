//6.Represent File as object
//filename, filesize, filetype, filelocation, fileextension
class File
{
    String filename;
    int filesize;
    String filetype;
    String filelocation;
    String fileextension;
}
class Program6
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        File f1 = new File();
        f1.filename="MyFile";
        f1.filesize=5000;
        f1.filetype="Text";
        f1.filelocation="C:\\Users\\Sundar\\Documents";
        f1.fileextension=".txt";

        System.out.println("File.Filename: "+f1.filename);
        System.out.println("File.Filesize: "+f1.filesize);  
        System.out.println("File.Filetype: "+f1.filetype);
        System.out.println("File.Filelocation: "+f1.filelocation);
        System.out.println("File.Fileextension: "+f1.fileextension);    

        System.out.println("main method ended");
    }
}