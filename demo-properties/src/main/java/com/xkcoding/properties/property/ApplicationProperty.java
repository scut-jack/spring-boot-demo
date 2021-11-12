package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApplicationProperty {
    /*读取配置文件中application.name的值给到name属性*/
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
