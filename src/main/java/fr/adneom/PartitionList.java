package fr.adneom;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {
	public static List<List<Integer>> partitionList(List<Integer> listToPartition, Integer size) {

		List<List<Integer>> ListToReturn = new ArrayList<List<Integer>>();
		List<Integer> liste = new ArrayList<Integer>();

		int i = 0;
		int j = 0;
		while (i < listToPartition.size()) {
			liste.clear();
			for (j = 0; j < size; j++) {
				if ((j + i) < listToPartition.size())
					liste.add(listToPartition.get(i + j));
			}
			
			ListToReturn.add(new ArrayList<Integer>(liste));
			i += size;
		}

		return ListToReturn;
	}

}
