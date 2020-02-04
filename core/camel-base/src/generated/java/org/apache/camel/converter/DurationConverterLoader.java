/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class DurationConverterLoader implements TypeConverterLoader {

    public DurationConverterLoader() {
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, java.lang.String.class, java.time.Duration.class, false,
            (type, exchange, value) -> org.apache.camel.converter.DurationConverter.toString((java.time.Duration) value));
        addTypeConverter(registry, java.time.Duration.class, java.lang.String.class, false,
            (type, exchange, value) -> org.apache.camel.converter.DurationConverter.toDuration((java.lang.String) value));
        addTypeConverter(registry, long.class, java.time.Duration.class, false,
            (type, exchange, value) -> org.apache.camel.converter.DurationConverter.toMilliSeconds((java.time.Duration) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

}