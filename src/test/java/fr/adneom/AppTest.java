package fr.adneom;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
	public void testListe(){
		List<Integer> listtopartition = new ArrayList<>();
		for (int i = 1; i <= 8; i++) {
			listtopartition.add(new Integer(i));
		}
		 List<List<Integer>> expected = new ArrayList<List<Integer>> ();
		 expected.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2,(Integer)3)));
         expected.add(new ArrayList<Integer>(Arrays.asList((Integer)4,(Integer)5,(Integer)6)));
         expected.add(new ArrayList<Integer>(Arrays.asList((Integer)7,(Integer)8)));
         
		 assertEquals(expected, PartitionList.partitionList(listtopartition, 3));

	}
    
}
