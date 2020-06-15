package fr.adneom;

import java.util.ArrayList;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> listtopartition = new ArrayList<Integer>();
		listtopartition.add(new Integer(1));
		listtopartition.add(new Integer(2));
		listtopartition.add(new Integer(3));
		listtopartition.add(new Integer(4));
		
		listtopartition.add(new Integer(5));
		listtopartition.add(new Integer(6));
		listtopartition.add(new Integer(7));
		listtopartition.add(new Integer(8));
		
		listtopartition.add(new Integer(9));
		listtopartition.add(new Integer(10));
		listtopartition.add(new Integer(11));
	
		System.out.println("Partition list ===> " +PartitionList.partitionList(listtopartition, 5));
    }
}
