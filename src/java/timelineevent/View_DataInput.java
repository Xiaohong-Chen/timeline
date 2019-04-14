package timelineevent;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "input")
public class View_DataInput {

    public int year;
    public int modelNumber;
    public int releaseYear;
    public double retailPriceIn2018;
    public String tpye;
    public String title;
    public String description;
    public String manufacturer;
    public String reasonOfChoosing;
    public String mostImportantSpecifications;

    public void setYear(int year) {
        this.year = year;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRetailPriceIn2018(double retailPriceIn2018) {
        this.retailPriceIn2018 = retailPriceIn2018;
    }

    public void setTpye(String tpye) {
        this.tpye = tpye;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setReasonOfChoosing(String reasonOfChoosing) {
        this.reasonOfChoosing = reasonOfChoosing;
    }

    public void setMostImportantSpecifications(String mostImportantSpecifications) {
        this.mostImportantSpecifications = mostImportantSpecifications;
    }

    public int getYear() {
        return year;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRetailPriceIn2018() {
        return retailPriceIn2018;
    }

    public String getTpye() {
        return tpye;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getReasonOfChoosing() {
        return reasonOfChoosing;
    }

    public String getMostImportantSpecifications() {
        return mostImportantSpecifications;
    }

    public View_DataInput() {

    }

    
}
