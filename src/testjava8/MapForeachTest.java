package testjava8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapForeachTest {

	public static void main(String[] args) {
	
	Map<String,Map<String,String>> outerMap = new HashMap<>();
	
	Map<String,String> innerMap1 =  new HashMap<>();
	innerMap1.put("A", "100");
	
	Map<String,String> innerMap2 =  new HashMap<>();
	innerMap2.put("B", "200");
	
	Map<String,String> innerMap3 =  new HashMap<>();
	innerMap3.put("C", "300");
	Map<String,String> innerMap4 =  new HashMap<>();
	innerMap4.put("D", "400");
	
	outerMap.put("One", innerMap1);
	outerMap.put("Two", innerMap2);
	outerMap.put("Three", innerMap3);
	outerMap.put("Four", innerMap4);
	
	
//	outerMap.forEach((k,v) ->System.out.println("key :"+k+" v :"+v));

/*	outerMap.forEach((k,v) ->{
		v.forEach((k1,v1) -> {
			if(k1 != null) {
				
				System.out.println("k1 :"+k1+" v1 :"+v1);
			}
		});
	});
	*/
	
	//String result = outerMap.entrySet().stream().filter(key -> "two".equals(key.getKey())).map(innerloop -> innerloop.getValue().entrySet().stream().forEachOrdered((k,y)-> " "+k)).collect(Collectors.joining());
	
     String res= outerMap.entrySet().stream().filter(outMap -> "Two".equals(outMap.getKey()) || "One".equals(outMap.getKey())).map(outMap -> { 
    	 Map<String,String> mp = outMap.getValue();
    	 return mp.entrySet().stream().map(entry -> entry.getKey()+" :"+entry.getValue()).collect(Collectors.joining(", "));
          }).collect(Collectors.joining());
	
   System.out.println(" >>>>>>>>>> "+res);	
	
	}

}
