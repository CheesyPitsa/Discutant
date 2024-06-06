package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Setter
@Getter
@NoArgsConstructor
@Document(collection = "topic")
public class Topic implements CanBeReported
{
    private @MongoId ObjectId _id;
    private String name;
    @DBRef
    private User creator;

    @Override
    public ObjectId get_id()
    {
        return this._id;
    }
}
