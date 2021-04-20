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

    public String getZodiacForDate(String birthDate, List<ZodiacInfo> zodiacList){
        int birthDateDay=Integer.parseInt(birthDate.split("/")[1]);
        int birthDateMonth=Integer.parseInt(birthDate.split("/")[0]);
        for(int index=0;index<zodiacList.size();index++) {

            int zodiacStartDateDay = Integer.parseInt(zodiacList.get(index).getStartDate().split("/")[1]);
            int zodiacStartDateMonth = Integer.parseInt(zodiacList.get(index).getStartDate().split("/")[0]);
            int zodiacEndDateDay = Integer.parseInt(zodiacList.get(index).getEndDate().split("/")[1]);
            int zodiacEndDateMonth = Integer.parseInt(zodiacList.get(index).getEndDate().split("/")[0]);

           if(birthDateMonth==zodiacStartDateMonth && birthDateDay>=zodiacStartDateDay)
            {
                return zodiacList.get(index).getName();
            } else if(birthDateMonth==zodiacEndDateMonth && birthDateDay<=zodiacEndDateDay){
                return zodiacList.get(index).getName();
            }
        }
        return "";
    }
}
