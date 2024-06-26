package pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "collectivePossibilities")
public class CollectivePossibilities
{
    private @MongoId ObjectId _id;
    private String name;
}
