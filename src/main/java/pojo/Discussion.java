package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;
import java.util.Set;

@NoArgsConstructor @Getter @Setter
@Document (collection = "discussion")
public class Discussion implements CanBeReported
{
    private @MongoId ObjectId id;
    private String name; //название дискуссии
    @DBRef
    private DiscussionSettings settings; //параметры дискуссии
    @DBRef
    private List<Category> categories; //к каким категориям относится
    @DBRef
    private List<Topic> topics; //к каким темам относится
    @DBRef
    private User creator; //создатель дискуссии
    @DBRef
    private List<Participants> participants; //участники дискуссии
    private Date date; //дата и время проведения дискуссии
    @DBRef
    private Chat chat; //соответствующий дискуссии чат
    private boolean nullified; //true если дискуссия отменена и проводиться не будет
    @DBRef
    private Set<User> views; //набор пользователей, присутствующих на дискуссии в качестве зрителей
    private String steno; //содержание дискуссии в текстовом формате
    private String video; //ссылка на запись дискуссии
    private Set<Reaction> reactions; //список реакций пользователей на трансляцию

    @Getter
    @Setter
    @NoArgsConstructor
    private static class Reaction //реакция
    {
        private User user; //кто отреагировал
        private char reaction; //символ реакции (👍👎🔥💩)
        private Date date; //дата и время отправления
        private int round; // если дискуссия регламентированная, номер раунда, в котором была отправлена реакция
    }
}

