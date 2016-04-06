import java.util.*;

public class GraphTests {

	public void runTests() {
		System.out.println("Running tests...");
		
		System.out.println("testBuildGraph...");
		testBuildGraph();
		System.out.println("Passed!");
		
		System.out.println("testHasCycle...");
		testHasCycle();
		System.out.println("Passed!");

		System.out.println("testIsConnected...");
		testIsConnected();
		System.out.println("Passed!");

		System.out.println("testIsValidTree...");
		testIsValidTree();
		System.out.println("Passed!");

		System.out.println("testIsValidTree...");
		testFindRoot();
		System.out.println("Passed!");

		System.out.println("All tests passed!");
	}

	/** Build graphs and spot check that at least one location has the expected set of children */
	private void testBuildGraph() {
		// All test graphs have a node 8 with children [9, 10]
		Set<Node> expectedChildren = new HashSet<>();
		expectedChildren.add(new Node(9));
		expectedChildren.add(new Node(10));

		StudySetGraph disconnectedGraphWithoutCycle = new StudySetGraph(Edges.disconnectedGraphWithoutCycle);
		Node node = disconnectedGraphWithoutCycle.getNode(8);
		assert node != null;
		assert node.getChildren().equals(expectedChildren);
		
		StudySetGraph disconnectedGraphWithCycle = new StudySetGraph(Edges.disconnectedGraphWithCycle);
		node = disconnectedGraphWithoutCycle.getNode(8);
		assert node != null;
		assert node.getChildren().equals(expectedChildren);
		
		StudySetGraph connectedGraphWithCycle = new StudySetGraph(Edges.connectedGraphWithCycle);
		node = disconnectedGraphWithoutCycle.getNode(8);
		assert node != null;
		assert node.getChildren().equals(expectedChildren);

		StudySetGraph connectedGraphWithoutCycle = new StudySetGraph(Edges.connectedGraphWithoutCycle);
		node = disconnectedGraphWithoutCycle.getNode(8);
		assert node != null;
		assert node.getChildren().equals(expectedChildren);
	}

	private void testHasCycle() {
		assert !(new StudySetGraph(Edges.disconnectedGraphWithoutCycle).hasCycle());
		assert new StudySetGraph(Edges.disconnectedGraphWithCycle).hasCycle();
		assert new StudySetGraph(Edges.connectedGraphWithCycle).hasCycle();
		assert !(new StudySetGraph(Edges.connectedGraphWithoutCycle).hasCycle());
	}

	private void testIsConnected() {
		assert !(new StudySetGraph(Edges.disconnectedGraphWithoutCycle).isConnected());
		assert !(new StudySetGraph(Edges.disconnectedGraphWithCycle).isConnected());
		assert new StudySetGraph(Edges.connectedGraphWithCycle).isConnected();
		assert new StudySetGraph(Edges.connectedGraphWithoutCycle).isConnected();
	}

	private void testIsValidTree() {
		assert !(new StudySetGraph(Edges.disconnectedGraphWithoutCycle).isValidTree());
		assert !(new StudySetGraph(Edges.disconnectedGraphWithCycle).isValidTree());
		assert !(new StudySetGraph(Edges.connectedGraphWithCycle).isValidTree());
		assert new StudySetGraph(Edges.connectedGraphWithoutCycle).isValidTree();
	}

	private void testFindRoot() {
		assert new StudySetGraph(Edges.disconnectedGraphWithoutCycle).getTreeRoot() == null;
		assert new StudySetGraph(Edges.disconnectedGraphWithCycle).getTreeRoot() == null;
		assert new StudySetGraph(Edges.connectedGraphWithCycle).getTreeRoot() == null;

		StudySetGraph tree = new StudySetGraph(Edges.connectedGraphWithoutCycle);
		Node root = tree.getTreeRoot();
		assert root != null;
		assert root.getId() == 1;
	}

	public static void main(String[] args) throws Exception {
		new GraphTests().runTests();
	}
}