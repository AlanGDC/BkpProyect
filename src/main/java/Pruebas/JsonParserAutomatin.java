package Pruebas;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserAutomatin {
	

	public static void main(String[] args) {

		try {

			ObjectMapper mapper = new ObjectMapper();

			JsonNode root = mapper.readTree(new File("/home/alaniunigo/eclipse-workspace/RestAutomation/test.json"));

				
			JsonNode runNode 	= root.path("run");
					
			JsonNode executionsNode 	= runNode.path("executions");

			if (executionsNode.isArray()) {
				// If this node an Arrray?
			}

			for (JsonNode node : executionsNode) {

			JsonNode assertionsNode = node.path("assertions");


			for (JsonNode node2 : assertionsNode) {

			
					String assertion = node2.path("assertion").asText();
					System.out.println(assertion);
			

				}

			}

			
			
			
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
