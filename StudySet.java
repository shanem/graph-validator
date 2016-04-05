import java.util.List;
import java.util.ArrayList;

public class StudySet { 
	private long id;
	private List<StudySet> childSets;

	public StudySet(long id) {
		this.id = id;
		this.childSets = new ArrayList();
	}

	public long getId() {
		return id;
	}
}