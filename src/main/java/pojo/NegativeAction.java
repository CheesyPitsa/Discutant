package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor @Getter @Setter
public class NegativeAction
{
    private String name;//название действия
    private String description;//описание
    private Date date;//дата совершения
    private String kind;//вид действия(спам, мошенничество, оскорбления и т.д.)
}
