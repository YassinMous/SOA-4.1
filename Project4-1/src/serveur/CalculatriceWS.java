package serveur;

import jakarta.jws.WebService;
import jakarta.jws.WebParm;
import jakarta.jws.WebService;

@WebService(name='CalculWS")')
public class CalculatriceWS {
	@WebMethod(operationName = "Somme")
	public double Somme(@WebParam(name = "val1") double a,@WebParam(name = "val2") double b) {
		return a+b;
	}
 /*WebMethod(operationName = "Multiplication")
  * public double multipicatiob(@WebParam(name = "val1") double a,@WebParam(name = "val2") double b){
  * return a*b;}
  * 
  */
}
