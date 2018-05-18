package stepDefination;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class httpPostExample2 {


    public static void main(String[] args) throws IOException  {
    	JSONObject json = new JSONObject();
    	json.put("licensePlate", "AHY160");    

    	json.put("AHY160", "");
    	
    	CloseableHttpClient httpClient = HttpClientBuilder.create().build();

    	try {
    	    HttpPost request = new HttpPost("https://api.iunigo.com/products/offerings");
    	    StringEntity params = new StringEntity(json.toString());
    	    
    	    
    	    request.addHeader("content-type", "application/json");
    	    request.setEntity(params);
    	    HttpResponse response = httpClient.execute(request);
    	// handle response here...
    	    
    	    String responseBody = EntityUtils.toString(response.getEntity());
    	    //JSONObject myResponse = new JSONObject(response.toString());
	    	//System.out.println("id- "+myResponse.getString("id"));
    	    /*
    	    JSONArray myResponse = new JSONArray(responseBody);
    	    
    	    System.out.println("id- "+myResponse.getString("id"));
    	    System.out.println("creationDate- "+myResponse.getString("creationDate"));
    	    System.out.println("packages- "+myResponse.getString("packages.id"));
    	    
    	    for (int index = 0;index < myResponse.length(); index++) {
    	    	        JSONObject jsonObject = myResponse.getJSONObject(index);
    	    	        System.out.println("id"+jsonObject.getString("id"));
    	    	        System.out.println("creationDate"+jsonObject.getString("creationDate"));
    	    	        JSONObject activeNodeJsonObject = jsonObject.getJSONObject("packages");
    	    	        System.out.println("Name"+activeNodeJsonObject.getString("name"));
    	    	        System.out.println("X"+activeNodeJsonObject.getString("description"));
    	    	        System.out.println("Y"+activeNodeJsonObject.getString("id"));
    	    	        
    	    	    }
    	    */
    	    
    	    
			    System.out.println("\n");
		    System.out.println(responseBody);
		    
    	} catch (Exception ex) {
    	    // handle exception here
    	} finally {
    	    httpClient.close();
    	}
		
		
	
	}
	
}
