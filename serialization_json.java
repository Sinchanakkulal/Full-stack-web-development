import com.fasterxml.jackson.databind.ObjectMapper;

class User{
    public String name;
    public int age;
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class serialization_json{
    public static void main(String[] args){
        User user=new User("Sinchana",22);
        ObjectMapper mapper=new ObjectMapper();
        String jsonString=mapper.writeValueAsString(user);
        System.out.println(jsonString);
    }
}

//1. 📥 jackson-databind-2.18.2.jar
//2. 📥 jackson-core-2.18.2.jar
//3.📥 jackson-annotations-2.18.2.jar
//it requires the three different jar files to run this programs 
