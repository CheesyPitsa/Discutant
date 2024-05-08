package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor @Setter @Getter
public class Ban
{
    private String description;//описание (если необходимо)
    private Date startDate;//время начала
    private Date endDate;//время окончания
    private List<NegativeAction> reasons;//список ссылок на негативные действия, за которые получен бан
}
