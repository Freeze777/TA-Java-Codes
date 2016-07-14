package collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakeGroups {
	public static void main(String[] args) {
		int begin = 1;
		int end = 160;
		int groupSize = 5, groupID = 0;
		int numGroups = (end / groupSize);
		Set<Integer> visited = new HashSet<Integer>();
		Map<Integer, Set<Integer>> groups = new HashMap<Integer, Set<Integer>>();
		while (groups.size() != numGroups) {
			Set<Integer> group = new HashSet<Integer>();
			while (group.size() != groupSize) {
				int rollNo = ((int) (Math.random() * 1001)) % (end - begin + 1)
						+ begin;
				if (!group.contains(rollNo) && !visited.contains(rollNo)) {
					group.add(rollNo);
					visited.add(rollNo);
				}

			}
			groups.put(++groupID, group);
		}
		for (Integer key : groups.keySet()) {
			System.out.println(key + ":" + groups.get(key));
		}

	}

}
