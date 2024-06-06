package pojo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
@Document(collection = "user")
public class User implements CanBeReported, HaveChat
{
    public User(String username, String password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    private @MongoId ObjectId id;
    @NotBlank
    @Size(min = 2, max = 20)
    private String username;
    @NotBlank
    @Size(min = 8, max = 120)
    private String password;
    @DBRef
    private Set<Role> role = new HashSet<>();
    @Email
    @Size(max = 50)
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
    @DBRef
    private List<User> friends;
    @DBRef
    private List<User> follow;//подписки на пользователей
    @DBRef
    private List<Category> categories;//подписки на категории
    @DBRef
    private List<Topic> topics;//подписки на темы
}
