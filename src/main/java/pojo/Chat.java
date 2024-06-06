package pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "chat")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Chat
{
    private @MongoId ObjectId _id;
    private List<HaveChat> location; //К чему относится чат
    @DBRef
    private ArrayList<Message> messages; //Сообщения чата
}
