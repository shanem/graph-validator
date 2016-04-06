import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class StudySet { 
	private long id;
	private Set<StudySet> childSets;

	public StudySet(long id) {
		this.id = id;
		this.childSets = new HashSet<>();
	}

	public long getId() {
		return id;
	}

	public void addChild(StudySet studySet) {
		childSets.add(studySet);
	}

	public Set<StudySet> getChildren() {
		return childSets;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof StudySet)) {
			return false;
		}
		return ((StudySet) obj).getId() == id;
	}

	@Override
	public int hashCode() {
		return (int) id;
	}
}