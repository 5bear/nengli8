package com.nengli8.helper;

import org.assertj.core.util.Strings;

import javax.persistence.AttributeConverter;
import java.util.Base64;

/**
 * Created by 11369 on 2018/5/19.
 */
public class SecretConverter implements AttributeConverter<String, String> {
    private Base64.Encoder base64Encoder = Base64.getEncoder();
    private Base64.Decoder base64Decoder = Base64.getDecoder();


    @Override
    public String convertToDatabaseColumn(String attribute) {
        return Strings.isNullOrEmpty(attribute) ? attribute : base64Encoder.encodeToString(attribute.getBytes());
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return Strings.isNullOrEmpty(dbData) ? dbData : new String(base64Decoder.decode(dbData.getBytes()));
    }
}
