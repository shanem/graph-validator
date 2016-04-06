import java.util.*;

public class GraphTests {

	public void runTests() {
		System.out.println("Running tests...");
		testBuildGraph();
		testHasCycle();
		testIsConnected();
		testFindRoot();
		System.out.println("Tests passed!");
	}

	/** Build graphs and spot check that at least one location has the expected set of children */
	private void testBuildGraph() {
		// All test graphs have a node 8 with children [9, 10]
		Set<Node> expectedChildren = new HashSet<>();
		expectedChildren.add(new Node(9));
		expectedChildren.add(new Node(10));

		StudySetGraph disconnectedGraphWithoutCycle = new StudySetGraph(Edges.disconnectedGraphWithoutCycle);
		assert disconnectedGraphWithoutCycle.getNode(8).getChildren().equals(expectedChildren);
		
		StudySetGraph disconnectedGraphWithCycle = new StudySetGraph(Edges.disconnectedGraphWithCycle);
		assert disconnectedGraphWithCycle.getNode(8).getChildren().equals(expectedChildren);
		
		StudySetGraph connectedGraphWithCycle = new StudySetGraph(Edges.connectedGraphWithCycle);
		assert connectedGraphWithCycle.getNode(8).getChildren().equals(expectedChildren);

		StudySetGraph connectedGraphWithoutCycle = new StudySetGraph(Edges.connectedGraphWithoutCycle);
		assert connectedGraphWithoutCycle.getNode(8).getChildren().equals(expectedChildren);
	}

	private void testIsConnected() {
		assert !(new StudySetGraph(Edges.disconnectedGraphWithoutCycle).isConnected());
		assert !(new StudySetGraph(Edges.disconnectedGraphWithCycle).isConnected());
		assert new StudySetGraph(Edges.connectedGraphWithCycle).isConnected();
		assert new StudySetGraph(Edges.connectedGraphWithoutCycle).isConnected();
	}

	private void testHasCycle() {
		assert !(new StudySetGraph(Edges.disconnectedGraphWithoutCycle).hasCycle());
		assert new StudySetGraph(Edges.disconnectedGraphWithCycle).hasCycle();
		assert new StudySetGraph(Edges.connectedGraphWithCycle).hasCycle();
		assert !(new StudySetGraph(Edges.connectedGraphWithoutCycle).hasCycle());
	}

	private void testIsValidTree() {
		assert !(new StudySetGraph(Edges.disconnectedGraphWithoutCycle).isValidTree());
		assert !(new StudySetGraph(Edges.disconnectedGraphWithCycle).isValidTree());
		assert !(new StudySetGraph(Edges.connectedGraphWithCycle).isValidTree());
		assert new StudySetGraph(Edges.connectedGraphWithoutCycle).isValidTree();
	}

	private void testFindRoot() {
		StudySetGraph tree = new StudySetGraph(Edges.connectedGraphWithoutCycle);
		Node root = tree.getTreeRoot();
		assert root != null;
		assert root.getId() == 1;
	}

	public static void main(String[] args) throws Exception {
		new GraphTests().runTests();
	}
}