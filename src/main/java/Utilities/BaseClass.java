package Utilities;

import javax.swing.JFrame;

import com.fasterxml.jackson.core.JsonProcessingException;


import PojoClasses.RCBTeamPayload;
import io.restassured.path.json.JsonPath;

public class BaseClass {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static JsonPath stringtojsonpath(String response)
{
	
	
	JsonPath js1 = new JsonPath(response);
	
	return js1;
	
}
	
	public static JFrame popupmessages() 
	{
		JFrame jFrame =new JFrame();
		return jFrame;
	}

	public static int playersize() throws JsonProcessingException
	{
		String p1 =RCBTeamPayload.RCBTeamPload();
		
		JsonPath js1 =BaseClass.stringtojsonpath(p1);
		
		int size =js1.getInt("player.size()");
		return size;
	}
	
	
	
	
	
}
