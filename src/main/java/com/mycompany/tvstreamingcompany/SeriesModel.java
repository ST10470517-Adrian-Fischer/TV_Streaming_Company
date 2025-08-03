/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvstreamingcompany;

/**
 *
 * @author adrianf
 */
public class SeriesModel {

    public String seriesID;
    public String SeriesName;
    public int SeriesAge;
    public String SeriesNumberofEpisodes;

    public SeriesModel(String seriesID, String SeriesName, int SeriesAge, String SeriesNumberofEpisodes) {
        this.seriesID = seriesID;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberofEpisodes = SeriesNumberofEpisodes;
    }

    public SeriesModel() {

    }

    public String getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(String seriesID) {
        this.seriesID = seriesID;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public void setSeriesName(String SeriesName) {
        this.SeriesName = SeriesName;
    }

    public int getSeriesAge() {
        return SeriesAge;
    }

    public void setSeriesAge(int SeriesAge) {
        this.SeriesAge = SeriesAge;
    }

    public String getSeriesNumberofEpisodes() {
        return SeriesNumberofEpisodes;
    }

    public void setSeriesNumberofEpisodes(String SeriesNumberofEpisodes) {
        this.SeriesNumberofEpisodes = SeriesNumberofEpisodes;
    }

    @Override
    public String toString() {
        return "Series id: " + seriesID + "\nSeriesName: " + SeriesName + "\nSeriesAge: " + SeriesAge + "\nSeriesNumberofEpisodes: " + SeriesNumberofEpisodes;
    }

}
