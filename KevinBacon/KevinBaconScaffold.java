// Dhruv Patel
// Dr. Wagner
// 12/6/2022
// Kevin Bacon Bridges Project


package KevinBacon;
import java.util.HashMap;
import java.util.Map.Entry;
import java.lang.String;
import java.util.List;

import bridges.connect.Bridges;
import bridges.base.SLelement;
import bridges.base.Element;
import bridges.base.Edge;
import bridges.base.GraphAdjListSimple;
import bridges.base.LinkVisualizer;
import bridges.data_src_dependent.ActorMovieIMDB;
import bridges.connect.DataSource;

// Write two sentences about BFS of a graph. Write a sentence or two each about the 
// included classes: Link, LQueue, and Queue. What do they do? 

// The BFS uses a queue data structure for traversal. The queue Create a queue, then insert the first vertex.
// The BFS Create a visited array from scratch and designate the first vertex as visited. Till the line is empty, as it
// Remove the queue's leading vertex that is visited and noted to adds all the vertex unvisited neighbors to the queue. 

// The link class created a linked list class that will be implemented with the lquene class that will initialize and reinitialize the queue.
// in forth with the queue class that returns each section with the Queue class and value. 

// This class carries out the computation of Bacon Number of an actor.
public class KevinBaconScaffold {
  public static void main(String[] args) throws Exception {

    // Initialize BRIDGES with your credentials
    Bridges bridges = new Bridges(3, "Dhruv", "805227888679");

    // set title for visualization
    bridges.setTitle("Bacon Number: IMDB Actor-Movie Data");
    bridges.setDescription("Highlights the shortest path between two actors in a Movie Actor graph.");

    // Using imported class of type string to use an adjacency list based graph
    GraphAdjListSimple<String> gr = new GraphAdjListSimple<>();

    // build the actor-movie graph
    buildActorMovieGraph(gr, bridges);

    //set the data structure handle, and visualize the input graph
    bridges.setDataStructure(gr);
    bridges.visualize();

    getBaconNumber(gr, "Kevin_Bacon_(I)", "Cate_Blanchett");
    bridges.setDataStructure(gr);
    bridges.visualize();
  }

  public static void buildActorMovieGraph (GraphAdjListSimple<String> gr,
      Bridges bridges) {

    // get the actor movie IMDB data through the BRIDGES API
    try {

      // Get a List of ActorMovieIMDB objects from Bridges
      DataSource ds = bridges.getDataSource();
      List<ActorMovieIMDB> actor_list = ds.getActorMovieIMDBData(1813);

      String actor, movie;
      for (int k = 0; k < actor_list.size(); k++) {

        // get the actor and movie names
        actor = actor_list.get(k).getActor();
        movie = actor_list.get(k).getMovie();

        // our graph needs to have a unique set of actors and movies;
        // so create the actor and movie vertices only if they dont already
        // exist; use an STL map to check for that

        // first get the graph's vertex list
        HashMap<String, Element<String>> vertices = gr.getVertices();

        // add actor if it does not exist
        if (!vertices.containsKey(actor))
          gr.addVertex(actor, actor);

        // add movie if it does not exist
        if (!vertices.containsKey(movie))
          gr.addVertex(movie, movie);

        // create the edge -- assumes no duplicate edges
        // undirected graph, edges go both ways
        gr.addEdge(actor, movie);
        gr.addEdge(movie, actor);

        // TO DO : Highlight "Cate_Blanchett" node and the movie nodes
        // she is connected to  in "orange" and do the same for
        //  "Kevin_Bacon_(I)" in "green"
        //  To set node attributes, you can do something like
        //  gr.getVisualizer(key-val).setColor(color-name)
        //  To set link attributes, you can do something like
        //  gr.getLinkVisualizer(src-key-val, dest-key-val).setColor(color-name)
        //  similarly for  other attributes (see the docs  on LinkVisualizer
        //  and ElementVisualizer classes)
        // specify colors by their names, "red", for example

        // Creates two actor and movie nodes visilization set to ones color
        if(actor.equals("Cate_Blanchett")) {
        	LinkVisualizer link = gr.getLinkVisualizer(actor, movie);
        	gr.getLinkVisualizer(actor, movie).setColor("orange");
        	gr.getVisualizer(actor).setColor("orange");
        	gr.getVisualizer(movie).setColor("orange");
        }
        if(actor.equals("Kevin_Bacon_(I)")) {
        	LinkVisualizer link = gr.getLinkVisualizer(actor, movie);
        	gr.getLinkVisualizer(actor, movie).setColor("green");
        	gr.getVisualizer(actor).setColor("green");
        	gr.getVisualizer(movie).setColor("green");
        }
      }
    }
    catch (Exception exc) {
    }
  }
  
  // Computes the Bacon Number of a an actor (#links that takes you from the
  // source actor to the destination actor.
  public static int getBaconNumber (
    GraphAdjListSimple<String> gr,  // input graph
    String src_actor,         // source actor
    String dest_actor) {      // destination actor
	  
     //Create hash maps to track visited nodes, parents node
	  HashMap<String, String> visited = new HashMap<>();
	  HashMap<String, String> parent = new HashMap<>();
	  HashMap<String, Integer> distance = new HashMap<>();

	  //initialize Hash Map
	  for(Entry<String, Element<String>> v : gr.getVertices().entrySet()) {
		  visited.put(v.getKey(), "unvisited");
		  parent.put(v.getKey(), "none");
		  distance.put(v.getKey(), 0);
	  }

	  //try to find the path back to the source actor from destination
	  try {

		  //use queue
		  LQueue<String> lq = new LQueue<String>();
		  
		  //add the source actor to the queue
		  lq.enqueue(src_actor);
		  visited.put(src_actor, "visited");
		  distance.put(src_actor, 0);
		  parent.put(src_actor, "none");
		  
		//Perform a BFS traversal of the graph from src_actor. You will
    // to maintain distance information (basically the number of links from
    // the source actor until the destination node is reached.  Keep
    // parent information as the traversal progresses; once the destination
    // node is found, you will use the parent pointers to follow them to
    // the source node (source node's parent is null)
		  while(lq.length() > 0) {
			  String vertex = (String) lq.dequeue();

			  //get adjacency list of vertices
			  SLelement<Edge<String, String>> sl_list = gr.getAdjacencyList(vertex);
			  for(SLelement<Edge<String, String>> sle = sl_list; sle != null;
					  sle=sle.getNext()) {

				  //get destination vertex - node that is connected
				  //by the particular edge
				  String w = sle.getValue().getTo();
				  


				  // if unvisited, mark it as visited and add to queue,
          // increment distance and point point parent back to vertex name
          // w is marked as "unvisited"
				  if(visited.get(w).equals("unvisited")) {

            //put w as "visited" in mark
					  visited.put(w, "visited");

            //add w to lq
					  lq.enqueue(w);

            //// update the distance and parent values
					  distance.put(w, distance.get(vertex) + 1);
					  parent.put(w, vertex);
					
          
            //if w is equal to the destination actor, return
            //// highlight the actor and the path to the source
					  //use parent nodes to retrace
					  if(w.equals(dest_actor)) {
						  String p = dest_actor;
              
              // while p does not equal none
						  while (!p.equals("none")) {

							  //color the links/nodes in the path
                //set the color of p to red
							  gr.getVisualizer(p).setColor("red");

                // set the size to 50
							  gr.getVisualizer(p).setSize(50);

                // set the Opacity to 1.0f
							  gr.getVisualizer(p).setOpacity(1.0f);
							  
							  //let the String par equal the parent of p
							  String par = parent.get(p);

                //as long as par is not "none" continue.
							  if(!par.equals("none")) {

                  //set the color of the link from p to par red
								  gr.getLinkVisualizer(p, par).setColor("red");

                  //set the thickness of the link from p to par to 10.
								  gr.getLinkVisualizer(p, par).setThickness(10.0);
							  }
							  p = par;
						  }

						  //return the Bacon number of this pare of actors
						  return distance.get(dest_actor);
					  }
				  }
			  }
		  }
	  }


    // Highlight all edges and vertices on the shortest path
    // between src_actor and dest_actor; Make the nodes in the path bigger,
    // and the links thicker so that it stands out.

	 catch(Exception exc) {
		 
	 }
    return -1;
  }
} // class BaconNumber