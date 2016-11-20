package cn.apopo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by baidu on 16/11/9.
 */

@Component
@ConfigurationProperties(prefix="hello") // 注入带hello前缀的属性
public class HelloProperties {

    private String associateId;
    public void setAssociateId(String associateId) { // associateId的setter方法,由于只有一个setter方法,所以就注入到这个
        this.associateId = associateId;
    }
    public String getAssociateId() {
        return associateId;
    }
}
