/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tvstreamingcompany;

import javax.swing.JOptionPane;

/**
 *
 * @author adrianf
 */
public class TvStreamingcompany {

    public static void main(String[] args) {
        String seriesID;
        int seriesAge = 0;
        String seriesName;
        String seriesNumberofEpisodes;
        String chosenSeriesID;
        String choice;
        Series entry = new Series();
        choice = JOptionPane.showInputDialog("Latest Series - 2025"
                + "\n *************************"
                + "\n Enter (1) to launch menu or any other key to exit");
        if (choice.equals("1")) {
            choice = JOptionPane.showInputDialog(
                    "Please select one of the following menu items:"
                    + "\n (1) Capture a new series. "
                    + "\n (2) Search for a series. "
                    + "\n (3) Update seeries age restriction "
                    + "\n (4) Delete a series. "
                    + "\n (5) Print series report - 2025. "
                    + "\n (6) Exit Application");
            while (!(choice.equals("6"))) {

                switch (choice) {
                    case "1":
                        seriesID = JOptionPane.showInputDialog("Enter the series id");
                        seriesName = JOptionPane.showInputDialog("Enter the series name");
                        do {
                            try {
                                seriesAge = Integer.parseInt(JOptionPane.showInputDialog("Enter the series age restriciton"));
                            } catch (NumberFormatException e) {
                                System.out.println("You have entered a incorrect series age!!!\"\n"
                                        + "\n Please re-enter the series age >>");
                            }

                            System.out.println(seriesAge < 2 || seriesAge > 18 ? "You have entered a incorrect series age!!!"
                                    + "\n Please re-enter the series age >>" : "valid age restriction");

                        } while (seriesAge < 2 || seriesAge > 18);

                        seriesNumberofEpisodes = JOptionPane.showInputDialog("Enter how amny episodes this series has");
                        SeriesModel series = new SeriesModel(seriesID, seriesName, seriesAge, seriesNumberofEpisodes);
                        entry = new Series(series);
                        System.out.println(entry.CaptureSeries(series, seriesID));

                        break;
                    case "2":
                        chosenSeriesID = JOptionPane.showInputDialog("Ente the series id you want to search for");

                        System.out.println(entry.SearchSeries(chosenSeriesID));
                        break;
                    case "3":
                        chosenSeriesID = JOptionPane.showInputDialog("enter the series id of the series you want to update");

                        entry.UpdateSeries(chosenSeriesID);
                        break;
                    case "4":
                        chosenSeriesID = JOptionPane.showInputDialog("Enter the series id to delete:");
                        choice = JOptionPane.showInputDialog("Are you sure you want to delete series:" + chosenSeriesID + " from the system? Yes (y) to delete");
                        System.out.println((choice.equals("y") ? entry.DeleteSeries(chosenSeriesID) : " "));
                        break;
                    case "5":
                        System.out.println(entry.SeriesReport());
                        break;

                    default:
                        System.out.println("Enter a valid menu option");

                }
                choice = JOptionPane.showInputDialog(
                        "Please select one of the following menu items:"
                        + "\n (1) Capture a new series. "
                        + "\n (2) Search for a series. "
                        + "\n (3) Update seeries age restriction "
                        + "\n (4) Delete a series. "
                        + "\n (5) Print series report - 2025. "
                        + "\n (6) Exit Application");

            }
        }
    }
}
