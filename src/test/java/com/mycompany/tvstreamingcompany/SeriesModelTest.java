/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tvstreamingcompany;

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
public class SeriesModelTest {

    public SeriesModelTest() {
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
     * Test of getSeriesID method, of class SeriesModel.
     */
    @Test
    public void testGetSeriesID() {
        System.out.println("getSeriesID");
        SeriesModel instance = new SeriesModel("817234376", "Title", 5, "5");
        String expResult = "817234376";
        String result = instance.getSeriesID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSeriesID method, of class SeriesModel.
     */
    /**
     * Test of getSeriesName method, of class SeriesModel.
     */
    @Test
    public void testGetSeriesName() {
        System.out.println("getSeriesName");
        SeriesModel instance = new SeriesModel("817234376", "Title", 5, "5");
        String expResult = "Title";
        String result = instance.getSeriesName();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSeriesName method, of class SeriesModel.
     */
    /**
     * Test of getSeriesAge method, of class SeriesModel.
     */
    @Test
    public void testGetSeriesAge() {
        System.out.println("getSeriesAge");
        SeriesModel instance = new SeriesModel("817234376", "Title", 5, "5");
        int expResult = 5;
        int result = instance.getSeriesAge();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSeriesAge method, of class SeriesModel.
     */
    /**
     * Test of getSeriesNumberofEpisodes method, of class SeriesModel.
     */
    @Test
    public void testGetSeriesNumberofEpisodes() {
        System.out.println("getSeriesNumberofEpisodes");
        SeriesModel instance = new SeriesModel("817234376", "Title", 5, "5");
        String expResult = "5";
        String result = instance.getSeriesNumberofEpisodes();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSeriesNumberofEpisodes method, of class SeriesModel.
     */
    /**
     * Test of toString method, of class SeriesModel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SeriesModel instance = new SeriesModel("817234376", "Title", 5, "5");
        String expResult = "Series id: " + "817234376" + "\nSeriesName: " + "Title" + "\nSeriesAge: " + 5 + "\nSeriesNumberofEpisodes: " + "5";
        String result = instance.toString();
        assertEquals(expResult, result);

    }

}
