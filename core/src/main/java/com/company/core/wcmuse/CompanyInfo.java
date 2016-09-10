package com.company.core.wcmuse;

import com.adobe.cq.sightly.WCMUse;

/**
 * Created by khoanguyen on 9/8/16.
 */
public class CompanyInfo extends WCMUse {

    private String logoImage;

    private String companyName;

    @Override
    public void activate() throws Exception {
        logoImage = getProperties().get("logoImage", "");
        companyName = getProperties().get("companyName", "");
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLogoImage() {
        return logoImage;
    }
}
