package pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.awt.*;
import java.util.HashMap;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "collectiveRole")//коллективная роль
public class CollectiveRole
{
    private @MongoId ObjectId id;
    @NotBlank
    private String name;
    private String description;
    private Color color;
    @DBRef
    private Set<Rights> rights;
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    private static class Rights
    {
        @DBRef
        private HashMap<CollectivePossibilities, String> rights;
    }
}
