package com.adobe.aem.guides.wknd.core.models;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.commons.lang.StringUtils;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

import java.util.Optional;
@Model(adaptables = Resource.class,
   defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class HelloWorldTooModel {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String text;
    
    // @ValueMapValue(injectionStrategy = InjectionStrategy.OPTIONAL )

    public String getTitle(){
        return StringUtils.isNotBlank(title) ? title : "Default Value for title!"; 
    }
    public String getText() {
       return StringUtils.isNotBlank(text) ? text.toUpperCase() : null; 
    }

}
