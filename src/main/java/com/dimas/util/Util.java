package com.dimas.util;

import lombok.experimental.UtilityClass;
import org.eclipse.microprofile.config.ConfigProvider;

@UtilityClass
public class Util {

    public static boolean isEnabledByProperty(String property) {
        return ConfigProvider.getConfig().getOptionalValue(property, Boolean.class).orElse(false);
    }

}
