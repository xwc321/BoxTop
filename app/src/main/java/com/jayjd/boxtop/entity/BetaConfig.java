package com.jayjd.boxtop.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class BetaConfig implements Serializable {

    /**
     * beta_enabled : true
     * expire_at : 2026-01-04 00:00:00
     * allowed_devices : ["744D67E892A761452C94A45C57EFE07A74067A6ADAC3DE09A4AFF56A1AAB2460"]
     * revoked_devices : []
     */

    private boolean beta_enabled;
    private String appGuard;
    private String expire_at;
    private List<String> allowed_devices;
    private List<String> revoked_devices;
}
