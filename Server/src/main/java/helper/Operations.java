package helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Operations {
    public void getZodiacTable(List<ZodiacInfo> zodiacList){
        try {
            File myObj = new File("zodiac.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                ZodiacInfo zodiac;
                String data = myReader.nextLine();
                String[] strings=data.split(";");
                zodiac=new ZodiacInfo(strings[0],strings[1],strings[2]);
                zodiacList.add(zodiac);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
