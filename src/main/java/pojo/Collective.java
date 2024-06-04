package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "collective")
public class Collective implements HaveChat
{
    private @MongoId ObjectId id;
    private String name;
    private String type; //учеба, работа, друзья и т.п.
    private String description;
    @DBRef
    private User creator;
    @DBRef
    private Set<CollectiveParticipant> participants;
    @DBRef
    private Set<CollectiveRole> roles;
    @DBRef
    private Set<Chat> chats;
}
