// 4. Clone Graph  

// Given a reference of a node in a connected undirected graph.

// Return a deep copy (clone) of the graph.

// Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.

// class Node {
//     public int val;
//     public List<Node> neighbors;
// }

// Solution

class problem4 {
    public Node cloneGraph(Node node) {
        if(node==null)
        {
           return null;
        }
        //hashmap to keep track of all cloned nodes
        Map<Node , Node>map= new HashMap<>();
   
        //queue to perform a bfs
        Queue<Node> queue = new LinkedList<>();
   
   
        queue.add(node);
        map.put(node,new Node(node.val));
   
        while(!queue.isEmpty())
        {
           Node curr = queue.poll();
           Node currClone = map.get(curr);
   
         for(Node neighbor:curr.neighbors)
         {
           if(!map.containsKey(neighbor))
           {
               //clone the neighbor node and add it to map
   
               map.put(neighbor,new Node(neighbor.val));
               queue.add(neighbor);
           }
   
           currClone.neighbors.add(map.get(neighbor));
         }
        }
   
   return map.get(node);
           
       }
}