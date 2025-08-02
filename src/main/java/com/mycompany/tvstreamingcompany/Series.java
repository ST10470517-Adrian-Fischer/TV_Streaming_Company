/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvstreamingcompany;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nolaf
 */
public class Series {

    private SeriesModel model;
    private static ArrayList<SeriesModel> seriesArray = new ArrayList<>();
    private static ArrayList<String> allseriesIDs = new ArrayList<>();

    public Series(SeriesModel model) {
        this.model = model;

    }

    public Series() {
    }

    public void resetArray() {
       seriesArray = new ArrayList<>();
       allseriesIDs = new ArrayList<>();
    }

    public String CaptureSeries(SeriesModel Model, String chosenseriesid) {
        String capturedseries;
        if (!(allseriesIDs.contains(chosenseriesid))) {
            allseriesIDs.add(chosenseriesid);
            seriesArray.add(Model);
            capturedseries = "Series id:"
                    + model.getSeriesID()
                    + "\nSeries name:"
                    + model.getSeriesName()
                    + "\nSeries age restriction:"
                    + model.getSeriesAge()
                    + "\nSeries number of episodes:"
                    + model.getSeriesNumberofEpisodes() + "\nhas been successfully saved\n";
        } else {
            capturedseries = "Not valid series due to duplicate series id";

        }

        return capturedseries;
    }

    public String SearchSeries(String chosensearchid) {
        String foundseries = "";

        for (int i = 0; i < seriesArray.size(); i++) {
            if (chosensearchid.equals(seriesArray.get(i).getSeriesID())) {
                foundseries = seriesArray.get(i).toString();

            } else {
                foundseries = "Series with series id: " + chosensearchid + " was not found";

            }

        }
        return foundseries;
    }

    public void UpdateSeries(String chosensearchid) {
        int newSeriesAgerestriction = 0;
        for (int i = 0; i < seriesArray.size(); i++) {
            if (chosensearchid.equals(seriesArray.get(i).getSeriesID())) {
                String newSeriesname = JOptionPane.showInputDialog("Enter the a new name for the series: ->");

                do {
                    try {
                        newSeriesAgerestriction = Integer.parseInt(JOptionPane.showInputDialog("Enter the a new age restriction for the series"));
                    } catch (NumberFormatException e) {
                        System.out.println("You have entered a incorrect series age!!!\"\n"
                                + "\n Please re-enter the series age >>");
                    }

                    System.out.println(newSeriesAgerestriction < 2 || newSeriesAgerestriction > 18 ? "You have entered a incorrect series age!!!"
                            + "\n Please re-enter the series age >>" : "valid age restriction");

                } while (newSeriesAgerestriction < 2 || newSeriesAgerestriction > 18);
                String newAmountofepisode = JOptionPane.showInputDialog("Enter the a new amount of episodes for the series");
                seriesArray.get(i).setSeriesName(newSeriesname);
                seriesArray.get(i).setSeriesAge(newSeriesAgerestriction);
                seriesArray.get(i).setSeriesNumberofEpisodes(newAmountofepisode);
            } else {

            }

        }
    }

    public String DeleteSeries(String chosenseriesid) {
        String message = "no series found";
        for (int i = 0; i < seriesArray.size(); i++) {
            if (chosenseriesid.equals(seriesArray.get(i).getSeriesID())) {
                seriesArray.remove(seriesArray.get(i));
                message = "Series with the series id: " + chosenseriesid + " was deleted";

            }
        }
        return message;

    }

    public String SeriesReport() {
        String report = "";
        for (int i = 0; i < seriesArray.size(); i++) {
            report += "Series "
                    + (i + 1)
                    + "\n-------------------------------------\n"
                    + "Series id: "
                    + seriesArray.get(i).getSeriesID()
                    + "\nSeries name: "
                    + seriesArray.get(i).getSeriesName()
                    + "\nSeries age restriction: "
                    + seriesArray.get(i).getSeriesAge()
                    + "\nSeries number of episodes: "
                    + seriesArray.get(i).getSeriesNumberofEpisodes()
                    + "\n-------------------------------------\n";

        }
        return report;

    }

}
