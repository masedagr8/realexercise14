import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

//{
//      "body": "Walk the dog",
//      "done": false,
//      "id": 0,
//      "priority": 3,
//      "title": "dog"
//    },
//    {
//      "body": "Pay the bills",
//      "done": false,
//      "id": 1,
//      "priority": 1,
//      "title": "bills"
//    }
class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper map= new ObjectMapper();
        String json2="[\n" +
                "    {\n" +
                "      \"body\": \"Walk the dog\",\n" +
                "      \"done\": false,\n" +
                "      \"id\": 0,\n" +
                "      \"priority\": 3,\n" +
                "      \"title\": \"dog\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"body\": \"Pay the bills\",\n" +
                "      \"done\": false,\n" +
                "      \"id\": 1,\n" +
                "      \"priority\": 1,\n" +
                "      \"title\": \"bills\"\n" +
                "    }\n" +
                "  ]";
        ArrayList<Task> myList2=map.readValue(json2, ArrayList.class);
        System.out.println(myList2.get(0));



    }
}

class Task{

}

