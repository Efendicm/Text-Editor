import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;

public class Txtchange {
    static void modifyFile(String filePath, String oldString, String newString)
        {
            File fileToBeModified = new File(filePath);
             
            String oldContent = "";
             
            BufferedReader reader = null;
             
            FileWriter writer = null;
             
            try
            {
                reader = new BufferedReader(new FileReader(fileToBeModified));
                 
                //Reading all the lines of input text file
                 
                String line = reader.readLine();
                 
                while (line != null)
                {
                    oldContent = oldContent + line + System.lineSeparator();
                     
                    line = reader.readLine();
                }
                 
                //Replacing oldString with newString in the file
                 
                String newContent = oldContent.replaceAll(oldString, newString);
                 
                //Rewriting the input text file with newContent
                 
                writer = new FileWriter(fileToBeModified);
                 
                writer.write(newContent);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                try
                {
                    //Closing the resources
                     
                    reader.close();
                     
                    writer.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
         
        public static void main(String[] args)
        {
            modifyFile("Program1Lang.txt", "aa", "0");
            modifyFile("Program1Lang.txt", "ac", "1");
            modifyFile("Program1Lang.txt", "ag", "2");
            modifyFile("Program1Lang.txt", "at", "3");
            modifyFile("Program1Lang.txt", "ca", "4");
            modifyFile("Program1Lang.txt", "cc", "5");
            modifyFile("Program1Lang.txt", "cg", "6");
            modifyFile("Program1Lang.txt", "ct", "7");
            modifyFile("Program1Lang.txt", "ga", "8");
            modifyFile("Program1Lang.txt", "gc", "9");
            modifyFile("Program1Lang.txt", "gg", "A");
            modifyFile("Program1Lang.txt", "gt", "B");
            modifyFile("Program1Lang.txt", "ta", "C");
            modifyFile("Program1Lang.txt", "tc", "D");
            modifyFile("Program1Lang.txt", "tg", "E");
            modifyFile("Program1Lang.txt", "tt", "F");
           
             
            System.out.println("Done");
        }
    }
    
    
