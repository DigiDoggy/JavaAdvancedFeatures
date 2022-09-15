package freehw.paintcalculation;

import advance.filestream.FileOutputStreamExample;
import freehw.paintcalculation.data.Storage;
import freehw.paintcalculation.paint.Grunt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingProjectFile {

    public static void creating() throws IOException{

        try {
            File file = new File("PaintProg\\"+ClientPath.getCompanyName()+".txt");

            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.write("Metal area"+Float.toString(ClientPath.getMetalArea()) +  System.lineSeparator());
            pw.write("Grunt thickness: "+ Integer.toString(ClientPath.getGruntThickness())+"\t||\t Amount of grunt paint for work: "+AmountOfGrunt.getAmountOfDyeGrunt()+ System.lineSeparator());
            pw.write("Finish thickness: "+ ClientPath.getFinishThickness() +"\t||\t Amount of finish paint for work: "+AmountOfFinish.getAmountOfDyeFinish()+ System.lineSeparator());
            pw.write("Finish color: " + ClientPath.getFinishColor() + System.lineSeparator());
            pw.write("---------------------------------" + System.lineSeparator());
            pw.write("How many buckets of grunt we need: " + AmountOfGrunt.getBucketGrunt() +"\t||\t Price for it: "+Price.getProjectGruntPrice()+ System.lineSeparator());
            pw.write("How many buckets of finish we need: " + AmountOfFinish.getBucketFinish() +"\t||\t Price for it: "+ Price.getProjectFinishPrice()+ System.lineSeparator());
            pw.write("How many grunt liters we has in storage: "+ Float.toString(Storage.getGruntStorage().indexOf(0)) + "\t||\t Finish: " + Storage.getFinishStorage().indexOf(0) + System.lineSeparator());
            pw.println(Storage.getGruntStorage().indexOf(0));
            pw.close();

        }catch (/*IOException*/Exception e ){
            System.out.println("Error: " + e);
        }

    }
}
