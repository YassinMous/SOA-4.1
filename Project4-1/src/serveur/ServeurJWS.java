package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculWS;

public class ServeurJWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "http://localhost:8084/";
		Endpoint.publish(url, new CalculWS());
		System.out.println("Web service deployé sur " +url);
	}

}
