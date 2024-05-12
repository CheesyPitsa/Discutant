package pojo;

import org.bson.types.ObjectId;

public interface CanBeReported//этот интерфейс отвечает за объекты, на которые можно отправить жалобу
{
    ObjectId getId();
}
