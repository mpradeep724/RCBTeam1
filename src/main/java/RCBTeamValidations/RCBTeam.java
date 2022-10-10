package RCBTeamValidations;




import com.fasterxml.jackson.core.JsonProcessingException;

import PojoClasses.RCBTeamPayload;
import Utilities.BaseClass;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;



public class RCBTeam extends BaseClass {
	
	int size;
	JsonPath js1;
	RCBTeamPayload payload;
	int foreignplayers ;  
	int keeper ;
	String foreignplayercountry;
	String role;
   
	
	
	public static void main(String[] args)  {
	
	

	}

	 public void defMethod() throws JsonProcessingException {
	    	
		 
	    	
	    	size =BaseClass.playersize();

	    	
	    	payload =new RCBTeamPayload();
	    		
	    	js1 = BaseClass.stringtojsonpath(RCBTeamPayload.RCBTeamPload());
	   
	    }
	
	public void VerifyNoOfForeignPlayersandWicketKeeprs() throws JsonProcessingException
	{
		
		
	
		for(int i=0;i<size;i++)
		{
			foreignplayercountry =js1.getString("player["+i+"].country");
			
			 if(!foreignplayercountry.equals("India"))
			 {
				 foreignplayers =foreignplayers+1;
			 }
		}
	
	
	for(int i=0;i<size;i++)
	{
		 role =js1.getString("player["+i+"].role");
		
		if(role.equals("Wicket-keeper"))
		{
			keeper=keeper+1;
		}
	}
	
	}


	public void ValidateNoOfForeignPlayersandWicketKeeprs(int totalforeignplayers, int countofwicketkeepers) throws JsonProcessingException
	{

	Assert.assertEquals(totalforeignplayers,foreignplayers);

	Assert.assertTrue(keeper>=countofwicketkeepers);

	}






}
