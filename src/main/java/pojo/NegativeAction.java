package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@NoArgsConstructor @Getter @Setter
public class NegativeAction
{
    private String name;
    private String description;
    private Date date;
    private String kind;
}
