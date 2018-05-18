package stepDefination;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PostExampleOffering {


    public static void main(String[] args) throws ClientProtocolException, IOException  {

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
    	    System.out.println("\n");
		    System.out.println(responseBody);
		    
		 
		    JSONObject myResponse = new JSONObject(responseBody );
		    
		    for (int index = 0;index < myResponse.length(); index++) {
		    System.out.println("\n");
		    System.out.println("\n");
		    System.out.println("result after Reading JSON Response");
		    System.out.println("\n");
		    System.out.println("id- "+myResponse.getString("id"));
		    System.out.println("creationDate- "+myResponse.getString("creationDate"));

		    //Show packages
		    JSONArray packages = myResponse.getJSONArray ("packages");
		    		    

		    for (int i = 0; i < packages.length(); i++) {
		      
		      JSONObject item = packages.getJSONObject(i); 

		      String id = item.getString("id");
		      String name = item.getString("name");

		      System.out.println(name);
		      
		      System.out.println(id);

		    	}
		     
		    JSONArray additionalCoverages = myResponse.getJSONArray ("additionalCoverages");
		    
		    for (int i = 0; i < additionalCoverages	.length(); i++) {
			      
			      JSONObject item = additionalCoverages.getJSONObject(i); 

			      String id = item.getString("id");
			      String name = item.getString("name");

			      System.out.println(name);
			      
			      System.out.println(id);

			    	}
		    
		    
		    }
	        	    
		    
	    
    	} catch (Exception ex) {
    	    // handle exception here
    		
    	}  
    	
	}
	
}
