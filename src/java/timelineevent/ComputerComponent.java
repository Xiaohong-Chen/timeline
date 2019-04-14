package timelineevent;

public class ComputerComponent extends TimelineEvent {

    int modelNumber;
    int releaseYear;
    double retailPriceIn2018;
    String manufacturer;

    public ComputerComponent(View_DataInput di) {

        super(di);
        modelNumber = di.getModelNumber();
        releaseYear = di.getReleaseYear();
        retailPriceIn2018 = di.getRetailPriceIn2018();
        manufacturer = di.getManufacturer();

    }

}
