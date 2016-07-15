package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakeGroups {
	public static void main(String[] args) {
		Map<Integer, Set<Integer>> groups = makeGroups(160);
		for (Integer key : groups.keySet()) {
			System.out.println(key + ":" + groups.get(key));
		}

	}

	private static Map<Integer, Set<Integer>> makeGroups(int batchSize) {
		int startRollNum = 1;
		int endRollNo = batchSize;
		int groupSize = 4, groupID = 0;
		//int numGroups = (batchSize / groupSize);
		
		Set<Integer> visited = new HashSet<Integer>();// why??
		Map<Integer, Set<Integer>> groups = new HashMap<Integer, Set<Integer>>(); //The groups map..!!
		
		while (visited.size() != batchSize) {
			
			Set<Integer> group = new HashSet<Integer>();//why??
			
			while (group.size() != groupSize) {
				int rollNo = ((int) (Math.random() * 1001)) % (endRollNo - startRollNum + 1)
						+ startRollNum;// generates random number between [begin,end]
				
				if (!group.contains(rollNo) && !visited.contains(rollNo)) {
					group.add(rollNo);// why??
					visited.add(rollNo);// why??
				}

			}
			
			groups.put(++groupID, group);
		}
		
		return groups;

	}

}
