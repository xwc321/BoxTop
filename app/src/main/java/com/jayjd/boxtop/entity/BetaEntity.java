package com.jayjd.boxtop.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BetaEntity implements Serializable {
    /**
     * versionName : 0.0.1
     * download :
     * versionCode : 1
     * info : 当前版本有内测版，为了更好的维护本项目，请不要将内测包进行公开外传，感谢支持！
     * devices : ["1111","2222"]
     */
    private String versionName;
    private String download;
    private int versionCode;
    private String info;
    private List<String> devices;
}
