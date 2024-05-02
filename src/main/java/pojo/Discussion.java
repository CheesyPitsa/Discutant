package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor @Getter @Setter
@Document (collection = "discussion")
public class Discussion
{
    @Id
    private ObjectId id;
    private String name;
    @DBRef
    private User creator;
    private Date date;
    @DBRef
    private Chat chat;
    private boolean nullified;
    private Set<User> views;
    private String steno;
    private String video;
}

