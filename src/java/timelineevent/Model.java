package timelineevent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {

    /*
    
    public File dataFile;
    public FileWriter fw;
    public PrintWriter writerTimeline;
    
    public Model() {
        System.out.println("kdkdkkdk");
        try {
            dataFile = new File("D:/CCAC/TimeLineData.txt");
            if (dataFile.exists()) {
                fw = new FileWriter(dataFile, true);
                writerTimeline = new PrintWriter(fw);
                System.out.println("exit");
                
            } else {
                writerTimeline = new PrintWriter(dataFile);
                writerOrder();
                System.out.println("notexit");
                
            }
        } catch (IOException ex) {
            System.out.println("nonono");
        }
        System.out.println(dataFile.getAbsolutePath());
    }
    public File getFile() {
        return dataFile;
    }
    public final void writerOrder() {

        writerTimeline.print("Tpye,");
        writerTimeline.print("Title,");
        writerTimeline.print("Year,");
        writerTimeline.print("Description,");
        writerTimeline.print("ModelNumber,");
        writerTimeline.print("Manufacturer,");
        writerTimeline.print("ReleaseYear,");
        writerTimeline.print("RetailPriceIn2018,");
        writerTimeline.print("ReasonOfChoosing,");
        writerTimeline.println("MostImportantSpecifications,");
        writerTimeline.flush();

    }


    public void writeComputerHardware(ComputerHardware ch) {

        writerTimeline.print("ComputerHardware,");
        writerTimeline.print(ch.title + ",");
        writerTimeline.print(ch.year + ",");
        writerTimeline.print(ch.description + ",");
        writerTimeline.print(ch.modelNumber + ",");
        writerTimeline.print(ch.manufacturer + ",");
        writerTimeline.print(ch.releaseYear + ",");
        writerTimeline.print(ch.retailPriceIn2018 + ",");
        writerTimeline.print(" " + ",");
        writerTimeline.println(ch.mostImportantSpecifications + ",");
        writerTimeline.flush();

    }

    public void writeComputerSystem(ComputerSystem cs) {

        writerTimeline.print("ComputerSystem,");
        writerTimeline.print(cs.title + ",");
        writerTimeline.print(cs.year + ",");
        writerTimeline.print(cs.description + ",");
        writerTimeline.print(cs.modelNumber + ",");
        writerTimeline.print(cs.manufacturer + ",");
        writerTimeline.print(cs.releaseYear + ",");
        writerTimeline.print(cs.retailPriceIn2018 + ",");
        writerTimeline.print(cs.reasonOfChoosing + ",");
        writerTimeline.println(" " + ",");
        writerTimeline.flush();

    }

    public void writeHumanInterest(HumanInterest hi) {

        writerTimeline.print("HumanInterest,");
        writerTimeline.print(hi.title + ",");
        writerTimeline.print(hi.year + ",");
        writerTimeline.print(hi.description + ",");
        writerTimeline.print(" " + ",");
        writerTimeline.print(" " + ",");
        writerTimeline.print(" " + ",");
        writerTimeline.print(" " + ",");
        writerTimeline.print(" " + ",");
        writerTimeline.println(" " + ",");
        writerTimeline.flush();
    }

    public void close() {

        writerTimeline.close();

    }
    */
    
    public void writeHumanInterest(HumanInterest hi) throws SQLException {
        
        
       
    }

    
}
