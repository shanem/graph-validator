import java.util.List;

public class GraphTests {

	public void runTests() {
		System.out.println("Running tests...");
		testBuildGraph();
		testHasCycle();
		testIsConnected();
		testFindRoot();
		System.out.println("Tests passed!");
	}

	private void testBuildGraph() {
		StudySetGraph disconnectedGraphWithoutCycle = new StudySetGraph(Edges.disconnectedGraphWithoutCycle);
		StudySetGraph disconnectedGraphWithCycle = new StudySetGraph(Edges.disconnectedGraphWithCycle);
		StudySetGraph connectedGraphWithCycle = new StudySetGraph(Edges.connectedGraphWithCycle);
		StudySetGraph connectedGraphWithoutCycle = new StudySetGraph(Edges.connectedGraphWithoutCycle);
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
		StudySet root = tree.getTreeRoot();
		assert root != null;
		assert root.getId() == 1;
	}

	public static void main(String[] args) throws Exception {
		new GraphTests().runTests();
	}
}