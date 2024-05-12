package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "discussionSettings")
public class DiscussionSettings
{
    private @MongoId ObjectId id;
    private String type;//закрытая, открытая, приватная
    private String kind;//регламентированная, нерегламентированная, бесконечная (без записи видео и транскрипции)
    @DBRef
    private Collective collective;//если дискуссия внутриколлективная, ссылка на коллектив
    private Regulations regulations;//регламент дискуссии
}
