package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Document(collection = "report")
public class Report
{
    private User creator;//автор жалобы
    private CanBeReported reportObject;//на что жалоба
    private String description;//описание
    private List<String> files;//прикрепленные доказательства нарушений (ссылки на файлы)
}
