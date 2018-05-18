package stepDefination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class newmanRunJava {


    public static void main(String[] args) throws IOException, InterruptedException  {
        // Run command and wait till it's done

    	//String[] cmdScript = new String[]{"/bin/bash", "path/to/myScript.sh"}; 
    	//Process procScript = Runtime.getRuntime().exec(cmdScript);
    	
    	//Process p = Runtime.getRuntime().exec("ping -n 3 www.google.de");
    	Process p = Runtime.getRuntime().exec("ipconfig");
         p.waitFor();

        // Grab output and print to display
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        
    }
	
}
