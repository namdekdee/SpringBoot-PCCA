package th.co.pt.pcca.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloworldRest {
	
	@GetMapping("/test/{val}")
	public Map<String,String> test(@PathVariable(required=false) String val){
		 Map<String,String> m = new HashMap();
		 m.put("message", "Hello "+val);
		return m ;
	}

}
