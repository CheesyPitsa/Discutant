package pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor @Setter @Getter
public class Ban
{
    private String description;
    private Date startDate;
    private Date endDate;
    private List<NegativeAction> reasons;
}
