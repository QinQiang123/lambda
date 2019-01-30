package pojo;

import java.util.Date;

/**
 * persistant object  持久对象,与数据库中的表相映射的java对象，所有PO类都需要继承该类
 * @param <PK> 主键
 */
public interface PO<PK> extends Model {
    PK getId();

    void setId(PK id);

    Date getGmtCreate();

    PO setGmtCreate(Date gmtCreate);

    Date getGmtModified();

    PO setGmtModified(Date gmtModified);
}
