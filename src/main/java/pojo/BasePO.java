package pojo;

import java.util.Date;

/**
 * 基础PO类
 *
 * @param <PK>
 */
public abstract class BasePO<PK> implements PO<PK> {

    private PK id;

    private Date gmtCreate;

    private Date gmtModified;

    @Override
    public PK getId() {
        return id;
    }

    @Override
    public void setId(PK id) {
        this.id = id;
    }

    @Override
    public Date getGmtCreate() {
        return gmtCreate;
    }

    @Override
    public BasePO setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    @Override
    public Date getGmtModified() {
        return gmtModified;
    }

    @Override
    public BasePO setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
}
