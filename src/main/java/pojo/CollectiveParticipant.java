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

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document (collection = "collectiveParticipant")//участник коллектива
public class CollectiveParticipant
{
    private @MongoId ObjectId id;
    @NotBlank
    @DBRef
    private User user;
    private boolean request;//false только тогда, когда пользователь подал заявку на участие в коллективе и ее еще не приняли
    @DBRef
    private Set<CollectiveRole> roles;
}
