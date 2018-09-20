package by.iba.railway.eticket.xml.objs.response.type.buyticket;

import by.iba.railway.eticket.xml.objs.response.type.common.BaseOrderType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderType")
public class OrderType extends BaseOrderType{

    @XmlAttribute(name = "CreateDate")
    protected String createDate;
    @XmlAttribute(name = "CreateTime")
    protected String createTime;

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
