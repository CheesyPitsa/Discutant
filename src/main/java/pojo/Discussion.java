package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor @Getter @Setter
@Document (collection = "discussion")
public class Discussion implements CanBeReported
{
    @Id
    private ObjectId id;
    private String name;
    @DBRef
    private DiscussionSettings settings;
    @DBRef
    private List<Category> categories;
    @DBRef
    private List<Topic> topics;
    @DBRef
    private User creator;
    @DBRef List<Participants> participants;
    private Date date;
    @DBRef
    private Chat chat;
    private boolean nullified;
    @DBRef
    private Set<User> views;
    private String steno;
    private String video;
}

