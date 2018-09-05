package RestClients;

public class restClient {
	public static void get(String URL) throws ClientProtocolException, IOException, JSONException
	{
		
		CloseableHttpClient httpClient=  HttpClients.createDefault();
		HttpGet httpget= new HttpGet(URL);
		CloseableHttpResponse response= httpClient.execute(httpget);
		
		int statusCode=response.getStatusLine().getStatusCode();
		
		System.out.println(statusCode);
		
		String responseString= EntityUtils.toString(response.getEntity(),"UTF-8");
		
		JSONObject responseJson= new JSONObject(responseString);
		
		System.out.println(responseJson);
		
	    Header[] headers=  response.getAllHeaders();
	    
	    HashMap<String,String> allHeaders = new HashMap<String,String>();
	    
	    for(Header header : headers)
	    {
	    	allHeaders.put(header.getName(), header.getValue());
	    }
	    
	    
	    System.out.println(allHeaders);
	    System.out.println(allHeaders);
	    
	    System.out.println(getValueByJpath(responseJson,"/data[0]/last_name"));
	    
	    
	}
	
	public static void post(String URL,String Entity) throws ClientProtocolException, IOException
	{
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpPost httpPosts=new HttpPost(URL);
		httpPosts.setEntity(new StringEntity(Entity));
		
		CloseableHttpResponse response1= httpClient.execute(httpPosts);
		
		System.out.println(response1.getStatusLine().getStatusCode());
	}
	
	public static String getValueByJpath(JSObject response,String JPath) throws JSONException

	{
		Object obj=response;
		for(String s:JPath.split("/"))
			if(!s.isEmpty())
		if(!(s.contains("[")||s.contains("]")))
			obj=((JSONObject)obj).get(s);
		else if(s.contains("[")||s.contains("]"))
		{
			obj=((JSONArray)((JSONObject)obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]", "")));
		}
		
		return obj.toString();
	}
	
	
	public static void main(String[] args) throws ClientProtocolException, IOException, JSONException
	{
	
		
		restClient.get("https://reqres.in/api/users");
		
	 // ObjectMapper mapper=new ObjectMapper();
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
