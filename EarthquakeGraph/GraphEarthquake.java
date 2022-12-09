package EarthquakeGraph;


import bridges.base.*;
import bridges.connect.Bridges;
import bridges.data_src_dependent.EarthquakeUSGS;

import java.util.Comparator;
import java.util.List;

public class GraphEarthquake {

  public static double calcDistance(double la1, double lo1, double la2, double lo2) {
    final int R = 6371; // Radius of the earth in km
    // Haversine formula to calculate a value between 0 and 1 between 2 points on a sphere, 1 being the
    // opposite side of the sphere
    double laDistance = Math.toRadians(la2 - la1);
    double loDistance = Math.toRadians(lo2 - lo1);
    double a = Math.sin(laDistance / 2) * Math.sin(laDistance / 2)
               + Math.cos(Math.toRadians(la1)) * Math.cos(Math.toRadians(la2))
               * Math.sin(loDistance / 2) * Math.sin(loDistance / 2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

    double distance = R * c;    //convert to km
    return distance;
  }

  public static void main(String[] args) throws Exception {
    
    Bridges bridges = new Bridges(4, "Dhruv", "805227888679");

    GraphAdjListSimple<String> graph = new GraphAdjListSimple<>();

    // grabs most recent 10000 earthquakes
    List<EarthquakeUSGS> eqList = bridges.getDataSource().getEarthquakeUSGSData(10000);

    // sorts list by magnitude in descending order
    eqList.sort(Comparator.comparingDouble(EarthquakeUSGS::getMagnitude).reversed());
  //TODO: for each earthquake in eqlist
    for (List<EarthquakeUSGS> eqList) {
      //TODO: get the size of the adjacency list for the graph and check if it's greater than 99)//keeping only the 100 strongest earthquakes
      if (
        break;

      graph.addVertex(eq.getTitle(), eq.getTitle());

      graph.getVertex(eq.getTitle()).setLabel (eq.getTitle() + "\n" + eq.getTime());
      ElementVisualizer vis = graph.getVisualizer(eq.getTitle());

      //TODO: set the location of vis to the longitude and latitude of eq
      //TODO: set the size of vis to the magnitude of eq
      
      //TODO: explain in two sentences what red = red > 0 ? red : 0; means
      //in other words, what is the ternary operator?
      int red = (int) ((eq.getLongit() / 180.0) * 255);
      red = red > 0 ? red : 0;

      int blue = (int) ((eq.getLongit() / 180.0) * 255);
      blue = blue < 0 ? blue * -1 : 0;

      int green = (int) ((eq.getLatit() / 90.0) * 255);
      green = green < 0 ? green * -1 : green;

      vis.setColor(red, green, blue, 1.0f);           // set color relative to earthquakes lat long position
    }


    bridges.setCoordSystemType("equirectangular");
    bridges.setDataStructure(graph);
    bridges.setMapOverlay(true);
    bridges.setTitle("Earthquake Map");
    bridges.visualize();

    /* Compare the distances between all vertexes in the graph, drawing an edge
     * if they are within 500km. A method is provided to give a rough
     * estimate between 2 lat,long points.
     *
     * example usage: calcDistance(eq1.getLatit(), eq1.getLongit(),
     *                eq2.getLatit(), eq2.getLongit());
     * which returns a double representing the distance of two points in km
     */
    for (//TODO: i from 0 to 99) {
      EarthquakeUSGS eq = eqList.get(i);

      for (int j = 0; j < 99; ++j) {
        if (i == j)
          continue;

        EarthquakeUSGS ua = eqList.get(j);
        //TODO: calculate the distance between eq's lat and long and ua's lat and long
        

        if (//TODO: distance is less than 500) {
          //TODO: add edge to the graph from the eq title to ua title
          LinkVisualizer link = graph.getLinkVisualizer(eq.getTitle(), ua.getTitle());
          if (link != null) {
            link.setLabel(String.format("%.2f KM", distance));
          }
        }
      }
    }

    bridges.visualize();

    for (int i = 0; i < 99; ++i) {
      EarthquakeUSGS eq = eqList.get(i);
      ElementVisualizer vis = graph.getVisualizer(eq.getTitle());

      vis.setLocation(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);  // resets vertices' locations
      vis.setSize(eq.getMagnitude() * 5);  // increases size of vertex
    }

    bridges.setMapOverlay(false);
    bridges.visualize();
  }
}
