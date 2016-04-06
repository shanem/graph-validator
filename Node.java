import java.util.*;

public class Node { 
	private long id;
	private Set<Node> children;

	public Node(long id) {
		this.id = id;
		this.children = new HashSet<>();
	}

	public long getId() {
		return id;
	}

	public void addChild(Node studySet) {
		children.add(studySet);
	}

	public Set<Node> getChildren() {
		return children;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Node)) {
			return false;
		}
		return ((Node) obj).getId() == id;
	}

	@Override
	public int hashCode() {
		return (int) id;
	}
}