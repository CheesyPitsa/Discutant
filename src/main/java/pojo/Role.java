package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "role")
public class Role
{
    private @MongoId ObjectId _id;
    private ERole name;
}
