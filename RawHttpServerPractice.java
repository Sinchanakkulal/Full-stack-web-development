import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.util.Map;
import java.util.HashMap;
import java.net.InetSocketAddress;
import java.io.IOException;
import java.io.OutputStream;


public class RawHttpServerPractice{
    private static Map<String,String> database=new HashMap<>();

    public static void main(String[] args) throws IOException{

        //1.create the https server listening on port 8080
        HttpServer server=HttpServer.create(new InetSocketAddress(8080),0);

        //map the endpoint "/api/users" to our handler
        server.createContext("/api/users",new UserApiHandler());

        //use default exceutor
        server.setExecutor(null);

        server.start();

        System.out.println("=========================================");
        System.out.println("Server started successfully!");
        System.out.println("URL: http://localhost:8080/api/users");
        System.out.println("=========================================");
    }

//handler to hanadle the incomming process request
static class UserApiHandler implements HttpHandler{
    @Override
    public void handle(HttpExchange exchange) throws IOException{
        // Get the HTTP Method (GET, POST, PUT, PATCH, DELETE)
        String method=exchange.getRequestMethod();
        String ResponseMessage="";
        int statusCode=200;

        //handle the request based on http request
        switch(method){
            case "GET":
                ResponseMessage="Get request sucessful! Current database"+database.toString();
                statusCode=200; //ok
                break;
            case "POST":
                database.put("1","Rahul");
                ResponseMessage="Post Request sucessful!,Rahul data inserted";
                statusCode=201; //created
                break;
            case "PUT":
                database.put("1","Rahul updated");
                ResponseMessage="Put request sucessfull!,rahul is updated";
                statusCode=200; //ok
                break;
            case "PATCH":
                database.put("1","Rahul patches");
                ResponseMessage="Patch request successfully done! rahul data got partially updated";
                statusCode=200; //ok
                break;
            case "DELETE":
                String userRole=getRequestHeaders().getFirst("X-USer-Role");
                if(userRole == null || !userRole.equalsIgnoreCase("ADMIN")){
                    statusCode=403;
                    ResponseMessage = "Error: 403 Forbidden. Only Admins can delete users.";

                }
                else{
                    database.remove(1);
                    ResponseMessage="Delete data sucessfully !,rahul data got deleted !";
                    statusCode=200; //ok
                    
                }
                break;
            default:
                statusCode=405; //method not allowed 
                ResponseMessage="Http method not allowed!";
        }

        //send the response back to the client 
        exchange.sendResponseHeaders(statusCode,ResponseMessage.getBytes().length);
        OutputStream os=exchange.getResponseBody();
        os.write(ResponseMessage.getBytes());
        os.close();
    }
}
}