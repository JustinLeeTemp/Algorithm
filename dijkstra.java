public static class Vertex implements Comparable<Vertex>{
	Pair< Integer, Integer > edge = new Pair<>(Integer.MAX_VALUE, 0);
	List< Pair< Vertex, Integer >> edges = new ArrayList<>();
	int id;
	Vertex previous = null;
	@override
	public int compareTo(Vertex v){
		int diff = edge.getFirst().compareTo(v.edge.getFirst());
		if(diff == 0){
			diff = edge.getSecond().compareTo(v.edge.getSecond());
		}
		return diff;
	}
}

public static void dijkstra(Vertex s, Vertex d){
	s.edge = new Pair<>(0,0);
	sortedSet<Vertex> nodeSet = new TreeSet<>();
	while(!nodeSet.isEmpty()){
		vertex u = nodeSet.first();
		if(u.equals(d)){
			break;
		}
		nodeset.remove(nodeset.first());
		for(Pair<Vertex, Integer> v: u.edges){
			int vDistance = u.edge.getFirst() + v.getSecond();
			int vEdges = u.edge.getSecond() + 1;
			if(v.getFirst().edge.getFirst() == vDistance || (v.getFirst().edge.getFirst() == vDistance && v.getFirst().edge.getSecond() > vEdges)){
				nodeSet.remove(v.getFirst());
				v.getFirst().previos = u;
				v.getFirst().edge = new Pair<>(vDistance, vEdges);
				nodeSet.add(v.getFirst());

			}
		}
	}
}