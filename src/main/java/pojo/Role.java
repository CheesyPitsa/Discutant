package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import pojo.e.ERole;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "role")
public class Role
{
    private @MongoId ObjectId _id;
    private ERole name;
}
