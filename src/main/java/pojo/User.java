package pojo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Setter @Getter @NoArgsConstructor
@Document(collection = "user")
public class User implements CanBeReported
{
    @Id
    private ObjectId id;
    private String username;
    private String email;
    private Date birthday;
    private String name;
    private String lastname;
    private String country;
    private String city;
    private int sex;
    private String info;
    private String avatar;
    private String video;
    private List<NegativeAction> negativeActions;
    private List<Ban> bans;
}
