package stepDefination;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class httpPostExample {


    public static void main(String[] args)  {
		HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead 

		try {

		    HttpPost request = new HttpPost("https://api.iunigo.com/products/offerings");
		    StringEntity params =new StringEntity("details={\"licensePlate\":\"AHY160\",\"document\":\"\"} ");
		    request.addHeader("content-type", "application/json");
		    request.setEntity(params);
		    HttpResponse response = httpClient.execute(request);
			
		    //handle response here...

		    String responseBody = EntityUtils.toString(response.getEntity());


		    System.out.println("\n");
		    System.out.println(responseBody);
		    
		    
		}catch (Exception ex) {

		    //handle exception here

		} finally {
		    //Deprecated
		    //httpClient.getConnectionManager().shutdown(); 
		}
		
		
	
	}
	
}
