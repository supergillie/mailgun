 public static ClientResponse SendSimpleMessage() 
 {    
 Client client = Client.create();    
 client.addFilter(new HTTPBasicAuthFilter("api", "key-3ab51df239bcc9c602b69eaa9ffb45d3"));    
 WebResource webResource = client.resource("https://api.mailgun.net/v3/sandbox0043c87422d34594bde6629c9ee54626.mailgun.org/messages");    MultivaluedMapImpl formData = new MultivaluedMapImpl();    
 formData.add("from", "Mailgun Sandbox <postmaster@sandbox0043c87422d34594bde6629c9ee54626.mailgun.org>");    
 formData.add("to", "peter <peter.krooks@gmail.com>");    
 formData.add("subject", "Hello peter");    
 formData.add("text", "Congratulations peter, you just sent an email with Mailgun!  You are truly awesome!  You can see a record of this email in your logs: https://mailgun.com/cp/log .  
You can send up to 300 emails/day from this sandbox server.  
Next, you should add your own domain so you can send 10,000 emails/month for free.");    
return webResource.type(MediaType.APPLICATION_FORM_URLENCODED). post(ClientResponse.class, formData);}
