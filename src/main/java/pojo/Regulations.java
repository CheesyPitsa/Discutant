package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class Regulations//регламент дискуссии
{
    private List<Round> rounds;//список раундов
    @NoArgsConstructor
    @Getter
    @Setter
    private static class Round
    {
        private String name;//название раунда, если не указано возвращать номер раунда
        private int index;//номер раунда
        private User user;//ссылка на участника
        private int time;//время на выступление в секундах
    }
}
