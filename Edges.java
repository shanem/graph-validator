import java.util.Arrays;
import java.util.List;

public class Edges {

	public static List<Edge> disconnectedGraphWithoutCycle = Arrays.asList(
			new Edge(2, 1),
			new Edge(3, 1),
			new Edge(4, 2),
			new Edge(5, 2),
			new Edge(6, 3),
			new Edge(7, 3),
			new Edge(9, 8),
			new Edge(10, 8)
		);

	public static List<Edge> disconnectedGraphWithCycle = Arrays.asList(
			new Edge(2, 1),
			new Edge(3, 1),
			new Edge(4, 2),
			new Edge(5, 2),
			new Edge(6, 3),
			new Edge(7, 3),
			new Edge(9, 8),
			new Edge(10, 8),
			new Edge(8, 10)
		);

	public static List<Edge> connectedGraphWithCycle = Arrays.asList(
			new Edge(2, 1),
			new Edge(3, 1),
			new Edge(3, 10),
			new Edge(4, 2),
			new Edge(5, 2),
			new Edge(6, 3),
			new Edge(7, 3),
			new Edge(8, 6),
			new Edge(9, 8),
			new Edge(10, 8)
		);


	public static List<Edge> connectedGraphWithoutCycle = Arrays.asList(
			new Edge(2, 1),
			new Edge(3, 1),
			new Edge(4, 2),
			new Edge(5, 2),
			new Edge(6, 3),
			new Edge(7, 3),
			new Edge(8, 6),
			new Edge(9, 8),
			new Edge(10, 8)
		);
}