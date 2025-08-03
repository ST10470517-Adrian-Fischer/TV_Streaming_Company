/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tvstreamingcompany;

import com.mycompany.tvstreamingcompany.Series;
import com.mycompany.tvstreamingcompany.SeriesModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adrianf
 */
public class SeriesTest {

    public SeriesTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of CaptureSeries method, of class Series.
     */
    @Test
    public void testCaptureSeries() {
        System.out.println("CaptureSeries");

        SeriesModel Model = new SeriesModel("932764385", "Title", 3, "5");
        String chosenseriesid = "932764385";
        Series instance = new Series(Model);
        instance.resetArray();
        String expResult = "Series id:932764385\nSeries name:Title\nSeries age restriction:3\nSeries number of episodes:5\nhas been successfully saved\n";

        String result = instance.CaptureSeries(Model, chosenseriesid);

        assertEquals(expResult, result);

    }

    /**
     * Test of SearchSeries method, of class Series.
     */
    @Test
    public void testSearchSeries() {
        System.out.println("SearchSeries");
        String chosensearchid = "932764385";
        SeriesModel Model = new SeriesModel("932764385", "Title", 3, "5");
        Series instance = new Series(Model);
        instance.resetArray();
        instance.CaptureSeries(Model, chosensearchid);
        String expResult = "Series id: 932764385\n"
                + "SeriesName: Title\n"
                + "SeriesAge: 3\n"
                + "SeriesNumberofEpisodes: 5";
        String result = instance.SearchSeries(chosensearchid);

        assertEquals(expResult, result);

    }

    /**
     * Test of UpdateSeries method, of class Series.
     */
    /**
     * Test of DeleteSeries method, of class Series.
     */
    @Test
    public void testDeleteSeries() {
        System.out.println("SearchSeries");
        String chosenseriesid = "932764385";
        String chosensearchid = "932764385";
        SeriesModel Model = new SeriesModel("932764385", "Title", 3, "5");
        Series instance = new Series(Model);
        instance.resetArray();
        instance.CaptureSeries(Model, chosensearchid);
        String expResult = "Series with the series id: 932764385 was deleted";
        String result = instance.DeleteSeries(chosenseriesid);

        assertEquals(expResult, result);

    }

    /**
     * Test of SeriesReport method, of class Series.
     */
    @Test
    public void testSeriesReport() {
        System.out.println("SearchSeries");

        String chosensearchid = "932764385";
        SeriesModel Model = new SeriesModel("932764385", "Title", 3, "5");
        Series instance = new Series(Model);
        instance.resetArray();
        instance.CaptureSeries(Model, chosensearchid);
        String expResult = "Series 1"
                + "\n-------------------------------------\n"
                + "Series id: 932764385"
                + "\nSeries name: Title"
                + "\nSeries age restriction: 3"
                + "\nSeries number of episodes: 5"
                + "\n-------------------------------------\n";
        String result = instance.SeriesReport();

        assertEquals(expResult, result);

    }

}
