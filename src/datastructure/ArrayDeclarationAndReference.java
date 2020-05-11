package datastructure;


import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDeclarationAndReference {

	public static void main(String[] args) {
		//Declare Int[]
		
		int[] a = new int[2];
		int[] b = {};
		int[] c = {1,2,3,4,5};
		
		int d[] = {4,3,2,1};
		
		//Declare String[]
		
		String[] sa = new String[10];
		String[] sb = {"hello", "world"};
		
		String[] sc = {};
		String sd[] = {"world", " hello"};
		
		//List of Integer object
		List<Integer> la = new ArrayList<Integer>(10);
		
		System.out.println(la.size());
		List<Integer> lb = new ArrayList<>();
		List<Integer> lc = new ArrayList<>(new Integer(120));
		
		
		//List of String object
		String[] cd = { "hello", "world"};
		List<String> sla = new ArrayList<>(Arrays.asList(cd));
		
		List<String> slb = new ArrayList<>(Arrays.asList(new String("world")));
		
		List<String> slc = new ArrayList<>(Arrays.asList( "hello", "world"));
		
		
		// Referencing the arrays
		List<Integer> rla = la;
		List<String> srla = sla;
		
		//Convert int[] into List<Integer>
		
		List<Integer> cla = Arrays.stream(c).boxed().collect(Collectors.toList());
		
		//Convert List<Integer> into int[] 
		int[] ca = la.stream().mapToInt(x -> x).toArray();
		
		//Convert String[] into List<String>
		List<String> csla = Arrays.stream(sb).collect(Collectors.toList());
		
		//Convert List<String> into String[]
		
		String[] ncsa = csla.stream().toArray(String[]:: new);
		//or
		String[] csa = new String[csla.size()] ;
		csa = csla.toArray(csa);
		
		//Common Methods.
		//add(T element)
		//get(int index)
		//set(int index, T element)
		//remove(int index);
		//size()
		
		
		

	}

}
