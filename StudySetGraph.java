import java.util.*;

public class StudySetGraph {
	
	protected Map<Long, Node> allNodes;

	public StudySetGraph(List<Edge> edges) {
		allNodes = new HashMap<>();
		// TODO: Build graph
	}

	public Node getNode(long id) {
		return allNodes.get(id);
	}

	public boolean isConnected() {
		// TODO: Return true if graph is connected
		return false;
	}

	public boolean hasCycle() {
		// TODO: Return true if graph has a cycle
		return false;
	}

	public boolean isValidTree() {
		// TODO: Return true if graph is a valid tree
		return false;
	}

	public Node getTreeRoot() {
		// TODO: Return root of tree. (Behavior undefined if graph is not a valid tree)
		return null;
	}
}