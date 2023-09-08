package FileIOHandling;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileIO {
    public static void main(String[] args) throws IOException {
        FileIO fi=new FileIO();
        fi.file_creation();
        Date date= new Date();
        SimpleDateFormat df=new SimpleDateFormat("d/M/yyyy");
        System.out.println(df.format(date));
        System.out.println(date.toString());
    }
    public void file_creation() throws IOException {
        File files=new File("file1.txt");
        if(files.createNewFile()){
            System.out.println("File has been created");
        }
        else{
            System.out.println("File already exists");
        }
        

    }
    public void read_file(){


    }
}
